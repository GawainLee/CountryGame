package com.gawainli.countryevolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gawainli.countryevolution.manager.Manager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Integer> allCountriesID = new ArrayList<Integer>();
        allCountriesID.add(123);
        allCountriesID.add(456);
        allCountriesID.add(789);
        Manager manager = new Manager(allCountriesID);
        System.out.println("OK");
    }
}
