package com.dimrak.kotlinmeetui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
//This import all the instances from activity_main
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var value = 0
//    val myButton = Button
//    private var sizeMaster = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener(this)
        txtValue.setOnClickListener(this)
        take.setOnClickListener(this)
        grow.setOnClickListener(this)
        shrink.setOnClickListener(this)
        reset.setOnClickListener(this)
        hide.setOnClickListener(this)
//        val myButton = Button()
//        resetSize.setOnClickListener(this)
    }

    //View as the parent class for button or text
    override fun onClick(v: View?) {
        val size: Float


        when (v!!.id) {

            R.id.add -> {
                value++
                txtValue.text = "$value"
                val myText = findViewById<TextView>(R.id.txtTitle)
                myText.text = "Sum"
            }

            R.id.take -> {
                value--
                txtValue.text = "$value"
                val myText = findViewById<TextView>(R.id.txtTitle)
                myText.text = "Resta"
            }

            R.id.reset -> {
                value = 0
                txtValue.text = "$value"
            }

            R.id.grow -> {
                size = txtValue.textScaleX
                txtValue.textScaleX = size + 1
            }

            R.id.shrink -> {
                size = txtValue.textScaleX
                txtValue.textScaleX = size - 1
            }

//            R.id.resetSize -> {
////                sizeMaster = 1.1
////                txtValue.textScaleX = sizeMaster
//            }

            R.id.hide ->
                if (txtValue.visibility == View.VISIBLE){
                    txtValue.visibility = View.INVISIBLE
                    hide.text = "SHOW"
                }else{
                    txtValue.visibility = View.VISIBLE
                    hide.text = "HIDE"
                }

        }
    }

}
