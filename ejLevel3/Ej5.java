/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
generar un Map<String, Integer> donde la clave de Map será el apellido
concatenado con el nombre (con separador de espacio en blanco) y el value la
edad del alumno.
- La lista de entrada debe estar cargada con varios alumnos (al menos 5)
para subir el ejemplo y demostrar su funcionamiento.
- En ejemplo se muestra solo con 1 Alumno a modo de abreviar
- En el ejemplo también se usa LocalDate.now().minusYears(30), en el
ejercicio a presentar se deberá usar otra tecnica de construcción para la
fecha (no usar .now(). Pueden ver métodos .parse(), etc)
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Ej5{
    
public static class Alumno{
private String nombre;
private String apellido;
private LocalDate fechaNacimiento;

public Alumno(String nombre, String apellido, LocalDate fechaNacimiento){
   this.nombre = nombre;
   this.apellido = apellido;
   this.fechaNacimiento = fechaNacimiento;
   }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public LocalDate getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(LocalDate fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
        
        
    public int edad(){       
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formattedString = this.fechaNacimiento.format(formatter);
        LocalDate fecha = LocalDate.parse(formattedString, formatter);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fecha, ahora);
        return periodo.getYears();
    } 
    
    public String clave(){
        String salida = this.nombre + " " + this.apellido;
        return salida;
    }
}


   public static void main(String[] args){
       
        Map<String, Integer> salida = new HashMap<>();
        List<Alumno> alumnos = new ArrayList<>();
        
        LocalDate homeroDate = LocalDate.parse("1975-11-13");
        LocalDate margeDate = LocalDate.parse("1977-11-07");
        LocalDate bartDate = LocalDate.parse("2005-10-27");
        LocalDate lisaDate = LocalDate.parse("2011-09-01");
        LocalDate maggieDate = LocalDate.parse("2017-07-01");
 
        Alumno alumno0 = new Alumno("Homero", "Simpson", homeroDate);
        Alumno alumno1 = new Alumno("Marge", "Bouvier", margeDate);
        Alumno alumno2 = new Alumno("Bart", "Simpson", bartDate);
        Alumno alumno3 = new Alumno("Lisa", "Simpson", lisaDate);
        Alumno alumno4 = new Alumno("Maggie", "Simpson", maggieDate);
        
        alumnos.add(alumno0);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);

        salida = alumnos.stream().collect(Collectors.toMap(Alumno::clave, Alumno::edad));
        
        System.out.println(salida);
   
        }
    }
