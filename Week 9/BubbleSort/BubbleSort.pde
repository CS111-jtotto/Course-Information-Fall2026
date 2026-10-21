float[] values;
int i = 0;
int j = 0;

void setup() {
  size(800, 600);
  values = new float[20];
  
  // Populate the array with random heights
  for (int n = 0; n < values.length; n++) {
    values[n] = random(10, height);
  }
  frameRate(5);
}

void draw() {
  background(30);

  // Sorting logic (Bubble Sort step)
  if (i < values.length) {
    if (j < values.length - i - 1) {
      if (values[j] > values[j+1]) {
        swap(values, j, j+1);
      }
      j++;
    } else {
      j = 0;
      i++;
    }
  } else {
    noLoop(); // Stop drawing when the array is fully sorted
  }

  // Drawing logic
  float w = width / (float) values.length;
  for (int n = 0; n < values.length; n++) {
    
    // Determine rectangle color based on sort state
    if (i >= values.length || n >= values.length - i) {
      fill(100, 255, 100); // Sorted elements (Green)
    } else if (n == j || n == j + 1) {
      fill(255, 100, 100); // Currently comparing (Red)
    } else {
      fill(255);           // Unsorted elements (White)
    }
    
    noStroke();
    // Draw from the bottom up: y-coordinate is (total height - rectangle height)
    rect(n * w, height - values[n], w, values[n]);
  }
}

// Helper function to swap two array elements
void swap(float[] arr, int a, int b) {
  float temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}
