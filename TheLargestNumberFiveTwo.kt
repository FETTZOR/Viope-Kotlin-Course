fun main(args: Array<String>) {
    println("Type the first number:")
    val num1 = readLine()!!.toInt()
    println("Type the second number:")
    val num2 = readLine()!!.toInt()
    println("Type the third number:")
    val num3 = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("The largest number = $num1")
    }
    else if (num2 > num1 && num2 > num3){
        println("The largest number = $num2")
    }
    else if (num3 > num1 && num2 < num3){
        println("The largest number = $num3")
    }

    else{
        println("Error")
    }

}







//Type the first number:
//-5
//Type the second number:
//0
//Type the third number:
//3
//The largest number = 3