public class Main {
    public static void main(String[] args) {
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
        System.out.println(Auto1.getMarca());
        System.out.println(Auto1.getModelo());
        System.out.println(Auto1.getColor());
        System.out.println(Auto1.getAnio());
        System.out.println(Auto1.getCilindraje());
        System.out.println("Auto 2");
        System.out.println(Auto2.getMarca());
        System.out.println(Auto2.getModelo());
        System.out.println(Auto2.getColor());
        System.out.println(Auto2.getAnio());
        System.out.println(Auto2.getCilindraje());
        System.out.println("Auto 3");
        System.out.println(Auto3.getMarca());
        System.out.println(Auto3.getModelo());
        System.out.println(Auto3.getColor());
        System.out.println(Auto3.getAnio());
        System.out.println(Auto3.getCilindraje());



    }
}