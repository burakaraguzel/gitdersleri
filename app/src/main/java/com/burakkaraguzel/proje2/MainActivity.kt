package com.burakkaraguzel.proje2

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun oturumAc(view: View){
        val intent=Intent(this,GirisSayfasi::class.java)
        startActivity(intent)
    }

    fun kayitOl(view: View){
        val intent=Intent(this,KayitSayfasi::class.java)
        startActivity(intent)
    }

    fun MisafirOlarakDevamEtSayfasi(view: View){
        val intent=Intent(this,MisafirOlarakDevamEtSayfasi::class.java)
        startActivity(intent)
    }
}