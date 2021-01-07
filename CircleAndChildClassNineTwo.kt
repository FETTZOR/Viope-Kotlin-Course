open class Shape {
}
class Circle: Shape() {
    var radius = 0.0
    var area = 0.0

    fun getArea() {
        area = radius * radius * 3.14159
    }
}

fun main(args: Array<String>) {
    val newCircleObject = Circle()
    newCircleObject.radius = 5.5
    newCircleObject.getArea()
    println("The area = ${newCircleObject.area}")
}