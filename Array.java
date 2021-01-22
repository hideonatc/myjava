public class Array{
	public static void main(String[] argv){
		int[] a1={1,2,3,4,5};
		int[] a2;
		a2 = new int[5];
		for(int i=0;i<5;i++)
			a2[i]=i;
		Object[] a3 = new Object[]{new Integer(10),new Float(31.5),new String("test"),new Integer(20),new Integer(30)};
		for(int i=0;i<5;i++){
			System.out.print(a1[i]+" "+a2[i]+" "+a3[i]+"\n");
		}
	}
}