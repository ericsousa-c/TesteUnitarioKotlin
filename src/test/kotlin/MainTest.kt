import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertTrue(countXO("xXoo")) },
            { Assertions.assertTrue(countXO("xxOO")) },
            { Assertions.assertTrue(countXO("xxooxxoO")) },
            { Assertions.assertTrue(countXO("xxooxxooox")) }
        )
    }

    @Test
    @Disabled
    fun naoImplementado() {

    }

    @Test
    fun falha () {
        fail("Sempre Falha!")
    }
}