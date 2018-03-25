package org.d3ifcool.nhernak.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.object.Animal;

import java.util.List;

/**
 * Created by Johan Sutrisno on 28/02/2018.
 */

public class AnimalAdapter extends ArrayAdapter <Animal> {
    public AnimalAdapter(@NonNull Context context, @NonNull List<Animal> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listContactView = convertView;
        if (listContactView == null){
            listContactView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_animal, parent, false);
        }

        Animal currentAnimal = getItem(position);
        TextView animalNameTextView = (TextView) listContactView.findViewById(R.id.animalname_tx);
        ImageView imgAnimal = (ImageView) listContactView.findViewById(R.id.icon_imageview);

        animalNameTextView.setText(currentAnimal.getmAnimal());
        imgAnimal.setImageResource(currentAnimal.getmImageResource());

        return listContactView;
    }
}
