import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autos Auto1;
        Autos Auto2;
        Autos Auto3;

        Auto1= new Autos("Toyota");
        Auto2 = new Autos("Nissan");
        Auto3=  new Autos("Chevrolet");
        //Seteos
        Auto1.setModelo("Rav4");
        Auto2.setModelo("GTR");
        Auto3.setModelo("Aveo");
        Auto1.setColor("Rojo");
        Auto2.setColor("Negro");
        Auto3.setColor("Gris");
        Auto1.setAnio(2003);
        Auto2.setAnio(2010);
        Auto3.setAnio(2021);
        Auto1.setCilindraje("2.0L");
        Auto2.setCilindraje("3.8L");
        Auto3.setCilindraje("1.4L");

        System.out.println("Auto 1");
        Auto1.imprimirDatos();
        System.out.println("Auto 2");
        Auto2.imprimirDatos();
        System.out.println("Auto 3");
        Auto2.imprimirDatos();

        int Suma= Auto1.getAnio()+Auto2.getAnio()+Auto3.getAnio();

        System.out.println("La suma de los años es: "+Suma);
        System.out.println("Ingrese los datos del primer auto");
        System.out.println("Año: ");
        int anioTemp = scanner.nextInt();
        Auto1.setAnio(anioTemp);

        System.out.println("Modelo: ");
        String modeloTemp = scanner.next();
        Auto1.setModelo(modeloTemp);

        System.out.println("Color: ");
        String colorTemp = scanner.next();
        Auto1.setColor(colorTemp);

        Auto1.imprimirDatos();

    }
}