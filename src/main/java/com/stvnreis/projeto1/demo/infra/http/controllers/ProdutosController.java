package com.stvnreis.projeto1.demo.infra.http.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stvnreis.projeto1.demo.domain.usecases.CreateProdutoUseCase;
import com.stvnreis.projeto1.demo.domain.usecases.FindAllProdutosUseCase;
import com.stvnreis.projeto1.demo.domain.usecases.FindProdutoByIdUseCase;
import com.stvnreis.projeto1.demo.infra.http.dtos.ProdutoDto;
import com.stvnreis.projeto1.demo.infra.http.responses.PostResponse;


@Controller
@RequestMapping(value = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutosController {
    @Autowired
    private FindAllProdutosUseCase findAllProdutosUseCase;
    @Autowired
    private CreateProdutoUseCase createProdutoUseCase;
    @Autowired
    private FindProdutoByIdUseCase findProdutoByIdUseCase;

    @PostMapping
    @ResponseBody
    public PostResponse create(@RequestBody ProdutoDto produto) {
        try {
            createProdutoUseCase.execute(produto);

            return new PostResponse("Produto criado com sucesso!");
        } catch (Exception e) {
            return new PostResponse(e.getMessage());
        }
    }

    @GetMapping
    @ResponseBody
    public List<ProdutoDto> findAll(){
        return findAllProdutosUseCase.execute();
    }

    @GetMapping("/{idProduto}")
    @ResponseBody
    public ProdutoDto findProdutoById(@PathVariable("idProduto") int id) {
        try {
            ProdutoDto produto = this.findProdutoByIdUseCase.execute(id);
            
            return produto;
        } catch (Exception e) {
            return null;
        }
    }
    
}
