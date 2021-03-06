package com.alfredtechsystems.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.OnClick;

public class SignupActivity extends AppCompatActivity {

    @BindView(R.id.editText_ConfRegPass)
    EditText editText_ConfRegPass;
    @BindView(R.id.editText_signup_password)
    EditText editText_signup_password;

    @BindView(R.id.editText_fullname)
    EditText fullName;
    @BindView(R.id.editText_signup_Id)
    EditText editText_signup_Id;
    @BindView(R.id.editText6_email)
    EditText editText6_email;

    @BindView(R.id.editTextPhoneNo)
    EditText editTextPhoneNo;
    @BindView(R.id.buttonRegisterSave)
    Button buttonRegisterSave;
    @BindView(R.id.radioButton_male)
    RadioButton radioButton_male;
    @BindView(R.id.RadioButton_Female)
    RadioButton RadioButton_Female;



    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //ButterKnife.bind(this);

    }
        @OnClick(R.id.buttonRegisterSave)
        public void buttonRegisterSaveClick() {

            if (TextUtils.isEmpty(fullName.getText())) {
                fullName.setError(" enter your name");
                return;
            }

            if (TextUtils.isEmpty(editText6_email.getText())) {
                editText6_email.setError("Enter Your Email");
                return;
            }

            if (TextUtils.isEmpty(editText_signup_Id.getText())) {
                editText_signup_Id.setError("Enter Your id");
                return;
            }
            if (TextUtils.isEmpty(editText_ConfRegPass.getText())) {
                editText_ConfRegPass.setError(" Enter Your Confirmation Password");
                return;
            }

            if (TextUtils.isEmpty(editText_signup_password.getText())) {
                editText_signup_password.setError("Enter Your Password");
                return;
            }
}}
