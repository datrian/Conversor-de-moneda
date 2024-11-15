package Principal;
import Modulos.Consumo;
import Modulos.Moneda;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        while (true){
            Scanner lectura = new Scanner(System.in);
            System.out.println("*--- Conversor de monedas ---*");
            System.out.println("¿Que conversión desea hacer?");
            System.out.println("1) USD => ARS");
            System.out.println("2) ARS => USD");
            System.out.println("3) USD => BRL");
            System.out.println("4) BRL => USD");
            System.out.println("5) COP => USD");
            System.out.println("6) USD => COP");
            System.out.println("0) Salir");
            int menu = lectura.nextInt();

            if (menu == 1){
                System.out.println("Ingrese los USD que desea convertir a ARS");
                double cantidad = lectura.nextFloat();
                Moneda miCurrency = new Moneda("USD", "ARS", cantidad);
                // Creamos una instancia en la clase Consumo para pasarle los valores de "miCurrency"
                Consumo consumo = new Consumo(miCurrency);
                consumo.mostrarMoneda();
                System.out.println("------------------------------");
            }
            else if (menu == 2) {
                System.out.println("Ingrese los ARS que desea convertir a USD");
                double cantidad = lectura.nextFloat();
                Moneda miCurrency = new Moneda("ARS", "USD", cantidad);
                // Creamos una instancia en la clase Consumo para pasarle los valores de "miCurrency"
                Consumo consumo = new Consumo(miCurrency);
                consumo.mostrarMoneda();
                System.out.println("------------------------------");
            }
            else if (menu == 3) {
                System.out.println("Ingrese los USD que desea convertir a BRL");
                double cantidad = lectura.nextFloat();
                Moneda miCurrency = new Moneda("USD", "BRL", cantidad);
                // Creamos una instancia en la clase Consumo para pasarle los valores de "miCurrency"
                Consumo consumo = new Consumo(miCurrency);
                consumo.mostrarMoneda();
                System.out.println("------------------------------");
            }
            else if (menu == 4) {
                System.out.println("Ingrese los BRL que desea convertir a USD");
                double cantidad = lectura.nextFloat();
                Moneda miCurrency = new Moneda("BRL", "USD", cantidad);
                // Creamos una instancia en la clase Consumo para pasarle los valores de "miCurrency"
                Consumo consumo = new Consumo(miCurrency);
                consumo.mostrarMoneda();
                System.out.println("------------------------------");
            }
            else if (menu == 5) {
                System.out.println("Ingrese los COP que desea convertir a USD");
                double cantidad = lectura.nextFloat();
                Moneda miCurrency = new Moneda("COP", "USD", cantidad);
                // Creamos una instancia en la clase Consumo para pasarle los valores de "miCurrency"
                Consumo consumo = new Consumo(miCurrency);
                consumo.mostrarMoneda();
                System.out.println("------------------------------");
            }
            else if (menu == 6) {
                System.out.println("Ingrese los USD que desea convertir a COP");
                double cantidad = lectura.nextFloat();
                Moneda miCurrency = new Moneda("USD", "COP", cantidad);
                // Creamos una instancia en la clase Consumo para pasarle los valores de "miCurrency"
                Consumo consumo = new Consumo(miCurrency);
                consumo.mostrarMoneda();
                System.out.println("------------------------------");
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
