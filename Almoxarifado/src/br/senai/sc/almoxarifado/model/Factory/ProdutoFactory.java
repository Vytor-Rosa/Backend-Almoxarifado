package br.senai.sc.almoxarifado.model.Factory;

import br.senai.sc.almoxarifado.model.entities.Produto;

import java.sql.Blob;

public class ProdutoFactory {
    public Produto getProduto(Integer idProduto, String nome, String caracteristica, Integer quantidade, String ultimaRetirada, boolean descartavel, String detalhes, Blob imagem){
        return new Produto(idProduto, nome, caracteristica, quantidade, ultimaRetirada, descartavel, detalhes, imagem);
    }
}
