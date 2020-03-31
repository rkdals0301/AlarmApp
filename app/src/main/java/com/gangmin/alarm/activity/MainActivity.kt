package com.gangmin.alarm.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gangmin.alarm.R
import com.gangmin.alarm.fragment.AlarmFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.view, AlarmFragment())
            .commit()
    }
}
