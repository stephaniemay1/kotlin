fun main(){
    var num = 6
    var rem = 6 % 2
    if (rem == 0){
        println("even")
    }else {
        println("odd")
    }


    var maths = 0
    var phyc = 9
    var chem = 2
    var bio = 1

    var sum = maths+phyc+chem+bio
    var mean = sum/4
    println(mean)

    if (mean >= 80){
        println("A")
    }else if (mean >=60){
        println("B")
    }else if (mean >= 50){
        println("C")
    }else if (mean >= 30){
        println("D")
    }else if (mean < 30){
        println("E")
    }

ifss()


}

fun ifss(){
    //while loop

    var grade = 0.00007

    while (grade < 1){
        println(grade)
        grade++
    }
}

