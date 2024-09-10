fun main() {
    var array: Array<String?> = arrayOfNulls<String>(10)
    createList(array)


}

fun greeting(array: Array<String>){
    array.forEach { println("$it Добрый день") }
}

fun createList(list: Array<String?>): Array<String?> {

    try {
        println("Введите имя и Фамилию пользователя")
        var inputName = readln()
        var check = MyException()
        check.checkNull(inputName)
        println("Введите позицию в каталоге")
        var inputPosition = readln()
        list[inputPosition.toInt()] = inputName
    } catch (e: MyException) {
        println(e.message)
    } catch (e: Exception) {
        println(e.message)
    }
    return list
}

class MyException : Exception() {

    override val message: String?
        get() = "Недопустимое значение: Пустая строка"

    fun checkNull(str: String): String {
        if (str == ""){
            throw Exception(
                "Недопустимое значение: Пустая строка"
            )
        }
        return str
    }
}