fun main() {
    var college = Course ("cs", 1 , mutableListOf("raghad", "rola", "maha"), "Dr.Zamel")
    var college1 = Professor ("ali", "mohamed" , "9805000000", mutableListOf("cs1", "cs2")
    var college2 = Student ("khalid", "omar" , mutableListOf("cs1", "cs2"))

}



class Course (var courseName : String , var numberOflectures : Int , var student : List<String> , Professor : String) {

    fun numberOfstudent(): String = "${student.size}"


    fun assignProfessor() {
        return assignProfessor()
    }

    fun ProfessorName(): String  {

    }

    fun enroll(student: Boolean) {
        var s = true
        if (student == s)
            println("you can rollin ")
        return enroll(student)

    }


    fun courseInfo(): String = "$courseName , $numberOflectures , $student , ${Professor} "

}





class Professor  (var firstName : String , var lastName : String , numberPhone : String , course:List<String>){

    fun fullName ():String= "$firstName $lastName " }






class Student  (var firstName : String , var lastName : String , var course:List<String>){

    fun fullName ():String= "$firstName $lastName "

}








