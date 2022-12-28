import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
            System.out.println("Basis pls");
        double basis = sc.nextInt();
            System.out.println("Potenz pls");
        double potenz = sc.nextInt();
        double potenziert = Main.berechnungPotenz(basis, potenz);
        int potenziertGerundet = (int) potenziert;
        System.out.println("Ergebnis ist: " + potenziertGerundet);
    }
    public static double berechnungPotenz(double basis, double potenz){
        double ergebnis = 0;
        int speicher;
        if(basis < 0 || potenz < 0){
            System.out.println("Eingabe negativ, try again");
            return 0;
        }
        int i = 1;
        if(potenz == 0){
            ergebnis = 1;
            return ergebnis;
        }
        double basisSPeicher = basis;
        while(i <= (potenz-1)) {
            ergebnis = (basis * basisSPeicher);
            basis = ergebnis;
            i++;
        }
        return ergebnis;
    }

}