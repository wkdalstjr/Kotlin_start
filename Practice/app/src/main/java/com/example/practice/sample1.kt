package com.example.practice

fun main(){
    //3. String Template

    val name = "minseok"
    println("My name is ${name} I'm 26")

    println("this is 2\$a")

}

//1. 함수

fun helloworld() : Unit { // return 이 없을 때 Unit 써주기 (없어도 됨)
    println("Hello world!")
}

fun add(a : Int, b : Int) : Int { //return 이 있어서 return 타입 꼭 적어주기
    return a+b
}

//2. val vs var
//val = value

fun hi(){
    val a : Int = 10 //변하지 않는 값
    var b : Int = 9 //변할 수 있는 값

    val c = 100 // Int 라고 써주지 않아도 괜찮지만, val 은 꼭 써주어야 한다.

    var name = "minseok"

}

//4. 조건식
fun maxBy(a:Int, b:Int) : Int {
    if(a>b){
        return a
    }else{
        return b
    }
}