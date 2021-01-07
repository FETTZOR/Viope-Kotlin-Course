fun main(args : Array<String>) {
    for (Priority in Priority.values()) {
        println("${Priority.ordinal} : ${Priority.name}")
    }
}



enum class Priority {
    LOW,
    MEDIUM,
    HIGH
}


//0 : LOW
//1 : MEDIUM
//2 : HIGH