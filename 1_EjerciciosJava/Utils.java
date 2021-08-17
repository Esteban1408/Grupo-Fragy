import javax.swing.JOptionPane;

public class Utils {
	int resultado=0,number1,number2,continuar;
	double number1Boolean,number2Boolean,resultado2=0;
	boolean salir = false, otraOperacion = false;
	public void leer() {
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	}
	public void leerBoolean() {
		number1Boolean = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		number2Boolean = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
	}
	public boolean hacerOtraOperacion() {
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
		if (continuar == 0) {
			otraOperacion = true;
		}
		return otraOperacion;
	}
	public void sumar () {
		resultado=number1+number2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "SUMA", JOptionPane.INFORMATION_MESSAGE);
	}
	public void restar () {
		resultado=number1-number2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "RESTA", JOptionPane.INFORMATION_MESSAGE);
	}
	public void multiplicar () {
		resultado=number1*number2;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "MULTIPLICACION", JOptionPane.INFORMATION_MESSAGE);
	}
	public void division () {
		resultado2=number1Boolean/number2Boolean;
		JOptionPane.showMessageDialog(null, "Resultado: " + resultado2, "DIVISION", JOptionPane.INFORMATION_MESSAGE);
	}
	public void celsiusFahrenheit () {
		double GC;
		GC=Double.parseDouble(JOptionPane.showInputDialog("Digite grados: (Celsius)"));
		
		double GF=32 + ( (9 * GC) / 5);
		
		JOptionPane.showMessageDialog(null, "Grados Celsius: "+ GC+"\nGrados Fahrenheit: "+GF,"Celsius a Fahrenheit",JOptionPane.INFORMATION_MESSAGE);
	}
	public void areaTriangulo (){
		int b,h;
		double A;
		b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo "));
		h=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo "));

		A=(b*h)/2;

		JOptionPane.showMessageDialog(null, "El area es: "+ A,"Area de un triangulo",JOptionPane.INFORMATION_MESSAGE);
	}
	public void horaExacta() {
		int H,M=1,S=1,DN;
		H=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora "));
		M=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minuto "));
		S=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo "));
		DN=Integer.parseInt(JOptionPane.showInputDialog("¿AM o PM? "+"\n  0       1"));
		
		if(13>H && H>=1 && 60>M && M>=0 && 60>S && S>=0 && DN==1) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ H + ":"+ M + ":"+ S + " PM " +"es VALIDA","Hora",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(13>H && H>=1 && 60>M && M>=0 && 60>S && S>=0 && DN==0) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ H + ":"+ M + ":"+ S + " AM " +"es VALIDA","Hora",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "TU HORA NO ES VALIDA","Hora",JOptionPane.WARNING_MESSAGE);
		}
	}
}
