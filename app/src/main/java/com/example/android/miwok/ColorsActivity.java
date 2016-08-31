package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //String Arraylist of english words from 1-10 and the Image Resource IDS
        ArrayList<Word> colors = new ArrayList<>();
        String[] englishTranslation = {"red", "mustard yellow", "dusty yellow", "green", "brown", "gray", "black", "white"};
        String[] miwokTranslation = {"red","odo", "unyi aja", "green", "aja aja", "isi awọ", "oji", "acha ọcha"};
        int[] resourceIdsImage = {R.drawable.color_red,R.drawable.color_mustard_yellow,R.drawable.color_dusty_yellow,
                                R.drawable.color_green,R.drawable.color_brown,R.drawable.color_gray,
                                R.drawable.color_black,R.drawable.color_white};

        // add the words and the resource IDS in the ArrayList using for loop
        for (int x = 0; x < englishTranslation.length; x++)
            colors.add(new Word(englishTranslation[x], miwokTranslation[x],resourceIdsImage[x]));

        // Setup an ArrayAdapter and attach it to a ListView
        WordAdapter adapter = new WordAdapter(this, colors, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
