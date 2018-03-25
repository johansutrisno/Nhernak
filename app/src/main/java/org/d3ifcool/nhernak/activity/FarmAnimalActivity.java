package org.d3ifcool.nhernak.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.adapter.AnimalAdapter;
import org.d3ifcool.nhernak.object.Animal;

import java.util.ArrayList;

public class FarmAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_animal);

        ArrayList<Animal> data = new ArrayList<>();
        data.add(new Animal("Garut Sheep", R.drawable.ic_sheep, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        data.add(new Animal("Limosin Cow", R.drawable.ic_cow, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));
        data.add(new Animal("Cemani Chicken", R.drawable.ic_chicken, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.\n It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."));

        ListView listView = (ListView) findViewById(R.id.listview_animal);
        listView.setAdapter(new AnimalAdapter(this, data));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent = new Intent(FarmAnimalActivity.this, DetailFarmAnimalActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(FarmAnimalActivity.this, "Cooming Soon For This Item", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(FarmAnimalActivity.this, "Cooming Soon For This Item", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }


}
