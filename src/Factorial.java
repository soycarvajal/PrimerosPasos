import javax.swing.JOptionPane;

public class Factorial {
    public static void main(String[] args) {
        
        int resultado = 1; 
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        
        for (int i=numero;i>0;i--){
            resultado=resultado*i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + resultado + ".");
        
    }
}
