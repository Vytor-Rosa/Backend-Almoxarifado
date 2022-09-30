package br.senai.sc.almoxarifado.model.dao;

import br.senai.sc.almoxarifado.model.Factory.*;
import br.senai.sc.almoxarifado.model.entities.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReservaDAO {

    private Connection connection;

    public ReservaDAO() {
        this.connection = new ConexaoFactory().conectaBD();
    }

    public void cadastrar(Reserva reserva) throws SQLException {
        String sql = "insert into reserva(codigo, data_retirada, data_devolucao, codigo_pessoa) values (?,?,?,?)";
        try(PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, reserva.getIdReserva());
            statement.setString(2, reserva.getDataRetirada());
            statement.setString(3, reserva.getDataDevolucao());
            statement.setInt(4, reserva.getIdPessoa());
            try{
                statement.execute();
            }catch (Exception exception){
                throw new RuntimeException("Erro na execucao");
            }
        }catch (Exception exception){
            throw new RuntimeException("Erro na preparacao");
        }
    }
}
