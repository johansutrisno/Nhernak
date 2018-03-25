package org.d3ifcool.nhernak.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.activity.ContactConsultantActivity;
import org.d3ifcool.nhernak.activity.CoomingSoonActivity;
import org.d3ifcool.nhernak.activity.FarmAnimalActivity;

/**
 * Created by Johan Sutrisno on 03/03/2018.
 */

public class HomeFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        LinearLayout menuContact = (LinearLayout) view.findViewById(R.id.menu_contact);
        LinearLayout menuAnimal = (LinearLayout) view.findViewById(R.id.menu_animal);
        LinearLayout menuPrice = (LinearLayout) view.findViewById(R.id.menu_price);

        menuContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ContactConsultantActivity.class);
                startActivity(intent);
            }
        });

        menuAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), FarmAnimalActivity.class);
                startActivity(intent);
            }
        });

        menuPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CoomingSoonActivity.class);
                startActivity(intent);
            }
        });
    }
}
