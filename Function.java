import java.util.Scanner;
public class Function{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a number:");
		int t = input.nextInt();
		System.out.printf("%dth number in fabonacci sequence is %d\n",t,f(t));
	}
	public static int f(int n){
		if(n==0||n==1)
			return 1;
		return f(n-1)+f(n-2);
	}
}