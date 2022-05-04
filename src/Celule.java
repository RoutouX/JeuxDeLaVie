public class Celule extends position2D {

    private boolean etat = false;
    private boolean pre_etat = false;

    public Celule(boolean etat, int x, int y){
        position2D(x, y);
        this.etat = etat;
    }

    public boolean get_etat(){
        return this.etat;
    }

    public void set_etat(boolean etat){
        this.etat = etat;
    }

    public void pre_update(Map m)
    {
        Celule celule_haut_gauche;
        Celule celule_haut_milieu;
        Celule celule_haut_droit;

        Celule celule_milieu_gauche;
        Celule celule_milieu_droite;

        Celule celule_bas_gauche;
        Celule celule_bas_milieu;
        Celule celule_bas_droit;


        if(m.celul_exist(this.get_x()-1, this.get_y()-1)) {
            celule_haut_gauche = m.get_celule_by_co(this.get_x() - 1, this.get_y() - 1);
        }else {
            celule_haut_gauche = new Celule(false, this.get_x()-1, this.get_y()-1);
        }
        if(m.celul_exist(this.get_x(), this.get_y()-1)) {
            celule_haut_milieu = m.get_celule_by_co(this.get_x(), this.get_y() - 1);
        }else {
            celule_haut_milieu = new Celule(false, this.get_x(), this.get_y()-1);
        }
        if(m.celul_exist(this.get_x()+1, this.get_y()-1)) {
            celule_haut_droit = m.get_celule_by_co(this.get_x() + 1, this.get_y() - 1);
        }else {
            celule_haut_droit = new Celule(false, this.get_x()+1, this.get_y()-1);
        }

        if(m.celul_exist(this.get_x()-1, this.get_y())) {
            celule_milieu_gauche = m.get_celule_by_co(this.get_x() - 1, this.get_y());
        }else {
            celule_milieu_gauche = new Celule(false, this.get_x()-1, this.get_y());
        }
        if(m.celul_exist(this.get_x()+1, this.get_y())) {
            celule_milieu_droite = m.get_celule_by_co(this.get_x() + 1, this.get_y());
        }else {
            celule_milieu_droite = new Celule(false, this.get_x()+1, this.get_y());
        }

        if(m.celul_exist(this.get_x()-1, this.get_y()+1)) {
            celule_bas_gauche = m.get_celule_by_co(this.get_x() - 1, this.get_y() +1);
        }else {
            celule_bas_gauche = new Celule(false, this.get_x()-1, this.get_y()+1);
        }
        if(m.celul_exist(this.get_x(), this.get_y()+1)) {
            celule_bas_milieu = m.get_celule_by_co(this.get_x(), this.get_y() + 1);
        }else {
            celule_bas_milieu = new Celule(false, this.get_x(), this.get_y()+1);
        }
        if(m.celul_exist(this.get_x()+1, this.get_y()+1)) {
            celule_bas_droit = m.get_celule_by_co(this.get_x() + 1, this.get_y() + 1);
        }else {
            celule_bas_droit = new Celule(false, this.get_x()+1, this.get_y()+1);
        }

        int cpt_celule = 0;
        if (celule_haut_gauche.get_etat()){cpt_celule++;}
        if (celule_haut_milieu.get_etat()){cpt_celule++;}
        if (celule_haut_droit.get_etat()){cpt_celule++;}
        if (celule_milieu_gauche.get_etat()){cpt_celule++;}
        if (celule_milieu_droite.get_etat()){cpt_celule++;}
        if (celule_bas_gauche.get_etat()){cpt_celule++;}
        if (celule_bas_milieu.get_etat()){cpt_celule++;}
        if (celule_bas_droit.get_etat()){cpt_celule++;}

        this.pre_etat = (cpt_celule == 3)||(this.etat==true&&cpt_celule==2);
    }

    public void update(){
        this.etat=this.pre_etat;
    }



}
