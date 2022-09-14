import java.util.Scanner;

public class Entrada_ejemplo1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Declaramos variable de tipo objeto de tipo Scanner

        System.out.println("Introduce tu nombre, por favor."); //Imprime mensaje en consola

        String nombre_usuario = entrada.nextLine(); //.nextLine() a la espera de ingresar informacion en consola

        System.out.println("Introduce tu edad, por favor.");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + " tienes " + edad + " años y el proximo año tendras " + (edad+1) + ".");

        entrada.close();
    }

}
