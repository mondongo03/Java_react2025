	public class Tarea1 {
	
		private int precioBase;
		private char consumo;
		private String color;
		private double peso;
		protected final int BASE = 100;
	
		public Tarea1() {
			this.precioBase = BASE;
			this.consumo = 'F';
			this.color = "Blanco";
			this.peso = 5;
		}
	
		public Tarea1(double peso, int precioBase) {
			this.precioBase = precioBase;
			this.peso = peso;
			this.consumo = 'F';
			this.color = "Blanco";
		}
	
		public Tarea1(double peso, int precioBase, String color, char consumo) {
			this.precioBase = precioBase;
			this.peso = peso;
			this.consumo = consumo;
			this.color = color;
		}
	
		public int getPrecioBase() {
			return precioBase;
		}
	
		public void setPrecioBase(int precioBase) {
			this.precioBase = precioBase;
		}
	
		public char getConsumo() {
			return consumo;
		}
	
		public void setConsumo(char consumo) {
			this.consumo = consumo;
		}
	
		public String getColor() {
			return color;
		}
	
		public void setColor(String color) {
			this.color = color;
		}
	
		public double getPeso() {
			return peso;
		}
	
		public void setPeso(double peso) {
			this.peso = peso;
		}
	
		public void comprobarConsumoEnergetico(Tarea1 cha) {
			System.out.println("El consumo energetico es: " + cha.getConsumo());
		}
	
		public void comprobarColor(Tarea1 check) {
			System.out.println("El color es: " + check.getColor());
		}
	
		public int precioFinal(Tarea1 finals) {
			int precio = 0;
			if (finals.getConsumo() == 'F') {
				precio += 10;
			} else if (finals.getConsumo() == 'E') {
				precio += 30;
			} else if (finals.getConsumo() == 'D') {
				precio += 50;
			} else if (finals.getConsumo() == 'C') {
				precio += 60;
			} else if (finals.getConsumo() == 'B') {
				precio += 80;
			} else if (finals.getConsumo() == 'A') {
				precio += 100;
			}
	
			if (finals.getPeso() <= 19) {
				precio += 10;
			} else if (finals.getPeso() >= 20 && finals.getPeso() <= 49) {
				precio += 50;
			} else if (finals.getPeso() >= 50 && finals.getPeso() <= 79) {
				precio += 80;
			} else if (finals.getPeso() >= 80) {
				precio += 100;
			}
			return precio +finals.getPrecioBase();
		}
	}
	
	class Lavadora extends Tarea1 {
	
		private int carga;
		
		public Lavadora() {
			super();
			this.carga = 5;
		}
	
		
		public Lavadora(double peso, int precioBase, String color, char consumo, int carga) {
			super(peso, precioBase, color, consumo);
			this.carga = carga;
		}
	
		public int getCarga() {
			return carga;
		}
	
		public void setCarga(int carga) {
			this.carga = carga;
		}
		
		public int precioFinal(Lavadora carga) {
			int precioTotal = super.precioFinal(carga);
			if(carga.getCarga() > 29) {
				precioTotal += 50;
			}
			return precioTotal;
		}
		
	}
	class Television extends Tarea1{
		
		private int resolucion;
		private boolean sintonizador;
		
		public Television() {
			super();
			this.resolucion = 20;
			this.sintonizador = false;
		}
		public Television(double peso, int preciobase, int resolucion, boolean sintonizador) {
			super(peso, preciobase);
			this.resolucion = resolucion;
			this.sintonizador = sintonizador;
		}
		
		public Television(double peso, int preciobase, String color, char consumo, int resolucion, boolean sintonizador) {
			super(peso, preciobase, color, consumo);
			this.resolucion = resolucion;
			this.sintonizador = sintonizador;
		}
		
		public int getResolucion() {
			return resolucion;
		}
		public void setResolucion(int resolucion) {
			this.resolucion = resolucion;
		}
		public boolean getSintonizador() {
			return sintonizador;
		}
		public void setSintonizador(boolean sintonizador) {
			this.sintonizador = sintonizador;
		}
		
		public int precioFinal(Television check) {
			int precioUltimo = super.precioFinal(check);
			
			if(check.getResolucion() > 39) {
				precioUltimo *= 1.30;
			}
			if(check.getSintonizador() == true) {
				precioUltimo +=50;
			}
			return precioUltimo;
		}
		
	
	}