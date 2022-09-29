package br.senai.sc.almoxarifado.model.service;

import br.senai.sc.almoxarifado.model.dao.UsuarioDAO;
import br.senai.sc.almoxarifado.model.entities.Usuario;

import java.sql.SQLException;

public class UsuarioService {
    public void inserir(Usuario usuario) throws SQLException {
        new UsuarioDAO().cadastrar(usuario);
    }
}
