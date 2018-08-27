package br.ibm.eletronicos.dao;

import java.util.ArrayList;
import java.util.List;

import br.ibm.eletronicos.dominio.Cliente;

public class ClienteDAO {
	private static List<Cliente> clientes;
	
	public ClienteDAO() {
		clientes = new ArrayList<>();

		clientes.add(new Cliente(1L, "Danieli D.", "Avenida Jose Maria", "telefone 11 96465-1241"));
		clientes.add(new Cliente(1L, "Daniel P.", "Avenida Cerejeiras", "telefone 11 94321-1234"));
		clientes.add(new Cliente(1L, "Joao S.", "Avenida Amere Medeia", "telefone 11 98412-1859"));
		clientes.add(new Cliente(1L, "Ajuanda B.", "Avenida Julio Buono", "telefone 11 96455-1111"));
		clientes.add(new Cliente(1L, "Charles B.", "Avenida Loreto", "telefone 11 96565-1001"));
	}
	
	public List<Cliente> listar(){
		return clientes;
	}
}
