/*Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial pero no se desean valores repetidos.*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashSet;
import java.util.Set;

public class Ej4{
   public static void main(String[] args){
   
   List<Integer> numbers = List.of(1, 2, 4, 4, 4);
   List<Integer> salida = new ArrayList<>();
   Set<Integer> resultado = new HashSet<>();
   salida = numbers.stream().map(n -> factorial(n)).collect(Collectors.toList());
   
   resultado = salida.stream().collect(Collectors.toSet());   
   
   System.out.println(resultado);
   
   }
   
   public static int factorial(int number) {
       int result = 1;
       for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}