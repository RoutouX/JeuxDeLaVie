public class PaterneCanon {

    public PaterneCanon(){}
    public void addpaterneCanon(Map m, MoteurGraphique mg, int sourisX, int sourisY) {
        double fenetre_size_x = mg.getContentPane().getWidth();
        double fenetre_size_y = mg.getContentPane().getHeight();
        int positionCeluleX = Math.round(((float)sourisX/(float)fenetre_size_x)*(float)m.getSize_x());
        int positionCeluleY = Math.round(((float)sourisY/(float)fenetre_size_y)*(float)m.getSize_y());

        m.get_celule_by_co(positionCeluleX, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX-13, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX-14, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX-13, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX-14, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX-4, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX-4, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX-4, positionCeluleY+1).set_etat(true);
        m.get_celule_by_co(positionCeluleX-3, positionCeluleY+2).set_etat(true);
        m.get_celule_by_co(positionCeluleX-3, positionCeluleY-2).set_etat(true);
        m.get_celule_by_co(positionCeluleX-2, positionCeluleY+3).set_etat(true);
        m.get_celule_by_co(positionCeluleX-2, positionCeluleY-3).set_etat(true);
        m.get_celule_by_co(positionCeluleX-1, positionCeluleY+3).set_etat(true);
        m.get_celule_by_co(positionCeluleX-1, positionCeluleY-3).set_etat(true);
        m.get_celule_by_co(positionCeluleX+1, positionCeluleY+2).set_etat(true);
        m.get_celule_by_co(positionCeluleX+1, positionCeluleY-2).set_etat(true);
        m.get_celule_by_co(positionCeluleX+2, positionCeluleY+1).set_etat(true);
        m.get_celule_by_co(positionCeluleX+2, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX+2, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX+3, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX+6, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX+6, positionCeluleY-2).set_etat(true);
        m.get_celule_by_co(positionCeluleX+6, positionCeluleY-3).set_etat(true);
        m.get_celule_by_co(positionCeluleX+7, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX+7, positionCeluleY-2).set_etat(true);
        m.get_celule_by_co(positionCeluleX+7, positionCeluleY-3).set_etat(true);
        m.get_celule_by_co(positionCeluleX+8, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX+8, positionCeluleY-4).set_etat(true);

        m.get_celule_by_co(positionCeluleX+10, positionCeluleY+1).set_etat(true);
        m.get_celule_by_co(positionCeluleX+10, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX+10, positionCeluleY-4).set_etat(true);
        m.get_celule_by_co(positionCeluleX+10, positionCeluleY-5).set_etat(true);

        m.get_celule_by_co(positionCeluleX+20, positionCeluleY-2).set_etat(true);
        m.get_celule_by_co(positionCeluleX+20, positionCeluleY-3).set_etat(true);
        m.get_celule_by_co(positionCeluleX+21, positionCeluleY-2).set_etat(true);
        m.get_celule_by_co(positionCeluleX+21, positionCeluleY-3).set_etat(true);
    }

}
