package com.halanx.halanx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    Button but1,but2,but3;

    public void init()
    {
        but1 = (Button) findViewById(R.id.btnsignin);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(MainActivity.this, signin.class);
                startActivity(toy);

            }
        });
    }
    public void init2()
    {
        but2= (Button)findViewById(R.id.btnregister);
        but2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent toy2=new Intent(MainActivity.this,register.class);
                startActivity(toy2);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     //   auth = FirebaseAuth.getInstance();
      //  if (auth.getCurrentUser() != null) {
            // TO USE - IF SIGNED IN, SEND TO MAP ACTIVITY
            //  startActivity(new Intent(MainActivity.this, MapsActivity.class));
            //  finish();
        //    Toast.makeText(MainActivity.this, "Signed in", Toast.LENGTH_LONG).show();
      //  }

        startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        //  finish();


        setContentView(R.layout.activity_main);
        //IF NOT SIGNED IN SEND TO LOGIN REGISTER PAGE, IE MAIN ACTIVITY
       // startActivity(new Intent(getApplicationContext(),SigninActivity.class));
       // but3= (Button)findViewById(R.id.btnaccount);
       // init();
        //init2();
    }
}
