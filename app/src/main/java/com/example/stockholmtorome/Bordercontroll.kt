package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class Bordercontroll : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bordercontroll)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopTv)



        userSeeQuestionView.setText(
            "The danish people like beer, what is the beer consumption pp/year?\n" +
                    "1. 30L\n" +
                    "2. 60L\n" +
                    "3. 80L\n" +
                    "4. 45L")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonDkBc1)
                button1.setOnClickListener {
                    backToStockholm()
                        userSeeQuestionView.setText("You faild, back to Stockholm!")
        }
        val button2 = findViewById<Button>(R.id.answerButtonDkBc2)
                button2.setOnClickListener {
                    backToLastChanceDanmarkPage()
                        userSeeQuestionView.setText("Good job, lets travel")
        }
        val button3 = findViewById<Button>(R.id.answerButtonDkBc3)
                button3.setOnClickListener {
                    backToStockholm()
                        userSeeQuestionView.setText("You faild, back to Stockholm!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonDkBc4)
                button4.setOnClickListener {
                    backToStockholm()
                        userSeeQuestionView.setText("You faild, back to Stockholm!")
        }


    }



    fun backToLastChanceDanmarkPage() {
        val intent = Intent(this, LastChanceDanmark::class.java)
        startActivity(intent)

    }


    fun backToStockholm() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }






}