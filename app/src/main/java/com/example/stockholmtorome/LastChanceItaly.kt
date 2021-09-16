package com.example.stockholmtorome

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LastChanceItaly : AppCompatActivity() {

    lateinit var userSeeQuestionView: TextView
    var borderMusic: MediaPlayer? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_chance_italy)


        userSeeQuestionView = findViewById(R.id.lastchanceItTv)


        userSeeQuestionView.setText(
            "Who is the manager of the male fottballteam in Italy?\n" +
                    "1. Giorgio Chiellini\n" +
                    "2. Luigi Riva\n" +
                    "3. Roberto Mancini\n" +
                    "4. Gianluigi Buffon"
        )
        Thread.sleep(2000)

        val button1 = findViewById<Button>(R.id.answerButtonLci1)
        button1.setOnClickListener {
            startRomePage()
            backToStockholmPage()
            userSeeQuestionView.setText("You failed, back to Stockholm il tou pesce svedese!")
        }
        val button2 = findViewById<Button>(R.id.answerButtonLci2)
        button2.setOnClickListener {
            startBordermusic()
            backToStockholmPage()
            userSeeQuestionView.setText("You failed, back to Stockholm il tou pesce svedese!")
        }
        val button3 = findViewById<Button>(R.id.answerButtonLci3)
        button3.setOnClickListener {
            startRomePage()
            userSeeQuestionView.setText("Bellisimo, you earned a ticket straight to Rome!")
        }
        val button4 = findViewById<Button>(R.id.answerButtonLci4)
        button4.setOnClickListener {
            startBordermusic()
            backToStockholmPage()
            userSeeQuestionView.setText("You failed, back to Stockholm il tou pesce svedese!")
        }


    }


    fun startRomePage() {
        val intent = Intent(this, Rome::class.java)

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
