
public class CuentaBancaria {

	private String titular;
	private double saldo;
	private int iban;
	
	public CuentaBancaria(String titular, int iban) {
		this.titular = titular;
		this.saldo = 0;
		this.iban = iban;
	}
	public void ingresar(double dinero) {
		if (dinero > 0) {
			saldo+=dinero;
		}
	}
	public void retirar(double dinero) {
		if (dinero > 0) {
			saldo-=dinero;
		}
	}
	public void consultarSaldo() {
		System.out.println("Su saldo es de: " +saldo);
	}
	public static void main(String[] args) {
		CuentaBancaria test = new CuentaBancaria("Isra", 242525252);
		test.ingresar(555);
		test.consultarSaldo();
		test.retirar(244);
		test.consultarSaldo();
	}
}
