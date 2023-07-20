package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    private TextView[] b1 = new TextView[4];
    private int[] b1id = {R.id.b1_1,R.id.b1_2,R.id.b1_3,R.id.b1_4};
    private TextView[] b2 = new TextView[4];
    private int[] b2id = {R.id.b2_1,R.id.b2_2,R.id.b2_3,R.id.b2_4};
    private TextView[] b3 = new TextView[4];
    private int[] b3id = {R.id.b3_1,R.id.b3_2,R.id.b3_3,R.id.b3_4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNum();
    }

    private void initNum() {
        for(int i=0;i<b1.length;i++){
            b1[i] = findViewById(b1id[i]);
            b1[i].setText("-");
        }
        for(int i=0;i<b2.length;i++){
            b2[i] = findViewById(b2id[i]);
            b2[i].setText("-");
        }
        for(int i=0;i<b3.length;i++){
            b3[i] = findViewById(b3id[i]);
            b3[i].setText("-");
        }
    }

    public void lottery(View view) {
        int [] numArr1 = generateNum();
        for(int i=0;i<b1.length;i++)b1[i].setText(""+numArr1[i]);
        int [] numArr2 = generateNum();
        for(int i=0;i<b2.length;i++)b2[i].setText(""+numArr2[i]);
        int [] numArr3 = generateNum();
        for(int i=0;i<b3.length;i++)b3[i].setText(""+numArr3[i]);
    }

    private int [] generateNum(){
        HashSet<Integer> nums = new HashSet<>();
        while(nums.size()<4){
            nums.add((int)(Math.random()*98+1));
        }
        int i=0; int[] ret = new int[4];
        for (Integer num : nums){
            ret[i] = num;
            i++;
        }
        return ret;
    }

}