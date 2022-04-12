package com.example.birthdaygreeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_card_display.*

class cardDisplayActivity : AppCompatActivity() {

    companion object {
        const val PERSON_NAME ="person_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_display)
       val name =intent.getStringExtra(PERSON_NAME)
        textView.text="Happy Birthday $name"
    }
}