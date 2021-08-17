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
		double gradosCelsius;
		gradosCelsius=Double.parseDouble(JOptionPane.showInputDialog("Digite grados: (Celsius)"));
		
		double gradosFahrenheit=32 + ( (9 * gradosCelsius) / 5);
		
		JOptionPane.showMessageDialog(null, "Grados Celsius: "+ gradosCelsius+"\nGrados Fahrenheit: "+gradosFahrenheit,"Celsius a Fahrenheit",JOptionPane.INFORMATION_MESSAGE);
	}
	public void areaTriangulo (){
		int base,altura;
		double area;
		base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo "));
		altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo "));

		area=(base*altura)/2;

		JOptionPane.showMessageDialog(null, "El area es: "+ area,"Area de un triangulo",JOptionPane.INFORMATION_MESSAGE);
	}
	public void horaExacta() {
		int hora,minuto,segundo,amPm;
		hora=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora "));
		minuto=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minuto "));
		segundo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo "));
		amPm=Integer.parseInt(JOptionPane.showInputDialog("¿AM o PM? "+"\n  0       1"));
		
		if(13>hora && hora>=1 && 60>minuto && minuto>=0 && 60>segundo && segundo>=0 && amPm==1) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " PM " +"es VALIDA","Hora",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(13>hora && hora>=1 && 60>minuto && minuto>=0 && 60>segundo && segundo>=0 && amPm==0) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " AM " +"es VALIDA","Hora",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "TU HORA NO ES VALIDA","Hora",JOptionPane.WARNING_MESSAGE);
		}
	}
}
