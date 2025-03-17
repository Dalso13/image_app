package com.jdw.twice_image

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_inside)

        val data = intent.getStringExtra("data")

        //Toast.makeText(this, data, Toast.LENGTH_LONG).show()
        
        // 이미지 레이아웃 가져오기
        val memberImage = findViewById<ImageView>(R.id.mamber_image_area)

        
        // 전달받은 값에 따라 id 할당
        val id = when (data) {
            R.id.twice_1.toString() -> R.drawable.member_1
            R.id.twice_2.toString() -> R.drawable.member_2
            R.id.twice_3.toString() -> R.drawable.member_3
            R.id.twice_4.toString() -> R.drawable.member_4
            R.id.twice_5.toString() -> R.drawable.member_5
            R.id.twice_6.toString() -> R.drawable.member_6
            R.id.twice_7.toString() -> R.drawable.member_7
            R.id.twice_8.toString() -> R.drawable.member_8
            R.id.twice_9.toString() -> R.drawable.member_9
            else -> 0
        }
        
        // 이미지 레이아웃 추가
        if (id > 0) {
            memberImage.setImageResource(id)
        }
    }
}