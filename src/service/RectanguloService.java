package service;

import java.util.Scanner;

import entidad.Rectangulo;
import interfaz.CalculosFormas;

public class RectanguloService implements CalculosFormas{

    Scanner read = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        double base = read.nextDouble();
        System.out.println("Ingrese la altura del rectangulo");
        double altura = read.nextDouble();
        return new Rectangulo(base, altura);
    }
    // Área rectángulo: base * altura 
    @Override
    public double calcularArea(Object nuevo) {
        Rectangulo rectangulo = (Rectangulo)nuevo;
        double base = rectangulo.getBase();
        double altura = rectangulo.getAltura();
        double area = (base*altura);
        return area;
    }
    
    // Perímetro rectángulo: (base + altura) * 2.
    @Override
    public double calcularPerimetro(Object nuevo) {
        Rectangulo rectangulo = (Rectangulo)nuevo;
        double base = rectangulo.getBase();
        double altura = rectangulo.getAltura();
        double perimetro = Math.pow((base+altura), 2);
        return perimetro;
    }

}