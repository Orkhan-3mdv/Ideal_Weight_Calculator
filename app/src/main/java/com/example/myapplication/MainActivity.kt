package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(){
            ageYazdir()
            gender()
            heightYazdir()
            calculate()
        }

    }

    fun ageYazdir(){
        val ageGet = ageEdit.text.toString().toIntOrNull()

        if (ageGet == null) {
            sonucEdit.text = "Please Enter The Age"
        }   else {
            age.text = "Age is : ${ageGet}"
        }
    }

    fun heightYazdir(){
        val heightGet = heightEdit.text.toString().toDoubleOrNull()

        if (heightGet == null){
            sonucEdit.text = "Please Enter The Height"
        }
        else height.text =  "Height is : ${heightGet}"
    }

    fun gender(){
        val gerderMale = male
        val genderFemale = female
        if (genderFemale ==null || gerderMale == null ){
            sonucEdit.text = "Please Choose The Gender"
        } else if (genderFemale != null) {
            gender.text = "Gender is Female"
        }else if (gerderMale != null ) {
            gender.text = "Gender is Male"
        }
    }

    fun calculate(){
        val heightGet = heightEdit.text.toString().toIntOrNull()
        if(heightGet == null){
            sonucEdit.text = "Bos Alanlari Doldurunuz"
        }
        else {
            val sonuc = heightGet*heightGet*24.9/10000
            val sonuc2 = heightGet*heightGet*18.5/10000
            sonucEdit.text = "Ideal Weight Is : ${sonuc2} - ${sonuc}"
        }

    }

}




