import javax.swing.JOptionPane;

public class Utils {
	int continuar;
	double resultado=0,number1,number2,number1Boolean,number2Boolean;
	boolean salir = false, otraOperacion = false;
	UtilsMain entrada2 = new UtilsMain();
	public Utils() {
		
	}
	public boolean hacerOtraOperacion() {
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
		if (continuar == 0) {
			otraOperacion = true;
		}
		return otraOperacion;
	}
	public void sumar (double n1,double n2,int select) {
		resultado=n1+n2;
		imprimirResultado(resultado,"Suma",select);
	}
	public void restar (double n1,double n2,int select) {
		resultado=n1-n2;
		imprimirResultado(resultado,"Resta",select);
	}
	public void multiplicar (double n1,double n2,int select) {
		resultado=n1*n2;
		imprimirResultado(resultado,"Multiplicacion",select);
	}
	public void division (double n1,double n2,int select) {
		resultado=n1/n2;
		imprimirResultado(resultado,"Multiplicacion",select);
	}
	
	public void celsiusFahrenheit (double gradosCelsius,int select) {
		double gradosFahrenheit=32 + ( (9 * gradosCelsius) / 5);
		imprimirResultado(gradosFahrenheit,"Celsius a Fahrenheit",select);
	}
	public void areaTriangulo (double n1,double n2,int select){
		double area;
		area=(n1*n2)/2;
		imprimirResultado(area,"Area de un Triangulo",select);
	}
	public void horaExacta(int hora,int minuto,int segundo,int amPm) {
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
	public void parImpar(double n1) {
		double PI=n1%2;
		
		if(PI==0) {
			JOptionPane.showMessageDialog(null, "Es PAR", "Par o Impar",JOptionPane.INFORMATION_MESSAGE);
		}
			else {
			JOptionPane.showMessageDialog(null, "Es IMPAR", "Par o Impar",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void numeroDe0a9(double n1) {
		if( n1<=9 && n1>=0) {
			JOptionPane.showMessageDialog(null, n1+" si es un numero :)");
		}
		else {
			JOptionPane.showMessageDialog(null,"Debe ser entre 0 a 9");
		}
	}
	public void numerosMenorMayor(double n1,double n2) {
		if(n1>n2) {
			JOptionPane.showMessageDialog(null, n2+" --> "+n1 ,"Menor a Mayor",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, n1+" --> "+n2 ,"Menor a Mayor",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void imprimirResultado(double cambio,String operacion,int select) {
		if(select<=4 && select>=0) {
			JOptionPane.showMessageDialog(null, "Resultado: " + cambio, operacion, JOptionPane.INFORMATION_MESSAGE);
		}else if(select==5) {
			JOptionPane.showMessageDialog(null, cambio,operacion,JOptionPane.INFORMATION_MESSAGE);
		}else if(select==6) {
			JOptionPane.showMessageDialog(null, "El area es: "+ cambio,operacion,JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
