package br.senai.sc.almoxarifado.model.dao;

import br.senai.sc.almoxarifado.model.Factory.*;
import br.senai.sc.almoxarifado.model.entities.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConexaoFactory().conectaBD();
    }

    public void cadastrar(Usuario usuario) throws SQLException {
        String sql = "insert into usuario(codigo, matricula, email, senha, cargo, nome) values (?,?,?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, usuario.getIdUsuario());
            statement.setInt(2, usuario.getMatricula());
            statement.setString(3, usuario.getEmail());
            statement.setString(4, usuario.getSenha());
            statement.setString(5, usuario.getCargo());
            statement.setString(6, usuario.getNome());
            try{
                statement.execute();
            }catch (Exception exception){
                throw new RuntimeException("Erro na execução");
            }
        }catch (Exception exception){
            throw new RuntimeException("Erro na preparação");
        }
    }
}
