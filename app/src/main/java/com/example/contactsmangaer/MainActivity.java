package com.example.contactsmangaer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.contactsmangaer.adapter.ContactsAdapter;

public class MainActivity extends AppCompatActivity {

    //Variables
    private ContactsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //NO Room Database project
    //Using SQLITE
}