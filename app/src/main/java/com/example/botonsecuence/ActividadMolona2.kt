package com.example.botonsecuence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.botonsecuence.MainActivity.Companion.EP1

class ActividadMolona2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actividad_molona2)

        // tenemos que recibirlo con una constante que es val
        val number = 0
        val diablo = intent.getIntExtra(EP1,number)
        val texto = findViewById<TextView>(R.id.TextV)
        // esto es asi, xq es asi y .
        diablo?.let {
            texto.text = diablo.toString()
        }

        val diablo2 = intent.getStringExtra(EP1)
        diablo2 ?.let {
            texto.text = diablo2.toString().toUpperCase()
        }
    }
}
