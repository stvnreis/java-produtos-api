package com.stvnreis.projeto1.demo.domain.usecases;

import java.text.MessageFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stvnreis.projeto1.demo.infra.database.repositories.ProdutosRepository;
import com.stvnreis.projeto1.demo.infra.http.dtos.ProdutoDto;

@Service
public class FindProdutoByIdUseCase {
    @Autowired
    private ProdutosRepository produtosRepository;

    public ProdutoDto execute(int idProduto){
        ProdutoDto produto = this.produtosRepository.findById(idProduto);
        if(produto == null) throw new Error(MessageFormat.format("Produto {0} nao encontrado!", idProduto));

        return produto;
    }
}
