fun main()
{
    try {

        var first_enter: Boolean = true
        val student = Student("Дамир")
        do {
            println("1 - Ввести информацию\n2 - Вывести информацию")
            print("Выберите действие: ")
            var Task: Int = readln().toInt()
            when (Task) {
                1 -> {
                    when (first_enter) {
                        true -> {
                            print("Введите фамилию: ")
                            student.surname = readln()
                            print("Введите отчество: ")
                            student.father_name = readln()
                            do {
                                print("Введите пол (М, Ж): ");
                                student.gender = readln()
                            } while (student.gender != "М" && student.gender != "Ж")
                            print("Введите группу: ")
                            student.group = readln()
                            print("Введите дату рождения: ");
                            student.birthdate = readln()
                            do {
                                print("Введите рост: ")
                                student.height = readln().toDouble()
                                print("Введите вес: ")
                                student.weight = readln().toDouble()
                            } while (student.height < 150 || student.height > 220 || student.weight < 30 || student.weight > 175)
                            print("Введите спорт: ")
                            student.sport = readln()
                            first_enter = false
                        }

                        false -> {
                            student.changehalf()
                        }
                    }
                }

                2 -> {
                    when (first_enter) {
                        false -> {
                            student.printStudent()
                        }

                        true -> {
                            student.error()
                        }
                    }
                }
            }
            readln()
        } while (true)
    } catch (e:Exception)
    {
        println("Неверный тип данных")
    }
}
class Student constructor(_stud_name:String)
{
    val stud_name: String
    init
    {
        stud_name = _stud_name
    }
    var surname:String = "nil"
    var father_name:String = "nil"
    var gender:String = "nil"
    var group:String = "nil"
    var birthdate:String = "nil"
    var height:Double = 0.0
    var weight:Double = 0.0
    var sport:String = "nil"
    fun printStudent()
    {
        println("Имя: $stud_name\nФамилия: ${surname}\nОтчество: ${father_name}\nПол: ${gender}\nГруппа: ${group}")
        println("Дата рождения: ${birthdate}\nРост: ${height}\nВес: ${weight}\nСпорт: ${sport}")
    }
    fun error()
    {
        println("Сначала нужно ввести данные")
    }
    fun changehalf()
    {
        try {
            print("Введите группу: ")
            group = readln()
            print("Введите дату рождения: ");
            birthdate = readln()
            do {
                print("Введите рост: ")
                height = readln().toDouble()
                print("Введите вес: ")
                weight = readln().toDouble()
            } while (height < 150 || height > 220 || weight < 30 || weight > 175)
            print("Введите спорт: ")
            sport = readln()
        } catch (e:Exception)
        {
            println("Неверный тип данных")
        }
    }
}