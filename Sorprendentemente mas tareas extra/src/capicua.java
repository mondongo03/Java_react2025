
public class capicua {

	public static void main(String[] args) {

		int num = 12321;
		String s = String.valueOf(num);
		String inversion = "";
		

        for (int i = s.length() - 1; i >= 0; i--) {
            inversion += s.charAt(i);
        }
        int numero = Integer.parseInt(inversion);

        
        if(numero == num){
        	System.out.println("Es capicua");
        }
        else {
        	System.out.println("No es capicua");
        }
	}

}
