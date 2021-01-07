import java.util.*

fun main(args: Array<String>) {
    println("Type an index:")
    val reader = Scanner(System.`in`)
    val nums = arrayOf(1, 2, 4, 5)
    try {
        var input_num = reader.nextInt()
        println(nums[input_num])
    }
    catch(e: ArrayIndexOutOfBoundsException)    {
        println("Element not found. Index out of bounds")
    }

    catch(e: InputMismatchException) {
        println("Type an integer")
    }
}