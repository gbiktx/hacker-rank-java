package easy

class MergeArrays {
    fun merge(array1: Array<Int>, array2: Array<Int>): Array<Int> {
        var xi = 0
        var yi = 0
        var array3 = emptyArray<Int>()

        var item1: Int? = array1[0]
        var item2: Int? = array2[0]

        while (item1 != null || item2 != null) {
           if (item2 == null || (item1 != null && item1 < item2)) {
               array3 = array3.plus(item1!!)
               xi++
               item1 = array1.getOrNull(xi)
           } else {
               array3 = array3.plus(item2)
               yi++
               item2 = array2.getOrNull(yi)
           }
        }
        return array3
    }
}