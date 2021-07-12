fun main(){
    println("==프로그램 시작==")

    print("숫자 : ")
    var num0 = readLine()?.trim()?.toInt()
    print("숫자 : ")
    var num1 = readLine()!!.trim().toInt()
    print("숫자 : ")
    var num2 = (readLine() ?: "").trim().toInt()
              //null일경우 ""출력, 아닐경우 readLine() 출력.
    print("숫자 : ")
    var num3 = readLine()?.trim()?.toInt() ?: 0
                //null일경우 0을출력한다.

    println("* 숫자출력 *")

    println("numb0 : $num0")
    println("numb1 : $num1")
    println("numb2 : $num2")
    println("numb3 : $num3")


    println("==프로그램 끝==")
}