package org.d3ifcool.nhernak.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.activity.ContactConsultantActivity;
import org.d3ifcool.nhernak.activity.CoomingSoonActivity;
import org.d3ifcool.nhernak.adapter.ArticleAdapter;
import org.d3ifcool.nhernak.object.Article;

import java.util.ArrayList;

/**
 * Created by Johan Sutrisno on 03/03/2018.
 */

public class ArticleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_article, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        ArrayList<Article> data = new ArrayList<>();
        data.add(new Article("Inilah 10 Alasan Kenapa Harga Domba Naik", "domba garut", R.drawable.ic_sheep));
        data.add(new Article("Ternyata Bahaya Sapi Dibiarkan Kepanasan", "sapi", R.drawable.ic_cow));
        data.add(new Article("Inilah Ayam Seharga 50 Juta", "ayam", R.drawable.ic_chicken));
        data.add(new Article("Inilah 10 Alasan Kenapa Harga Domba Naik", "domba garut", R.drawable.ic_sheep));
        data.add(new Article("Ternyata Bahaya Sapi Dibiarkan Kepanasan", "sapi", R.drawable.ic_cow));
        data.add(new Article("Inilah Ayam Seharga 50 Juta", "ayam", R.drawable.ic_chicken));
        data.add(new Article("Inilah 10 Alasan Kenapa Harga Domba Naik", "domba garut", R.drawable.ic_sheep));
        data.add(new Article("Ternyata Bahaya Sapi Dibiarkan Kepanasan", "sapi", R.drawable.ic_cow));
        data.add(new Article("Inilah Ayam Seharga 50 Juta", "ayam", R.drawable.ic_chicken));
        data.add(new Article("Inilah 10 Alasan Kenapa Harga Domba Naik", "domba garut", R.drawable.ic_sheep));

        ListView listView = (ListView) getActivity().findViewById(R.id.list_article);
        listView.setAdapter(new ArticleAdapter(getActivity(), data));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), CoomingSoonActivity.class);
                switch (i){
                    case 0 : startActivity(intent); break;
                    case 1 : startActivity(intent); break;
                    case 2 : startActivity(intent); break;
                    case 3 : startActivity(intent); break;
                    case 4 : startActivity(intent); break;
                    case 5 : startActivity(intent); break;
                    case 6 : startActivity(intent); break;
                    case 7 : startActivity(intent); break;
                    case 8 : startActivity(intent); break;
                    case 9 : startActivity(intent); break;
                    case 10 : startActivity(intent); break;

                }
            }
        });

    }
}
