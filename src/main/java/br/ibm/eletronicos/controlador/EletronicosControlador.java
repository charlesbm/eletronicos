package br.ibm.eletronicos.controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//http://127.0.0.1:8080/eletronicos
@RestController
@RequestMapping("/eletronicos")
public class EletronicosControlador {
	@RequestMapping("/testar")
	public String testar() {
		return "Programação Web com Spring";
	}
}
