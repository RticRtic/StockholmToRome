package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Switzerland : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic : MediaPlayer? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switzerland)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionSwTv)

        userSeeQuestionView.setText("What brand does not originate from Switzerland?\n" +
                "1. Knorr\n" +
                "2. Breitling\n" +
                "3. Birkenstock\n" +
                "4. Lindt")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonSw1)
                button1.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, Answer the bordercontrol!")

        }
        val button2 = findViewById<Button>(R.id.answerButtonSw2)
                button2.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, Answer the bordercontrol!")

        }
        val button3 = findViewById<Button>(R.id.answerButtonSw3)
                button3.setOnClickListener {
                    startItalyPage()
                        userSeeQuestionView.setText("God job! Travel on to Italy")

        }
        val button4 = findViewById<Button>(R.id.answerButtonSw4)
                button4.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, Answer the bordercontrol!")
        }



    }

    fun startBordermusic(){
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }

    }


    fun startItalyPage() {
       val intent = Intent(this, Italy::class.java)
            startActivity(intent)
    }

    fun borderControlPage() {
        val intent = Intent(this,BorderControlSwitzerland ::class.java)
        startActivity(intent)
    }



}