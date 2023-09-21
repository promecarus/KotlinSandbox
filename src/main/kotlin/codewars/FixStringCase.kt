package codewars

import junit.framework.TestCase.assertEquals
import org.junit.Test
import java.util.*

object FixStringCase {
    fun solve(s: String) = if (s.count(Char::isUpperCase) * 2 > s.length) s.uppercase(Locale.getDefault())
    else s.lowercase(Locale.getDefault())
}

class TestFixStringCase {
    @Test
    fun BasicTests() {
        assertEquals("code", FixStringCase.solve("code"))
        assertEquals("CODE", FixStringCase.solve("CODe"))
        assertEquals("code", FixStringCase.solve("COde"))
        assertEquals("code", FixStringCase.solve("Code"))
        assertEquals("", FixStringCase.solve(""))
    }
}
