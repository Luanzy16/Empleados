import java.time.LocalDate;

public abstract class Empleado  {
  protected int id;
  protected String nombre;
  protected LocalDate fechaIngreso;
  
  public Empleado(int id, String nombre, LocalDate fechaIngreso) {
    this.id = id;
    this.nombre = nombre;
    this.fechaIngreso = fechaIngreso;
  }

  public abstract int calcularSalario();

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public LocalDate getFechaIngreso() {
    return fechaIngreso;
  }

  public void setFechaIngreso(LocalDate fechaIngreso) {
    this.fechaIngreso = fechaIngreso;
  }

  @Override
  public String toString() {
    return "Elementos [fechaIngreso=" + fechaIngreso + ", id=" + id + ", nombre=" + nombre + "]";
  }

  

  
  
}
