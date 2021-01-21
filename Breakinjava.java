public class Breakinjava{
	public static void main(String[] args){
		outerloop:for(int i=0;i<10;i++){
			innerloop:for(int j=0;j<10;j++){
				if(i==5&&j==5)
					break outerloop;
				System.out.println("i="+i+" j="+j);
			}
		}
	}
}
