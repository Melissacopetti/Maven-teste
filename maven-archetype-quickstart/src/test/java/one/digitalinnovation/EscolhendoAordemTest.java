package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
// import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.MethodOrderer.MethodName;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
// @TestMethodOrder(MethodName.class)
// @TestMethodOrder(Random.class)
// @TestMethodOrder(MethodOrderer.DisplayName.class);

public class EscolhendoAordemTest {
    
   // @DisplayName("A")
   @Order(4)
@Test
void validaFluxoA()
    {
        Assertions.assertTrue(true);
    }

    // @DisplayName("B")
 //   @Order(3)
@Test
void validaFluxoB()
    {
        Assertions.assertTrue(true);
    }

    // @DisplayName("C")
  @Order(2)
@Test
void validaFluxoC()
    {
        Assertions.assertTrue(true);
    }

    // @DisplayName("D")
    @Order(1)
@Test
void validaFluxoD()
    {
        Assertions.assertTrue(true);
    }

}