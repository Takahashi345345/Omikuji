package jp.wings.nikkeibp.omikuji

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //idを取得【変数宣言】
        val iv = findViewById<ImageView>(R.id.iv)
        val btn = findViewById<Button>(R.id.btn)

        //ボタン押下時の処理
        btn.setOnClickListener {

            //7未満の乱数結果によっておみくじ画像を表示【大吉～大凶】
            when(Random.nextInt(7)){
                0 -> iv.setImageResource(R.drawable.daikiti)
                1 -> iv.setImageResource(R.drawable.tyuukiti)
                2 -> iv.setImageResource(R.drawable.syoukiti)
                3 -> iv.setImageResource(R.drawable.kiti)
                4 -> iv.setImageResource(R.drawable.suekiti)
                5 -> iv.setImageResource(R.drawable.kyou)
                6 -> iv.setImageResource(R.drawable.daikyou)
            }
        }
    }
}