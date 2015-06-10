package com.ljaymori.sampleviewpageranimation.pagertransformer;

import android.support.v4.view.ViewPager;
import android.view.View;

/*
 * Reference : https://github.com/ToxicBakery/ViewPagerTransforms/blob/master/library/src/main/java/com/ToxicBakery/viewpager/transforms/CubeOutTransformer.java
 */

public class CubeOutPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View view, float position) {
        view.setPivotX(position < 0f ? view.getWidth() : 0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(90f * position);
    }
}
