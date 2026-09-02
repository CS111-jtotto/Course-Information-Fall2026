public class AssignmentDemo {
    public static void main(String[] args) {
        boolean isReady = false;

        System.out.println("Initial value of isReady: " + isReady);
        System.out.println();

        if (isReady == true) {
            System.out.println("I can't be reached");
        } else {
            System.out.println("I'm working as expected");
        }
        System.out.println("Final value of isReady: " + isReady);
    }
}