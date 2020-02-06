package cindodcindy.mobiletest.icptest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import cindodcindy.mobiletest.icptest.pojo.Data;
import cindodcindy.mobiletest.icptest.pojo.UserLoginResponse;
import cindodcindy.mobiletest.icptest.retrofit.AmbilMetod;
import cindodcindy.mobiletest.icptest.retrofit.RetroUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Menu extends AppCompatActivity {
    private CardView cardView_keProfile;

    private TextView textView_nama_menu, textView_password_menu, textView_welcmeUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        textView_welcmeUser=findViewById(R.id.tv_welcome_user);


        cardView_keProfile=findViewById(R.id.ke_profile);



        cardView_keProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Profile.class);
                startActivity(intent);
                finish();
            }
        });


    }




}
