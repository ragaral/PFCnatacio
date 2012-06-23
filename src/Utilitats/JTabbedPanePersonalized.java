package Utilitats;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Raul
 */
public class JTabbedPanePersonalized extends JTabbedPane implements MouseListener {

    public JTabbedPanePersonalized() {
        addMouseListener(this);
    }

    public JTabbedPanePersonalized(int tabPlacement) {
        super(tabPlacement);
        setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
    }

    @Override
    public void addTab(String title, Component component) {
        this.addTab(title, component, null);
    }

    public void addTab(String title, Component component, Icon extraIcon) {
        super.addTab(title, new CloseTabIcon(extraIcon), component);
    }

    public void addT(String title, Icon c, Component component) {
        super.addTab(title, c, component);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        try{
            int tabNumber = getUI().tabForCoordinate(this, e.getX(), e.getY());
            Rectangle rect = ((CloseTabIcon) getIconAt(tabNumber)).getBounds();
            if (rect.contains(e.getX(), e.getY())) {
                this.removeTabAt(tabNumber);
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            //Entra aci si no punxes en la pestanya. tabNumber = -1
        }
    }
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}


class CloseTabIcon implements Icon {
    private int x_pos;
    private int y_pos;
    private int width;
    private int height;
    private Icon fileIcon;
    private Color col;

    public CloseTabIcon(Icon fileIcon) {
        this.fileIcon = fileIcon;
        width = 16;
        height = 16;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        this.x_pos = x;
        this.y_pos = y;

        if (fileIcon != null) {
            fileIcon.paintIcon(c, g, x + width, y+2);
        }
        else{
            g.setColor(Color.black);
            int y_p = y + 2;
            g.drawLine(x + 3, y_p + 3, x + 10, y_p + 10);
            g.drawLine(x + 3, y_p + 4, x + 9, y_p + 10);
            g.drawLine(x + 4, y_p + 3, x + 10, y_p + 9);
            g.drawLine(x + 10, y_p + 3, x + 3, y_p + 10);
            g.drawLine(x + 10, y_p + 4, x + 4, y_p + 10);
            g.drawLine(x + 9, y_p + 3, x + 3, y_p + 9);
        }
    }

    @Override
    public int getIconWidth() {
        return width + (fileIcon != null ? fileIcon.getIconWidth() : 0);
    }

    @Override
    public int getIconHeight() {
        return height;
    }
    public Rectangle getBounds() {
        return new Rectangle(x_pos, y_pos, width, height);
    }
}
