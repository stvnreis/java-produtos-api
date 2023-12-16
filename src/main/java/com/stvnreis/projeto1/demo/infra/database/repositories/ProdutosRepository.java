package com.stvnreis.projeto1.demo.infra.database.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.stvnreis.projeto1.demo.infra.http.dtos.ProdutoDto;

@Service
public class ProdutosRepository {
    private static final Map<Integer, ProdutoDto>produtos = new HashMap<>();

    public void create(ProdutoDto produto) {
        int proximoId = produtos.keySet().size() + 1;

        produto.setIdProduto(proximoId);

        produtos.put(proximoId, produto);
    }

    public void update(ProdutoDto produto, int idProduto) {
        produtos.put(idProduto, produto);
    }

    public ProdutoDto findById(int idProduto){
        return produtos.get(idProduto);
    }

    public List<ProdutoDto> fetch() {
        return new ArrayList<>(produtos.values());
    }

    public void delete(int idProduto) {
        produtos.remove(idProduto);
    }
}
