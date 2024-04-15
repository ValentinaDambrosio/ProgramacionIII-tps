public class Auto {
    //Atributos
    private String color;
    private String patente;
    private int anio;
    private String modelo;
    private int km;
    private boolean encendido;

    //Constructores
    public Auto(){};
    public Auto(String color, String patente, int anio, String modelo, int km){
        this.color = color;
        this.patente = patente;
        this.anio = anio;
        this.modelo = modelo;
        this.km = km;
        encendido = false;
    }


    //Métodos
    public void encender(){
        encendido = true;
        System.out.println("El auto esta encendido.");
    }

    public void kilometrajeMayor(){
        if (km > 100000){
            System.out.println("Color: "+ color + "\nPatente: "+ patente +"\nAño: "+anio+"\nModelo: "+ modelo +"\nKilometraje: "+km);
        }
        else {
            System.out.println("El auto no tiene más de 100000km, no se puede mostrar el auto.");
        }
    }
}
