package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Melissa")
    void validarAlgoSomenteNoUsuarioMelissa() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoWindows() {
        Assertions.assertEquals(12, 6 + 6);
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_20)
    void validarAlgoNasVersoesJre() {
        Assertions.assertEquals(16, 8 + 8);
    }
}
