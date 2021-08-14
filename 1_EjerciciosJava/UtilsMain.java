import javax.swing.JOptionPane;

public class UtilsMain {

	public static void main(String[] args) {
		final String error = "SOLO ESTAN PERMITIDOS NUMEROS";
		Utils Entrada = new Utils();
		int sel,conti;
		boolean salir = false, operacion = false;
		while (!salir && !operacion) {// Este es un bucle el cual no termina hasta que de la opcion de Salir y la opcion de operacion
				sel = Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion \n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir \n5-Salir"));
				switch (sel) {
				case 1:
					try {
						Entrada.leer();
						Entrada.sumar();
						conti = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
						if (conti == 0) {
							operacion = true;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, error);
					}

					break;
				case 2:
					try {
						Entrada.leer();
						Entrada.restar();
						conti = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
						if (conti == 0) {
							operacion = true;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, error);
					}
					break;
				case 3:
					try {
						Entrada.leer();
						Entrada.multiplicar();
						conti = Integer.parseInt(
								JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
						if (conti == 0) {
							operacion = true;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, error);
					}
					break;
				case 4:
					try {
						Entrada.leer2();
						Entrada.division();
						conti = Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
						if (conti == 0) {
							operacion = true;
						}
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, error);
					}
					break;
				case 5:
					salir = true;
					operacion = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "ELIGA UNA OPCION DEL 1 AL 5 PORFAVOR");
			}
		}
	}
}