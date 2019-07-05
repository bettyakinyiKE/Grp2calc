package com.nicki.bettysgroupcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextView;
    private EditText myEditText;
    private Button buttonone;
    private Button buttontwo;
    private Button buttonthree;
    private Button buttonfour;
    private Button buttonfive;
    private Button buttonsix;
    private Button buttonseven;
    private Button multiplication;
    private Button division;
    private Button subtraction;
    private Button addition;
    private Button zero;
    private Button point;
    private Button equal;
    private Button buttoneight;
    private Button buttonnine;
    private Button cancel;
    private Button delete;

    float mValue1, mValue2;
    boolean mAddition, mMultiplication, mDivision, mPlus, mSubtraction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonone = (Button) findViewById(R.id.bt_buttonone_id);
        buttonone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"1");
            }
        });

        Button buttontwo = (Button)findViewById(R.id.bt_buttontwo_id);
        buttontwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"2");

            }
        });
        Button buttonthree = (Button)findViewById(R.id.bt_buttonthree_id);
        buttonthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"3");
            }
        });


        Button buttonfour = (Button)findViewById(R.id.bt_buttonfour_id);
        buttonfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"4");
            }
        });

        Button buttonfive = (Button)findViewById(R.id.bt_buttonfive_id);
        buttonfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"5");
            }
        });

        Button buttonsix = (Button)findViewById(R.id.bt_buttonsix_id);
        buttonsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"6");
            }
        });

        Button buttonseven = (Button)findViewById(R.id.bt_buttonseven_id);
        buttonseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"7");
            }
        });

        Button buttoneight = (Button)findViewById(R.id.bt_buttoneight_id);
        buttoneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"8");
            }
        });

        Button buttonnine = (Button)findViewById(R.id.bt_buttonnine_id);
        buttonnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"9");
            }
        });

        Button zero = (Button)findViewById(R.id.bt_buttonzero_id);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"0");
            }
        });

        final Button addition = (Button)findViewById(R.id.bt_addition_id);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(myEditText.getText() + "");
                mAddition = true;
                myEditText.setText(mValue1 + mValue2 + "");
            }});

        Button subtraction = (Button)findViewById(R.id.bt_subtraction_id);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mValue2 = Float.parseFloat(myEditText.getText() + "");

                if (mSubtraction == true){
                    myEditText.setText(mValue1 - mValue2 +"");
                    mSubtraction=false;
            }
        }});

        Button multiplication = (Button)findViewById(R.id.bt_multiplication_id);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(myEditText.getText() + "");
                mMultiplication = true;
                myEditText.setText(mValue1 * mValue2 + "");
            }
        });

        Button division = (Button)findViewById(R.id.bt_division_id);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue1 = Float.parseFloat(myEditText.getText() + "");
                mValue2 = Float.parseFloat(myEditText.getText() + "");
                mDivision = true;
                myEditText.setText(mValue1 / mValue2 + "");
            }
        });

       Button equal =(Button)findViewById(R.id.bt_equal_id);
       equal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               mValue2=Float.parseFloat(myEditText.getText () +"");
               if(mAddition == true){
                   myEditText.setText(mValue1 + mValue2 + "");
                   mAddition =false;}


                   if(mSubtraction == true){
                       myEditText.setText(mValue1 - mValue2 + "");
                       mSubtraction = false;}

                       if(mDivision == true){
                           myEditText.setText(mValue1 / mValue2 + "");
                           mDivision = false;}

                           if(mMultiplication == true);{
                           myEditText.setText(mValue1 * mValue2 + "");
                           mMultiplication = false;}





           }
       });



        Button point = (Button)findViewById(R.id.bt_point_id);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+".");
            }
        });

        Button delete = (Button)findViewById(R.id.bt_delete_id);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);
                myEditText.setText(myEditText.getText()+"");
            }
        });

        Button cancel = (Button)findViewById(R.id.bt_cancel_id);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Button cancel = (Button)findViewById(R.id.bt_cancel_id);
                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText myEditText = (EditText) findViewById(R.id.et_screen1_id);
                        TextView myTextView = (TextView) findViewById(R.id.tv_screen2_id);

                        myEditText.setText(myEditText.getText()+"");
                        myTextView.setText(myTextView.getText()+"");
                    }
                });
            }
        });


    }
}













