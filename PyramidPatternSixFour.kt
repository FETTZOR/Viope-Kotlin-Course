fun main(args: Array<String>) {
    val rows = 10

    for (i in 1..rows) {
        for (j in 1..i) {
            if (i < 11) {
                print("$i ")
            }
            else {
                break;
            }
        }
        println()
    }
}