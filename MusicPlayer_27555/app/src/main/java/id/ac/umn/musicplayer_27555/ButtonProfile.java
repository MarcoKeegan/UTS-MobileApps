package id.ac.umn.musicplayer_27555;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ButtonProfile extends AppCompatActivity {
    private TextView MyProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_profile);

        MyProfile = (TextView)findViewById(R.id.MyProfile);
    }
}