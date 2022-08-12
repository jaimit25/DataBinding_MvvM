package com.example.databinding_mvvm.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.databinding_mvvm.models.Customer;

public class MainviewModel extends AndroidViewModel {

    Customer customer; // this class will act as intermediate between binding_class(xml) and model_class so we don't access Ui element's directly

    public MainviewModel(@NonNull Application application) {
        super(application);
        customer = new Customer("Jam Eat"); //  for now we add some temp data otherwise in real project we will fetch data from the API or from somewhere else
    }

    public Customer getCustomer() {
        return this.customer;
    }

}
