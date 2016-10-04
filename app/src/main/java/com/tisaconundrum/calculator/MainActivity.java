package com.tisaconundrum.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


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
        disp         = (EditText) findViewById(R.id.disp);


        try{
            txtResult.setOnClickListener(this);
            btnClear.setOnClickListener(this);
            btnParen.setOnClickListener(this);
            btnPercent.setOnClickListener(this);
            btnDiv.setOnClickListener(this);
            btnOne.setOnClickListener(this);
            btnTwo.setOnClickListener(this);
            btnThree.setOnClickListener(this);
            btnMul.setOnClickListener(this);
            btnFour.setOnClickListener(this);
            btnFive.setOnClickListener(this);
            btnSix.setOnClickListener(this);
            btnSub.setOnClickListener(this);
            btnSeven.setOnClickListener(this);
            btnEight.setOnClickListener(this);
            btnNine.setOnClickListener(this);
            btnAdd.setOnClickListener(this);
            btnDot.setOnClickListener(this);
            btnZero.setOnClickListener(this);
            btnPlusMinus.setOnClickListener(this);
            btnEqual.setOnClickListener(this);
            disp.setOnClickListener(this);
        } catch (Exception ignored){
        }
    }

    public void operation() {
        if (optr.equals("+")) {
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 + op2;
            disp.setText("Result : " + Integer.toString(op1));
        } else if (optr.equals("-")) {
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 - op2;
            disp.setText("Result : " + Integer.toString(op1));
        } else if (optr.equals("x")) {
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 * op2;
            disp.setText("Result : " + Integer.toString(op1));
        } else if (optr.equals("÷")) {
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 / op2;
            disp.setText("Result : " + Integer.toString(op1));
        }
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
