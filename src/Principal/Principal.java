package Principal;
import Modulos.Consumo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        while (true){
            Scanner lectura = new Scanner(System.in);
            System.out.println("*--- Conversor de monedas ---*");
            System.out.println("¿Que conversión desea hacer?");
            System.out.println("1) USD => ARS");
            System.out.println("2) ARS => USD");
            System.out.println("3) USD => BRL");
            System.out.println("4) BRL => USD");
            System.out.println("6) COP => USD");
            System.out.println("5) USD => COP");
            System.out.println("0) Salir");
            int menu = lectura.nextInt();

            if (menu == 1){
                System.out.println("Ingrese los USD que desea convertir a ARS");
                float cantidad = lectura.nextFloat();

            }
            else if (menu == 2) {
                System.out.println("Ingrese los ARS que desea convertir a USD");
                float cantidad = lectura.nextFloat();
            }
            else if (menu == 3) {
                System.out.println("Ingrese los USD que desea convertir a BRL");
                float cantidad = lectura.nextFloat();
            }
            else if (menu == 4) {
                System.out.println("Ingrese los BRL que desea convertir a USD");
                float cantidad = lectura.nextFloat();
            }
            else if (menu == 5) {
                System.out.println("Ingrese los COP que desea convertir a USD");
                float cantidad = lectura.nextFloat();
            }
            else if (menu == 6) {
                System.out.println("Ingrese los USD que desea convertir a COP");
                float cantidad = lectura.nextFloat();
            }
            else if (menu == 0){
                break;
            }
            else {
                System.out.println("Elija una opción válida");
            }
        }
    }
}
