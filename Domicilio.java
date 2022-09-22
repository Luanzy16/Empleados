import java.time.LocalDate;

public class Domicilio extends Empleado {
  private int SALARIOMIN = 300000;
  private int VALORDOMICILIO = 9500;
  private int numDomicilios;
  
  public Domicilio(int id, String nombre, LocalDate fechaIngreso, int numDomicilios) {
    super(id, nombre, fechaIngreso);
    this.numDomicilios = numDomicilios;
  }

  @Override
  public int calcularSalario() {
    return (numDomicilios*VALORDOMICILIO)+SALARIOMIN;
  }

  public int getSALARIOMIN() {
    return SALARIOMIN;
  }

  public void setSALARIOMIN(int sALARIOMIN) {
    SALARIOMIN = sALARIOMIN;
  }

  public int getVALORDOMICILIO() {
    return VALORDOMICILIO;
  }

  public void setVALORDOMICILIO(int vALORDOMICILIO) {
    VALORDOMICILIO = vALORDOMICILIO;
  }

  public int getNumDomicilios() {
    return numDomicilios;
  }

  public void setNumDomicilios(int numDomicilios) {
    this.numDomicilios = numDomicilios;
  }

  @Override
  public String toString() {
    return super.toString()+ "Domicilio [SALARIOMIN=" + SALARIOMIN + ", VALORDOMICILIO=" + VALORDOMICILIO + ", numDomicilios="
        + numDomicilios + "]";
  }

  

  

  
  
}