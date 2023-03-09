package com.ugurd.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.openqa.selenium.chrome.ChromeDriver


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.goruntulemesayfasi)
        val driver = ChromeDriver()

    }
}