/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_11641068;

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class usuarios {
	private String nombre;
	private int edad;
	private String lugarDeNacimiento;
	private String username;
	private String password;
	private String listaDeAmigos;
	private String listaDeSolicitudes;
	private String listaDeMensajesEnviados;
	private String buzonDeEntrada;

	public usuarios(String nombre, int edad, String lugarDeNacimiento, String username, String password, String listaDeAmigos, String listaDeSolicitudes, String listaDeMensajesEnviados, String buzonDeEntrada) {
		this.nombre = nombre;
		this.edad = edad;
		this.lugarDeNacimiento = lugarDeNacimiento;
		this.username = username;
		this.password = password;
		this.listaDeAmigos = listaDeAmigos;
		this.listaDeSolicitudes = listaDeSolicitudes;
		this.listaDeMensajesEnviados = listaDeMensajesEnviados;
		this.buzonDeEntrada = buzonDeEntrada;
	}
}
