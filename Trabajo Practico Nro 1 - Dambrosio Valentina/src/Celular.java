public class Celular {
    //Atributos
    private String Modelo;
    private String Marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    //Constructores
    public Celular(){}

    public Celular(String Modelo, String Marca, int memoria, boolean radio, int nroCelular){
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.memoria = memoria;
        this.radio = radio;
        this.nroCelular = nroCelular;
    }

    Celular celular = new Celular("Galaxy A04", "Samsung", 0, false, 0);

    public void realizarLlamada(){
        System.out.println("Llamando...");
    }

    public void cortarLlamada(){
        System.out.println("Llamada terminada.");
    }
}
