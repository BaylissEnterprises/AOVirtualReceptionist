package accucode.example.com.aovr;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.telephony.gsm.SmsManager;
import android.widget.TextView;

public class MainActivity extends Activity {
    ViewPager viewpager;
    Button btnTransfer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_one_layout);

        btnTransfer=(Button)findViewById(R.id.btnTransfer);
        btnTransfer.setBackgroundColor(Color.TRANSPARENT);
        btnTransfer.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v)
            {
                Intent myIntent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(myIntent);
            }
        });
//        viewpager = (ViewPager) findViewById(R.id.pager);
//        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
//        viewpager.setAdapter(padapter);
    }
}
