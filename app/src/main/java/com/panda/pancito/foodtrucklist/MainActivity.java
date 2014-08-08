package com.panda.pancito.foodtrucklist;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(R.drawable.hubbub);
        ids.add(R.drawable.koja);
        ids.add(R.drawable.sugarphilly);
        ids.add(R.drawable.chewys);
        ids.add(R.drawable.smoketruck);
        ids.add(R.drawable.rivalbros);
        ids.add(R.drawable.yumtown);
        ids.add(R.drawable.vernalicious);
        ids.add(R.drawable.footruck);
        ids.add(R.drawable.pitrucopizza);
        ids.add(R.drawable.saycheese);

        String [] trucks = {"Hub Bub", "Koja", "Sugar Philly", "Chewy's", "The Smoke Truck", "Rival Bros. Coffee",
                            "Yumtown USA", "Vernalicious", "Foo Truck", "Pitruco Pizza", "Say Cheese Philly"};

        ListAdapter theAdapter = new MyAdapter(this, trucks);

        ListView theListView = (ListView) findViewById(R.id.truck_list);

        theListView.setAdapter(theAdapter);

        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView the_name_of_truck = (TextView) view.findViewById(R.id.name_truck);
                String name = the_name_of_truck.getText().toString();
                Intent infoMenu = new Intent(MainActivity.this, DescriptionActivity.class);
                infoMenu.putExtra("name",name);
                infoMenu.putExtra("pic",ids.get(i));
                startActivity(infoMenu);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
