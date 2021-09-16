package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LastChanceSwitzerland : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_switzerland)

        userSeeQuestionView = findViewById(R.id.lastchanceSwTv)

        userSeeQuestionView.setText("What languages do they speak in Switzerland?\n" +
                "1. French, German\n" +
                "2. French, German, Italian\n" +
                "3. French, German, Italian and Romansh\n" +
                "4. German, Italian")
        Thread.sleep(2000)


        val button1 = findViewById<Button>(R.id.answerButtonLastChanceSw1)
                button1.setOnClickListener {
                    startBordermusic()
                    backToStockholmPage()
                        userSeeQuestionView.setText("You failed! You couldn't handle the Swizz")

        }
        val button2 = findViewById<Button>(R.id.answerButtonLastChanceSw2)
                button2.setOnClickListener {
                    startBordermusic()
                    backToStockholmPage()
                        userSeeQuestionView.setText("You failed! You couldn't handle the Swizz")


        }
        val button3 = findViewById<Button>(R.id.answerButtonLastChanceSw3)
                button3.setOnClickListener {
                    startItalyPage()
                        userSeeQuestionView.setText("Good job, Travel to Italy!")

        }
        val button4 = findViewById<Button>(R.id.answerButtonLastChanceSw4)
                button4.setOnClickListener {
                    startBordermusic()
                    backToStockholmPage()
                        userSeeQuestionView.setText("You failed! You couldn't handle the Swizz")

        }


    }
    fun startItalyPage() {
        val intent = Intent(this, Italy::class.java)
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




