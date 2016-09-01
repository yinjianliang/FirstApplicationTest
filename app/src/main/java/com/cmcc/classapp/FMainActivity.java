package com.cmcc.classapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.cmcc.firstapplication.R;

public class FMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_fmain);
        Button btnOk = (Button) findViewById(R.id.button);
        if (btnOk != null) {
            btnOk.setOnClickListener(ls);
        }
    }

    Intent intent ;

    View.OnClickListener ls = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView tvPhone = (TextView) findViewById(R.id.editText);
            String phoneNum = tvPhone.getText().toString();
             intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNum));
            startActivity(intent);
           //界面跳转过渡效果
          //  overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
        }
    };

}
