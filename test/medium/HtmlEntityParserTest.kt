package medium

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HtmlEntityParserTest {

    @Test
    fun solution1() {
        val test = HtmlEntityParser()
        val result = test.entityParser("&amp; is an HTML entity but &ambassador; is not.")

        assertEquals("& is an HTML entity but &ambassador; is not.", result)
    }

    @Test
    fun solution2() {
        val test = HtmlEntityParser()
        val result = test.entityParser("and I quote: &quot;...&quot;")

        assertEquals("and I quote: \"...\"", result)
    }

    @Test
    fun solution3() {
        val test = HtmlEntityParser()
        val result = test.entityParser("&&gt;")

        assertEquals("&>", result)
    }

    @Test
    fun solution4() {
        val test = HtmlEntityParser()
        val result = test.entityParser("&a&gt;")

        assertEquals("&a>", result)
    }

    @Test
    fun solution5() {
        val test = HtmlEntityParser()
        val result = test.entityParser("&&&")

        assertEquals("&&&", result)
    }

}