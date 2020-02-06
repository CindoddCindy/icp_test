package cindodcindy.mobiletest.icptest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import cindodcindy.mobiletest.icptest.pojo.DataUser;
import cindodcindy.mobiletest.icptest.pojo.UserLoginResponse;
import cindodcindy.mobiletest.icptest.pojo.UserProfile;
import cindodcindy.mobiletest.icptest.retrofit.AmbilMetod;
import cindodcindy.mobiletest.icptest.retrofit.RetroUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Profile extends AppCompatActivity {
    TextView textView_welcome_profile;

    TextView textView_active, textView_fullname, textView_id, textView_username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        textView_active=findViewById(R.id.active_profile);
        textView_fullname=findViewById(R.id.fullname_profile);
        textView_id=findViewById(R.id.id_id_profile);
        textView_username=findViewById(R.id.username_profile);
        textView_welcome_profile=findViewById(R.id.tv_welcome_profile);

        getDataUser();
    }

    public void getDataUser(){
        AmbilMetod ambilMetod   = RetroUrl.getRetrofit().create(AmbilMetod.class);
        //User user = new User(name, email, password);


        Call<UserProfile> userCall = ambilMetod.userProfile();//.EmployeeRegister(name,email,password, employeeid,employeecomname);//.userSignUp(name, email, password);

        userCall.enqueue(new Callback<UserProfile>() {
            @Override
            public void onResponse(@Nullable Call<UserProfile> call, @Nullable Response<UserProfile> response) {
                //String status = response.body().getMessage();
                UserProfile userProfile= response.body();
                DataUser dataUser =userProfile.getData();

                if (response.isSuccessful()) {
                    Log.d("Server Response", "failed" + userProfile.getData());
                    textView_id.setText(dataUser.getId());
                    textView_fullname.setText(dataUser.getFullname());
                    textView_username.setText(dataUser.getUsername());



                }

                else  {
                    textView_welcome_profile.setText("User Not Found");

                }
            }

            @Override
            public void onFailure(Call<UserProfile> call, Throwable t) {
                //hidepDialog();
                Log.d("onFailure", t.toString());
            }
        });



    }

}

