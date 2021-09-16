package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LastChanceGermany : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_germany)


        userSeeQuestionView = findViewById(R.id.lastchanceGrTv)

        userSeeQuestionView.setText("What of the following political parties do not exist in Germany?\n" +
                "1. CDU\n" +
                "2. ÖDP\n" +
                "3. Volt\n" +
                "4. Vox")
        Thread.sleep(2000)


        val button1 = findViewById<Button>(R.id.answerButtonLastChanceGr1)
                button1.setOnClickListener {
                    startBordermusic()
                    backToStockholm()
                        userSeeQuestionView.setText("Germany dont like your ignorance, back to Stockholm!")

        }
        val button2 = findViewById<Button>(R.id.answerButtonLastChanceGr2)
                button2.setOnClickListener {
                    startBordermusic()
                    backToStockholm()
                        userSeeQuestionView.setText("Germany dont like your ignorance, back to Stockholm!")

        }
        val button3 = findViewById<Button>(R.id.answerButtonLastChanceGr3)
                button3.setOnClickListener {
                    startBordermusic()
                    backToStockholm()
                        userSeeQuestionView.setText("Germany dont like your ignorance, back to Stockholm!")

        }
        val button4 = findViewById<Button>(R.id.answerButtonLastChanceGr4)
                button4.setOnClickListener {
                    startSwitzerlandPage()
                        userSeeQuestionView.setText("Good job, lets travel!")
        }

    }
    fun startSwitzerlandPage() {
        val intent = Intent(this, Switzerland::class.java)
        startActivity(intent)
    }
    fun backToStockholm() {
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



