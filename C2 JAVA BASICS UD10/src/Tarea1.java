import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tarea1 {

    private int num;
    private int rand;

    public void introducirValor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        this.num = sc.nextInt();

        if (this.num == this.rand) {
            System.out.println("Encontraste el numero!");
        }
    }

    public int rand() {
        Random rn = new Random();
        this.rand = rn.nextInt(0, 500);
        return rand;
    }

    public void mayorOMenor() {
        if (this.num > this.rand) {
            System.out.println("El numero es menor");
        } else {
            System.out.println("El numero es mayor");
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public static void main(String[] args) {

        Tarea1 test = new Tarea1();

        test.rand();

        while (test.getNum() != test.getRand()) {
            try {
            test.introducirValor();
            test.mayorOMenor();
            }catch(InputMismatchException e) {
                System.out.println("Debes introducir digitos, y que ademas sean sin decimal!");
            }
        }
        
        
    }

}