public class PaterneCaree {

    public PaterneCaree(){}

    public void addpaterneCarre(Map m, MoteurGraphique mg, int sourisX, int sourisY) {
        double fenetre_size_x = mg.getContentPane().getWidth();
        double fenetre_size_y = mg.getContentPane().getHeight();
        int positionCeluleX = Math.round(((float)sourisX/(float)fenetre_size_x)*(float)m.getSize_x());
        int positionCeluleY = Math.round(((float)sourisY/(float)fenetre_size_y)*(float)m.getSize_y());

        m.get_celule_by_co(positionCeluleX, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX-1, positionCeluleY).set_etat(true);
        m.get_celule_by_co(positionCeluleX, positionCeluleY-1).set_etat(true);
        m.get_celule_by_co(positionCeluleX-1, positionCeluleY-1).set_etat(true);
    }

}
