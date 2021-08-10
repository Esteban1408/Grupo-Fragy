import javax.swing.JOptionPane;

public class Ejercicio_8 {

	public static void main(String[] args) {
		//Lee las medidas de la base y altura de un triangulo
		int b,h,a=1;
		double A;
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo "));
		h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo "));
		
		//Formula del triangulo
		A=(b*h)/2;
		
		//Imprime el resultado
		JOptionPane.showMessageDialog(null, "El area es: "+ A,"Area de un triangulo",a);
	}

}
