package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by okwy on 28/08/16.
 */
public class WordAdapter extends ArrayAdapter<Word> {
    // Public member ID for the color resource ID
    private int mColorID;
    // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
    // the second argument is used when the ArrayAdapter is populating a single TextView.
    // Because this is a custom adapter for two TextViews, the adapter is not
    // going to use this second argument, so it can be any value. Here, we used 0.
    public WordAdapter(Activity context, ArrayList<Word> word, int colorID)
    {
        super(context,0,word);
        mColorID = colorID;
    }

    // Getter for the color ID
    public int getmColorID()
    {
        return mColorID;
    }

    // The getView() method is overwritten to enable us display more than one textviews
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, else use it
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        }

        //Get the position of the current object in the list
        Word currentWord = getItem(position);

        // Find the Textview by the ID for the English word
        TextView englishWord = (TextView) listItemView.findViewById(R.id.englishTranslation);

        // Set the English word as the text of the TextView
        englishWord.setText(currentWord.getmEnglishTranslation());

        // Find the Textview by the ID for the english miwok word
        TextView miwokWord = (TextView) listItemView.findViewById(R.id.defaultTranslation);

        // Set the display text of the TextView to the miwok word
        miwokWord.setText(currentWord.getmDefaultTranslation());

        //Find ImageView from the custom Layout file
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon_imageview);

        if(currentWord.hasImage())
        {
            // Set the given image ID to the iconView
            iconView.setImageResource(currentWord.getmImageResourceID());

            // Set the visibility of this view
            iconView.setVisibility(View.VISIBLE);

        }
        else
        {
            // Set the visibility of this view
            iconView.setVisibility(View.GONE);
        }

        // Set the background color of the Linear layout containing two textviews
        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);

        // Get what the color ID maps to
        int color = ContextCompat.getColor(getContext(),mColorID);

        // Catch any error in case the textview container is not found
        if(textContainer != null)
            textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
