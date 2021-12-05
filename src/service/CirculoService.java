package service;

import java.util.Scanner;

import entidad.Circulo;
import interfaz.CalculosFormas;

public class CirculoService implements CalculosFormas {
Scanner read = new Scanner(System.in);

    public Circulo crearCirculo(){
        System.out.println("Ingrese el radio del circulo");
        double radio = read.nextDouble();
        System.out.println("Ingrese el diametro del circulo");
        double diametro = read.nextDouble();
        return new Circulo(radio, diametro);
    }
    
    // Área circulo: PI * radio ^ 2 
    @Override
    public double calcularArea(Object nuevo) {
        Circulo circulo = (Circulo) nuevo;
        double radio = circulo.getRadio();
        double area = (Math.pow(radio, 2))*pi;
        return area;
    }
    
    // Perímetro circulo: PI * diámetro.
    @Override
    public double calcularPerimetro(Object nuevo) {
        Circulo circulo = (Circulo) nuevo;
        double diametro = circulo.getDiametro();
        double perimetro = pi*diametro;
        return perimetro;
    }
    
}
