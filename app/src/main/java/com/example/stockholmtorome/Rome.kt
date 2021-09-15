package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Rome : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rome)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionItRo)
        userPutInAnswerView = findViewById(R.id.userAnswerRoEt)

        userSeeQuestionView.setText(
            "What was Julius Ceasers dying word?\n" +
                    "1.Veni, vidi, vici\n" +
                    "2.Non ducor, duco\n" +
                    "3.Et tu, Brute?\n" +
                    "4.Aqua vitae")
        Thread.sleep(3000)

        val button = findViewById<Button>(R.id.answerButtonRo)
        button.setOnClickListener {
            userAnswerRome()
        }


    }

    fun userAnswerRome() {
        if (userPutInAnswerView.text.toString().toInt() == 3) {
            userSeeQuestionView.setText("Congratulations, You traveled all the way to rome.\n" +
                    "The Pope wants to see you!")
            startFinalPage()


        } else {
            userSeeQuestionView.setText("You failed, Bye bye have fun in Stockholm!")
            backToStockholmPage()
        }


    }
    fun startFinalPage() {
        val intent = Intent(this, FinalPage::class.java)
        startActivity(intent)
    }
    fun backToStockholmPage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}