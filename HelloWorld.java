import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please Enter A Number: ");
        int number = reader.nextInt();
        System.out.println("The Number You Entered: " + number);
    }
}


   
