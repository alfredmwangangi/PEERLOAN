package com.alfredtechsystems.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.signup_button)
    Button signUpButton;
    @BindView(R.id.button_forgotpassword)
    Button forgotPassword;

    @BindView(R.id.textView)
    TextView headerViewText;

    @BindView(R.id.button_loginasAdmin)
    Button loginAsAdmin;

    @BindView(R.id.button_loginasuser)
    Button loginAsuser;

    @BindView(R.id.button_exit)
    Button btnexit;

    @BindView(R.id.editText_password)
    EditText editPassword;

    @BindView(R.id.editText_userid)
    EditText userId;

    @BindView(R.id.editText_username)
    EditText userName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        //init viewmodel
        //null pointer exception on database data retrieve on this two functions have commeted for further debugging
        //Happy coding

        //fetchUsers();
        //fetchAdmins();

    }
    Boolean doLogin;




    @OnClick(R.id.button_loginasAdmin)
    public void loginAdminClick(){
        Intent intent = new Intent(this,Admin_login.class);
        startActivity(intent);
    }

    @OnClick(R.id.button_exit)
    public void exitClick(){
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @OnClick(R.id.button_loginasuser)
    public void setLoginAsuserseerClick(){

        if(TextUtils.isEmpty(userName.getText())){
            userName.setError("Enter your  name");
            return;
        }

        if(TextUtils.isEmpty(userId.getText())){
            userName.setError("Enter Your  id");
            return;
        }

        if(TextUtils.isEmpty(editPassword.getText())){
            userName.setError("Enter Your  Password");
            return;
        }
        Intent intent = new Intent(this, home_user.class);
        startActivity(intent);

    }

    @OnClick(R.id.button_forgotpassword)
    public  void setForgotPassword(){
        Intent j = new Intent(this, reset_password.class);
        startActivity(j);
    }

    @OnClick(R.id.signup_button)
    public  void signUpPage(){
        Intent j = new Intent(this, SignupActivity.class);
        startActivity(j);
    }

}
