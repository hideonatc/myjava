public class Review{
	public static void main(String[] args){
		outerloop:for(int i=1;i<=5;i++){
			innerloop:for(int j=i;j<=5;j++){
				System.out.printf("*");
			}
			System.out.println("");
		}
	}
}