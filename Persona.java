package Persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;
    private int numtel;

    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getDniSinLetra(){
        return dniSinLetra;
    }

    public int getEdad(){
        return edad;
    }

    public int getNumtel(){
        return numtel;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setApellidos(String apell){
        this.apellidos = apell;
    }

    public void setDniSinLetra(int dni){
        this.dniSinLetra = dni;
    }

    public void setNumtel(int numtel){
        this.numtel= numtel;
    }

    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }
}
