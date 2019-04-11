package br.com.clearWorld.megasena;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/megasena")

public class ResultadoControle {

	@GetMapping
	public String getResultado() throws ClientProtocolException, IOException {
		Megasena megasena = new Megasena();
		return megasena.ObterUltimoResultado();
		
	}

}