public class IdentityMatrix {
    public static void main(String[] args) {
        int n = 2;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }

        // create an 'identity matrix' whose main diagonal contains 1s
        double[] matrix = new double[n*n];
        for (int i = 0; i < n; i += 1) {
            // loop over j, and modify entries where column j == row i
            for (int j = 0; j < n; j += 1) {
                if (i == j) {
                    matrix[i*n + j] = 1.0;
                }
            }
            // equivalent: instead of looping over j, update where j == i
            // matrix[i*n + i] = 1.0;
        }

        // print out the new matrix
        for (int i = 0; i < n; i += 1) {
            String buffer = "";
            for (int j = 0; j < n; j += 1) {
                buffer += matrix[i*n + j] + " ";
            }
            System.out.println(buffer);
        }
    }
}