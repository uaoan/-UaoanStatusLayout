package com.uaoanlao.uaoantools;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.uaoanlao.tools.View.UaoanStatusLayoutView;

public class MainActivity extends AppCompatActivity {

    UaoanStatusLayoutView uaoanStatusLayoutView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uaoanStatusLayoutView=findViewById(R.id.uaoanStatusLayoutView);
        uaoanStatusLayoutView.showError();
        
        uaoanStatusLayoutView.setOnRootClickListener(new UaoanStatusLayoutView.OnRootClickListener() {
            @Override
            public void onRootClick(View view) {
                uaoanStatusLayoutView.showNone();
            }
        });
    }
    public void an(View vv){
        uaoanStatusLayoutView.showLoading();
    }
}