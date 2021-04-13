package com.example.customeview.CustomViewAnimation

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat.animate
import com.example.customeview.R
import com.example.customeview.dp

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)
        val findViewById = findViewById<provinceView>(R.id.provinceView)
        val animator = ObjectAnimator.ofObject(findViewById, "province", ProvinceEvaluator(), "澳门特别行政区")
        animator.startDelay = 1000
        animator.duration = 10000
        animator.start()
    }
}