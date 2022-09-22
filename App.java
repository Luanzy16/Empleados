import java.time.LocalDate;

public class App {
  public static void main(String[] args) {
    // Empleados Fijos
    Empleado fijo1 = new Fijo(45612, "Luis Sanchez",LocalDate.of(2020, 4, 8), 700000, "arquitecto", 2);
    Empleado fijo2 = new Fijo(1233, "Juan Ortega", LocalDate.of(2017, 6,25), 65000, "desarrollador", 8);

    //Empleados Domiciliarios
    Empleado domicilo1 = new Domicilio(123789, "fernando gonzales",LocalDate.of(2020, 4, 8), 5);
    Empleado domicilio2 = new Domicilio(45698, "juan fernandez", LocalDate.of(2017, 6,25), 9);

    System.out.println(fijo1);
    System.out.println(fijo2);
    System.out.println(domicilo1);
    System.out.println(domicilio2);

    LocalDate fecha = LocalDate.now();

    if (fecha.getYear() - domicilo1.fechaIngreso.getYear() > 3){
      System.out.println("El empleado"+ domicilo1.nombre+" lleva mas de 3 años");
    }

    if (fecha.getYear() - domicilio2.fechaIngreso.getYear() > 3){
      System.out.println("El empleado"+ domicilio2.nombre+" lleva mas de 3 años");
    }
    
  }
}
