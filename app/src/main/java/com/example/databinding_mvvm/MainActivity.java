package com.example.databinding_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.databinding_mvvm.databinding.ActivityMainBinding;
import com.example.databinding_mvvm.models.Customer;
import com.example.databinding_mvvm.viewmodels.MainviewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainxml;

    //Create object of mainViewModel(provider class which will provide data)
    MainviewModel mainviewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainxml = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        Directly using model class
//        Customer customer = new Customer("Hotmarty");
//        mainxml.setCustomer(customer);


//        Getting data from provider class instead of directly accessing data frm the model class
//        Model class will act as intermediate for passing the Data

        mainviewModel = ViewModelProviders.of(this).get(MainviewModel.class);
        mainxml.setCustomer(mainviewModel.getCustomer());


    }

}