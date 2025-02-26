
public class Parse {

	public static void main(String[] args) {
		
		String str = "123";
		int num = Integer.parseInt(str);
		System.out.println(num);
		
		String str2 = "123.45";
		double num2 = Double.parseDouble(str2);
		System.out.println(num2);
		
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		System.out.println(bool);
		
		String str4 = "Hola";
		
		int sum = num + (int)num2;
		System.out.println(sum);

	}

}
