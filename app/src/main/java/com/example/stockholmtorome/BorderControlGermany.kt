package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BorderControlGermany : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_border_control_germany)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopGrTv)
        userPutInAnswerView = findViewById(R.id.userAnswerStopGrEt)

        userSeeQuestionView.setText("Germany are famous for their carindustry, what brand is not from Germany?\n" +
                "1. Audi\n" +
                "2. Volkswagen\n" +
                "3. Porsche\n" +
                "4. Fiat")
        Thread.sleep(2000)
        val button = findViewById<Button>(R.id.answerButtonStopGr)
        button.setOnClickListener {
            answerStopGermany()

        }

    }

    fun answerStopGermany() {
        if(userPutInAnswerView.text.toString().toInt() == 4) {
            userSeeQuestionView.setText("Good job, lets travel more!")
            backToLastChanceGermanyPage()

        }
        else {
            userSeeQuestionView.setText("You faild, back to Danmark!")
            backToLastChanceDanmarkPage()

        }

    }
    fun backToLastChanceGermanyPage() {
        val intent = Intent(this, LastChanceGermany::class.java)
        startActivity(intent)
    }
    fun backToLastChanceDanmarkPage() {
        val intent = Intent(this, LastChanceDanmark::class.java)
        startActivity(intent)

    }



}