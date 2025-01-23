package medium

class HtmlEntityParser {
    val entities = mapOf(
        "&quot;" to "\"",
        "&apos;" to "\'",
        "&amp;" to "&",
        "&gt;" to ">",
        "&lt;" to "<",
        "&frasl;" to "/",
    )

    fun entityParser(text: String): String {
        var phrase = ""
        var entity = ""
        var readingEntity = false
        text.forEach { ch ->
            if (ch == '&') {
                readingEntity = true
                if (entity.isNotEmpty()) {
                    phrase += entity
                    entity = ""
                }
                entity += ch
            } else if (readingEntity) {
                entity += ch
                if (ch == ';') {
                    phrase += entities[entity] ?: entity
                    entity = ""
                    readingEntity = false
                }
            } else {
                phrase += ch
            }
        }
        if (entity.isNotEmpty()) {
            phrase += entity
        }

        return phrase
    }
}