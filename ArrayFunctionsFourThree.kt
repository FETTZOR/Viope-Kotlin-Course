fun main(args : Array<String>) {
    val nums = arrayOf("Mary", "Paul", "Jane", "Phil", "John", "Jane", "Paul", "Anthony", "Mary")
    nums.sort()
    val count = nums.distinct()
    println("There is ${count.size} distinct names")
    println("The first in the alphabetical order is " + nums[0])
    println("The last in the alphabetical order is " + nums[nums.size-1])
}

//There is 6 distinct names
//The first in the alphabetical order is Anthony
//The last in the alphabetical order is Phil