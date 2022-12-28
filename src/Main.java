import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
            System.out.println("Basis pls");
        int basis = sc.nextInt();
            System.out.println("Potenz pls");
        int potenz = sc.nextInt();
        int potenziert = Main.berechnungPotenz(basis, potenz);
    }
    public static int berechnungPotenz(int basis, int potenz){
        int ergebnis = 0;
        int speicher;
/*
        if(basis < 0 || potenz < 0){
            System.out.println("Eingabe negativ, try again");
            return 0;
        }
*/
/*
        while()
*/
        return ergebnis;
    }

}