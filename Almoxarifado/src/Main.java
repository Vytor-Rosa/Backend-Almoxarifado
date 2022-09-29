import br.senai.sc.almoxarifado.controller.*;
import br.senai.sc.almoxarifado.model.entities.Usuario;

import java.sql.Blob;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    static Scanner tec = new Scanner(System.in);
    public static void main(String[] args) throws SQLException {
        cadastrarProduto();
    }

    public static void cadastrarUsuario() throws SQLException {
        System.out.println("codigo: ");
        Integer codigo = tec.nextInt();
        System.out.println("matricula: ");
        Integer matricula = tec.nextInt();
        System.out.println("nome: ");
        String nome = tec.next();
        System.out.println("email: ");
        String email = tec.next();
        System.out.println("senha: ");
        String senha = tec.next();
        System.out.println("cargo: ");
        String cargo = tec.next();

        UsuarioController controller = new UsuarioController();
        controller.cadastrar(codigo, matricula, nome, email, senha, cargo);
    }

    public static void cadastrarProduto() throws SQLException {
        System.out.println("codigo: ");
        Integer codigo = tec.nextInt();
        System.out.println("nome: ");
        String nome = tec.next();
        System.out.println("caracteristica: ");
        String caracteristica = tec.next();
        System.out.println("quantidade: ");
        Integer quantidade = tec.nextInt();
        System.out.println("ultima retirada: ");
        String ultimaRetirada = tec.next();
        System.out.println("descartável: (1- sim, 2-não)");
        int tipo = tec.nextInt();
        boolean descartavel = false;
        switch (tipo){
            case 1->{descartavel = true;}
            case 2->{descartavel = false;}
        }
        System.out.println("detalhes: ");
        String detalhes = tec.next();
        Blob imagem = null;

        ProdutoController controller = new ProdutoController();
        controller.cadastrar(codigo, nome, caracteristica, quantidade, ultimaRetirada, descartavel, detalhes, imagem);
    }

    public static void cadastrarClassificacao() throws SQLException {
        System.out.println("codigo: ");
        Integer codigo = tec.nextInt();
        System.out.println("classificacao: ");
        String classificacao = tec.next();

        ClassificacaoController controller = new ClassificacaoController();
        controller.cadastrar(codigo, classificacao);
    }

    public static void cadastrarLocalizacao() throws SQLException {
        System.out.println("codigo: ");
        Integer codigo = tec.nextInt();
        System.out.println("localidade: ");
        String localidade = tec.next();

        LocalizacaoController controller = new LocalizacaoController();
        controller.cadastrar(codigo, localidade);
    }

    public static void cadastrarReserva() throws SQLException {
        System.out.println("codigo: ");
        Integer codigo = tec.nextInt();
        System.out.println("data de retirada: ");
        String dataRetirada = tec.next();
        System.out.println("data de devolução: ");
        String dataDevolucao = tec.next();
        System.out.println("idPessoa: ");
        Integer idPessoa = tec.nextInt();

        ReservaController controller = new ReservaController();
        controller.cadastrar(codigo, dataRetirada, dataDevolucao, idPessoa);
    }

}
