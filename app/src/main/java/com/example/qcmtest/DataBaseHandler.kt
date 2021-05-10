package com.example.tachen3_final

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast
import com.example.qcmtest.Question
import com.example.qcmtest.Reponse
import com.example.qcmtest.Test

val DATABASE_NAME ="MyDB"

val TABLE_NAMET="test"
val COL_idT = "id"
val COL_test = "test"

val TABLE_NAMEQ="question"
val COL_idQ = "id"
val COL_question = "question"
val COL_testQ = "test"

val TABLE_NAMER="reponse"
val COL_idR = "id"
val COL_repons = "repons"
val COL_questionR = "question"
val COL_state = "state"

class DataBaseHandler(var context: Context) : SQLiteOpenHelper(context,DATABASE_NAME,null,1){
    override fun onCreate(db: SQLiteDatabase?) {

        val createTableT = "CREATE TABLE " + TABLE_NAMET +" (" +
                COL_idT +" INTEGER PRIMARY KEY AUTOINCREMENT," +  COL_test + " VARCHAR(256) )"

        val createTableR = "CREATE TABLE " + TABLE_NAMER +" (" +
                COL_idR +" INTEGER PRIMARY KEY AUTOINCREMENT," +  COL_repons + " VARCHAR(256)," +  COL_questionR + " VARCHAR(256)," + COL_state +" INTEGER)"

        val createTableQ = "CREATE TABLE " + TABLE_NAMEQ +" (" +
                COL_idQ +" INTEGER PRIMARY KEY AUTOINCREMENT," +  COL_question + " VARCHAR(256)," +  COL_testQ + " VARCHAR(256))"

        db?.execSQL(createTableR)
        db?.execSQL(createTableT)
        db?.execSQL(createTableQ)

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun add_question(question: Question) {
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_question, question.question)
        cv.put(COL_test, question.test)
        var result = db.insert(TABLE_NAMEQ,null,cv)
        if(result == -1.toLong())
            Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context,"Success",Toast.LENGTH_SHORT).show()
        db.close()

    }
    fun add_test(test: Test) {
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_test,test.nom)
        var result = db.insert(TABLE_NAMET,null,cv)
        if(result == -1.toLong())
            Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context,"Success",Toast.LENGTH_SHORT).show()
        db.close()
    }
    fun add_reponse(reponse: Reponse) {
        val db = this.writableDatabase
        var cv = ContentValues()
        cv.put(COL_repons,reponse.repons)
        cv.put(COL_questionR,reponse.question)
        cv.put(COL_state,reponse.state)
        var result = db.insert(TABLE_NAMER,null,cv)
        if(result == -1.toLong())
            Toast.makeText(context,"Failed",Toast.LENGTH_SHORT).show()
        else
            Toast.makeText(context,"Success",Toast.LENGTH_SHORT).show()
        db.close()
    }

    fun readData(question: String) : MutableList<Reponse>{
        var list : MutableList<Reponse> = ArrayList()

        val db = this.readableDatabase
        val query = "Select * from " + TABLE_NAMER +" where " + COL_question + "='"+question+"'"
        val result = db.rawQuery(query,null)
        if(result.moveToFirst()){
            do {
                var reponse = Reponse()
                reponse.repons = result.getString(result.getColumnIndex(COL_repons))
                reponse.state = result.getInt(result.getColumnIndex(COL_state))
                list.add(reponse)
            }while (result.moveToNext())
        }

        result.close()
        db.close()
        return list
    }

    fun readQuestion(test: String) : MutableList<Question>{
        var list : MutableList<Question> = ArrayList()

        val db = this.readableDatabase
        val query = "Select DISTINCT * from " + TABLE_NAMEQ +" where " + COL_testQ + "='"+test+"'"
        val result = db.rawQuery(query,null)
        if(result.moveToFirst()){
            do {
                var question = Question()
                question.question = result.getString(result.getColumnIndex(COL_question))
                list.add(question)
            }while (result.moveToNext())
        }

        result.close()
        db.close()
        return list
    }

    /*fun readDataId(id : Int) : User{
        lateinit var list : User

        val db = this.readableDatabase
        val query = "Select * from " + TABLE_NAME +" where id = "+id
        val result = db.rawQuery(query,null)
        if(result.moveToFirst()){
            do {
                var user = User()
                user.id = result.getString(result.getColumnIndex(COL_ID)).toInt()
                user.nom = result.getString(result.getColumnIndex(COL_NAME))
                user.prenom = result.getString(result.getColumnIndex(COL_PRENOM))
                user.age = result.getString(result.getColumnIndex(COL_AGE)).toInt()
                user.tele = result.getString(result.getColumnIndex(COL_TELE)).toInt()
                user.image = result.getString(result.getColumnIndex(COL_IMAGE))
                list = user
            }while (result.moveToNext())
        }

        result.close()
        db.close()
        return list
    }*/

}