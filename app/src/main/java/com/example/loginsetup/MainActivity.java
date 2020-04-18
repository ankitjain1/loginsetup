package com.example.loginsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button login;
    EditText username,password ,name1;
    public  static String name;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        username = findViewById( R.id.etUser );
        name1 = findViewById( R.id.etName );
        password = findViewById( R.id.etPass );
        login = findViewById( R.id.btnlogin );

login.setOnClickListener( this);



    }

    @Override
    public void onClick ( View v ) {
if  (username.getText().toString().equalsIgnoreCase( "student") && password.getText().toString().equals(  "12345"))
{
    if (name1.getText().toString().equals( " " ))
        Toast.makeText(getApplicationContext(),"please enter your name here ",Toast.LENGTH_SHORT ).show();
    else
    {
        name = name1.getText().toString();
        Intent intent = new Intent( this, NewActivity.class );
        startActivity( intent );
    }

}
else
    Toast.makeText( getApplicationContext(),"wrong details entered " ,Toast.LENGTH_SHORT).show();
    }
}
