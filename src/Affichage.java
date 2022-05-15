import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;

public class Affichage extends JPanel {

    int sourisX;
    int sourisY;
    boolean affMapOver = false;
    int typePaterne = 1;
    Map m;
    Map mOver;
    MoteurGraphique mg;
    CareCelule[] tableauCareCelule;
    CareCeluleFake careCeluleFake;
    PaterneCelule paterneCelule;
    PaterneCaree paterneCaree;
    PaterneVaisseaux paterneVaisseaux;
    PaterneCanon paterneCanon;
    public Affichage(Map m, MoteurGraphique mg){
        this.m = m;
        this.mOver = new Map(m.size_x, m.size_y, false);
        this.mg = mg;
        this.paterneCelule = new PaterneCelule();
        this.paterneCaree = new PaterneCaree();
        this.paterneVaisseaux = new PaterneVaisseaux();
        this.paterneCanon = new PaterneCanon();


        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent me)
            {
                sourisX = me.getX();
                sourisY = me.getY();
                if(affMapOver){
                    mOver = new Map(m.size_x, m.size_y, false);
                    if (typePaterne == 1){paterneCelule.addpaterne(mOver, mg, sourisX, sourisY);}
                    else if(typePaterne == 2){paterneCaree.addpaterneCarre(mOver, mg, sourisX, sourisY);}
                    else if(typePaterne == 3){paterneVaisseaux.addpaterneV(mOver, mg, sourisX, sourisY);}
                    else if(typePaterne == 4){paterneCanon.addpaterneCanon(mOver, mg, sourisX, sourisY);}
                    mg.revalidate();
                    mg.repaint();
                }
            }
        });

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addPaterne();
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        double fenetre_size_x = mg.getContentPane().getWidth();
        double fenetre_size_y = mg.getContentPane().getHeight();
        int size_x = m.getSize_x();
        int size_y = m.getSize_y();

        int squareEveryX = (int) (fenetre_size_x / size_x);
        int squareEveryY = (int) (fenetre_size_y / size_y);

        this.tableauCareCelule = new CareCelule[m.getSize_x()*m.getSize_y()];

        int i = 0;
        for (int x=0; x<m.getSize_x();x++) {
            for (int y=0; y<m.getSize_y();y++) {
                tableauCareCelule[i] = new CareCelule((int) (x*squareEveryX), (int) (y*squareEveryY), (int) squareEveryX, (int) squareEveryY,m.get_celule_by_co(x, y).get_etat());
                i++;
            }
        }
        for(CareCelule c : tableauCareCelule) {
            c.paintcelule(g);
        }



        if(affMapOver){
            i = 0;
            for (int x=0; x<mOver.getSize_x();x++) {
                for (int y=0; y<mOver.getSize_y();y++) {
                    if(mOver.get_celule_by_co(x, y).get_etat()==true) {
                        careCeluleFake = new CareCeluleFake((int) (x * squareEveryX), (int) (y * squareEveryY), (int) squareEveryX, (int) squareEveryY, mOver.get_celule_by_co(x, y).get_etat());
                        careCeluleFake.paintcelule(g);
                        i++;
                    }
                }
            }
        }
    }

    public void changeAffichageMap(Map map){
        this.m = map;
    }

    public void setAffMapOver(boolean aff){
        this.affMapOver = aff;
    }
    public boolean getAffMapOver(){
        return this.affMapOver;
    }
    public void switchAffMapOver(){
        if(this.affMapOver == true){
            this.affMapOver = false;
        }
        else{
            this.affMapOver = true;
        }
    }

    public void addPaterne(){
        this.m.FusionOR(mOver);
    }

    public void settypePaterne(int type){this.typePaterne = type;}
    public int gettypePaterne(){return this.typePaterne;}
}
