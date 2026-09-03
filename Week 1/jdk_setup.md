
# JDK 25 Setup

Problem: `javac` doesn't run, no JVM installed.

Mac users with Homebrew installed:
Write `brew install openjdk@25` in your terminal to produce (in part) the following output:
```
% brew install openjdk@25
==> Caveats
==> openjdk@25
For the system Java wrappers to find this JDK, symlink it with
	sudo ln -sfn /opt/homebrew/opt/openjdk@25/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-25.jdk
```
or possibly a different message,
```
% brew install openjdk@25
Warning: openjdk@25 25.0.4.1 is already installed and up-to-date.
```

What does the 'symbolic link' command actually do?

We happen to know that `sudo` (short for 'super user do...') takes a command and its arguments (in this case `ln ...`), giving them permission to edit system directories. So we need to look up `ln` and its three flags: `-s`, `-f`, and `-n`.
```
% man ln
NAME
     ln, link – link files
SYNOPSIS
     ln source_file [target_file]
DESCRIPTION
     The ln utility creates a new directory entry (linked file) for the file name specified
     by target_file. It is useful for maintaining multiple copies of a file in many places at
     once; a link “points” to the original copy.
	 
	 -f		If the target file already exists, then unlink it first.
	 -n 	If the target_file is a symbolic link, do not follow it.
	 -s		Create a symbolic link.
```
In other words, our JDK is currently installed at `/opt/homebrew/...`.
This link will point to our JDK from the new location, `/Library/Java/...`, where MacOS expects to find it.

Let's run the `ln` command with escalated privileges from `sudo`.
```
sudo ln -sfn /opt/homebrew/opt/openjdk@25/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-25.jdk
(enter your password; it won't show up on the screen)
```

Test with:
```
% java --version
openjdk 25.0.4.1 2026-08-18
OpenJDK Runtime Environment Homebrew (build 25.0.4.1)
OpenJDK 64-Bit Server VM Homebrew (build 25.0.4.1, mixed mode, sharing)
```

---

Windows users, instead perform:
```
$ winget install Microsoft.OpenJDK.25
$ java --version
```