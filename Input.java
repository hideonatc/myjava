import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter your name:");
		System.out.printf("Hello, %s\n",input.next());
		System.out.printf("Enter your age:");
		System.out.printf("You were born in %d\n",2020-input.nextInt());
}