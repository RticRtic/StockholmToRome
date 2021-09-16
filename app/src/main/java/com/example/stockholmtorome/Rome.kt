package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Rome : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rome)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionItRo)


        userSeeQuestionView.setText(
            "What was Julius Ceasers dying word?\n" +
                    "1.Veni, vidi, vici\n" +
                    "2.Non ducor, duco\n" +
                    "3.Et tu, Brute?\n" +
                    "4.Aqua vitae"
        )
        Thread.sleep(3000)


        val button1 = findViewById<Button>(R.id.answerButtonRo1)
        button1.setOnClickListener {
            backToStockholmPage()
            startBordermusic()
            userSeeQuestionView.setText("You failed! Go back to Stockholm and eat som kalles caviar!")
        }
        val button2 = findViewById<Button>(R.id.answerButtonRo2)
        button2.setOnClickListener {
            backToStockholmPage()
            startBordermusic()
            userSeeQuestionView.setText("You failed! Go back to Stockholm and eat som kalles caviar!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonRo3)
        button3.setOnClickListener {
            startFinalPage()
            userSeeQuestionView.setText("Good job! The Pope wants to see you!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonRo4)
        button4.setOnClickListener {
            backToStockholmPage()
            startBordermusic()

            userSeeQuestionView.setText("You failed! Go back to Stockholm and eat som kalles caviar!")
        }

    }

    fun startFinalPage() {
        val intent = Intent(this, FinalPage::class.java)
        startActivity(intent)
    }

    fun backToStockholmPage() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun startBordermusic() {
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }


    }
}