package com.stvnreis.projeto1.demo.domain.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stvnreis.projeto1.demo.infra.database.repositories.ProdutosRepository;
import com.stvnreis.projeto1.demo.infra.http.dtos.ProdutoDto;

@Service
public class FindAllProdutosUseCase {
    @Autowired
    private ProdutosRepository produtosRepository;

    public List<ProdutoDto> execute(){
        List<ProdutoDto> produtos = this.produtosRepository.fetch();

        return produtos;
    }
}
