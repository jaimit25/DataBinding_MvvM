package com.example.databinding_mvvm;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding_mvvm.databinding.SingleRowDesignBinding;

import java.util.List;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.myviewholder> {


    List<Student> slist ;

    public MyAdaptor(List<Student> slist){
        this.slist = slist;
    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        SingleRowDesignBinding binding = SingleRowDesignBinding.inflate(layoutInflater,parent,false);

        return new myviewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int index) {
        Student student = slist.get(index);
        holder.singleRowDesignBinding.setStudentObject(student);
    }

    @Override
    public int getItemCount() {
        return slist.size();
    }

    class myviewholder  extends  RecyclerView.ViewHolder {

        //without databinding recylerview
        //        public myviewholder(@NonNull View itemView) {
        //            super(itemView);
        //        }

        SingleRowDesignBinding singleRowDesignBinding;

        //with databinding recylerview
        public myviewholder(SingleRowDesignBinding singleRowDesignBinding) {
            super(singleRowDesignBinding.getRoot());
                this.singleRowDesignBinding = singleRowDesignBinding;
        }
    }


}
