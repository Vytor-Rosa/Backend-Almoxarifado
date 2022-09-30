package br.senai.sc.almoxarifado.controller;

import br.senai.sc.almoxarifado.model.entities.Usuario;
import br.senai.sc.almoxarifado.model.service.*;

import java.sql.SQLException;

public class UsuarioController {
    public void cadastrar(Integer idUsuario, Integer matricula, String email, String senha, String nome, String cargo) throws SQLException {
        UsuarioService service = new UsuarioService();
        Usuario usuario = Usuario.cadastrar(idUsuario, matricula, email, senha, nome, cargo);
        service.inserir(usuario);
    }
}
