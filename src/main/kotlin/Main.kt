fun main(args: Array<String>) {
    val Student= mutableListOf<String>("Ahmed","Ali", "Saad", "Ziad")
    println(Student)
    Student.add(0,"ENg Zamel")
    Student.add(1,"eng Sadun")
    println(Student)
    Student.add(2,"Faisal")
    println(Student)
    Student[0]="Eng.Mohammed Zamel"
    println(Student)
Student[1]="Eng Hussen Sadun"
    println(Student)
    Student.removeAll(){
        word->word.contains("Eng")
    }
    println(Student)
    
}

