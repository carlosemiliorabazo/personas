package Persona;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dniSinLetra;
    private int edad;
    private String signozodiaco;
    private int hijos;
    private int telefono;

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


    public String getSignozodiaco(){
        return signozodiaco;

    public int getHijos() {
        return hijos;
    }

    public int getTelefono(){
        return telefono;

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

    public void setSignozodiaco(String signozodiaco){
        this.signozodiaco = signozodiaco;
    }

    public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
    }

    public void setHijos(int hj) {
        this.hijos = hj;
    }

    public void setTelefono(int tlf){
        this.telefono = tlf;
    }
}
