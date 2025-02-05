fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)

    //To avoid concurrent modification issues, always use immutable collections
    //when possible.  If you need a mutable list, synchronize access to it.
}
