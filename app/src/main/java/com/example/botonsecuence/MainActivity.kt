package com.example.botonsecuence

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    companion object{const val EP1="variableEstatica"}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // creación de editText (hemos de crearlo previamente)
        val EditText = findViewById<EditText>(R.id.Edit2)


        //Crear funcionalidad al boton
        val boton1 = findViewById<Button>(R.id.boton1)
        boton1.setOnClickListener {
            //Explicación de hoy
            val intent = Intent(this,ActividadMolona::class.java)
            intent.putExtra(EP1,1)
            startActivity(intent)
        }


        val boton2 = findViewById<Button>(R.id.boton2)
        boton2.setOnClickListener {
            val intent = Intent(this,ActividadMolona2::class.java)
            // lo que queremos hacer es "decirle al boton" cuantas letras tenemos en el editText
            // con esto sacamos la longitud de la cadena

            // pasar de main activity la actividadmolona2
            /*
            el putExtra --> sirve para mandar / enviar información a otro activity Main
            el get"XXXX"Extra --> sirve para recibir ese dato en otro activity main
            es decir un getter y un setter
             */
            intent.putExtra(EP1,EditText.text.toString().length)
            startActivity(intent)

        }

        val boton3 =  findViewById<Button>(R.id.boton3)
        boton3.setOnClickListener {
            val random = Random.nextInt(1,10) // me lo ha pasado javi xd
            if (random > 4){

                val intent = Intent(this, ActividadMolona::class.java)
                intent.putExtra(EP1,random)
                startActivity(intent)

            }else{
                val intent = Intent(this, ActividadMolona2::class.java)
                intent.putExtra(EP1,EditText.text.toString())
                startActivity(intent)
            }






        }



    }
}
