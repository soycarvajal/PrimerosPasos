//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas {
    public static void main(String[] args) {

        // MANERA DE SACAR EL AREA POR CONSOLA
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo ");

        int figura = entrada.nextInt();

        switch (figura){

            case 1:
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

            System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
            break;
        }

        entrada.close();*/

        // MANERA DE SACAR EL AREA POR PANTALLA
        String figura = JOptionPane.showInputDialog("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo ");

        int  x = Integer.parseInt(figura);

        switch(x){
            case 1: 
            int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
            JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + Math.pow(lado, 2));
            break;

            case 2:
            int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + base *altura);
            break;

            case 3:
            base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
            JOptionPane.showMessageDialog(null, "El area del triangulo es: " + (base * altura) / 2);
            break;

            case 4:
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
            JOptionPane.showMessageDialog(null, "El area del circulo es: " + Math.PI*(Math.pow(radio, 2)));


        }


        

    }
}
