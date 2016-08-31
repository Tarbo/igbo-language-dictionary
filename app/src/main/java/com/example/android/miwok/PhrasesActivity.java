package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        //String Arraylist of english words from 1-10
        ArrayList<Word> phrases = new ArrayList<>();
        String[] englishTranslation = {"Where are you going?", "What is your name?", "My name is...", "how are you?",
                                    "I am good.", "Are you coming?", "Yes! I am coming.", "I'm coming.",
                                    "Let's go ", "Come here."};
        String[] miwokTranslation = {"Ebee ka ị na-aga?", "Kedu aha gị?", "Aha m bụ ....", "Kedu ka ị mere?",
                                    "adị m mma", "Ị na -abịa ?", "Ee! Ana m abịa.", "Ana m abịa.", "Ka anyi pụọ.", "Bịa ebe a!"};
        // add the words in the ArrayList using for loop
        for (int x = 0; x < englishTranslation.length; x++)
            phrases.add(new Word(englishTranslation[x], miwokTranslation[x]));

        // Setup an ArrayAdapter and attach it to a ListView
        WordAdapter adapter = new WordAdapter(this, phrases, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
