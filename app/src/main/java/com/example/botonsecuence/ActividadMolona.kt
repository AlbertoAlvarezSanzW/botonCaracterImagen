package com.example.botonsecuence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.botonsecuence.MainActivity.Companion.EP1

class ActividadMolona : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_molona)
        val number = 0
        // crear la constante
        val ViewImagen = findViewById<ImageView>(R.id.imageView5)
        val image = intent.getIntExtra(EP1,number)
        image?.let {
            if(image == 1){
                ViewImagen.setImageResource(R.mipmap.ic_launcher_foreground)
            }else{
                ViewImagen.setImageResource(R.mipmap.thanos_foreground)
            }
        }


    }
}