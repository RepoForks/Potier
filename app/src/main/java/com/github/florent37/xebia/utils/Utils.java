package com.github.florent37.xebia.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;

/**
 * Created by florentchampigny on 27/04/15.
 */
public class Utils {
    public static float dpToPx(float dp, Context context) {
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float px = dp * (metrics.densityDpi / 160f);
        return px;
    }
    public static int colorWithAlpha(int color, float percent){
        int r = Color.red(color);
        int g = Color.green(color);
        int b = Color.blue(color);
        int alpha = Math.round(percent*255);

        return Color.argb(alpha,r,g,b);
    }
}
