import java.io.BufferedReader;
import java.io.InputStreamReader;

// import java.io.*;

class testClass{
  public static void main(String[] args) {
    
      try {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int numeroEntero = Integer.valueOf(sc.readLine());             // Para ingresar un numero entero
        double numeroDecimalDouble = Double.valueOf(sc.readLine());    // Para ingresar un numero decimal double
        float numeroDecimalFloat = Float.valueOf(sc.readLine());       // Para ingresar un numero decimal float
        char caracter = sc.readLine().charAt(0);                       // Para ingresar un caracter
        String texto = sc.readLine();                                 // Para ingresar un texto o palabra
        
        }
      catch (Exception e ) {
        System.out.println(e);    // Imprime el mensaje de error ocurrido en el try
      }
  }
}
