package com.example.qcmtest

import android.graphics.Color.parseColor
import android.graphics.Color.red
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.math.RoundingMode
import java.text.DecimalFormat
import android.graphics.Color


class ScoreActivity : AppCompatActivity() {

    lateinit var textView10 : TextView
    lateinit var textView13 : TextView
    lateinit var textView9 : TextView
    lateinit var textView11 :TextView
    lateinit var imageView2 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val intent = intent

        val df = DecimalFormat("#")
        df.roundingMode = RoundingMode.CEILING

        val score :Int =  intent.getIntExtra("score", 7)
        val perc : Float = ((score.toFloat()/7)*100)

        textView9 = findViewById(R.id.textView9)
        imageView2 = findViewById(R.id.imageView2)
        textView10 = findViewById(R.id.textView10)
        textView11 = findViewById(R.id.textView11)

        if(score < 6){
            imageView2.setImageResource(R.drawable.failure)
            textView9.text="bad luck !!"
            textView11.text ="Quiz didn't completed successfully"
            textView10.setTextColor(parseColor("#CF2416"))
        }


        textView13 = findViewById<TextView>(R.id.textView13)
        textView10.setText(df.format(perc).toString()+"% Score .")
        textView13.setText("You attempt 7 Questions and from that "+score+" answer is correct")
    }
}