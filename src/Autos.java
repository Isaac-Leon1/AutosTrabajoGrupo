public class Autos {
    public String marca;
    public String modelo;
    public String color;
    public int anio;
    public String cilindraje;

    Autos(String nuevaMarca){
        marca=nuevaMarca;
    }

    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getColor(){
        return color;
    }
    public int getAnio(){
        return anio;
    }
    public String getCilindraje(){
        return cilindraje;
    }

    public void setModelo(String newModel){
        this.modelo=newModel;
    }
    public void setColor(String newColor){
        this.color=newColor;
    }
    public void setAnio(int newAnio){
        this.anio=newAnio;
    }
    public void setCilindraje(String newCilindraje){
        this.cilindraje=newCilindraje;
    }
}
