/*
Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2.
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.Math;

public class Ej2{
   public static void main(String[] args){
   List<Integer> entrada = List.of(1,2,3,4,5);
   List<Integer> salida = new ArrayList<>();
   System.out.println(entrada);
   salida = entrada.stream().map(x ->x*x).collect(Collectors.toList());
   System.out.println(salida);
      }

  }