package com.panda.pancito.foodtrucklist;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by pancito on 8/7/14.
 */
public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);
        TextView men = (TextView) findViewById(R.id.menu);
        men.setText(Html.fromHtml(getString(R.string.chewys_menu)));
    }
}
