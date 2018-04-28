/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntouno;

/**
 *
 * @author Alumno
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    
    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }
    
    public double calcularDistanciaDesde(Punto parametros) {
        double cateto1= x-parametros.getX();
        double cateto2= y-parametros.getY();
        double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return hipotenusa;
    }
  
    public String retornar(){
        return "(x= " + getX() + ", y= " + getY() + ")";
        
}
}
