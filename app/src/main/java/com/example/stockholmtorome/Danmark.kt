package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import java.util.concurrent.TimeUnit
import kotlin.concurrent.thread

class Danmark : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmark)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionTv)



        userSeeQuestionView.setText("Who was the Danish king whom ruled over England during the viking era?")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonDk1)
                button1.setOnClickListener {
                    startGermanyPage()
                        userSeeQuestionView.setText("Good job, lets travel!")
            }
        val button2 = findViewById<Button>(R.id.answerButtonDk2)
                button2.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonDk3)
                button3.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonDk4)
                button4.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
        }

    }


    fun startBordermusic(){
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }

    }



    fun startGermanyPage() {
        val intent = Intent(this, Germany::class.java)
            startActivity(intent)

    }
    fun borderControlPage() {
        val intent = Intent(this, Bordercontroll::class.java)
        startActivity(intent)

    }


}
