package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BorderControlSwitzerland : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_border_control_switzerland)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopSwTv)
        userPutInAnswerView = findViewById(R.id.userAnswerStopSwEt)

        userSeeQuestionView.setText("What is Switzerland not famous of?\n" +
                "1. Fondue\n" +
                "2. Chocolate\n" +
                "3. Cable Cars\n" +
                "4. Swizz cutlery")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.answerButtonStopSw)
        button.setOnClickListener {
            answerStopSwitzerland()
        }

    }

    fun answerStopSwitzerland() {
        if(userPutInAnswerView.text.toString().toInt() == 4) {
            userSeeQuestionView.setText("Good job, lest Travel!")
            backToLastChanceSwitzerlandPage()
        }
        else {
            userSeeQuestionView.setText("You faild, back To Germany!")
            backToLastChanceGermanyPage()
        }
    }

    fun backToLastChanceSwitzerlandPage() {
        val intent = Intent(this, LastChanceSwitzerland::class.java)
        startActivity(intent)
    }
    fun backToLastChanceGermanyPage() {
        val intent = Intent(this, LastChanceGermany::class.java)
        startActivity(intent)

    }


}