package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {
	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		long id = 1;
// traer el obj a modificar
		Cliente c = abm.traer(id);
		System.out.println("Cliente a Modificar -->" + c);
// modificar por set los atributos
		c.setDni(35000001);
		abm.modificar(c); // update del objeto
		int dni = 35000001;
		Cliente cModif = abm.traer(dni);
		System.out.println("Cliente Modificado -->" + cModif);
	}
}