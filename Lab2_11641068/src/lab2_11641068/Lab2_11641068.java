/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_11641068;

import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Lab2_11641068 {

	/**
	 * @param args the command line arguments
	 */
	static String usuario = " ";
	static String contra = " ";

	public static void main(String[] args) {
		ArrayList<usuarios> lista = new ArrayList();
		String p = " ";
		usuarios t = new usuarios();
		while (!p.equals("f")) {
			p = JOptionPane.showInputDialog("Menu\n "
					+ "A - Agregar Nombre y edad y Lugar de Nacimiento, Usuario, Contraseña\n"
					+ "B - Lista de usuarios\n"
					+ "C - Modifica usuario \n"
					+ "D - eliminar usuario\n"
					+ "E - Login\n "
					+ "f - Salir");
			if (p.equals("a")) {
				t = new usuarios();
				String nombre = " ";
				int edad = 0;
				String lnd = " ";
				String username = " ";
				String contra = " ";
				nombre = JOptionPane.showInputDialog("Nombre");
				edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
				lnd = JOptionPane.showInputDialog("Lugar De Nacimiento");
				usuario = JOptionPane.showInputDialog("Usuario");
				contra = JOptionPane.showInputDialog("Contraseña");
				//DefaultComboBoxModel model = (DefaultComboBoxModel) combo.getModel();
				t.setNombre(nombre);
				t.setEdad(edad);
				t.setLugarDeNacimiento(lnd);
				t.setUsername(usuario);
				t.setPassword(contra);
				lista.add(t);
			}
			if (p.equals("b")) {
				String ver = "";
				for (usuarios ob : lista) {
					if (ob instanceof usuarios) {
						ver += "\n Posicion: " + lista.indexOf(ob) + "\nNombre:" + ob.getNombre() + "\nEdad: " + ob.getEdad() + "\nLugar de Nacimiento: "
								+ ob.getLugarDeNacimiento() + "\nUsuario: " + ob.getUsername() + "\nContraseña: " + ob.getPassword();
					}
				}
				JOptionPane.showMessageDialog(null, ver);
			}

			if (p.equals("c")) {
				int opcion = 0;
				int pos = 0;
				int edad;
				String m = "";
				String lugar = " ";
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quiere modificar\n"
						+ "1) Nombre\n"
						+ "2) Edad\n"
						+ "3) Lugar de nacimiento\n"
						+ "4) Username \n"
						+ "5) Password \n"));
				switch (opcion) {
					case 1:
						pos = Integer.parseInt(JOptionPane.showInputDialog("Eliga la posicion que quiere modificar"));
						m = JOptionPane.showInputDialog("Modifique el nombre");
						lista.get(pos).setNombre(m);
						break;
					case 2:
						pos = Integer.parseInt(JOptionPane.showInputDialog("Eliga la posicion que quiere modificar"));
						edad = Integer.parseInt(JOptionPane.showInputDialog("Modifique la Edad"));
						lista.get(pos).setEdad(edad);
						break;
					case 3:
						pos = Integer.parseInt(JOptionPane.showInputDialog("Eliga la posicion que quiere modificar"));
						lugar = JOptionPane.showInputDialog("Modifique el Lugar De Nacimiento ");
						lista.get(pos).setLugarDeNacimiento(lugar);
						break;
					case 4:
						pos = Integer.parseInt(JOptionPane.showInputDialog("Eliga la posicion que quiere modificar"));
						usuario = JOptionPane.showInputDialog("Modifique Username ");
						lista.get(pos).setUsername(usuario);
						break;
					case 5:
						pos = Integer.parseInt(JOptionPane.showInputDialog("Eliga la posicion que quiere modificar"));
						contra = JOptionPane.showInputDialog("Modifique Username ");
						lista.get(pos).setPassword(contra);
						break;
				}
			}
			if (p.equals("d")) {
				int eliminar;
				eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion a eliminar"));
				lista.remove(eliminar);

			}
			if (p.equals("e")) {
				General gene = new General();
				int a = 0;
				final JPanel panel = new JPanel();
				usuario = JOptionPane.showInputDialog("Ingrese el usuario");
				contra = JOptionPane.showInputDialog("Ingrese la contraseña");
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).getUsername().contains(usuario) && lista.get(i).getPassword().contains(contra)) {
						a = 1;
						gene.setAlwaysOnTop(true);
						gene.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
						gene.setLocationByPlatform(true);
						gene.pack();
						gene.setVisible(true);
						break;
					}
					if (lista.size() == i - 1 && a == 0) {
						JOptionPane.showMessageDialog(panel, "Usuario incorrecto");
					}
				}
			}
		}
	}
}
