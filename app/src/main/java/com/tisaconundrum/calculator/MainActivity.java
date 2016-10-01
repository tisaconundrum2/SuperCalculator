package com.tisaconundrum.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero, btnAdd, btnSub, btnMul, btnDiv, btnClear, btnEqual;
    EditText disp;
    int op1;
    int op2;
    String optr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd   = (Button) findViewById(R.id.btnAdd);
        btnSub   = (Button) findViewById(R.id.btnSub);
        btnMul   = (Button) findViewById(R.id.btnMul);
        btnDiv   = (Button) findViewById(R.id.btnDiv);
        btnOne   = (Button) findViewById(R.id.btnOne);
        btnTwo   = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour  = (Button) findViewById(R.id.btnFour);
        btnFive  = (Button) findViewById(R.id.btnFive);
        btnSix   = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine  = (Button) findViewById(R.id.btnNine);
        btnZero  = (Button) findViewById(R.id.btnZero);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnClear = (Button) findViewById(R.id.btnClear);
        disp =     (EditText) findViewById(R.id.disp);

        try{
            btnOne.setOnClickListener((View.OnClickListener) this);
            btnTwo.setOnClickListener((View.OnClickListener) this);
            btnThree.setOnClickListener((View.OnClickListener) this);
            btnFour.setOnClickListener((View.OnClickListener) this);
            btnFive.setOnClickListener((View.OnClickListener) this);
            btnSix.setOnClickListener((View.OnClickListener) this);
            btnSeven.setOnClickListener((View.OnClickListener) this);
            btnEight.setOnClickListener((View.OnClickListener) this);
            btnNine.setOnClickListener((View.OnClickListener) this);
            btnZero.setOnClickListener((View.OnClickListener) this);
            btnClear.setOnClickListener((View.OnClickListener) this);
            btnEqual.setOnClickListener((View.OnClickListener) this);
        } catch(Exception ignored){}
    }

    public void operation(){
        if (optr.equals("+")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 + op2;
            disp.setText(Integer.toString(op1));
        }

        else if (optr.equals("-")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 - op2;
            disp.setText(Integer.toString(op1));
        }

        else if (optr.equals("x")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 * op2;
            disp.setText(Integer.toString(op1));
        }

        else if (optr.equals("/")){
            op2 = Integer.parseInt(disp.getText().toString());
            disp.setText("");
            op1 = op1 / op2;
            disp.setText(Integer.toString(op1));
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
