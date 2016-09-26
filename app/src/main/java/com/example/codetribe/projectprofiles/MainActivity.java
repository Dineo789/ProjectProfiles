package com.example.codetribe.projectprofiles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.codetribe.projectprofiles.user.User;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText name,email,password,rpassword;
    RadioGroup gender;
    RadioButton selected;

    String name_str,email_str,sex,password_str,rpassword_str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gender = (RadioGroup) findViewById(R.id.gender);

        name = (EditText)findViewById(R.id.edt_name);
        email =(EditText)findViewById(R.id.edt_email);
        password=(EditText)findViewById(R.id.edt_pass);
        rpassword =(EditText)findViewById(R.id.edt_rpass);
        gender =(RadioGroup)findViewById(R.id.gender);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        selected =(RadioButton)findViewById(i);//without initializing a specific radio button
        sex = selected.getText().toString();

    }
    public void signUp(View v){
        name_str = name.getText().toString();
        email_str = email.getText().toString();
        password_str = password.getText().toString();
        rpassword_str = rpassword.getText().toString();

        User account = new User(name_str,email_str,password_str,sex);//instance of a class

        if(password_str.equalsIgnoreCase(rpassword_str)){
            Toast.makeText(this,"Registration complete",Toast.LENGTH_LONG).show();
            Intent i = new Intent (MainActivity.this,Details.class);
            startActivity(i);

        }else
        {
            Toast.makeText(this,"Password does not match.",Toast.LENGTH_LONG).show();
        }
    }


}
