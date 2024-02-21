import javax.swing.Icon;
import java.awt.*;
import java.awt.geom.*;

public class TestIcon implements Icon {
    TestIcon(int size_){
        size = size_;
    }

    public int getIconWidth(){
        return size;
    }

    public int getIconHeight(){
        return size;
    }

    public void paintIcon(Component c, Graphics g, int x, int y){
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y, size, size);
        g2.setColor(Color.BLUE);
        g2.fill(planet);
    }

    private int size;
}