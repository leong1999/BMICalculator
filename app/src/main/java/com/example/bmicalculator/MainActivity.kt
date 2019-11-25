package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener()
        {
            //user input 
            val weight:Double = editTextWeight.text.toString().toDouble()
            val height:Double = editTextHeight.text.toString().toDouble()

            val meter:Double = height / 100
            val bmi:Double = weight/(meter*meter)

            textViewBMI.text = bmi.toString()

            //calculate bmi
            if (bmi < 18.5)
            {
                imageViewProfile.setImageResource(R.drawable.under)
            }else if(bmi >= 18.5 && bmi <= 24.9)
            {
                imageViewProfile.setImageResource(R.drawable.normal)
            }else
            {
                imageViewProfile.setImageResource(R.drawable.over)
            }

        }

        buttonReset.setOnClickListener()
        {
            //clear input and result
            editTextHeight.text = null
            editTextWeight.text = null
            textViewBMI.text = null
            //clear image
            imageViewProfile.setImageResource(R.drawable.empty)


        }
    }


}
