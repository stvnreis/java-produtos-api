package com.stvnreis.projeto1.demo.domain.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stvnreis.projeto1.demo.infra.database.repositories.ProdutosRepository;
import com.stvnreis.projeto1.demo.infra.http.dtos.ProdutoDto;

@Service
public class CreateProdutoUseCase {
    @Autowired
    private ProdutosRepository produtosRepository;

    public void execute(ProdutoDto produto){
        this.produtosRepository.create(produto);
    }
}
