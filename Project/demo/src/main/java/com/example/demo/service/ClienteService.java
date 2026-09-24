package com.example.demo.service;

import com.example.demo.entity.ClienteEntity;
import com.example.demo.entity.ProdutoEntity;
import com.example.demo.repository.ClienteRepository;
import com.example.demo.repository.ProdutoRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> listarTodosProdutos(){
        return repository.findAll();

    }

    public ClienteEntity salvarCliente (@NonNull ClienteEntity cliente){
        if(repository.findByEmail(cliente.getEmail()).isPresent()){
            throw new IllegalArgumentException("Produto já cadastrado");
        }

        return repository.save(cliente);

    }

    public void atualizarCliente(Long id){
        if (repository.existsById(id)) repository.deleteById(id);
         throw new IllegalArgumentException("Cliente já não existe");
        }

    }

    public void excluirCliente(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else{
            throw new IllegalArgumentException("produto já não existe");
        }
    }

}
