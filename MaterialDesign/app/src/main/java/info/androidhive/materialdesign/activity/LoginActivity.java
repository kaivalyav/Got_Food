package info.androidhive.materialdesign.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import info.androidhive.materialdesign.R;
import info.androidhive.materialdesign.activity.MainActivity;

public class LoginActivity extends AppCompatActivity {

    Button login;

    String usrname, pssword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button)findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                EditText username= (EditText)findViewById(R.id.username);
                EditText password= (EditText)findViewById(R.id.password);
                // TODO Auto-generated method stub
                usrname = username.getText().toString();
                pssword=password.getText().toString();

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                i.putExtra("username", usrname);
                i.putExtra("password", pssword);

                startActivity(i);
            }
        });


    }
}
