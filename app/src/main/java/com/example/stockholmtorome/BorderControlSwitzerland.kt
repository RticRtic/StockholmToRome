package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BorderControlSwitzerland : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic : MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_border_control_switzerland)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopSwTv)


        userSeeQuestionView.setText("What is Switzerland not famous of?\n" +
                "1. Fondue\n" +
                "2. Chocolate\n" +
                "3. Cable Cars\n" +
                "4. Swizz cutlery")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonStopSw1)
                button1.setOnClickListener {
                    startBordermusic()
                    backToLastChanceGermanyPage()
                        userSeeQuestionView.setText("You failed, back To Germany!")

        }
        val button2 = findViewById<Button>(R.id.answerButtonStopSw2)
                button2.setOnClickListener {
                    startBordermusic()
                    backToLastChanceGermanyPage()
                        userSeeQuestionView.setText("You failed, back To Germany!")

        }
        val button3 = findViewById<Button>(R.id.answerButtonStopSw3)
                button3.setOnClickListener {
                    startBordermusic()
                    backToLastChanceGermanyPage()
                        userSeeQuestionView.setText("You failed, back To Germany!")

        }
        val button4 = findViewById<Button>(R.id.answerButtonStopSw4)
                button4.setOnClickListener {
                    backToLastChanceSwitzerlandPage()
                        userSeeQuestionView.setText("Good job, lets Travel!")

        }

    }

    fun backToLastChanceSwitzerlandPage() {
        val intent = Intent(this, LastChanceSwitzerland::class.java)
        startActivity(intent)
    }
    fun backToLastChanceGermanyPage() {
        val intent = Intent(this, LastChanceGermany::class.java)
        startActivity(intent)

    }
    fun startBordermusic() {
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }

    }


}