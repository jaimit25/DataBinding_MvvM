package com.example.databinding_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databinding_mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainxml;

    //Approach2 : model class name should be Capital
//    Product product;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainxml = DataBindingUtil.setContentView(this,R.layout.activity_main);



        //Approach1 : txt1 is id of the textview also we don't need to initialise the variable for the textview
        //mainxml.txt1.setText("This is Main Activity Page"); // same as ViewBinding

        //Approach2 : using model
        Product product = new Product("this is product 1 "," this is random text 2");
        mainxml.setProduct(product); // setProduct is automatically created by the Binding class







    }

}