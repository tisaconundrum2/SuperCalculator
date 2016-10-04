package com.tisaconundrum.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.attr.x;
import static com.tisaconundrum.calculator.R.id.btnAdd;
import static com.tisaconundrum.calculator.R.id.btnMul;
import static com.tisaconundrum.calculator.R.id.btnSub;
import static com.tisaconundrum.calculator.R.id.op1;
import static com.tisaconundrum.calculator.R.id.op2;


public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText disp;
    private Button
            btnClear,
            btnParen,
            btnPercent,
            btnDiv,
            btnOne,
            btnTwo,
            btnThree,
            btnMul,
            btnFour,
            btnFive,
            btnSix,
            btnSub,
            btnSeven,
            btnEight,
            btnNine,
            btnAdd,
            btnDot,
            btnZero,
            btnPlusMinus,
            btnEqual;
    private TextView txtResult;
    int op1, op2;
    String optr;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1 = (EditText) findViewById(op1);
        op2 = (EditText) findViewById(op2);

        txtResult    = (TextView) findViewById(R.id.txtResult);
        btnClear     = (Button) findViewById(R.id.btnClear);
        btnParen     = (Button) findViewById(R.id.btnParen);
        btnPercent   = (Button) findViewById(R.id.btnPercent);
        btnDiv       = (Button) findViewById(R.id.btnDiv);
        btnOne       = (Button) findViewById(R.id.btnOne);
        btnTwo       = (Button) findViewById(R.id.btnTwo);
        btnThree     = (Button) findViewById(R.id.btnThree);
        btnMul       = (Button) findViewById(R.id.btnMul);
        btnFour      = (Button) findViewById(R.id.btnFour);
        btnFive      = (Button) findViewById(R.id.btnFive);
        btnSix       = (Button) findViewById(R.id.btnSix);
        btnSub       = (Button) findViewById(R.id.btnSub);
        btnSeven     = (Button) findViewById(R.id.btnSeven);
        btnEight     = (Button) findViewById(R.id.btnEight);
        btnNine      = (Button) findViewById(R.id.btnNine);
        btnAdd       = (Button) findViewById(R.id.btnAdd);
        btnDot       = (Button) findViewById(R.id.btnDot);
        btnZero      = (Button) findViewById(R.id.btnZero);
        btnPlusMinus = (Button) findViewById(R.id.btnPlusMinus);
        btnEqual     = (Button) findViewById(R.id.btnEqual);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oper1 = Double.parseDouble(op1.getText().toString());
                double oper2 = Double.parseDouble(op2.getText().toString());
                txtResult.setText(Double.toString(oper1 + oper2));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oper1 = Double.parseDouble(op1.getText().toString());
                double oper2 = Double.parseDouble(op2.getText().toString());
                txtResult.setText(Double.toString(oper1 - oper2));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oper1 = Double.parseDouble(op1.getText().toString());
                double oper2 = Double.parseDouble(op2.getText().toString());
                txtResult.setText(Double.toString(oper1 * oper2));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double oper1 = Double.parseDouble(op1.getText().toString());
                double oper2 = Double.parseDouble(op2.getText().toString());
                txtResult.setText(Double.toString(oper1 / oper2));
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
