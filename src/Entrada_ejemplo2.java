import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {
    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor.");

        String edad =  JOptionPane.showInputDialog("Introduce tu edad, por favor.");
        int edad_usuario = Integer.parseInt(edad);

        JOptionPane.showMessageDialog(null, "Hola " + nombre_usuario + " tienes " + edad + " años." + "\n El proximo año tendras " + (edad_usuario+1) + " años.");
        
    }
}
