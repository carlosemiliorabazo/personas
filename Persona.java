package Persona;

public class Persona {
  private String nombre;
  private String apellidos;
  private int dnisinletra;
  private int edad;
  private String comidaFavorita;
  private String nacionalidad;
  private int hijos;
  private int telefono;

  public String getNombre(){
      return nombre;
  }
  
  public String getApellidos(){
      return apellidos;
  }
  
  public int getDnisinletra(){
      return dnisinletra;
  }

  public string getcomidaFavorita(){
      return dniSinLetra;
  }

  public int getEdad(){
      return edad;
  }
  
  public String getNacionalidad(){
      return nacionalidad;
  }

  public int getHijos() {
      return hijos;
  }

  public int getTelefono(){
      return telefono;
  }

  public void setNombre(String nom){
      this.nombre = nom;
  }

  public void setcomidaFavorita(String CF){
      this.comidaFavorita= CF;
  }
  
  public void setApellidos(String apell){
      this.apellidos = apell;
  }
  
  public void setApellidos(String apel){
      this.apellidos= apel;
  }
  
  public void setDnisinletra(int dni){
      this.dnisinletra = dni;
  }
  
  public void setEdad(int ed){
        if (ed >= 18){
            System.out.println("Estás hecho un chaval");
        } else {
            System.out.println("Ya eres talludito");
        }
        this.edad = ed;
  }
  
  public void setNacionalidad(String nac){
      this.nacionalidad = nac;
  }

  public void setHijos(int hj) {
      this.hijos = hj;
  }

  public void setTelefono(int tlf){
      this.telefono = tlf;
  }
  
}
