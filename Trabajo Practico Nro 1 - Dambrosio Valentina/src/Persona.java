public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    //Constructores
    public Persona(){};

    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    Persona persona = new Persona("Lautaro", "Martinez", ' ', 0, null);


    //Metodos
    public void mostrarDatos(){
        if (edad >= 18){
            System.out.println("Nombre :" + nombre + "\nApellido: " + apellido + "\nSexo: " + sexo + "\nEdad: " + edad + "\nCiudad: " + ciudad);
        }
        else {
            System.out.println("La persona no es mayor de edad, no es posible mostrar sus datos.");
        }

    }


}
