package one.digitalinnovation;

import java.time.LocalDate;


import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTeste {
    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { 10, 5, 305, 16, 50 };
        // Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoNull() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
        assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;
        
        assertEquals(valor, outroValor);
    }
}
