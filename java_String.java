public class java_String{
	public static void main(String[] args){
		String str1 = "string one";
		System.out.println("the third character in str1 is "+str1.charAt(2));
		StringBuffer str2 = new StringBuffer("sb");
		System.out.println("str2 is "+str2);
		str2.append(100);
		System.out.println("str2 is "+str2);
		str2.reverse();
		System.out.println("str2 is "+str2);
		str2.insert(2,9);
		System.out.println("str2 is "+str2);	
		str2.deleteCharAt(4);
		System.out.println("str2 is "+str2);
	}
}