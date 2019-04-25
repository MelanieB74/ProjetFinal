package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Client;
import com.model.Service.ClientServiceImpl;
import com.model.Service.IClientService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ClientController {

	
	@Autowired
    IClientService clientService;

    public ClientController(ClientServiceImpl clientServiceImpl) {
        clientService = clientServiceImpl;
    }
	
    
    @RequestMapping(value = "/createClient", method = RequestMethod.POST)
    public ResponseEntity<Client> createUser(@RequestBody Client client) {
            clientService.save(client);
            return new ResponseEntity<Client>(client, HttpStatus.OK);
    }
    @RequestMapping(value = "/updateClient", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        clientService.update(client);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }
    
    
    @RequestMapping(value = "/deleteClient", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> deleteClient(@RequestBody Client client) {
        clientService.delete(client);
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }
    
//    @RequestMapping(value = "/clients/all", method = RequestMethod.GET)
//    public ResponseEntity<List<Client>> getAllClients() {
//        List<Client> clients = new ArrayList<>();
//        clients = clientService.findAll();
//        List<Client> clientList = new ArrayList<Client>();
//        for (Client currentClient : clients) {
//            clientList.add(new Client(currentClient));
//        }
//        return new ResponseEntity<>(clientList, HttpStatus.OK);
//    }
    
    
    @RequestMapping(value = "/clients/all", method = RequestMethod.GET)
    public List<Client> getAllClients() {
        return clientService.findAll();
}
    @GetMapping("/clients/{id}")
    public Client findClientById (@RequestBody Client client, @PathVariable int id) {
        if(clientService.findById(id) == null) {
            return null;
        } else {
            return clientService.findById(id);
        }
    }
    
    @GetMapping("/clients/{nom}")
    public Client findClientByNom (@RequestBody Client client, @PathVariable String nom) {
        if(clientService.findByNom(nom) == null) {
            return null;
        } else {
            return clientService.findByNom(nom);
        }
    }
}