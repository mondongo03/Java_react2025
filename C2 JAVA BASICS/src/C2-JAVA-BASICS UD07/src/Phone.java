import java.util.Scanner;
public class Phone {

	private String name;
	private double version;
	private double ram;
	private double storage;
	private int price;

	public Phone(String name, double version, double ram, double storage, int price) {
		this.name = name;
		this.version = version;
		this.ram = ram;
		this.storage = storage;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		Phone test = new Phone("Iphone", 5.0, 12, 256, 1000);

		Phone array[] = new Phone[5];
		array[0] = new Phone("Iphone", 8.0, 12, 512, 1200);
		array[1] = new Phone("Samsung note", 3.0, 16, 256, 1600);
		array[2] = new Phone("IPad", 4.0, 32, 1024, 2500);
		array[3] = new Phone("Huawei", 2.0, 16, 128, 600);
		array[4] = new Phone("Doogee", 1.5, 4, 64, 300);

		System.out.println("The price for the " + 
		"Iphone version 8 is: " + array[0].getPrice());
		
		System.out.println("The RAM for "
				+ "samsung note version 3 is: " +array[1].getRam());
		System.out.println("The internal storage for "
				+ "IPad version 4 is: " +array[2].getStorage());
		
		Phone info[] = new Phone[5];
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		double max = 0;
		Scanner sc = new Scanner(System.in);
		double totalPrice = 0;
		for(Phone show : array) {
			System.out.println("The available phones are: " +array[0].getName() + " "
					+array[1].getName() +" "+array[2].getName() +" " +array[3].getName()
					 + " " +array[4].getName());
			System.out.println("What phone do you wish to buy? ");
			String answer = sc.nextLine();
			
			if(answer.equalsIgnoreCase("Iphone")) {
				System.out.println("That'll be: " +array[0].getPrice());
				totalPrice += +array[0].getPrice();
				count++;
			}
			else if(answer.equalsIgnoreCase("IPad")) {
				System.out.println("That'll be: " +array[2].getPrice());
				totalPrice += +array[2].getPrice();
				count2++;

			}
			else if(answer.equalsIgnoreCase("Samsung note")) {
				System.out.println("That'll be: " +array[1].getPrice());
				totalPrice += +array[1].getPrice();
				count3++;

			}
			else if(answer.equalsIgnoreCase("Huawei")) {
				System.out.println("That'll be: " +array[3].getPrice());
				totalPrice += +array[3].getPrice();
				count4++;

			}
			else if(answer.equalsIgnoreCase("IPad")) {
				System.out.println("That'll be: " +array[4].getPrice());
				totalPrice += +array[4].getPrice();
				count5++;
			}
			
			
			if(show.getRam() > max) {
				max = show.getRam();
			}
			
			  if (count > count2 && count > count3 && count > count4 && count > count5) {
		            System.out.println("Count (" + count + ") es el más grande");
		        } else if (count2 > count3 && count2 > count4 && count2 > count5) {
		            System.out.println("Count2 (" + count2 + ") es el más grande");
		        } else if (count3 > count4 && count3 > count5) {
		            System.out.println("Count3 (" + count3 + ") es el más grande");
		        } else if (count4 > count5) {
		            System.out.println("Count4 (" + count4 + ") es el más grande");
		        } else {
		            System.out.println("Count5 (" + count5 + ") es el más grande");
		        }
			
			System.out.println("The mostly"
					+ " preferred ram is: " +max);
			
			System.out.println("The total price of all sold phones is: " +totalPrice);
			
		}
		
	
	}

}
