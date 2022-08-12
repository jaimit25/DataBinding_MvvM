package com.example.databinding_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.databinding_mvvm.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialising recycler view
        recyclerView = findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));


        //getting data from data source and making it available to the recyclerView adaptor class
        MyAdaptor myAdaptor = new MyAdaptor(getStudents());
        recyclerView.setAdapter(myAdaptor);


    }

    public List<Student>  getStudents(){
        List<Student>  slist = new ArrayList<>();

        slist.add(new Student("Jam eat","PCM"));
        slist.add(new Student("HotMarty","CR"));
        slist.add(new Student("Unknown","Social"));
        slist.add(new Student("Mr RObert","Social"));
        slist.add(new Student("Mr Maang","public"));
        slist.add(new Student("Mr kia","CAR"));
        slist.add(new Student("Mr Tata","CAR Driving"));



        return slist;
    }

}