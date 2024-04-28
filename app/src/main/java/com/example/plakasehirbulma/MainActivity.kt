package com.example.plakasehirbulma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plakasehirbulma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.editTextPlaka.text.isNotEmpty()) {
                var plakaKodu=binding.editTextPlaka.text.toString().toInt()
                when(plakaKodu) {
                    35 -> binding.textSehir.text = "İzmir"
                    34 -> binding.textSehir.text = "İstanbul"
                    53 -> binding.textSehir.text = "Rize"
                    61 -> binding.textSehir.text = "Trabzon"
                    1 -> binding.textSehir.text = "Adana"
                    16 -> binding.textSehir.text = "Bursa"
                    6 -> binding.textSehir.text = "Ankara"

                    else -> {
                        binding.textSehir.text = "Bulunmadı"
                    }
                }

            }
            else{
                binding.textSehir.text="Şehir Plakasını giriniz"
            }

        }
    }
}