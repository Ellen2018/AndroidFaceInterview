package com.ellen.androidface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.tv2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestDialog testDialog = new TestDialog(MainActivity.this);
                testDialog.show();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("哈哈","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("哈哈","onResume");
    }
}
