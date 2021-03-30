package com.example.calculator_dupree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButtonToggleGroup;

public class MainActivity extends AppCompatActivity {

    Button deleteButton, equalButton, button1, button2, button3, divButton, button4,
            button5, button6, subButton,button7, button8, button9, multiButton, decButton,
            button0, percentButton, addButton;

    TextView display;

    float x, y;

    boolean myAdditon, mySubtract, myMultipication, myDivison;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        deleteButton = (Button) findViewById(R.id.deleteButton);
        equalButton = (Button) findViewById(R.id.equalButton);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        divButton = (Button) findViewById(R.id.divButton);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        subButton = (Button) findViewById(R.id.subButton);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        multiButton = (Button) findViewById((R.id.multiButton));
        button0 = (Button) findViewById(R.id.button0);
        percentButton = (Button) findViewById(R.id.percentButton);
        addButton = (Button) findViewById(R.id.addButton);
        decButton = (Button) findViewById(R.id.decButton);


        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = Float.parseFloat(display.getText() + "");
                if (myDivison == true) {
                    display.setText(x / y + "");
                    myDivison = false;
                }

                if (mySubtract == true) {
                    display.setText(x - y + "");
                    mySubtract = false;
                }

                if (myMultipication == true) {
                    display.setText(x * y + "");
                    myMultipication = false;
                }

                if (myAdditon == true) {
                    display.setText(x + y + "");
                    myAdditon = false;
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "3");
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = Float.parseFloat(display.getText() + "");
                myDivison = true;
                display.setText(null);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "6");
            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = Float.parseFloat(display.getText() + "");
                mySubtract = true;
                display.setText(null);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "9");
            }
        });

        multiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = Float.parseFloat(display.getText() + "");
                myMultipication = true;
                display.setText(null);
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "0");
            }
        });

        percentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + "%");
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display == null) {
                    display.setText("");
                } else {
                    x = Float.parseFloat(display.getText() + "");
                    myAdditon = true;
                    display.setText(null);
                }
            }
        });

        decButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });

    }
}