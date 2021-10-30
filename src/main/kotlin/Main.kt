fun main() {


    val course = Course()
    course.courseName = "English"
    course.numberOfLectures = 5

    val course2 = Course()
    course2.courseName = "Arabic"
    course2.numberOfLectures = 10

    val courses = ArrayList<Course>()
    courses.add(course)
    courses.add(course2)
    val prof = Professor("ali", "ahmed")
    val prof2 = Professor("saed", "khaled")
    prof.courses = courses
    course.assignProfessor(prof)
    course2.assignProfessor(prof2)


   val stdRaghad =  Student("Raghad","aa",courses)
    val courseJava = Course()
    courseJava.courseName = "Java"
    courseJava.numberOfLectures = 50
    val courseProgram = ArrayList<Course>()
    courseProgram.add(courseJava)
   val stdSami =  Student("Sami","omar",courseProgram)
    course.enroll(stdRaghad)
    courseJava.enroll(stdSami)
   // courseJava.assignProfessor(prof)
    courseJava.assignProfessor(prof2)
    println(course.courseInfo())
    println(courseJava.courseInfo())



}


 class Course() {
    var courseName = ""
    var numberOfLectures = 0
    var students = ArrayList<Student>()
    var professor: Professor? = null
    var maxStudent = 20

    fun numberOfStudents() = students.size


    fun assignProfessor(prof: Professor): Boolean {
        if (professor == null) {
            professor = prof
            return true
        }
        return false
    }

    fun professorName(): String? {
        return professor?.fullName()
    }

    fun enroll(student: Student): Boolean {

        if (numberOfStudents() < maxStudent) {
            students.add(student)
            return true
        } else {
            return false
        }



    }

     override fun toString(): String {
         return " courseNam: $courseName, professor: $professor, maxStudent: $maxStudent "
     }

     fun allStudents():String{
        var std = ""
        students.forEach {
           std+="$it,"
        }
        return std
    }

    fun courseInfo(): String = "Course($courseName , $numberOfLectures) , ${allStudents()} ${professor?.fullName()} "
}


data class Professor(var firstName: String, var lastName: String) {
    var courses = ArrayList<Course>()
    var telephone: String = ""

    fun fullName() = "Professor($firstName $lastName)"

    fun getAllCourses() = courses

}


data class Student(var firstName: String, var lastName: String, var course: List<Course>) {


    fun fullName() = "$firstName $lastName"

    override fun toString(): String {
        return " Student( firstName: $firstName, lastName: $lastName)"
    }

}








