package com.example.youdongkwan.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentMain fragmentMain;
    FragmentMenu fragmentMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentMain = new FragmentMain();
        fragmentMenu = new FragmentMenu();

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragmentMain).commit();
            }
        });
        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragmentMenu).commit();
            }
        });
    }

    public void onFragmentChange(int index){
        if(index ==0){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragmentMain).commit();
        }else if(index ==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragmentMenu).commit();
        }
    }
}
