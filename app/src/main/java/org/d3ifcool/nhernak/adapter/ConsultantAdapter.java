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
import org.d3ifcool.nhernak.object.Consultant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Johan Sutrisno on 28/02/2018.
 */

public class ConsultantAdapter extends ArrayAdapter<Consultant>{
    public ConsultantAdapter(@NonNull Context context, @NonNull ArrayList<Consultant> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listContactView = convertView;
        if (listContactView == null){
            listContactView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_contact, parent, false);
        }

        Consultant currentConsultant = getItem(position);
        TextView nameTextView = (TextView) listContactView.findViewById(R.id.name_tx);
        nameTextView.setText(currentConsultant.getmName());
        TextView specializationTextView = (TextView) listContactView.findViewById(R.id.specialization_tx);
        specializationTextView.setText(currentConsultant.getmSpecialization());
        TextView priceTextView = (TextView) listContactView.findViewById(R.id.price_tx);
        priceTextView.setText(currentConsultant.getmPrice());
        ImageView profileImageView = (ImageView) listContactView.findViewById(R.id.image_contact_img);
        profileImageView.setImageResource(currentConsultant.getmImageResourceId());
        return listContactView;
    }
}
