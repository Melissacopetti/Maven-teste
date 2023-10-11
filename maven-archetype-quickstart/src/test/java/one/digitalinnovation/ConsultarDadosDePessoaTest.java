package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class ConsultarDadosDePessoaTest {

    @BeforeAll
    static void configurarConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
        System.out.println("rodou configurarConexao");
    }

    @BeforeEach
    void validarDadosParaTeste() {
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("Jailson", LocalDate.of(2000, 04, 01)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterEach
    void excluirDadosDepoisDoTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("Jailson", LocalDate.of(2000, 04, 01)));
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
        System.out.println("rodou finalizarConexao");
    }
}
