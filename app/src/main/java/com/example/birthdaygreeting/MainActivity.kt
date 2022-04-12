package com.example.birthdaygreeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createGreeting(view: View) {
        val name = cardNameText.editableText.toString()
        val intent = Intent(this,cardDisplayActivity::class.java)
        intent.putExtra(cardDisplayActivity.PERSON_NAME,name)
        startActivity(intent)
    }
}