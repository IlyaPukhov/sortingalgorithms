fun main(args: Array<String>) {
    val list1 = arrayListOf(6, 4, 3, 1, 2, 5, 8, 14, 113, 9)
    list1.insertionSort()
    println(list1)
    val list2 = arrayListOf(6, 4, 3, 1, 2, 5, 8, 14, 113, 9)
    list2.selectionSort()
    println(list2)
}

fun <T : Comparable<T>> ArrayList<T>.selectionSort() {
    if (size < 2) return
    for (i in 0 until size - 1) {
        var min = i
        for (j in i + 1 until size) {
            if (this[j] < this[min]) min = j
        }
        val temp = this[i]
        this[i] = this[min]
        this[min] = temp
    }
}
fun <T : Comparable<T>> ArrayList<T>.insertionSort() {
    if (size < 2) return
    for (i in 1 until size) {
        for (j in (1..i).reversed()) {
            if (this[j] < this[j - 1]) {
                val temp = this[j]
                this[j] = this[j-1]
                this[j-1] = temp
            } else break
        }
    }
}