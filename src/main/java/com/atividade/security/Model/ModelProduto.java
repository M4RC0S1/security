package com.atividade.security.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PRODUTOS")
@Data

public class ModelProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

}
