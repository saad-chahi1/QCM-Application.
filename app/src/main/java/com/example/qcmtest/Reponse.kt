package com.example.qcmtest

class Reponse {
    var id : Int = 0
    var repons : String = ""
    var question : String = ""
    var state : Int =0



    constructor(rep:String, qst:String, stat:Int){
        this.repons = rep
        this.state = stat
        this.question = qst
    }

    constructor(){
    }
}