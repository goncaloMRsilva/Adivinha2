package pt.ipg.adivinha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private val random = Random()
    private var numeroAdivinhar : Int = 0
    private var jogo: Int = 0
    private var tentativas: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        novoJogo()

    }

    private fun novoJogo() {
        val numeroAdivinhar = random.nextInt(10) + 1
        tentativas = 0
        jogo++

        atualizaJogoTentativas()

    }

        private fun atualizaJogoTentativas(){
            findViewById<TextView>(R.id.textViewJogo).text = "Jogo" + jogo
            findViewById<TextView>(R.id.textViewTentativas).text = "Tentativas: " + tentativas
        }

    fun adivinha(view: View) {}

}