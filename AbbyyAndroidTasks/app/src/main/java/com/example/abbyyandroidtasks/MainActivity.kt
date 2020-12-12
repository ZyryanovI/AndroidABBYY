package com.example.abbyyandroidtasks

import android.animation.Animator
import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun startSecondActivity(v: View?) {
        val card1:View = findViewById(R.id.card1)
        //val animator = ObjectAnimator.ofFloat(v, View.ROTATION, -360f, 0f)
        val animator: Animator = AnimatorInflater.loadAnimator(this, R.animator.animations)
            .apply {
                setTarget(card1)
                start()
            }


        animator.start()
//        val intent = Intent(this, SecondActivity::class.java)
//        startActivity(intent)
    }
}