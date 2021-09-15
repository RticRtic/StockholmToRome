package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.util.toRange
import java.util.*

class Bordercontroll : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutinAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bordercontroll)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopTv)
        userPutinAnswerView = findViewById(R.id.userAnswerStopEt)


        userSeeQuestionView.setText(
            "What is the name of Indias primeminister?\n" +
                    "1. Ram Khatri\n" +
                    "2. Narendra Modi\n" +
                    "3. Mohammad Patel\n" +
                    "4. Reddy Ahuja")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.answerButtonStop)
        button.setOnClickListener {
            userAnswerStop()
        }


    }


    fun userAnswerStop() {

        if (userPutinAnswerView.text.toString().toInt() == 2) {
            userSeeQuestionView.setText("Good job, lets travel more!")
            backToDanmarkPage()


        } else {
            userSeeQuestionView.setText("You faild! One last Chance")
            backToMainActivityPage()
        }

    }

    fun backToDanmarkPage() {
        val intent = Intent(this, LastChanceDanmark::class.java)
        startActivity(intent)

    }


    fun backToMainActivityPage() {
        val intent = Intent(this, LastChanceDanmark::class.java)
        startActivity(intent)

    }






}