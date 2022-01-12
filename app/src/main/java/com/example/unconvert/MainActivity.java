package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;
    TextView t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.textView2);
        e1 = (EditText)findViewById(R.id.editTextNumber);
        b1 = (Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            toast message
                Toast.makeText(getApplicationContext(),"processing...",Toast.LENGTH_LONG).show();
                String rupees = e1.getText().toString();
                double rs = Double.parseDouble(rupees);

                double dollar = rs * 73.7831;
                String dollarstr = new Double(dollar).toString();
                t1.setText(dollarstr);

            }
        });
    }
}