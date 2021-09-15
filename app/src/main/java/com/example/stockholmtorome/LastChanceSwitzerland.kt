package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LastChanceSwitzerland : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_switzerland)

        userSeeQuestionView = findViewById(R.id.lastchanceSwTv)
        userPutInAnswerView = findViewById(R.id.userAnswerLastChanceSwEt)

        userSeeQuestionView.setText("What languages do they speak in Switzerland?\n" +
                "1. French, German\n" +
                "2. French, German, Italian\n" +
                "3. French, German, Italian and Romansh\n" +
                "4. German, Italian")


        val button = findViewById<Button>(R.id.answerButtonLastChanceSw)
        button.setOnClickListener {
            answerLastChanceQuestion()

        }


    }
    fun answerLastChanceQuestion() {
        if(userPutInAnswerView.text.toString().toInt() == 3) {
            userSeeQuestionView.setText("Good job, Travel to Italy!")
            startItalyPage()

        }
        else {
            userSeeQuestionView.setText("You faild! You couldn't handle the Swizz")
            backToStockholmPage()
        }

    }
    fun startItalyPage() {
        val intent = Intent(this, Italy::class.java)
        startActivity(intent)
    }
    fun backToStockholmPage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}