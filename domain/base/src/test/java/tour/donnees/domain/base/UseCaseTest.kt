package tour.donnees.domain.base

import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class UseCaseTest {

    private val testUseCase = TestUseCase()

    @Test
    fun return_isCorrect() {
        val param = TestParameter("Test")
        val model = runBlocking { testUseCase.execute(param) }

        assertEquals(param.name, model.name)
    }

    @Test
    fun return_isWrong() {
        val param = TestParameter(null)
        val model = runBlocking { testUseCase.execute(param) }

        assertNotEquals(param.name, model.name)
    }

}

data class TestParameter(
    val name: String?
)

data class TestModel(
    val name: String
): Model()

class TestUseCase: UseCase<TestParameter, TestModel>(){
    override suspend fun execute(param: TestParameter): TestModel {
        return TestModel(param.name.orEmpty())
    }
}

