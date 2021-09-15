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
    lateinit var userPutInAnswerView: EditText
    var borderMusic : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmark)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionTv)



        userSeeQuestionView.setText("Who was the Danish king whom ruled over England during the viking era?\n" +
                "1. Knut the great one\n" +
                "2. Albert the gready\n" +
                "3. Björn ironside\n" +
                "4. Gorm the old")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonDk1)
                button1.setOnClickListener {
                    userAnswerDanmark()
            }
        val button2 = findViewById<Button>(R.id.answerButtonDk2)
                button2.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, answer the bordercontrol!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonDk3)
                button3.setOnClickListener {
                    borderControlPage()
                        startBordermusic()
                            userSeeQuestionView.setText("You faild, answer the bordercontrol!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonDk4)
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

    fun userAnswerDanmark(){

        if(userPutInAnswerView.text.toString().toInt() == 1) {
            userSeeQuestionView.setText("Good job! Travel on to Germany")
            startGermanyPage()

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
