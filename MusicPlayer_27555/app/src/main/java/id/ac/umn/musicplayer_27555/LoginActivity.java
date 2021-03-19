package id.ac.umn.musicplayer_27555;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private RelativeLayout LoginAct;
    private Button PencetLogin;
    EditText Username, Password;
    String Correct_Username = "uasmobile";
    String Correct_Pass = "uasmobilegenap";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = findViewById(R.id.Username);
        Password = findViewById(R.id.Pass);
        PencetLogin = findViewById(R.id.PencetLogin);

        PencetLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(LoginActivity.this, ListLagu.class);
                //startActivity(intent);
                if(TextUtils.isEmpty(Username.getText().toString()) || TextUtils.isEmpty(Password.getText().toString())) {
                    Toast.makeText(LoginActivity.this, "Empty Data!", Toast.LENGTH_LONG).show();
                }else if(Username.getText().toString().equals(Correct_Username)){
                    if (Password.getText().toString().equals(Correct_Pass)){
                        Toast.makeText(LoginActivity.this, "Selamat Datang\n Marco Keegan\n 00000027555", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(LoginActivity.this, ListLagu.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this, "Invalid Username or Password!", Toast.LENGTH_LONG).show();
                    }
                }else {
                   Toast.makeText(LoginActivity.this, "Invalid Username or Password!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}



