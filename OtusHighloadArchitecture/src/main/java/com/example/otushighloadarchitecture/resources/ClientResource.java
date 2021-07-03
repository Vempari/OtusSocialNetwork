package com.example.otushighloadarchitecture.resources;

import com.example.otushighloadarchitecture.model.Client;
import com.example.otushighloadarchitecture.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class ClientResource {

	private final ClientRepository clientRepository;

	@GetMapping("/clients")
	public List<Client> getAll() {
		return clientRepository.getAllClients();
	}

}
