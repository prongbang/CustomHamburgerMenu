package com.prongbang.customhamburgermenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivMenuLeft.setOnClickListener {
            vNavMenu.visibility = if (vNavMenu.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }

        vNavMain.setOnClickListener {
            vNavMenu.visibility = View.GONE
        }
    }
}
