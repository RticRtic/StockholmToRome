package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LastChanceDanmark : AppCompatActivity() {


    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_danmark)


        userSeeQuestionView = findViewById(R.id.lastchanceDkTv)


        userSeeQuestionView.setText("Lego is from Danmark but when was the company created?\n" +
                "1. 1947\n" +
                "2. 1932\n" +
                "3. 1958\n" +
                "4. 1925")
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonLastChanceDk1)
                button1.setOnClickListener {
                    startBordermusic()
                    backToStockholm()
                        userSeeQuestionView.setText("Back to Stockholm with you, your sour herring!")
            }
        val button2 = findViewById<Button>(R.id.answerButtonLastChanceDk2)
                button2.setOnClickListener {
                    startGermanyPage()
                        userSeeQuestionView.setText("Good job, lets travel to Germany!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonLastChanceDk3)
                button3.setOnClickListener {
                    startBordermusic()
                    backToStockholm()
                        userSeeQuestionView.setText("Back to Stockholm with you, your sour herring!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonLastChanceDk4)
                button4.setOnClickListener {
                    startBordermusic()
                    backToStockholm()
                        userSeeQuestionView.setText("Back to Stockholm with you, your sour herring!")
        }

    }




    fun startGermanyPage() {
        val intent = Intent(this, Germany::class.java)
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