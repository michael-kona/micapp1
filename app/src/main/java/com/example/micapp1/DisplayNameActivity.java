package com.example.micapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayNameActivity extends AppCompatActivity
{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name);
        tv=(TextView) findViewById(R.id.textView2);
        String message="Hi "+getIntent().getStringExtra("Name");
        tv.setText(message);

        //prepare layout for toast
        LayoutInflater li=getLayoutInflater();
        View toast_layout=li.inflate(R.layout.custom_toast_layout,(ViewGroup)findViewById(R.id.custom_toast_root));
        TextView toast_txt_view=(TextView)toast_layout.findViewById(R.id.textView4);
        toast_txt_view.setText(message);
        //custom toast
        Toast t=new Toast(this.getApplicationContext());
        t.setDuration(Toast.LENGTH_LONG);
        t.setView(toast_layout);
        t.show();
    }
}