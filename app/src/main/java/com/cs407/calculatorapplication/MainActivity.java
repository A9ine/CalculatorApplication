package com.cs407.calculatorapplication;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void goToActivity(String s) {
        Intent intent = new Intent(this, Answer.class);
        intent.putExtra("answer", s);
        startActivity(intent);
    }
    public void clickFunction(View view) {
        EditText myTextField = (EditText) findViewById(R.id.editTextText2);
        EditText myTextField2 = (EditText) findViewById(R.id.editTextText4);


        Button addButton = (Button) findViewById(R.id.button);
        Button subButton = (Button) findViewById(R.id.button2);
        Button divButton = (Button) findViewById(R.id.button4);
        Button mulButton = (Button) findViewById(R.id.button3);
        double number1 = Double.parseDouble(myTextField.getText().toString());
        double number2 = Double.parseDouble(myTextField2.getText().toString());
        double result = 0;
        if (addButton.isPressed()) {
            result = number1 + number2;
        } else if (subButton.isPressed()) {
            result = number1 - number2;
        } else if (divButton.isPressed()) {
            result = number1 / number2;
        } else if (mulButton.isPressed()) {
            result = number1 * number2;
        }
        goToActivity(Double.toString(result));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}