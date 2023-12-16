package com.stvnreis.projeto1.demo.infra.http.dtos;

public class ProdutoDto {
    private int idProduto;
    private String dsProduto;
    private String dsComplemento;

    public int getIdProduto() {
        return this.idProduto;
    }

    public String getDsProduto() {
        return this.dsProduto;
    }

    public String getDsComplemento() {
        return this.dsComplemento;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    } 
    public void setDsProduto(String dsProduto) {
        this.dsProduto = dsProduto;
    } 
    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    } 
}
