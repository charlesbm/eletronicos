package br.ibm.eletronicos.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.ibm.eletronicos.dao.ClienteDAO;
import br.ibm.eletronicos.dominio.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteControlador {
	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar(){
		ClienteDAO dao = new ClienteDAO();
		List<Cliente> resultado = dao.listar();
		return resultado;
	}
}
