package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LastChanceDanmark : AppCompatActivity() {


    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_danmark)


        userSeeQuestionView = findViewById(R.id.lastchanceDkTv)
        userPutInAnswerView = findViewById(R.id.userAnswerLastChanceDkEt)

        userSeeQuestionView.setText("Lego is from Danmark but when was the company created?\n" +
                "1. 1947\n" +
                "2. 1932\n" +
                "3. 1958\n" +
                "4. 1925")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.answerButtonLastChanceDk)
            button.setOnClickListener {
                answerLastChanceDk()

            }

    }

    fun answerLastChanceDk() {
        if(userPutInAnswerView.text.toString().toInt() == 2) {
            userSeeQuestionView.setText("Good job, Lets Travel!")
            startGermanyPage()
        }
        else {
            userSeeQuestionView.setText("Back to Stockholm with you your sour herring!")
            backToStockholm()
        }
    }


    fun startGermanyPage() {
        val intent = Intent(this, Germany::class.java)
        startActivity(intent)
    }
    fun backToStockholm() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}