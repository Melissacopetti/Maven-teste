package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaTest {
    
    @Test
    void deveCalcularIdadeCorretamente(){
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 5, 3));
        Assertions.assertEquals(23, jessica.calcularIdade());
    }

    @Test
    void deveResponderSeMaiorIdade(){
       Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000, 5, 3));
       Assertions.assertTrue(jessica.maiorIdade());

       Pessoa joao = new Pessoa("joao", LocalDate.of(2023, 5, 3));
       Assertions.assertFalse(joao.maiorIdade());

    }
}
