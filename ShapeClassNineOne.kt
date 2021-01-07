class ShapeClassNineOne() {
    // Class properties
    private var xPos: Int = 0
    private var yPos: Int = 0

    // Memeber functions
    fun reset() {
        xPos = 0
        yPos = 0
    }

    fun print() {
        println("Position: x=$xPos, y=$yPos")
    }
}
fun main(args: Array<String>) {
    var shp = ShapeClassNineOne()
    shp.print()
}