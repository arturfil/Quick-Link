package com.arturofilio.quicklink.activities

import android.content.Context
import android.widget.Toast
import com.arturofilio.quicklink.models.User
import com.google.firebase.database.DataSnapshot

fun Context.showToast(text: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this,text,duration).show()
}
