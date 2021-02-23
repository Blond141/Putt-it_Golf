package modele;

import java.util.Vector;

public class Vecteur {

    private double[] possition;
    private double[] vecteurForceResultant;
    private Vector<Double> forceX,forceY,forceZ;
    private double[] vecteurVitesseResultant;
    private Vector<Double> vitesseX,vitesseY,vitesseZ;
    private double[] vecteurAccelerationResultant;
    private Vector<Double> accelerationX,accelerationY,accelerationZ;

    public Vecteur(double[] positionBalle){
        possition = positionBalle;
        vecteurForceResultant = new double[]{0,0,0};
        vecteurVitesseResultant = new double[]{0,0,0};
        vecteurAccelerationResultant = new double[]{0,0,0};
        forceX = new Vector<>();
        forceY = new Vector<>();
        forceZ = new Vector<>();
        vitesseX = new Vector<>();
        vitesseY = new Vector<>();
        vitesseZ = new Vector<>();
        accelerationX = new Vector<>();
        accelerationY = new Vector<>();
        accelerationZ = new Vector<>();
    }

    private void refreshForce(){
        vecteurForceResultant[0] = forceX.stream().mapToDouble(Double ::doubleValue).sum();
        vecteurForceResultant[1] = forceY.stream().mapToDouble(Double ::doubleValue).sum();
        vecteurForceResultant[2] = forceZ.stream().mapToDouble(Double ::doubleValue).sum();
    }

    private void refreshVitesse(){
        vecteurVitesseResultant[0] = vitesseX.stream().mapToDouble(Double ::doubleValue).sum();
        vecteurVitesseResultant[1] = vitesseY.stream().mapToDouble(Double ::doubleValue).sum();
        vecteurVitesseResultant[2] = vitesseZ.stream().mapToDouble(Double ::doubleValue).sum();
    }

    private void refreshAcceleration(){
        vecteurAccelerationResultant[0] = accelerationX.stream().mapToDouble(Double ::doubleValue).sum();
        vecteurAccelerationResultant[1] = accelerationY.stream().mapToDouble(Double ::doubleValue).sum();
        vecteurAccelerationResultant[2] = accelerationZ.stream().mapToDouble(Double ::doubleValue).sum();
    }

    public int addforceX ( double vecteur){
        forceX.add(vecteur);
        refreshForce();
        return forceX.size() - 1;
    }

    public void setForceX ( int positionForce, double force){
        forceX.set(positionForce, force);
        refreshForce();
    }

    public int addforceY ( double vecteur){
        forceY.add(vecteur);
        refreshForce();
        return forceY.size() - 1;
    }

    public void setForceY ( int positionForce, double force){
        forceY.set(positionForce, force);
        refreshForce();
    }

    public int addforceZ ( double vecteur){
        forceZ.add(vecteur);
        refreshForce();
        return forceZ.size() - 1;
    }

    public void setForceZ ( int positionVitesse, double vitesse){
        forceZ.set(positionVitesse, vitesse);
        refreshForce();
    }



    public int addVitesseX(double vecteur){
        vitesseX.add(vecteur);
        refreshVitesse();
        return vitesseX.size()-1;
    }

    public void setVitesseX(int positionVitesse, double vitesse){
        forceX.set(positionVitesse,vitesse);
        refreshVitesse();
    }

    public int addVitesseY(double vecteur){
        vitesseY.add(vecteur);
        refreshVitesse();
        return vitesseY.size()-1;
    }

    public void setVitesseY(int positionVitesse, double vitesse){
        vitesseY.set(positionVitesse,vitesse);
        refreshVitesse();
    }

    public int addVitesseZ(double vecteur){
        vitesseZ.add(vecteur);
        refreshVitesse();
        return vitesseZ.size()-1;
    }

    public void setVitesseZ(int positionVitesse, double vitesse){
        forceZ.set(positionVitesse,vitesse);
        refreshVitesse();
    }



    public int addAccelerationX(double vecteur){
        accelerationX.add(vecteur);
        refreshVitesse();
        return accelerationX.size()-1;
    }

    public void setAccelerationX(int positionAcceleration, double acceleration){
        forceX.set(positionAcceleration,acceleration);
        refreshAcceleration();
    }

    public int addAccelerationY(double vecteur){
        accelerationY.add(vecteur);
        refreshVitesse();
        return accelerationY.size()-1;
    }

    public void setAccelerationY(int positionAcceleration, double acceleration){
        forceY.set(positionAcceleration,acceleration);
        refreshAcceleration();
    }

    public int addAccelerationZ(double vecteur){
        accelerationZ.add(vecteur);
        refreshVitesse();
        return accelerationZ.size()-1;
    }

    public void setAccelerationZ(int positionAcceleration, double acceleration){
        forceZ.set(positionAcceleration,acceleration);
        refreshAcceleration();
    }



    public double[] getPossition() {
        return possition;
    }

    public double[] getVecteurForceResultant() {
        return vecteurForceResultant;
    }

    public double[] getVecteurVitesseResultant() {
        return vecteurVitesseResultant;
    }

    public double[] getVecteurAccelerationResultant() {
        return vecteurAccelerationResultant;
    }
}
