package com.atividade.security.Service;

import com.atividade.security.Model.ModelProduto;
import com.atividade.security.Repositories.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProduto {

    @Autowired
    private RepositoryProduto repository;

    public List<ModelProduto> findAll(){
        return repository.findAll();
    }

    public ModelProduto criarProduto(ModelProduto produto){
        return repository.save(produto);
    }
}
