import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        String name;
        int confirmation;

        while (true) {
            
            name = JOptionPane.showInputDialog(null, "Please enter your name:");

            
            if (name == null) {
                break;
            }

            
            confirmation = JOptionPane.showConfirmDialog(null, 
                "Do you want to display your name: " + name + "?", 
                "Name Confirmation", 
                JOptionPane.YES_NO_OPTION);

            
            if (confirmation == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;
            }
        }
    }
}
