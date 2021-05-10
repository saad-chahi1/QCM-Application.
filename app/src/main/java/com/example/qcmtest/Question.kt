package com.example.qcmtest

class Question {
    var id : Int = 0
    var question : String = ""
    var test : String = ""

    constructor(qst:String, tst:String){
        this.question = qst
        this.test = tst
    }

    constructor(){
    }
}