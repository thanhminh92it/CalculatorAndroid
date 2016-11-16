package com.example.thanhminh92it.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final Button addition = (Button) findViewById(R.id.addition);
        final Button subtraction = (Button) findViewById(R.id.subtraction);
        final Button multiplication = (Button) findViewById(R.id.multiplication);
        final Button division = (Button) findViewById(R.id.division);
        final EditText number1 = (EditText) findViewById(R.id.number1);
        final EditText number2 = (EditText) findViewById(R.id.number2);
        final EditText result = (EditText) findViewById(R.id.result);
        addition.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int r = n1 + n2;
                result.setText(Integer.toString(r));
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int r = n1 - n2;
                result.setText(Integer.toString(r));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                int r = n1 * n2;
                result.setText(Integer.toString(r));
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int n1 = Integer.parseInt(number1.getText().toString());
                int n2 = Integer.parseInt(number2.getText().toString());
                float r = (float) n1 / n2;
                result.setText(Float.toString(r));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
