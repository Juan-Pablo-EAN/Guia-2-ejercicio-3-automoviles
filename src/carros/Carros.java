package carros;

import java.util.Scanner;

public class Carros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String tipo = "";
        int valor = 0;
        int precio = 0;
        int iva = 0;

        System.out.println("¿Que tipo de auto deseas comprar automovil o camioneta?");
        System.out.println("Escribe 'automovil' o 'camioneta'");
        tipo = entrada.nextLine();

        switch (tipo) {
            case "camioneta":
                tipo = " la camioneta";
                System.out.println("¿Cual es el precio bruto de la camioneta?");
                precio = entrada.nextInt();
                if (precio < 80) {
                    iva = 0;
                } else if (precio >= 80) {
                    iva = precio / 2;
                } else {
                    System.out.println("No escribiste un valor correcto, vuelve a intentarlo");
                }
                valor = iva + precio;
                System.out.println("Impuesto de" + tipo + ": " + iva + " pesos");
                System.out.println("Precio total de" + tipo + ": " + valor + " pesos");
                break;
                
            case "automovil":
                tipo = "l automovil";
                System.out.println("¿Cual es el precio bruto del automovil?");
                precio = entrada.nextInt();
                if (precio < 20){
                    iva = 5;
                } else if (precio >= 20 && precio < 40){
                    iva = precio/5;
                } else if (precio >= 40) {
                    iva = 9;
                } else {
                    System.out.println("No escribiste un valor correcto, vuelve a intentarlo");
                }
                valor = iva + precio;
                System.out.println("Impuesto de" + tipo + ": " + iva + " pesos");
                System.out.println("Precio total de" + tipo + ": " + valor + " pesos");
                break;
                
            default: 
                System.out.println("Opción equivocada, revisa si escribiste bien");
        }

    }

}
