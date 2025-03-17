package com.jdw.twice_image

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bths = listOf<ImageView>(
            findViewById(R.id.twice_1),
            findViewById(R.id.twice_2),
            findViewById(R.id.twice_3),
            findViewById(R.id.twice_4),
            findViewById(R.id.twice_5),
            findViewById(R.id.twice_6),
            findViewById(R.id.twice_7),
            findViewById(R.id.twice_8),
            findViewById(R.id.twice_9),
        )

        bths.forEach { btn : ImageView ->
            btn.setOnClickListener {
                val intent = Intent(this, ImageInsideActivity::class.java)

                intent.putExtra("data", "${btn.id}")

                startActivity(intent)
            }
        }

    }
}