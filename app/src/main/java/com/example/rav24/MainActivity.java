package com.example.rav24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button sum;
    ToggleButton tb;
    EditText num1,num2,ans;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=findViewById(R.id.toggleButton);
        txt=findViewById(R.id.textView4);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
                    public void onCheckedChanged(CompoundButton cb,boolean isChecked)
            {
                if(isChecked)
                    txt.setVisibility(View.VISIBLE);
                else
                    txt.setVisibility(View.INVISIBLE);

            }
        }  );
    }
    public void CalcSum(View view)
    {   sum = findViewById(R.id.add);
        num1 = findViewById(R.id.editText1);
        num2=  findViewById(R.id.editText);
        ans=findViewById(R.id.editText3);

        int a=Integer.parseInt(num1.getText().toString());
        int b=Integer.parseInt(num2.getText().toString());
        int c=a+b;
        ans.setText(String.valueOf(c));
    }
}


