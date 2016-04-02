package info.androidhive.materialdesign.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import info.androidhive.materialdesign.R;

public class Search extends AppCompatActivity {



    ArrayList<product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


    }
}
