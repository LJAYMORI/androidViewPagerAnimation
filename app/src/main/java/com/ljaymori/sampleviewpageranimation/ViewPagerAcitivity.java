package com.ljaymori.sampleviewpageranimation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.ljaymori.sampleviewpageranimation.pagertransformer.CubeOutPageTransformer;
import com.ljaymori.sampleviewpageranimation.pagertransformer.DepthPageTransformer;
import com.ljaymori.sampleviewpageranimation.pagertransformer.RotationPageTransformer;
import com.ljaymori.sampleviewpageranimation.pagertransformer.ZoomOutPageTransformer;
import com.ljaymori.sampleviewpageranimation.pages.FourFragment;
import com.ljaymori.sampleviewpageranimation.pages.OneFragment;
import com.ljaymori.sampleviewpageranimation.pages.ThreeFragment;
import com.ljaymori.sampleviewpageranimation.pages.TwoFragment;

import java.util.ArrayList;

public class ViewPagerAcitivity extends ActionBarActivity {

    ArrayList<Fragment> pages = new ArrayList<Fragment>();
    ViewPager viewPager;
    MyPagerAdpater mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        setPages();

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        mAdapter = new MyPagerAdpater(getSupportFragmentManager());
        mAdapter.setInitPages(pages);

        viewPager.setAdapter(mAdapter);

        String transformerType = getIntent().getStringExtra(MainActivity.EXTRA_KEY_TRANSFORMER);
        if (transformerType.equals(MainActivity.NOTHING_TRANSFORMER)) {
            Toast.makeText(ViewPagerAcitivity.this, "Nothing", Toast.LENGTH_SHORT).show();

        } else if (transformerType.equals(MainActivity.DEPTH_TRANSFORMER)) {
            DepthPageTransformer transformer = new DepthPageTransformer();
            viewPager.setPageTransformer(true, transformer);

        } else if (transformerType.equals(MainActivity.ZOOM_OUT_TRANSFORMER)) {
            ZoomOutPageTransformer transformer = new ZoomOutPageTransformer();
            viewPager.setPageTransformer(true, transformer);

        } else if (transformerType.equals(MainActivity.CUBE_OUT_TRANSFORMER)) {
            CubeOutPageTransformer transformer = new CubeOutPageTransformer();
            viewPager.setPageTransformer(true, transformer);

        } else if (transformerType.equals(MainActivity.ROTATION_TRANSFORMER)) {
            RotationPageTransformer transformer = new RotationPageTransformer(160);
            viewPager.setPageTransformer(true, transformer);
        }

    }

    private void setPages(){
        pages.add(new OneFragment());
        pages.add(new TwoFragment());
        pages.add(new ThreeFragment());
        pages.add(new FourFragment());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_pager_acitivity, menu);
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
