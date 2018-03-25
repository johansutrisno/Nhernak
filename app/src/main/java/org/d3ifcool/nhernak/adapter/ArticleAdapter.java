package org.d3ifcool.nhernak.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.object.Article;

import java.util.List;

/**
 * Created by Johan Sutrisno on 03/03/2018.
 */

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(@NonNull Activity context, @NonNull List<Article> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listContactView = convertView;
        if (listContactView == null){
            listContactView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_article, parent, false);
        }

        Article currentArticle = getItem(position);
        TextView titleArticle = listContactView.findViewById(R.id.title_article);
        TextView categoryArticle = listContactView.findViewById(R.id.category_article);
        ImageView imageArticle = listContactView.findViewById(R.id.image_article);

        titleArticle.setText(currentArticle.getmTitleArticle());
        categoryArticle.setText(currentArticle.getmCategory());
        imageArticle.setImageResource(currentArticle.getmImageResourceId());

        return listContactView;
    }
}
