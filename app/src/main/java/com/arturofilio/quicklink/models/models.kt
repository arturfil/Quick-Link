package com.arturofilio.quicklink.models

import com.google.firebase.database.Exclude

data class User(val name: String = "", val username: String = "",
                val email: String = "", @Exclude val uid: String = "")