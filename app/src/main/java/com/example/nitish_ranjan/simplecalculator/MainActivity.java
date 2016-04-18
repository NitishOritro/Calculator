package com.example.nitish_ranjan.simplecalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity
{

    Button b1, b2;
    EditText e1, e2, e3;
    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void onADDButtonClick(View v)
    {
        b1 = (Button) findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Add is Pressed", Toast.LENGTH_SHORT).show();

                e1 = (EditText) findViewById(R.id.editText1);
                e2 = (EditText) findViewById(R.id.editText2);

                e3 = (EditText) findViewById(R.id.editText3);


                if(e1 != null && e2 != null)
                {
                    num1 = Integer.parseInt(e1.getText().toString());
                    num2 = Integer.parseInt(e2.getText().toString());
                    result = num1 + num2;
                    e3.setText(Integer.toString(result));
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "No input is pressed", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


    public void onSUBbuttonClick(View V)
    {

        b2 = (Button) findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getApplicationContext(), "Sub is Pressed", Toast.LENGTH_SHORT).show();

                e1 = (EditText) findViewById(R.id.editText1);
                e2 = (EditText) findViewById(R.id.editText2);

                e3 = (EditText) findViewById(R.id.editText3);



                if (e1 != null && e2 != null)
                {

                    num1 = Integer.parseInt(e1.getText().toString());
                    num2 = Integer.parseInt(e2.getText().toString());
                    if (num1 < num2)
                    {
                        result = num2 - num1;
                        e3.setText("-" + Integer.toString(result));
                    }
                    else
                    {
                        result = num1 - num2;
                        e3.setText(Integer.toString(result));
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "No input is pressed", Toast.LENGTH_SHORT).show();
                }

            }
        });




    }

}
