package br.senai.sc.almoxarifado.model.service;

import br.senai.sc.almoxarifado.model.dao.ProdutoDAO;
import br.senai.sc.almoxarifado.model.entities.Produto;

import java.sql.SQLException;

public class ProdutoService {
    public void inserir(Produto produto) throws SQLException{
        new ProdutoDAO().cadastrar(produto);
    }
}
