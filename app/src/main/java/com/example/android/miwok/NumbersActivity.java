package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //String Arraylist of english words from 1-10
        ArrayList<Word> words = new ArrayList<>();
        String[] englishTranslation = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] miwokTranslation = {"otu", "abụọ", "atọ", "anọ", "ise", "isii", "Asaa", "asatọ", "itoolu", "iri"};
        int[] resourceIdsImage = {R.drawable.number_one,R.drawable.number_two,R.drawable.number_three,R.drawable.number_four,
                                  R.drawable.number_five,R.drawable.number_six,R.drawable.number_seven,R.drawable.number_eight,
                                  R.drawable.number_nine,R.drawable.number_ten};

        // add the words and the resource IDS in the ArrayList using for loop
        for (int x = 0; x < englishTranslation.length; x++)
            words.add(new Word(englishTranslation[x],miwokTranslation[x],resourceIdsImage[x]));

        // Setup an ArrayAdapter and attach it to a ListView
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }

}
