/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_11641068;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class Lab2_11641068 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ArrayList<usuarios> lista = new ArrayList();
		String p = " ";
		usuarios t = new usuarios();
		while (!p.equals("d")) {
			p = JOptionPane.showInputDialog("Menu\n "
					+ "A - Agregar Usuario y edad y Lugar de Nacimiento\n"
					+ "B - Lista de usuarios\n"
					+ "C - Modifica usuario \n"
					+ "D - eliminar usuario\n"
					+ "d - Salir");
			if (p.equals("a")) {
				t = new usuarios();
				String nombre = " ";
				int edad = 0;
				String lnd = " ";
				String username = " ";
				String contra = " ";
				nombre = JOptionPane.showInputDialog("Nombre de usuario");
				edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
				lnd = JOptionPane.showInputDialog("Lugar De Nacimiento");
				username = JOptionPane.showInputDialog("Usuario");
				contra = JOptionPane.showInputDialog("Contraseña");
				t.setNombre(nombre);
				t.setEdad(edad);
				t.setLugarDeNacimiento(lnd);
				t.setUsername(username);
				t.setPassword(contra);
				lista.add(t);
			}
			if (p.equals("b")) {
				String ver = "";
				for (usuarios ob : lista) {
					if (ob instanceof usuarios) {
						ver += " " + lista.indexOf(ob) + "Nombre:  " + ob.getNombre() + "Edad: " + ob.getEdad() + "Lugar de Nacimiento: " + ob.getLugarDeNacimiento() + "\n";
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
				String usuario = " ";
				String contra = " ";
				opcion = Integer.parseInt(JOptionPane.showInputDialog("Que quiere modificar\n"
						+ "1) Nombre\n"
						+ "2) Edad\n"
						+ "3) Lugar de nacimiento\n"
						+ "4) Username \n"
						+ "5) Password "));
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
		}
	}
}
