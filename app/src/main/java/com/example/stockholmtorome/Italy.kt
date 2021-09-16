package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Italy : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_italy)


        userSeeQuestionView = findViewById(R.id.userSeeQuestionItTv)


        userSeeQuestionView.setText(
            "Why is the tower of pisa leaning?\n" +
                    "1. Because the mud on one of the sides of the base where softer.\n" +
                    "2. The builders did not communicate and made the base slightly higher on one side.\n" +
                    "3. The architect made an error with the blueprint and didnt notice until halfway done.\n" +
                    "4. It was straight when it was finished, a storm made it leaning 50 years after."
        )
        Thread.sleep(2000)

        fun startBordermusic() {
            borderMusic = MediaPlayer.create(this, R.raw.bordersound)
            borderMusic?.setOnPreparedListener() {
                borderMusic?.start()
            }

        }


        fun startRomePage() {
            val intent = Intent(this, Rome::class.java)
            startActivity(intent)
        }

        fun borderControlPage() {
            val intent = Intent(this, BorderControlItaly::class.java)
            startActivity(intent)
        }



        val button1 = findViewById<Button>(R.id.answerButtonIt1)
        button1.setOnClickListener {
            startRomePage()
            userSeeQuestionView.setText("Good job! Travel on to Rome!")
        }
        val button2 = findViewById<Button>(R.id.answerButtonIt2)
        button2.setOnClickListener {
            startBordermusic()
            borderControlPage()
            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonIt3)
        button3.setOnClickListener {
            startBordermusic()
            borderControlPage()
            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonIt4)
        button4.setOnClickListener {
            startBordermusic()
            borderControlPage()
            userSeeQuestionView.setText("You failed, answer the bordercontrol!")
        }



    }
}