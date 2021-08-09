import javax.swing.JOptionPane;

public class Ejercicio_10 {

	public static void main(String[] args) {
		int H,M=1,S=1,DN,a=1;
		H=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora "));
		M=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minuto "));
		S=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo "));
		DN=Integer.parseInt(JOptionPane.showInputDialog("¿AM o PM? "+"\n  0       1"));
		
		if(13>H && H>=1 && 60>M && M>=0 && 60>S && S>=0 && DN==1) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ H + ":"+ M + ":"+ S + " PM " +"es VALIDA","Hora",a);
		}
		else if(13>H && H>=1 && 60>M && M>=0 && 60>S && S>=0 && DN==0) {
			JOptionPane.showMessageDialog(null, "Tu hora: "+ H + ":"+ M + ":"+ S + " AM " +"es VALIDA","Hora",a);
		}
		else {
			JOptionPane.showMessageDialog(null, "TU HORA NO ES VALIDA","Hora",a);
		}
	}

}
