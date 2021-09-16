package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Germany : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic : MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_germany)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionGrTv)

        userSeeQuestionView.setText(
            "Which river is the longest in Germany?\n" +
                    "1. Rhen\n" +
                    "2. Elbe\n" +
                    "3. Donau\n" +
                    "4. Weser")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonGr1)
                button1.setOnClickListener {
                    startSwitzerlandPage()
                        startBordermusic()
                            userSeeQuestionView.setText("Good job! Travel on to Switzerland")
        }
        val button2 = findViewById<Button>(R.id.answerButtonGr2)
                button2.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, answer the bordercontrol!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonGr3)
                button3.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, answer the bordercontrol!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonGr4)
                button4.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, answer the bordercontrol!")
        }


    }

    fun startBordermusic(){
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }

    }




    fun startSwitzerlandPage() {
        val intent = Intent(this, Switzerland::class.java)
        startActivity(intent)
    }

    fun borderControlPage() {
        val intent = Intent(this, BorderControlGermany::class.java)
        startActivity(intent)




    }
}