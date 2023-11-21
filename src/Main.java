public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        //declarar variable tipo perros
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

        //Obtener valores de cada atributo

    }
}