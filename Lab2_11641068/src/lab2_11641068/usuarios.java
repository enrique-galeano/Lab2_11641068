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
	public String nombre;
	public int edad;
	public String lugarDeNacimiento;
	public String username;
	public String password;
	public String listaDeAmigos;
	public String listaDeSolicitudes;
	public String listaDeMensajesEnviados;
	public String buzonDeEntrada;

	public usuarios() {

	}
	public usuarios(String Nombre, int edad, String lugarDeNacimiento){
		this.nombre = nombre;
		this.edad = edad;
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLugarDeNacimiento() {
		return lugarDeNacimiento;
	}

	public void setLugarDeNacimiento(String lugarDeNacimiento) {
		this.lugarDeNacimiento = lugarDeNacimiento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getListaDeAmigos() {
		return listaDeAmigos;
	}

	public void setListaDeAmigos(String listaDeAmigos) {
		this.listaDeAmigos = listaDeAmigos;
	}

	public String getListaDeSolicitudes() {
		return listaDeSolicitudes;
	}

	public void setListaDeSolicitudes(String listaDeSolicitudes) {
		this.listaDeSolicitudes = listaDeSolicitudes;
	}

	public String getListaDeMensajesEnviados() {
		return listaDeMensajesEnviados;
	}

	public void setListaDeMensajesEnviados(String listaDeMensajesEnviados) {
		this.listaDeMensajesEnviados = listaDeMensajesEnviados;
	}

	public String getBuzonDeEntrada() {
		return buzonDeEntrada;
	}

	public void setBuzonDeEntrada(String buzonDeEntrada) {
		this.buzonDeEntrada = buzonDeEntrada;
	}
	@Override
	public String toString(){
		return nombre;
	}
	
}
