package Persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;
    private int peso;

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

    public int getPeso(){
        return peso;
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

    public void setPeso(int pes){
        this.peso = pes;
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
