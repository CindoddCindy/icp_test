package cindodcindy.mobiletest.icptest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import cindodcindy.mobiletest.icptest.pojo.Data;
import cindodcindy.mobiletest.icptest.pojo.UserLoginResponse;
import cindodcindy.mobiletest.icptest.retrofit.AmbilMetod;
import cindodcindy.mobiletest.icptest.retrofit.RetroUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserLogin extends AppCompatActivity {

    private EditText editText_name , editText_password;

    private Button button_login;

    private  TextView textView_seterror, textView_token, textView;
private  Data data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        editText_name=findViewById(R.id.et_name);
        editText_password=findViewById(R.id.et_password);
        button_login=findViewById(R.id.btn_login);
        textView_seterror=findViewById(R.id.text_error);
        textView_token=findViewById(R.id.text_token);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getLoginUser();

            }
        });
    }

    public void getLoginUser(){

        String usernama=editText_name.getText().toString();
        String password=editText_password.getText().toString();

        AmbilMetod ambilMetod   = RetroUrl.getRetrofit().create(AmbilMetod.class);


        Call<UserLoginResponse> userCall = ambilMetod.userLogin(usernama,password);//.EmployeeRegister(name,email,password, employeeid,employeecomname);//.userSignUp(name, email, password);

        userCall.enqueue(new Callback<UserLoginResponse>() {
            @Override
            public void onResponse(@Nullable Call<UserLoginResponse> call, @Nullable Response<UserLoginResponse> response) {
                //String status = response.body().getMessage();
                UserLoginResponse userLoginResponse = response.body();
               // Data data=userLoginResponse.getData();
                if (response.isSuccessful()) {
                    Log.d("Server Response", "failed" + userLoginResponse.getData());
                    Intent intent = new Intent(UserLogin.this,Menu.class);
                    startActivity(intent);
                    finish();


                }

                else  {
                    textView_seterror.setText("User Not Found");

                }
            }

            @Override
            public void onFailure(Call<UserLoginResponse> call, Throwable t) {
                //hidepDialog();
                Log.d("onFailure", t.toString());
            }
        });



    }


}


