package com.djawnstj.aspect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.djawnstj.aspect.databinding.ActivityMainBinding
import com.djawnstj.common.debug

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.logButton.setOnClickListener {
            println("logButtonClicked!")
            debug("test log")
        }
    }
}
