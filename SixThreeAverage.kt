fun main(args: Array<String>) {
    val arrayOfNum = arrayOf(11, 16, 7, 8, 14, 5, 9, 3)
    var sum = 0.0

    for (num in arrayOfNum) {
        sum += num
    }

    val average = sum / arrayOfNum.size
    println("Average = $average")
}