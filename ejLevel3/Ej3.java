/*
Se dispone de una lista de Strings, de la cual saber la cantidad de valores que
comiencen con la letra B (tanto mayúscula como minúscula, en ese caso
decimos que será ignoreCase).
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ej3{
   public static void main(String[] args){
      List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl",
"Wonder Woman", "brainiac");
      List<String> salida = new ArrayList<>();
     
      salida = palabras.stream().filter(p -> p.startsWith("B")||p.startsWith("b")).collect(Collectors.toList());
      System.out.println(salida);
      }
   }