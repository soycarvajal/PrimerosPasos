import javax.swing.JOptionPane;

public class Comprueba_Mail2 {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto = true;

        String mail = JOptionPane.showInputDialog("Introduce tu email");

        for (int i = 0; i < mail.length(); i++) { 
            if (mail.charAt(i) == '@') {
                arroba++;
            }
            if (mail.charAt(i) == '.') {
                punto = true;
            }
        }
        if (arroba == 1 && punto == true) {
            JOptionPane.showMessageDialog(null, "Es correcto");
        } else {
            JOptionPane.showMessageDialog(null, "No es correcto");

        }
    }
}
