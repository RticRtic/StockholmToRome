package com.example.stockholmtorome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var userSeeImageView: ImageView
    lateinit var userSeeWelcomeTextView: TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        userSeeImageView = findViewById(R.id.stockholmIv)
        userSeeWelcomeTextView = findViewById(R.id.welcomeTv)

        userSeeWelcomeTextView.setText("Ïn this travelquiz your’r going from stockholm\n" +
                "to rome. Each stop on the way to Rome, there will\n" +
                "be a specific question for that location.\n" +
                "\n" +
                "To travel along you have to guess the right\n" +
                "answer. If you guess the wrong answer you will\n" +
                "be brought back to Stockholm. ")
        Thread.sleep(2000)

        val button = findViewById<Button>(R.id.startButton)
        button.setOnClickListener {
            startDanmarkPage()
        }


    }

    fun startDanmarkPage() {
        val intent = Intent(this, Danmark::class.java)
        startActivity(intent)

    }


}