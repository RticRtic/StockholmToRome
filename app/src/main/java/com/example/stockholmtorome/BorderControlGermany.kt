package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class BorderControlGermany : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_border_control_germany)

        userSeeQuestionView = findViewById(R.id.userSeeQuestionStopGrTv)


        userSeeQuestionView.setText(
            "Germany are famous for their carindustry, what brand is not from Germany?\n" +
                    "1. Audi\n" +
                    "2. Volkswagen\n" +
                    "3. Porsche\n" +
                    "4. Fiat"
        )
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonStopGr1)
                button1.setOnClickListener {
                    startBordermusic()
                    backToLastChanceDanmarkPage()
                        userSeeQuestionView.setText("You failed, back to Denmark!")

        }
        val button2 = findViewById<Button>(R.id.answerButtonStopGr2)
                button2.setOnClickListener {
                    startBordermusic()
                    backToLastChanceDanmarkPage()
                        userSeeQuestionView.setText("You failed, back to Denmark!")

        }
        val button3 = findViewById<Button>(R.id.answerButtonStopGr3)
                button3.setOnClickListener {
                    startBordermusic()
                    backToLastChanceDanmarkPage()
                    userSeeQuestionView.setText("You failed, back to Denmark!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonStopGr4)
                button4.setOnClickListener {
                    backToLastChanceGermanyPage()
                        userSeeQuestionView.setText("Good job, lets travel more!")
        }

    }
    fun startBordermusic() {
        borderMusic = MediaPlayer.create(this, R.raw.bordersound)
        borderMusic?.setOnPreparedListener() {
            borderMusic?.start()
        }

    }


    fun backToLastChanceGermanyPage() {
        val intent = Intent(this, LastChanceGermany::class.java)
        startActivity(intent)
    }

    fun backToLastChanceDanmarkPage() {
        val intent = Intent(this, LastChanceDanmark::class.java)
        startActivity(intent)


    }
}











