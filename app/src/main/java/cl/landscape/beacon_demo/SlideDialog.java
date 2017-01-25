package cl.landscape.beacon_demo;

import android.content.Context;

/**
 * Created by danielsotopino on 1/22/17.
 */

public class SlideDialog extends android.support.v7.app.AlertDialog {

    protected SlideDialog(Context context, int themeResId) {
        super(context, R.style.DialogSlideAnim);
    }

}
