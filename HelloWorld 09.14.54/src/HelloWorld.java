import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("This is the first time I learn Java!");
        //int a = 3;
        //double b = (double) a;
        //System.out.println(b);
        //int[] array = new int[10];
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + b + c);

    }
}
