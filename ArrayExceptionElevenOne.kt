fun main(args: Array<String>) {
    try {
    val nums = arrayOf(1, 2, 3, 4)
    print(nums[7])
    }
    catch(e: ArrayIndexOutOfBoundsException)    {
        println("Element not found. Index out of bounds")
    }
}