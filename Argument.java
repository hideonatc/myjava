public class Argument{
	public static double sum(double ... nums){
		double s=0;
		for(double i:nums){
			s+=i;
		}
		return s;
	}
	public static void main(String[] args){
		System.out.println("sum(40.5,50.6,59.2,7.2)="+sum(40.5,50.6,59.2,7.2));
		System.out.println("sum(52.1,5.2,49.1)="+sum(52.1,5.2,49.1));
	}
}