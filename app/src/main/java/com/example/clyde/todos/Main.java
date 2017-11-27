package com.example.clyde.todos;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Main extends AppCompatActivity {

    /*ListView taskListView;

    int[] category = {R.drawable.iconsbank,
             R.drawable.iconsbeach,
             R.drawable.iconsdriving,
             R.drawable.iconsgame,
             R.drawable.iconsreading,
             R.drawable.iconsrestaurant,
             R.drawable.iconstv};

    String[] task = {
            "Pay electric bill",
            "Chill and relax!",
            "Carpool mode",
            "mmr boost",
            "long quiz on ethics",
            "dinner with diana",
            "stranger things"};*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTask. = (EditText)
        /*taskListView = findViewById(R.id.listView);*/
    }

 /*   class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return category.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View taskView = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = view
            return null;
        }

        @Nullable
        @Override
        public CharSequence[] getAutofillOptions() {
            return new CharSequence[0];
        }
    }*/
}
