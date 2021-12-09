/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
valores que NO sean null o vacío ("").
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ej1{
   public static void main(String[] args){
      
      List<String> palabras = new ArrayList<>();
      List<String> salida = new ArrayList<>();
      palabras.add("hola");
      palabras.add(null);
      palabras.add("Informatorio");

      salida = palabras.stream().filter(Objects::nonNull).collect(Collectors.toList());
      System.out.println(palabras);
      System.out.println(salida);
   }
}