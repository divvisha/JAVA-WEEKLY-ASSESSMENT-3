import java.util.*;

public class JavaExceptionHanldingTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                int x = new Integer(sc.nextInt());
                int y = new Integer(sc.nextInt());
                System.out.println("" + (x / y));
            } catch (InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
