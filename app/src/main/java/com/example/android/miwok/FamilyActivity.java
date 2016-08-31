package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //String Arraylist of english words from 1-10
        ArrayList<Word> family = new ArrayList<>();
        String[] englishTranslation = {"father", "mother", "son", "daughter", "older brother",
                "younger brother", "older sister", "younger sister", "grandmother", "grandfather"};
        String[] miwokTranslation = {"nna", "nne", "nwa nwoke", "nwa nwanyi", "nwanne ya nwoke tọrọ",
                "nwanne ya nwoke ntà", "nwanne ya nwaanyị tọrọ", "nwanne ya nwanyị nta", "nne nne", "nna nna"};
        int[] resourceIdsImage = {R.drawable.family_father,R.drawable.family_mother,R.drawable.family_son,
                R.drawable.family_daughter,R.drawable.family_older_brother,R.drawable.family_younger_brother,
                R.drawable.family_older_sister,R.drawable.family_younger_sister,R.drawable.family_grandmother,
                R.drawable.family_grandfather};

        // add the words in the ArrayList using for loop
        for (int x = 0; x < englishTranslation.length; x++)
            family.add(new Word(englishTranslation[x], miwokTranslation[x],resourceIdsImage[x]));

        // Setup an ArrayAdapter and attach it to a ListView
        WordAdapter adapter = new WordAdapter(this, family, R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
