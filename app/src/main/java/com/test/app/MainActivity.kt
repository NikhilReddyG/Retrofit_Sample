package com.test.app

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.app.testfragment.TestFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAddFragment();
    }

    private fun initAddFragment() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragmentContent, TestFragment(), "HELLO")
        fragmentTransaction.commit()
    }
}
