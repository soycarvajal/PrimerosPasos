import javax.swing.JOptionPane;

public class Acceso_Aplicacion {
    public static void main(String[] args) {

        String clave = "Fernando";
        String pass = "";

        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña por favor");

            if (clave.equals(pass) == false) {

                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        }

        JOptionPane.showMessageDialog(null, "Contraseña correcta. \n Acceso permitido");
    }
}
