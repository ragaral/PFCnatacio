package Utilitats;

import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Raul
 */
public class Calendari extends CalendariNotes.Vista{
    protected String data;

    @Override
    protected void eventoDia(ActionEvent e) {
        JButton boto = ((JButton)e.getSource());
        data = boto.getText()+"/"+(mes+1)+"/"+any;
//        System.out.println(this.getParent());
        if(this.getParent() instanceof Window)
            ((Window)this.getParent()).dispose();
    }
    
    public String toString(){
        return data;
    }
}
