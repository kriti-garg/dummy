package com.kriti.allison;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //Layout
        RelativeLayout kritisLayout = new RelativeLayout(this);
        kritisLayout.setBackgroundResource(R.drawable.back2);
        //Button
        Button loginButton = new Button(this);
        loginButton.setText("Login");
        loginButton.setBackgroundColor(Color.GRAY);

        Button signupButton = new Button(this);
        signupButton.setText("SignUp");
        signupButton.setBackgroundResource(R.drawable.red_button);
        signupButton.setInputType(InputType.TYPE_CLASS_TEXT);
        //Username and password
        EditText username = new EditText(this);
        EditText password = new EditText(this);
        password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        loginButton.setId(1);
        username.setId(2);
        password.setId(3);
        signupButton.setId(4);

        RelativeLayout.LayoutParams loginbuttonDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams signupbuttonDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams passwordDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        //give rules to position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE,password.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);
        
        passwordDetails.addRule(RelativeLayout.ABOVE,loginButton.getId());
        passwordDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        passwordDetails.setMargins(0,0,0,50);

        signupbuttonDetails.addRule(RelativeLayout.BELOW,loginButton.getId());
        signupbuttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);

        signupbuttonDetails.width = 400;

        loginbuttonDetails.addRul   e(RelativeLayout.CENTER_HORIZONTAL);
        loginbuttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        loginbuttonDetails.setMargins(0,0,0,50);
        loginbuttonDetails.width = 400;


        signupbuttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        signupbuttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        signupbuttonDetails.width = 400;

        Resources r=getResources();
        int px=(int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,250,
                r.getDisplayMetrics()
        );
        username.setWidth(px);
        password.setWidth(px);
        username.setHint("Username");
        password.setHint("Password");

        //Add Widget
        kritisLayout.addView(loginButton,loginbuttonDetails);
        kritisLayout.addView(username,usernameDetails);
        kritisLayout.addView(password,passwordDetails);
        kritisLayout.addView(signupButton,signupbuttonDetails);

        //Set the activities
        setContentView(kritisLayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar    will
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
