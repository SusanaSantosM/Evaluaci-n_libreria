import javax.swing.*;
import com.dam2024.librerias.Entrada;
import com.dam2024.librerias.Salida;

public class Main {
  public static void main(String[] args) {
    Float retorno = Calculadora.opcion(4, Entrada.VENTANA("Escriba el 1er número"),Entrada.VENTANA("Escriba el 2do número"));

    //Visualizamos el retorno
    if(retorno==null){
      JOptionPane.showMessageDialog(null,"Algo falla");
    }else
      Salida.VENTANA(retorno);
  }
}