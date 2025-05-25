package com.example.s3_registroasistenciaalumnos

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCodigo = findViewById<EditText>(R.id.etCodigo)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etFecha = findViewById<EditText>(R.id.etFecha)
        val etHora = findViewById<EditText>(R.id.etHora)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnRegistrar.setOnClickListener {
            val codigo = etCodigo.text.toString().trim()
            val nombre = etNombre.text.toString().trim()
            val fecha = etFecha.text.toString().trim()
            val hora = etHora.text.toString().trim()

            if (codigo.isNotEmpty() && nombre.isNotEmpty() && fecha.isNotEmpty() && hora.isNotEmpty()) {
                val resultado = """
                    Asistencia Registrada:
                    Código: $codigo
                    Nombre: $nombre
                    Fecha: $fecha
                    Hora: $hora
                """.trimIndent()

                tvResultado.text = resultado
            } else {
                tvResultado.text = "Por favor, completa todos los campos."
            }
        }
    }
}
