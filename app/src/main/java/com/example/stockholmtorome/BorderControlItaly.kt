package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BorderControlItaly : AppCompatActivity() {


    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswer: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_border_control_italy)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopItTv)
        userPutInAnswer = findViewById(R.id.userAnswerStopItEt)

        userSeeQuestionView.setText("What was the currency in Italy before they adopted the Euro?\n" +
                "1. Franc\n" +
                "2. Lira\n" +
                "3. Peso\n" +
                "4. Dinar")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.answerButtonStopIt)
        button.setOnClickListener {
            answerStopItaly()

        }

    }
    fun answerStopItaly() {
        if(userPutInAnswer.text.toString().toInt() == 2) {
            userSeeQuestionView.setText("Good job, lets travel!")
            backToLastChanceItalyPage()

        }
        else {
            userSeeQuestionView.setText("You faild, Answer the bordercontrol!")
            backToLastChancePageSwitzerland()
        }



    }
    fun backToLastChanceItalyPage() {
        val intent = Intent(this, LastChanceItaly::class.java)
        startActivity(intent)
    }
    fun backToLastChancePageSwitzerland() {
        val intent = Intent(this, LastChanceSwitzerland::class.java)
        startActivity(intent)
    }



}