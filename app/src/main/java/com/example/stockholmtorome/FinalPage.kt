package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FinalPage : AppCompatActivity() {

    lateinit var userSeeQuestionPopeView: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_page)

        userSeeQuestionPopeView = findViewById(R.id.userSeePopeTv)

        userSeeQuestionPopeView.setText("Im very glad you made it all the way to Rome.\n" +
                "Feel your self at home and be sure to check out Michelangelo great work.\n" +
                "- The Pope")
        Thread.sleep(2000)

        val playAgainButton = findViewById<Button>(R.id.playAgainButton)
        playAgainButton.setOnClickListener {
            restartGame()

        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            exitGame()
        }

    }

    fun restartGame() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun exitGame() {
        finishAffinity()
    }



}