package com.example.applocaisturisticos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tela_sidney(View view){
        Intent it = new Intent(MainActivity.this, SidineyActivity.class);
        startActivity(it);
    }
    public void tela_irlanda(View view){
        Intent it = new Intent(MainActivity.this, IrlandaActivity.class);
        startActivity(it);
    }
    public void tela_tailandia(View view){
        Intent it = new Intent(MainActivity.this,TailandiaActivity.class);
        startActivity(it);
    }

}