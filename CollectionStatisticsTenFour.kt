import java.util.*

fun main(args: Array<String>) {
    val list = mutableListOf<Int>()
    while(true){
        val reader = Scanner(System.`in`)
        println("Type a positive integer (-1 exits):")
        var input_num = reader.nextInt()
        if (input_num >= 0) {
            list.add(input_num)
        }
        else if (input_num == -1){
            break
        }
    }
    println("The average = ${list.average()}")
    println("The max = ${list.max()}")
    println("The min = ${list.min()}")
}



//Type a positive integer (-1 exits):
//2
//Type a positive integer (-1 exits):
//7
//Type a positive integer (-1 exits):
//11
//Type a positive integer (-1 exits):
//3
//Type a positive integer (-1 exits):
//7
//Type a positive integer (-1 exits):
//6
//Type a positive integer (-1 exits):
//-5
//Type a positive integer (-1 exits):
//3
//Type a positive integer (-1 exits):
//-1
//The average = 5.571428571428571
//The max = 11
//The min = 2