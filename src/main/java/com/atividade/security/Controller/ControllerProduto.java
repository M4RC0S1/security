package com.atividade.security.Controller;

import com.atividade.security.Model.ModelProduto;
import com.atividade.security.Service.ServiceProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ControllerProduto {

    @Autowired
    private ServiceProduto serviceProduto;

    @GetMapping
    public List<ModelProduto> findAll() {
        return serviceProduto.findAll();
    }

    @PostMapping
    public ModelProduto criarProduto(ModelProduto produto){
        return serviceProduto.criarProduto(produto);
    }

}
