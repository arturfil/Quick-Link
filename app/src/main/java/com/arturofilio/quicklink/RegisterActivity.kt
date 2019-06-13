package com.arturofilio.quicklink

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.arturofilio.quicklink.models.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(view: View) {
        when(view.id) {
            R.id.register_btn -> {
                onRegister()
            }
        }
    }

    private val TAG = "RegisterActivity"


    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mAuth = FirebaseAuth.getInstance()

        register_btn.setOnClickListener(this)

    }


    private fun onRegister() {
        val fullName = edt_fullname.text.toString()
        val email = edt_email.text.toString()
        val password = edt_password.text.toString()
        val password2 = edt_password2.text.toString()

        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || password2.isEmpty()) {
            showToast("All fields are required")
        } else {
            if(password == password2) {
                mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener {
                        if(it.isSuccessful) {
                            showToast("Registration was successful!")
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        } else {
                            showToast("Something went wrong, please try again later")
                        }
                    }

            } else {
                showToast("Make sure both passwords match")
            }
        }
    }

}
