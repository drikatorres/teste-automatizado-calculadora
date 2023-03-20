package service;

import model.Quadrado;
import model.Triangulo;

public class QuadradoService {

    public double calcularArea(double l){
        return l*l;
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado1 = calcularArea(quadrado1.getLado());
        double areaQuadrado2 = calcularArea(quadrado2.getLado());
        if(areaQuadrado1 > areaQuadrado2){
            return quadrado2;
        } else if (areaQuadrado1 < areaQuadrado2) {
            return quadrado1;
        }else {
            return null;
        }
    }
}
