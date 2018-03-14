package com.example.baptiste.chinesedecide

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger","Pizza", "MacDonalds", "Barros Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodtxt.text = foodList.get(randomFood)
        }
        addFoodBtn.setOnClickListener {
            val newFood = addFoodEditText.text.toString()
            foodList.add(newFood)
            addFoodEditText.text.clear()
        }
    }
}
