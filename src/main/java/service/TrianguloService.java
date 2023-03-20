package service;

import model.Triangulo;

public class TrianguloService {
    public double calcularArea(double b, double h){
        return (b*h)/2;
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTriangulo1 = calcularArea(triangulo1.getBase(), triangulo1.getAltura());
        double areaTriangulo2 = calcularArea(triangulo2.getBase(), triangulo2.getAltura());
        if(areaTriangulo1 > areaTriangulo2){
            return triangulo2;
        } else if (areaTriangulo1 < areaTriangulo2) {
            return triangulo1;
        }else {
            return null;
        }
    }
}
