import java.time.LocalDate;

public class Fijo extends Empleado {
  private int salarioBasico;
  private String rol;
  private int añosTrabajo;
 
  public Fijo(int id, String nombre, LocalDate fechaIngreso, int salarioBasico, String rol, int añosTrabajo) {
    super(id, nombre, fechaIngreso);
    this.salarioBasico = salarioBasico;
    this.rol = rol;
    this.añosTrabajo = añosTrabajo;
  }

  @Override
  public int calcularSalario() { 
    if (añosTrabajo > 2 && añosTrabajo <3){
      return salarioBasico += (0.05*salarioBasico);
    }
    if (añosTrabajo > 4 && añosTrabajo < 7){
      return salarioBasico += (0.1*salarioBasico);
    }
    if (añosTrabajo > 8 && añosTrabajo < 7){
      return salarioBasico += (0.15*salarioBasico);
    }
    else return salarioBasico += (0.2*salarioBasico);
  
  }

  public int getSalarioBasico() {
    return salarioBasico;
  }

  public void setSalarioBasico(int salarioBasico) {
    this.salarioBasico = salarioBasico;
  }

  public String getRol() {
    return rol;
  }

  public void setRol(String rol) {
    this.rol = rol;
  }

  public int getAñosTrabajo() {
    return añosTrabajo;
  }

  public void setAñosTrabajo(int añosTrabajo) {
    this.añosTrabajo = añosTrabajo;
  }

  @Override
  public String toString() {
    return super.toString()+"Fijo [añosTrabajo=" + añosTrabajo + ", rol=" + rol + ", salarioBasico=" + salarioBasico + "]";
  }

  
  

  
}
