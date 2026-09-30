public class Hailstone {
	public static void main(String[] args) {
		int n = 100;
		if (args.length > 0) {
			n = Integer.parseInt(args[0]);
		}
		System.out.println(getSequence(n));
	}

    public static int getSequence(int n) {
        int steps = 0;
		int MAX_STEPS = 1_000_000;
        while (n > 1 && steps < MAX_STEPS) {
			if (n % 2 == 0) {
				n = n / 2;
			}
			else {
				n = 3 * n + 1;
			}
			steps += 1;
        }
        if (steps == MAX_STEPS) {
 			n = Integer.MAX_VALUE;
        }
        return steps;
    }
}