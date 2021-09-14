package com.example.stockholmtorome

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
                "1. French, German" +
                "2. French, German, Italian" +
                "3. French, German, Italian and Romansh" +
                "4. German, Italian")


        val button = findViewById<Button>(R.id.answerButtonLastChanceSw)
        button.setOnClickListener {

        }


    }


}