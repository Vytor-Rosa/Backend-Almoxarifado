package br.senai.sc.almoxarifado.model.entities;

import br.senai.sc.almoxarifado.model.Factory.*;

import java.sql.Blob;

public class Produto {
    private Integer idProduto;
    private String nome;
    private String caracteristica;
    private Integer quantidade;
    private String ultimaRetirada;
    private boolean descartavel;
    private String detalhes;
    private Blob imagem;

    public static Produto cadastrar(Integer idProduto, String nome, String caracteristica, Integer quantidade, String ultimaRetirada, boolean descartavel, String detalhes, Blob imagem){
        return new ProdutoFactory().getProduto(idProduto, nome, caracteristica, quantidade, ultimaRetirada, descartavel, detalhes, imagem);
    }

    public Produto(Integer idProduto, String nome, String caracteristica, Integer quantidade, String ultimaRetirada, boolean descartavel, String detalhes, Blob imagem) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.caracteristica = caracteristica;
        this.quantidade = quantidade;
        this.ultimaRetirada = ultimaRetirada;
        this.descartavel = descartavel;
        this.detalhes = detalhes;
        this.imagem = imagem;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getUltimaRetirada() {
        return ultimaRetirada;
    }

    public void setUltimaRetirada(String ultimaRetirada) {
        this.ultimaRetirada = ultimaRetirada;
    }

    public boolean isDescartavel() {
        return descartavel;
    }

    public void setDescartavel(boolean descartavel) {
        this.descartavel = descartavel;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public Blob getImagem() {
        return imagem;
    }

    public void setImagem(Blob imagem) {
        this.imagem = imagem;
    }
}
