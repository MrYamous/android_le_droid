package com.example.android_cours

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userlogin = username.text
        val password = password.text

        login.setOnClickListener {
            if (password.isNotEmpty() && isUserNameValid(userlogin)) {
                showValidMessage("Les informations de connexion sont correctement remplies")
                // changeActivity()
            } else {
                showInvalidMessage("Les informations de connexion sont invalides")
            }
        }
    }

    private fun isUserNameValid(username: Editable): Boolean {
        return if (username.contains('@')) {
            Patterns.EMAIL_ADDRESS.matcher(username).matches()
        } else {
            username.isNotBlank()
        }
    }

    private fun changeActivity() {
        val intent = Intent(this, FeedActivity::class.java).apply {  }
        startActivity(intent)
    }

    private fun showInvalidMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    private fun showValidMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("lifecycle", "onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("lifecycle", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "onResume")
    }
}