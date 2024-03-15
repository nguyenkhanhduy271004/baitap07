package com.example.myapplication.;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private UserModel userModel;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userModel = new UserModel("pham", "chien");
        binding.setUser(userModel);

        // them tu cap nhat
        userModel.setFirstName("Pham");
        userModel.setLastName("Chien");
    }
}