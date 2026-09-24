package com.example.demo.service;

import com.example.demo.entity.ProdutoEntity;
import com.example.demo.repository.ProdutoRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoEntity> listarTodosProdutos(){
        return repository.findAll();

    }

    public ProdutoEntity salvarProduto(@NonNull ProdutoEntity produto){
        if(repository.findByNome(produto.getName()).isPresent()) {
            throw new IllegalArgumentException("Produto já cadastrado");
        }

        return repository.save(produto);

    }

    public void excluirProduto(Long id){
        if(repository.existsById(id)){
            repository.deleteById(id);
        } else{
            throw new IllegalArgumentException("produto já não existe");
        }
    }

}
