import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfaceNewMap extends JPanel {

    boolean isVisible = false;
    MoteurGraphique moteurGraphique;

    public InterfaceNewMap(MoteurGraphique mg){
        this.moteurGraphique = mg;

        this.setBounds((moteurGraphique.getContentPane().getWidth()/2)-200,(moteurGraphique.getContentPane().getHeight()/2)-100,400, 200);
        this.setBackground(new Color(0,0,0,200));

        Font fontSet = new Font("SansSerif", Font.BOLD, 20);

        JTextField textSetX = new JTextField("Set x");
        textSetX.setPreferredSize(new Dimension(70, 30));
        textSetX.setEditable(false);
        textSetX.setFont(fontSet);
        textSetX.setBackground(new Color(0,0,0,0));
        textSetX.setForeground(Color.WHITE);
        textSetX.setBorder(new LineBorder(new Color(0,0,0,0)));
        JTextField textFieldX = new JTextField();
        textFieldX.setPreferredSize(new Dimension(70, 30));
        JPanel panelSetX = new JPanel();
        panelSetX.setBackground(new Color(0,0,0,0));
        panelSetX.add(textSetX);
        panelSetX.add(textFieldX);

        JTextField textSetY = new JTextField("Set y");
        textSetY.setPreferredSize(new Dimension(70, 30));
        textSetY.setEditable(false);
        textSetY.setFont(fontSet);
        textSetY.setBackground(new Color(0,0,0,0));
        textSetY.setForeground(Color.WHITE);
        textSetY.setBorder(new LineBorder(new Color(0,0,0,0)));
        JTextField textFieldY = new JTextField();
        textFieldY.setPreferredSize(new Dimension(70, 30));
        JPanel panelSetY = new JPanel();
        panelSetY.setBackground(new Color(0,0,0,0));
        panelSetY.add(textSetY);
        panelSetY.add(textFieldY);

        JButton maprandom = new JButton("<html>Random Celule</html>");
        maprandom.setPreferredSize(new Dimension(150,30));
        maprandom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(maprandom.getText() == "<html>Random Celule</html>"){
                    maprandom.setText("<html>Empty Celule</html>");
                }else{
                    maprandom.setText("<html>Random Celule</html>");
                }
            }
        });


        JButton bouttonNewMAp = new JButton("<html>New<br>Map</html>");
        bouttonNewMAp.setPreferredSize(new Dimension(90,90));
        bouttonNewMAp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    boolean random;
                    int numberX = Integer.parseInt(textFieldX.getText());
                    int numberY = Integer.parseInt(textFieldY.getText());
                    if(maprandom.getText() == "<html>Random Celule</html>"){
                        random = true;
                    }else{
                        random = false;
                    }
                    Map m = new Map(numberX, numberY, random);
                    moteurGraphique.setMap(m);
                    moteurGraphique.revalidate();
                    moteurGraphique.repaint();

                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
            }
        });


        this.add(panelSetX);
        this.add(panelSetY);
        this.add(maprandom,BorderLayout.LINE_START);
        this.add(bouttonNewMAp ,BorderLayout.LINE_START);

        this.setVisible(isVisible);
    }

    public void MiseAJour(){
        this.setBounds((moteurGraphique.getContentPane().getWidth()/2)-200,(moteurGraphique.getContentPane().getHeight()/2)-200,400, 200);
    }

    public void switchVisible(){
        if (isVisible == true){
            isVisible = false;
        }else{
            isVisible = true;
        }
        this.setVisible(isVisible);
    }

}
