int[] randomCounts;
int total = 10;

void setup() {
  size(640, 360);
  randomCounts = new int[total];
  frameRate(10);
}
void draw() {
  background(255);
  int index = floor(random(total));
  randomCounts[index] += 10;

  for (int x = 0; x < randomCounts.length; x++) {
    // draw randomCounts[x]:
    rect(x * width / total,        // left edge
         height - randomCounts[x], // bottom edge
         width / total - 1,        // width
         randomCounts[x]           // height
    );
  }
}
