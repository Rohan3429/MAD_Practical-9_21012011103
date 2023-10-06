package com.example.mad_practical_9_21012011103

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity(),Animation.AnimationListener {
    lateinit var logoimage:ImageView
    lateinit var logoanimation:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        logoimage=findViewById(R.id.uvpce)
        logoimage.setBackgroundResource(R.drawable.guni_animation_list)
        logoimage.background as AnimationDrawable
        logoanimation=AnimationUtils.loadAnimation(this,R.anim.twin_animation)
        logoanimation.setAnimationListener(this)
    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        if (hasFocus){
            logoanimation.start()
        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {
        TODO("Not yet implemented")
    }

    override fun onAnimationEnd(p0: Animation?) {
        TODO("Not yet implemented")
    }

    override fun onAnimationRepeat(p0: Animation?) {
        TODO("Not yet implemented")
    }
}