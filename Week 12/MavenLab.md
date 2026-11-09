Your lab assignment for Mon, Nov 9th is to port your Processing sketch to Maven, a standard build tool for Java. You will learn how to import the Processing library, create a PApplet subclass using `extends`, and import custom classes to use their `protected` and `public` methods.

You'll port the Processing sketch in three stages:
1. Create a Maven project, and import Processing.
2. Convert your sketch by subclassing `PApplet`.
3. Port your brush class, by passing a `PApplet` reference.

If you do not have the Visual Studio Code integrated development environment (IDE), please download it from `code.visualstudio.com` or your package manager.

Open the Extensions panel `(cmd-shift-X)` and search for "Extension Pack for Java" by Microsoft. It should be the second result if you search `extension java`. Once the extension is installed, you do not need to follow its setup instructions because we already have a JDK installed.

Instead, close your existing project by going to `File > Close Folder (cmd-K + F)`. Then reference `vscode_setup.png` to set up a new Maven project directly from the Explorer panel, using the default build settings. Give your project any "group id" and "artifact id" that you like. For example, `edu.usfca` and `custombrush` will produce the following project structure:

custombrush/
├── .vscode/
│   └── launch.json
├── src/
│   └── main/
│       └── java/
│           └── edu/
│               └── usfca/
│                   └── App.java
├── target/
└── pom.xml

Finally, we will add the Processing library as a dependency, causing VS Code to fetch it from the corresponding Maven package. Insert this XML into `pom.xml` right after `</properties>` and before `</project>`:
```
<dependencies>
    <dependency>
        <groupId>org.processing</groupId>
        <artifactId>core</artifactId>
        <version>4.5.7</version>
    </dependency>
</dependencies>
```

Test with a minimal PApplet class:
```
package com.example; // change this!

import processing.core.PApplet;

public class App extends PApplet {

    public static void main(String[] args) {
        PApplet.main("com.example.App"); // change this too!
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        background(30);
    }

    @Override
    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX, mouseY, pmouseX, pmouseY);
        }
    }
}
```

---

Now you are ready to port both custom classes from your Processing sketch to your Maven project. You have two source files: one for your main class and entry point, and one for the Brush class.

We'll turn the main class into a `PApplet` subclass.  If your main class is named `public App`, then we'll write:
```
import processing.core.PApplet;
public App extends PApplet {

    // ... setup() and draw() methods
}
```

Since we aren't in the Processing IDE, Processing needs us to move the `size(int, int)` call to a `settings()` method.
```
    public void settings() {
        size(900, 600);
    }
```

We will also create an entry point. Instead of running the code from your console, we will now `Run` it from the IDE. You can use either the inline `Run | Debug` menu appearing directly above this `main(String[])` definition, or the `Run Java` option appearing in the context menu for the Explorer when you right-click `App.java`.
```
    public static void main(String[] args) {
        // Change this classPath string to match your new project.
        PApplet.main(new String[] { "edu.usfca.App" }); 
    }
```

Next, we will port over the brush. You must change the **visibility** of each class method you access from the main app to `public` instead of leaving it blank (`default`), because Java does not like to expose methods without explicit permission. The same goes for class fields.

```
import processing.core.PApplet;
class Shape {
    PApplet p;
    // remaining fields...

    public Shape(PApplet parent, ...) {
        this.p = parent;
    }

    // use p.rect(...) etc. for built-in methods of PApplet
    // optionally, use PApplet.random(...) etc. for static methods
}

As you port your Processing code to regular Java, there are a couple other pain points to watch out for:
- Avoid type conversion from `double` by appending `f` to floating point literals, e.g. `float halfAngle = angle / 2.0f;`.
- There is no `color` type outside of the Processing IDE. Change these fields to `int`.