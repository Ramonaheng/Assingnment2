package com.example.assognment2revamp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public
class details extends AppCompatActivity
{   TextView textView;
    String text;
    ImageView imagesView;
    int       image;



    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_details );

        imagesView= findViewById ( R.id.bag);
        image=getIntent ().getIntExtra ( "images2",0 );
        imagesView.setImageResource ( image );




}}