package com.example.micapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Hi I'm Creating", Toast.LENGTH_SHORT).show();
    }
    public void createNewActivity(View v)
    {
        EditText et=findViewById (R.id.editTextTextPersonName);
        Intent i=new Intent(MainActivity.this,DisplayNameActivity.class);
       // Bundle b=new Bundle();
      //  b.putString("Name",et.getText().toString());
       // i.putExtras(b);
        i.putExtra("Name",et.getText().toString());
        this.startActivity(i);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Hi I'm starting", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Hi I'm resuming", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Hi I'm restarting", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Bye Bye I'm dying", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Pausing see you later", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "oh stopping", Toast.LENGTH_SHORT).show();
    }
}