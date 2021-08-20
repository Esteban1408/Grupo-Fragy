import javax.swing.JOptionPane;

public class Utils {
	int continuar;
	double resultado=0,number1,number2,number1Boolean,number2Boolean;
	boolean salir = false, otraOperacion = false;
	UtilsMain imprimir = new UtilsMain();
	public Utils() {
		
	}
	public boolean hacerOtraOperacion() {
		continuar = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
		if (continuar == 0) {
			otraOperacion = true;
		}
		return otraOperacion;
	}
	public void sumar (double n1,double n2) {
		resultado=n1+n2;
		String result= "Resultado: "+resultado;
		imprimir.imprimirResultado(result,"Suma");
	}
	public void restar (double n1,double n2) {
		resultado=n1-n2;
		String result= "Resultado: "+resultado;
		imprimir.imprimirResultado(result,"Resta");
	}
	public void multiplicar (double n1,double n2) {
		resultado=n1*n2;
		String result= "Resultado: "+resultado;
		imprimir.imprimirResultado(result,"Multiplicacion");
	}
	public void division (double n1,double n2) {
		resultado=n1/n2;
		String result= "Resultado: "+resultado;
		imprimir.imprimirResultado(result,"Division");
	}
	
	public void celsiusFahrenheit (double gradosCelsius) {
		double gradosFahrenheit=32 + ( (9 * gradosCelsius) / 5);
		String result = "Grados Celsius: "+gradosCelsius+"\nGrados Fahrenheit: "+gradosFahrenheit;
		imprimir.imprimirResultado(result,"Celsius a Fahrenheit");
	}
	public void areaTriangulo (double n1,double n2){
		double area;
		area=(n1*n2)/2;
		String result= "El area es: "+area;
		imprimir.imprimirResultado(result,"Area de un Triangulo");
	}
	public void horaExacta(int hora,int minuto,int segundo,int amPm) {
		if(13>hora && hora>=1 && 60>minuto && minuto>=0 && 60>segundo && segundo>=0 && amPm==1) {
			String mensaje1 = "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " PM " +"es VALIDA";
			imprimir.imprimirResultado(mensaje1,"Hora");
		}
		else if(13>hora && hora>=1 && 60>minuto && minuto>=0 && 60>segundo && segundo>=0 && amPm==0) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " AM " +"es VALIDA","Hora",JOptionPane.INFORMATION_MESSAGE);
			String mensaje2 = "Tu hora: "+ hora + ":"+ minuto + ":"+ segundo + " AM " +"es VALIDA";
			imprimir.imprimirResultado(mensaje2,"Hora");
		}
		else {
			imprimir.imprimirResultado("TU HORA NO ES VALIDA","Hora");
		}
	}
	public void validarNumeroParImpar(double n1) {
		double PI=n1%2;
		
		if(PI==0) {
			imprimir.imprimirResultado("Es PAR","Par o Impar");
		}
			else {
			imprimir.imprimirResultado("Es IMPAR","Par o Impar");
		}
	}
	public void validarNumeroDe0a9(double n1) {
		if( n1<=9 && n1>=0) {
			String mensaje=n1+" si es un numero :)";
			imprimir.imprimirResultado(mensaje,"Numeros de 0 a 9");
		}
		else {
			imprimir.imprimirResultado("Debe ser entre 0 a 9","Numeros de 0 a 9");
		}
	}
	public void validarNumerosMenorMayor(double n1,double n2) {
		if(n1>n2) {
			String mensaje1 = n2+" --> "+n1 ;
			imprimir.imprimirResultado(mensaje1,"Menor a Mayor");
		}
		else {
			String mensaje2 = n1+" --> "+n2 ;
			imprimir.imprimirResultado(mensaje2,"Menor a Mayor");
		}
	}
	
}
