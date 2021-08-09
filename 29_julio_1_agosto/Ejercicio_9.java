import javax.swing.JOptionPane;

public class Ejercicio_9 {

	public static void main(String[] args) {
	//Lectura de datos
	int a=1;
	String palabra;
	String contraria= " ";
	palabra=JOptionPane.showInputDialog("Ingrese cualquier palabra: ");
	
	//Separador de letras
	for(int contador = palabra.length()-1; contador >=0; contador--) {
			contraria += palabra.charAt(contador);
		}
	//Impresion de resultados
	JOptionPane.showMessageDialog(null, palabra + "\n"+contraria,"Inverso de una palabra",a);
	}

}
