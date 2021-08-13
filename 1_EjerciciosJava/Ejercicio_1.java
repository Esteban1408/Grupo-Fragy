import javax.swing.JOptionPane;


public class Ejercicio_1 {

	
	public static void main(String[] args) {
		//Lee el nombre del usuario
		String nombre;
		nombre=JOptionPane.showInputDialog("Ingrese nombre del usuario");
		
		//Imprime el resultado
		JOptionPane.showMessageDialog(null, "Buenos dias "+ nombre);

	}

}
