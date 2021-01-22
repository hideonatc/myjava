public class Init{
	int data=2;
	public Init(int data){
		System.out.printf("this data is %d\n", this.data);
		this.data=data;
	}
	public static void main(String[] argv){
		Init d1 = new Init(3);
		Init d2 = new Init(4);
		System.out.printf("d1 is %d\nd2 is %d\n", d1.data, d2.data);
	}
}