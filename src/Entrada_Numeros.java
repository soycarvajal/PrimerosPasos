import javax.swing.JOptionPane;

public class Entrada_Numeros {
    public static void main(String[] args) {

        //Ejemplos para usar .printf

        //double x = 1000.0;
        //System.out.printf("%1.2f", x/3);

        double n = 1.25036;

        int x = 10;

        System.out.printf("%.3f%n",n); //Redondea para mostrar los decimales indicados en este caso 3

        System.out.printf("%+.3f", n); //Muesta el signo + en un numero positivo

        //Para mostrar varias variables pondremos tantos % como valores vamos a mostrar 

        System.out.printf("n = %.2f x = %d %n",n,x);

        String num1 = JOptionPane.showInputDialog("Introduce un numero:");
        
        double num2 = Double.parseDouble(num1);// Convertir String a double 

        System.out.print("La raiz de " + num2 + " es ");
        System.out.printf("%.2f", Math.sqrt(num2));



        



    }
}
