package br.senai.sc.almoxarifado.controller;

import br.senai.sc.almoxarifado.model.entities.Reserva;
import br.senai.sc.almoxarifado.model.service.*;

import java.sql.SQLException;

public class ReservaController {
    public void cadastrar(Integer idReserva, String dataRetirada, String dataDevolucao, Integer idPessoa) throws SQLException {
        ReservaService service = new ReservaService();
        Reserva reserva = Reserva.cadastrar(idReserva, dataRetirada, dataDevolucao, idPessoa);
        service.inserir(reserva);
    }
}
