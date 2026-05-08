package com.atividade.security.Repositories;

import com.atividade.security.Model.ModelProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProduto extends JpaRepository <ModelProduto, Long> {
}
