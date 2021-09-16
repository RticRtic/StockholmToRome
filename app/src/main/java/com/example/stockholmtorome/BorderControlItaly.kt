package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BorderControlItaly : AppCompatActivity() {


    lateinit var userSeeQuestionView: TextView
    var borderMusic : MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_border_control_italy)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopItTv)


        userSeeQuestionView.setText(
            "What was the currency in Italy before they adopted the Euro?\n" +
                    "1. Franc\n" +
                    "2. Lira\n" +
                    "3. Peso\n" +
                    "4. Dinar"
        )
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonStopIt1)
        button1.setOnClickListener {
            backToLastChancePageSwitzerland()
            startBordermusic()
            userSeeQuestionView.setText("You failed, back To Switzerland!")

        }
        val button2 = findViewById<Button>(R.id.answerButtonStopIt2)
        button2.setOnClickListener {
            backToLastChancePageSwitzerland()
            startBordermusic()
            userSeeQuestionView.setText("You failed, back To Switzerland!")

        }
        val button3 = findViewById<Button>(R.id.answerButtonStopIt3)
        button3.setOnClickListener {
            startBordermusic()
            backToLastChancePageSwitzerland()
            userSeeQuestionView.setText("You failed, back To Switzerland!")

        }
        val button4 = findViewById<Button>(R.id.answerButtonStopIt4)
        button4.setOnClickListener {
            backToLastChanceItalyPage()
            userSeeQuestionView.setText("Good job, lets move on to Italy!")


        }

    }

    fun startBordermusic() {
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }

    }


            fun backToLastChanceItalyPage() {
            val intent = Intent(this, LastChanceItaly::class.java)
            startActivity(intent)
        }

        fun backToLastChancePageSwitzerland() {
            val intent = Intent(this, LastChanceSwitzerland::class.java)
            startActivity(intent)
        }

    }


