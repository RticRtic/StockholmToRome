package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LastChanceGermany : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_germany)


        userSeeQuestionView = findViewById(R.id.lastchanceGrTv)
        userPutInAnswerView = findViewById(R.id.userAnswerLastChanceGrEt)

        userSeeQuestionView.setText("What of the following political parties do not exist in Germany?\n" +
                "1. CDU\n" +
                "2. ÖDP\n" +
                "3. Volt\n" +
                "4. Vox")
        Thread.sleep(2000)


        val button = findViewById<Button>(R.id.answerButtonLastChanceGr)
        button.setOnClickListener {
            answerLastQuestionGr()
        }

    }
    fun answerLastQuestionGr() {
        if(userPutInAnswerView.text.toString().toInt() == 4) {
            userSeeQuestionView.setText("Good job, lets travel!")
            startGermanyPage()
        }
        else {
            userSeeQuestionView.setText("Germany dont like your ignorance, back to Stockholm!")
            backToStockholm()
        }

    }
    fun startGermanyPage() {
        val intent = Intent(this, Switzerland::class.java)
        startActivity(intent)
    }
    fun backToStockholm() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}