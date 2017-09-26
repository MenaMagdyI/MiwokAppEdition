package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Mena on 7/21/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mcolorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);
    }

    public WordAdapter(Activity context, ArrayList<Word> words,int colorResourceId){
        super(context,0,words);
        mcolorResourceId = colorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View ListItemView = convertView;

        if(ListItemView == null){
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.listlay,parent,false);
        }

        Word currentWord = getItem(position);
        TextView miwoktextview = (TextView) ListItemView.findViewById(R.id.miwok_text_view);
        miwoktextview.setText(currentWord.getmMiwokTranslation());

        TextView defualttextview = (TextView) ListItemView.findViewById(R.id.defualt_text_view);
        defualttextview.setText(currentWord.getmDefualtTranslation());

        ImageView imagebyId = (ImageView) ListItemView.findViewById(R.id.image);

        if (currentWord.has_image()){
            imagebyId.setImageResource(currentWord.getmImageId());
            imagebyId.setVisibility(View.VISIBLE);

        }
        else{
            imagebyId.setVisibility(View.GONE);
        }

        View textContainer = ListItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mcolorResourceId);
        textContainer.setBackgroundColor(color);


        return ListItemView;
    }
}
