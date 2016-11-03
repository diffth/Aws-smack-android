package com.example.god.aws_smack_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.igniterealtime.restclient.RestApiClient;
import org.igniterealtime.restclient.entity.AuthenticationToken;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //http://52.78.215.218:9090/plugins/restapi/v1/users
        // Basic HTTP Authentication
        AuthenticationToken authenticationToken = new AuthenticationToken("admin", "qwer!@#$");

        RestApiClient restApiClient = new RestApiClient("http://52.78.215.218", 9090, authenticationToken);

        //Log.v("=============================== ", restApiClient.getUsers().toString());
    }
}


