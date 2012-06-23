package Utilitats;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Raul
 */
public class XMLProva {
    static Properties properties = new Properties();
    static final String path = "C:\\config.xml";
    
    public static boolean loadConfig(){
        File file = new File(path);
        if(file.exists()){
            properties.clear();
            try {
                InputStream inputStream = new FileInputStream(file);
                try {
                    properties.loadFromXML(inputStream);
                    javax.swing.JOptionPane.showMessageDialog(null, "Config loaded!", "Is ok", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    load();
                    return true;
                } catch (java.util.InvalidPropertiesFormatException invalidPropertiesFormatException) {
                    invalidPropertiesFormatException.printStackTrace();
                } catch (java.io.IOException ioException) {ioException.printStackTrace();}
            } catch (java.io.FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }
        return false;
    }
    
    static javax.swing.JToggleButton buttons[]=new javax.swing.JToggleButton[6];
    
    public static void load(){
        //esta linea me la e inventat!
        for(int index=0; index < properties.size(); index++){
            if(properties.containsKey((buttons[index].getText()))){
                boolean b=Boolean.valueOf(properties.getProperty(buttons[index].getText()));
                if(b)buttons[index].doClick();
            }
        }
    }

    static boolean loaded = false;

    public static void main(String[] args) {
        final javax.swing.JFrame frame = new javax.swing.JFrame();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        javax.swing.border.Border border = javax.swing.BorderFactory.createTitledBorder("Buttons");
        panel.setBorder(border);
        panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        frame.setSize(frameWIDTH, frameHEIGHT);
        final javax.swing.JButton buttonClose = new javax.swing.JButton("Close");
        frame.setLayout(new java.awt.BorderLayout());
        final javax.swing.JButton buttonSaveConfig = new javax.swing.JButton("Save config");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        final javax.swing.JButton buttonOpenFileConfig=new javax.swing.JButton("Open file");
        ActionListener actionListener=new ActionListener() {
            @Override
            public void actionPerformed(final java.awt.event.ActionEvent actionEvent) {
                if(actionEvent.getActionCommand().equalsIgnoreCase(buttonOpenFileConfig.getText())){
                    if(java.awt.Desktop.isDesktopSupported()){
                        try {
                            java.awt.Desktop.getDesktop().open(new java.io.File(path));
                        } catch (java.io.IOException ioException) {
                            ioException.printStackTrace();
                        }
                    }
                }else
                    if(actionEvent.getActionCommand().equalsIgnoreCase(buttonClose.getText())){
                        System.exit(0);
                    }else
                        if(actionEvent.getActionCommand().equalsIgnoreCase(buttonSaveConfig.getText())){
                            java.io.FileOutputStream fileOutputStream=null;
                            try {
                                fileOutputStream = new java.io.FileOutputStream(path,false);
                                try {
                                    properties.storeToXML(fileOutputStream, "Config");
                                    javax.swing.JOptionPane.showMessageDialog(frame, "Config saved!", "Is ok", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                                } catch (Exception exception) {exception.printStackTrace();}
                            } catch (java.io.FileNotFoundException fileNotFoundException) {
                                fileNotFoundException.printStackTrace();
                            }
                        }else{
                            javax.swing.AbstractButton button=(javax.swing.AbstractButton)actionEvent.getSource();
                            if(button.isSelected())
                                properties.put(button.getText(),String.valueOf(true));
                            else
                                properties.put(button.getText(),String.valueOf(false));
                        }
            }
        };

        for(int index=0;index < buttons.length; index++){
            buttons[index]=new javax.swing.JToggleButton(String.valueOf(index));
            buttons[index].addActionListener(actionListener);
            panel.add(buttons[index]);
        }

        javax.swing.JPanel panel2 = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
        panel2.add(buttonSaveConfig);
        panel2.add(buttonOpenFileConfig);
        panel2.add(buttonClose);
        buttonClose.addActionListener(actionListener);
        frame.getContentPane().add(panel2,java.awt.BorderLayout.CENTER);
        buttonSaveConfig.addActionListener(actionListener);
        buttonOpenFileConfig.addActionListener(actionListener);
        frame.getContentPane().add(panel,java.awt.BorderLayout.NORTH);
        loaded=loadConfig();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    static final int frameHEIGHT =100;
    static final int frameWIDTH  =400;    
}
