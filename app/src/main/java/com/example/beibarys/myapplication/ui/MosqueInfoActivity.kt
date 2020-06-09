package com.example.beibarys.myapplication.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.beibarys.myapplication.R
import com.example.beibarys.myapplication.ui.MainActivity.Companion.FULL_INFO_MESSAGE
import com.example.beibarys.myapplication.ui.MainActivity.Companion.IMAGE_INFO
import com.example.beibarys.myapplication.ui.MainActivity.Companion.MAIN_INFO_MESSAGE
import kotlinx.android.synthetic.main.mosque_info.*

class MosqueInfoActivity : AppCompatActivity() {

    private var currPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mosque_info)

        val mainInfo = intent.getStringExtra(MAIN_INFO_MESSAGE)
        val fullInfoMosque = intent.getStringExtra(FULL_INFO_MESSAGE)
        imageArray = intent.getStringArrayExtra(IMAGE_INFO)
        mosqueName.text = mainInfo
        fullInfo.text = fullInfoMosque

        Glide
            .with(this)
            .load(imageArray[0])
            .centerCrop()
            .into(mosquesImage)

        /*for (i in 0..imageArray.size){
            flipperImages(imageArray[i])
        }*/

    }

    /*private fun flipperImages(image: String?){
        Glide
            .with(this)
            .load(image)
            .centerCrop()
            .into(mosquesImage)

        mosquesImage.setBackgroundResource(image)
        v_flipper.addView(mosquesImage)
        v_flipper.setFlipInterval(2000)
        v_flipper.isAutoStart = true


        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left)
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right)
    }*/

    fun rightOrLeftClickChange(view: View) {
        when (view.id) {
            R.id.rightButton -> {
                currPosition++
                nextOrPrevClick()
                Glide
                    .with(this)
                    .load(imageArray[currPosition])
                    .centerCrop()
                    .into(mosquesImage)
            }
            R.id.leftButton -> {
                currPosition--
                nextOrPrevClick()
                Glide
                    .with(this)
                    .load(imageArray[currPosition])
                    .centerCrop()
                    .into(mosquesImage)
            }
        }
    }

    private fun nextOrPrevClick() {
        when (currPosition) {
            0 -> leftButton.visibility = View.INVISIBLE
            (imageArray.size - 1) -> rightButton.visibility = View.INVISIBLE
            else -> {
                leftButton.visibility = View.VISIBLE
                rightButton.visibility = View.VISIBLE
            }
        }
    }

    companion object {
        lateinit var imageArray: Array<String?>
    }

}