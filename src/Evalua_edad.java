import java.util.Scanner;

import javax.swing.JOptionPane;

public class Evalua_edad {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad por favor");
        int edad = entrada.nextInt();

        /*if(edad>=18){
            System.out.println("Eres mayor de edad");
            //JOptionPane.showMessageDialog(null, "Eres mayor de edad.");
        }
        else{
            System.out.println("Eres menor de edad");
            //JOptionPane.showMessageDialog(null, "Eres menor de edad.");
        }
        */
        if (edad <=18){ //"Si" es menor de 18 imprimir Eres un adolecente
            System.out.println("Eres un adolecente");
        }
        else if (edad<40){ //"Sino" 
            System.out.println("Eres un joven");
        }
        else if (edad<65){ //"Sino" 
            System.out.println("Eres maduro");
        }
        else {
            System.out.println("Cuidate");
        }
        entrada.close();
    }
}
