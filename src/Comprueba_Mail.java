import javax.swing.JOptionPane;

public class Comprueba_Mail {
    public static void main(String[] args) {
        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("Introduce tu Email");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
            }
        }
        if (arroba == true) {
            JOptionPane.showMessageDialog(null, "Es correcto");
        } else {
            JOptionPane.showMessageDialog(null, "No es correcto");
        }
    }
}
