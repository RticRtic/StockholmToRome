package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

class Danmark : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmark)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionTv)
        userPutInAnswerView = findViewById(R.id.userAnswerEt)


        userSeeQuestionView.setText("Who was the Danish king whom ruled over England during the viking era?\n" +
                "1. Knut the great one\n" +
                "2. Albert the gready\n" +
                "3. Björn ironside\n" +
                "4. Gorm the old")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.answerButton)
            button.setOnClickListener {
                userAnswerDanmark()

            }



    }



    fun userAnswerDanmark(){

        if(userPutInAnswerView.text.toString().toInt() == 1) {
            userSeeQuestionView.setText("Good job! Travel on to Germany")
            startGermanyPage()





        }else {
            userSeeQuestionView.setText("You faild, answer the bordercontrol!")
            borderControlPage()
        }



    }






    fun startGermanyPage() {


        val intent = Intent(this, Germany::class.java)
            startActivity(intent)

    }
    fun borderControlPage() {
        val intent = Intent(this, Bordercontroll::class.java)
        startActivity(intent)

    }

    fun randomQuestions() {



    }








}
