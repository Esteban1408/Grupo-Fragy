import javax.swing.JOptionPane;

public class Utils {
	int continuar;
	double resultado=0,number1,number2;
	boolean otraOperacion = false;
	public Utils() {
		
	}
	public boolean hacerOtraOperacion() {
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1         No=0"));
		if (continuar == 0) {
			otraOperacion = true;
		}
		return otraOperacion;
	}
	public String sumar (double n1,double n2) {
		resultado=n1+n2;
		String result= "Resultado: "+resultado;
		return result;
	}
	public String restar (double n1,double n2) {
		resultado=n1-n2;
		String result= "Resultado: "+resultado;
		return result;
	}
	public String multiplicar (double n1,double n2) {
		resultado=n1*n2;
		String result= "Resultado: "+resultado;
		return result;
	}
	public String division (double n1,double n2) {
		resultado=n1/n2;
		String result= "Resultado: "+resultado;
		return result;
	}
	
	public String celsiusFahrenheit (double gradosCelsius) {
		double gradosFahrenheit=32 + ( (9 * gradosCelsius) / 5);
		String result = "Grados Celsius: "+gradosCelsius+"\nGrados Fahrenheit: "+gradosFahrenheit;
		return result;
	}
	public String areaTriangulo (double n1,double n2){
		double area;
		area=(n1*n2)/2;
		String result= "El area es: "+area;
		return result;
	}
	public String horaExacta(int hora,int minuto,int segundo,int amPm) {
		String mensaje;
		if(13>hora && hora>=1 && 60>minuto && minuto>=0 && 60>segundo && segundo>=0 && amPm==1) {
			mensaje = "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " PM " +"es VALIDA";
			return mensaje;
		}
		else if(13>hora && hora>=1 && 60>minuto && minuto>=0 && 60>segundo && segundo>=0 && amPm==0) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " AM " +"es VALIDA","Hora",JOptionPane.INFORMATION_MESSAGE);
			mensaje = "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " AM " +"es VALIDA";
			return mensaje;
		}
		else {
			mensaje = "TU HORA NO ES VALIDA";
			return mensaje;
		}
	}
	public String validarNumeroParImpar(double n1) {
		double PI=n1%2;
		String ImPar;
		if(PI==0) {
			ImPar = "Es PAR";
			return ImPar;
		}
			else {
			ImPar = "Es IMPAR";
			return ImPar;
		}
	}
	public String validarNumeroDe0a9(double n1) {
		String mensaje;
		if( n1<=9 && n1>=0) {
			mensaje=n1+" si es un numero entre 0 y 9 :)";
			return mensaje;
		}
		else {
			mensaje="Debe ser entre 0 a 9";
			return mensaje;
		}
	}
	public String validarNumerosMenorMayor(double n1,double n2) {
		String mensaje;
		if(n1>n2) {
			mensaje = n2+" --> "+n1 ;
			return mensaje;
		}
		else {
			mensaje = n1+" --> "+n2 ;
			return mensaje;
		}
	}
	
}
