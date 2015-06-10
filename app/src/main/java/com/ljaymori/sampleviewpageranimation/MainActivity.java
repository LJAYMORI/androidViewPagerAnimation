package com.ljaymori.sampleviewpageranimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    public static final String EXTRA_KEY_TRANSFORMER = "transformer";
    public static final String NOTHING_TRANSFORMER = "nothing_transformer";
    public static final String DEPTH_TRANSFORMER = "depth_transformer";
    public static final String ZOOM_OUT_TRANSFORMER = "zoom_out_transformer";
    public static final String CUBE_OUT_TRANSFORMER = "cube_out_transformer";
    public static final String ROTATION_TRANSFORMER = "rotation_transformer";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_nothing_transformer);
        button.setOnClickListener(this);

        button = (Button) findViewById(R.id.button_depth_transformer);
        button.setOnClickListener(this);

        button = (Button) findViewById(R.id.button_zoomout_transformer);
        button.setOnClickListener(this);

        button = (Button) findViewById(R.id.button_cube_out_transformer);
        button.setOnClickListener(this);

        button = (Button) findViewById(R.id.button_rotation_transformer);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this, ViewPagerAcitivity.class);

        switch(v.getId()) {
            case R.id.button_nothing_transformer : {
                intent.putExtra(EXTRA_KEY_TRANSFORMER, NOTHING_TRANSFORMER);
                break;
            }
            case R.id.button_depth_transformer : {
                intent.putExtra(EXTRA_KEY_TRANSFORMER, DEPTH_TRANSFORMER);
                break;
            }
            case R.id.button_zoomout_transformer : {
                intent.putExtra(EXTRA_KEY_TRANSFORMER, ZOOM_OUT_TRANSFORMER);
                break;
            }
            case R.id.button_cube_out_transformer : {
                intent.putExtra(EXTRA_KEY_TRANSFORMER, CUBE_OUT_TRANSFORMER);
                break;
            }
            case R.id.button_rotation_transformer : {
                intent.putExtra(EXTRA_KEY_TRANSFORMER, ROTATION_TRANSFORMER);
                break;
            }
        }

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
