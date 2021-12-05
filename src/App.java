import java.util.Scanner;

import entidad.Circulo;
import entidad.Rectangulo;
import service.CirculoService;
import service.RectanguloService;

// Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
// de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
// calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
// llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
// perímetro y el valor de PI como constante.
// Desarrollar el ejercicio para que las formas implementen los métodos de la
// interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
// formas y se mostrará el resultado final.
// Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
// Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        CirculoService cs = new CirculoService();
        RectanguloService rs = new RectanguloService();

        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        int op;
        int op2 = 0;

        do {
            System.out.println("MENU");
            System.out.println("1.Crear Circulo");
            System.out.println("2.Calcular area circulo");
            System.out.println("3.Calcular perimetro circulo");
            System.out.println("4.Crear Rectangulo");
            System.out.println("5.Calcular area rectangulo");
            System.out.println("6.Calcular perimetro rectangulo");
            System.out.println("7.Salir");
            System.out.println("Ingrese una opcion: ");

            op = read.nextInt();
            while (op < 0 || op > 7) {
                System.out.println("Opcion incorrecta, elija la opcion 1 y 7");
                op = read.nextInt();
            }

            switch (op) {
                case 1:
                    circulo = cs.crearCirculo();
                    System.out.println("Circulo creado!");
                    break;
                case 2:
                    System.out.println("El area del circulo creado es "+cs.calcularArea(circulo));
                    break;
                case 3:
                    System.out.println("El perimetro del circulo creado es "+cs.calcularPerimetro(circulo));
                    break;
                case 4:
                    rectangulo = rs.crearRectangulo();
                    System.out.println("Rectangulo creado!");
                    break;
                case 5:
                    System.out.println("El area del rectangulo creado es "+rs.calcularArea(rectangulo));
                    break;
                case 6:
                    System.out.println("El perimetro del rectangulo creado es "+rs.calcularPerimetro(rectangulo));
                    break;
                case 7:
                    System.out.println("Esta seguro que desea salir?");
                    System.out.println("1.Si");
                    System.out.println("2.No");
                    op2 = read.nextInt();
                    while (op2 != 1 && op2 != 2) {
                        System.out.println("Ingrese una opcion correcta");
                        op2 = read.nextInt();
                    }
            }
        } while (op2 != 1);
    }

}
