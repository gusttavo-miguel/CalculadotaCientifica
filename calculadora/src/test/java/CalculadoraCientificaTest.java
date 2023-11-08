import org.ifpe.testeSoftware.CalculadoraCientifica;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCientificaTest {

    private CalculadoraCientifica calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new CalculadoraCientifica();
    }

    @Test
    @DisplayName("Teste 1: Adição de dois números positivos")
    void testeAdicao1() {
        assertEquals(5, calculadora.adicao(2, 3));
    }

    @Test
    @DisplayName("Teste 2: Subtração de dois números positivos")
    void testeSubtracao1() {
        assertEquals(-1, calculadora.subtracao(2, 3));
    }

    @Test
    @DisplayName("Teste 3: Multiplicação de dois números positivos")
    void testeMultiplicacao1() {
        assertEquals(6, calculadora.multiplicacao(2, 3));
    }

    @Test
    @DisplayName("Teste 4: Divisão de dois números positivos")
    void testeDivisao1() {
        assertEquals(0.6666666666666666, calculadora.divisao(2, 3));
    }

    @Test
    @DisplayName("Teste 5: Divisão por zero")
    void testeDivisao2() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divisao(2, 0));
    }

    @Test
    @DisplayName("Teste 6: Raiz quadrada de um número positivo")
    void testeRaizQuadrada1() {
        assertEquals(2, calculadora.raizQuadrada(4));
    }

    @Test
    @DisplayName("Teste 7: Raiz quadrada de zero")
    void testeRaizQuadrada2() {
        assertEquals(0, calculadora.raizQuadrada(0));
    }

    @Test
    @DisplayName("Teste 8: Potência de dois números positivos")
    void testePotencia1() {
        assertEquals(8, calculadora.potencia(2, 3));
    }

    @Test
    @DisplayName("Teste 9: Seno de zero")
    void testeSeno1() {
        assertEquals(0, calculadora.seno(0));
    }

    @Test
    @DisplayName("Teste 10: Cosseno de zero")
    void testeCosseno1() {
        assertEquals(1, calculadora.cosseno(0));
    }

    @Test
    @DisplayName("Teste 11: Tangente de zero")
    void testeTangente1() {
        assertEquals(0, calculadora.tangente(0));
    }

    @Test
    @DisplayName("Teste 12: Logaritmo de um número positivo")
    void testeLogaritmo1() {
        assertEquals(0, calculadora.logaritmo(1));
    }

    @Test
    @DisplayName("Teste 13: Logaritmo de zero")
    void testeLogaritmo2() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.logaritmo(0));
    }

    @Test
    @DisplayName("Teste 14: Logaritmo de um número negativo")
    void testeLogaritmo3() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.logaritmo(-1));
    }
    @AfterEach
    void tearDown() {
        calculadora = null;
    }
}