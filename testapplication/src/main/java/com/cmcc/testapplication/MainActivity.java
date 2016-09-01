package com.cmcc.testapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.first_layout);
       Button btn1  =(Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"Button1 is Clicked",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent("com.example.activity.ACTION_START");
               Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("http://www.163.com"));
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        System.out.print(""+itemId);

        switch (itemId)
        {
            case R.id.add_item:
                Toast.makeText(this,"Add Item is clicked",Toast.LENGTH_SHORT);

                break;
            case R.id.remove_item:
                Toast.makeText(MainActivity.this,"Remove Item is clicked",Toast.LENGTH_SHORT);

                break;
            default:
        }

        return true;
    }


}
