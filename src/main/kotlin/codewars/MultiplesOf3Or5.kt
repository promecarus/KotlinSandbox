package codewars

import junit.framework.TestCase.assertEquals
import org.junit.Test

fun solution(number: Int) = (3 until number)
    .filter { it % 3 == 0 || it % 5 == 0 }
    .sum()

class TestMultiplesOf3Or5 {
    @Test
    fun test() {
        assertEquals(23, solution(10))
        assertEquals(78, solution(20))
        assertEquals(9168, solution(200))
    }
}
