package com.panda.pancito.foodtrucklist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by pancito on 8/7/14.
 */
public class DescriptionActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.description_activity);

        Intent callInfo = getIntent();
        String name = callInfo.getExtras().getString("name");

        TextView truck = (TextView) findViewById(R.id.name_text);
        truck.setText(name);

        ImageView image = (ImageView) findViewById(R.id.food_truck_pic);
        image.setImageResource((Integer) callInfo.getExtras().get("pic"));

    }

    public void openMenu(View view) {
        Intent Menu = new Intent(DescriptionActivity.this, MenuActivity.class);
        startActivity(Menu);
    }
}
