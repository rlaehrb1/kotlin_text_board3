fun main(){
    println("== 프로그램 시작 == ")


    //val numbers = intArrayOf(0,0,0)
    val numbers = IntArray(3) {0}

    println("* 숫자입력")

    for( i in numbers.indices){
        print("${i+1}번째 숫자 입력 :")
        numbers[i] = readLine()!!.trim().toInt()

    }

    println("* 숫자출력")
    var i = 0

    for (number in numbers) {
        i++
        println(" ${i} 번째숫자: $number")

    /* for( i in numbers.indices){
        println("${i+1}번째 숫자 : ${numbers[i]}")*/

    }
    println("== 프로그램 끝 ==")
}