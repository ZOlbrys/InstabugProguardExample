package com.example.instabugproguardexample;

import android.os.Bundle;

import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Instabug.Builder(getApplication(), "INSTABUG_API_KEY").setInvocationEvents(InstabugInvocationEvent.FLOATING_BUTTON)
                .build();
    }
}
