package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Italy : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    lateinit var userPutInAnswerView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italy)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionItTv)
        userPutInAnswerView = findViewById(R.id.userAnswerItEt)

        userSeeQuestionView.setText("Why is the tower of pisa leaning?\n" +
                    "1. Because the mud on one of the sides of the base where softer.\n" +
                    "2. The builders did not communicate and made the base slightly higher on one side.\n" +
                    "3. The architect made an error with the blueprint and didnt notice until halfway done.\n" +
                    "4. It was straight when it was finished, a storm made it leaning 50 years after.")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.answerButtonIt)
        button.setOnClickListener {
            userAnswerItaly()
        }


    }

    fun userAnswerItaly() {
        if (userPutInAnswerView.text.toString().toInt() == 1) {
            userSeeQuestionView.setText("God job! Travel on to Rome.\n" +
                    "You only have one chance to answer correct in Rome.")
            startRomePage()


        } else {
            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
            borderControlPage()
        }


    }

    fun startRomePage() {
        val intent = Intent(this, Rome::class.java)
            startActivity(intent)
    }
    fun borderControlPage() {
        val intent = Intent(this, BorderControlItaly::class.java)
        startActivity(intent)
    }




}