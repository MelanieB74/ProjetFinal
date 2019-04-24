package com.model.Service;

import java.util.List;

import com.model.Client;

public interface IClientService {

public Client save(Client client);
    
    public Client update(Client client);
    
    public void delete(Client client);
    
    public Client findById(Integer id);
    
    public List<Client> findAll();
    
    public Client findByFirstNameAndLastName(String firstName, String lastName);
    
   
}
