package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LastChanceItaly : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_italy)


        userSeeQuestionView = findViewById(R.id.lastchanceItTv)
        userPutInAnswerView = findViewById(R.id.userAnswerLastChanceItEt)

        userSeeQuestionView.setText("Who is the manager of the male fottballteam in Italy?\n" +
                "1. Giorgio Chiellini\n" +
                "2. Luigi Riva\n" +
                "3. Roberto Mancini\n" +
                "4. Gianluigi Buffon")

        val button = findViewById<Button>(R.id.answerButtonLastChanceIt)
        button.setOnClickListener {
            answerLastChangeItaly()

        }

    }
    fun answerLastChangeItaly() {
        if(userPutInAnswerView.text.toString().toInt() == 3) {
            userSeeQuestionView.setText("Good job, lets travel!")
            startRomePage()

        }
        else {
            userSeeQuestionView.setText("You faild, the pope dont want you here anymore!")
            backToStockholmPage()
        }


    }
    fun startRomePage() {
        val intent = Intent(this, Rome::class.java)
        startActivity(intent)
    }
    fun backToStockholmPage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}