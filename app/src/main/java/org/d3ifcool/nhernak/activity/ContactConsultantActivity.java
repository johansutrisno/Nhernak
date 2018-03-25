package org.d3ifcool.nhernak.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.adapter.ConsultantAdapter;
import org.d3ifcool.nhernak.object.Consultant;

import java.util.ArrayList;

public class ContactConsultantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_consultant);

        ArrayList<Consultant> data = new ArrayList<>();
        data.add(new Consultant("Ir. Johan Sutrisno", "Domba Garut Specialization", "Free", R.drawable.ic_profilemanblueyoung));
        data.add(new Consultant("Drs. Sri Mulyani", "Sapi Limosin Specialization", "Free", R.drawable.ic_profilegirlbluemidleage));
        data.add(new Consultant("Drs. A. Nurul Istiqomah", "Ayam Cemani Specialization", "Free", R.drawable.ic_profilegirlblueyoung));
        data.add(new Consultant("Ir. Johan Sutrisno", "Domba Garut Specialization", "Free", R.drawable.ic_profilemanblueyoung));
        data.add(new Consultant("Drs. Sri Mulyani", "Sapi Limosin Specialization", "Free", R.drawable.ic_profilegirlbluemidleage));
        data.add(new Consultant("Drs. A. Nurul Istiqomah", "Ayam Cemani Specialization", "Free", R.drawable.ic_profilegirlblueyoung));
        data.add(new Consultant("Ir. Johan Sutrisno", "Domba Garut Specialization", "Free", R.drawable.ic_profilemanblueyoung));
        data.add(new Consultant("Drs. Sri Mulyani", "Sapi Limosin Specialization", "Free", R.drawable.ic_profilegirlbluemidleage));
        data.add(new Consultant("Drs. A. Nurul Istiqomah", "Ayam Cemani Specialization", "Free", R.drawable.ic_profilegirlblueyoung));
        data.add(new Consultant("Ir. Johan Sutrisno", "Domba Garut Specialization", "Free", R.drawable.ic_profilemanblueyoung));
        data.add(new Consultant("Drs. Sri Mulyani", "Sapi Limosin Specialization", "Free", R.drawable.ic_profilegirlbluemidleage));
        data.add(new Consultant("Drs. A. Nurul Istiqomah", "Ayam Cemani Specialization", "Free", R.drawable.ic_profilegirlblueyoung));


        ListView listView = (ListView) findViewById(R.id.listview_contact);
        listView.setAdapter(new ConsultantAdapter(this, data));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ContactConsultantActivity.this, CoomingSoonActivity.class);
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
