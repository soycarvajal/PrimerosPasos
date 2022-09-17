import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Adivina_Numero {
    public static void main(String[] args) {
        
        //GENERAR NUMERO ENTRE 0 - 100 Y ADIVINARLO

        int aleatorio = (int)(Math.random()*100);

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;
        

        while (numero!=aleatorio){
            intentos++;
            System.out.println("Introduce un numero por favor");

            numero = entrada.nextInt();

            if(aleatorio<numero){
                System.out.println("Mas bajo");
            }
            else if (aleatorio>numero){
                System.out.println("Mas alto");
            }

        }
        System.out.println("Correcto, lo has conseguido en " + intentos + ".");
        System.out.println(intentos);
        entrada.close();
        //System.out.println(aleatorio);

        //JOptionPane.showMessageDialog(null, (Math.random()*100));

        


    }
}
