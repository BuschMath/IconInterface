import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Main {
    static public void main(String[] args){

        Icon icon = new TestIcon(20);

        JOptionPane.showMessageDialog(null, "Test Message", 
        "Dialog Box", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
