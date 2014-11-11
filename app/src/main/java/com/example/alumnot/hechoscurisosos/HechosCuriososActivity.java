package com.example.alumnot.hechoscurisosos;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class HechosCuriososActivity extends ActionBarActivity {


    FactBook fb1 = new FactBook();
    ColorWheel cw = new ColorWheel();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);

    }

    public void factButtonAction(View v)
    {
        TextView factLabel = (TextView) findViewById(R.id.HechoCuriosoTextView);
        factLabel.setText(fb1.getRandomFact(getResources()));
        changeBackgroundColor();
    }

    public void changeBackgroundColor()
    {
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.relativeLayout);
        Button b1 = (Button)findViewById(R.id.VerOtroButton);

        /*Toast t = Toast.makeText(this, "Esto tira guey", Toast.LENGTH_LONG);
        t.show();*/


        rl1.setBackgroundColor(Color.parseColor(cw.getRandomFact(getResources())));
        b1.setBackgroundColor(Color.parseColor(cw.getRandomFact(getResources())));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hechos_curiosos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
