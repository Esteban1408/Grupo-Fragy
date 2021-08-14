import javax.swing.JOptionPane;

public class Utils {
	int resultado=0,n1,n2,a=1,conti;
	double n1_1,n2_1,resultado2=0;
	boolean salir = false, operacion = false;
	public void leer() {
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	}
	public void leer2() {
		n1_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		n2_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	}
	public void sumar () {
		resultado=n1+n2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "SUMA", a);
	}
	public void restar () {
		resultado=n1-n2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "RESTA", a);
	}
	public void multiplicar () {
		resultado=n1*n2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "MULTIPLICACION", a);
	}
	public void division () {
		resultado2=n1_1/n2_1;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado2, "DIVISION", a);
	}
}
