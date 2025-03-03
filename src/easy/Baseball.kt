package easy

/*
*
* You are keeping score for a baseball game with strange rules.
* The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.
* At the beginning of the game, you start with an empty record.
* You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:
* An integer x - Record a new score of x.
* "+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
* "D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
* "C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
* Return the sum of all the scores on the record. The test cases are generated so that the answer fits in a 32-bit integer.
*
* */
class Baseball {

    fun calPoints(ops: Array<String>): Int {
        val points = Array(1000) { 0 }
        var i = 0
        ops.forEach { op ->
            when (op) {
                "+" -> {
                    points[i] = points[i - 2] + points[i - 1]
                    i++
                }
                "D" -> {
                    points[i] = points[i - 1] * 2
                    i++
                }
                "C" -> {
                    i--
                    points[i] = 0
                }
                else -> {
                    points[i] = op.toInt()
                    i++
                }
            }
        }

        return points.sum()
    }
}