package org.d3ifcool.nhernak.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.activity.FarmAnimalActivity;
import org.d3ifcool.nhernak.object.Users;

/**
 * Created by Johan Sutrisno on 13/03/2018.
 */

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile2, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Users users = new Users("Robert Downey Jr.","Peternak Sapi Limosin",
                "robertdowney@jr.com","089675688630","Jl. Cibaduyut Raya" +
                ", Gg TVRI 1",R.drawable.ic_profilemanblueyoung);

        ImageView image = (ImageView) view.findViewById(R.id.image_profile);
        TextView name = (TextView) view.findViewById(R.id.name_profile);
        TextView job = (TextView) view.findViewById(R.id.job_profile);
        TextView email = (TextView) view.findViewById(R.id.text_email);
        TextView contact = (TextView) view.findViewById(R.id.text_contact);
        TextView alamat = (TextView) view.findViewById(R.id.text_location);

        image.setImageResource(users.getmImageResourceId());
        name.setText(users.getmName());
        job.setText(users.getmJob());
        email.setText(users.getmEmail());
        contact.setText(users.getmContact());
        alamat.setText(users.getmAlamat());

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "An option to edit your Profile Picture", Toast.LENGTH_SHORT).show();
            }
        });
        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "An option to edit your Name", Toast.LENGTH_SHORT).show();
            }
        });
        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "An option to edit your job description", Toast.LENGTH_SHORT).show();
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "An option to edit your Email", Toast.LENGTH_SHORT).show();
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "An option to edit your contact", Toast.LENGTH_SHORT).show();
            }
        });
        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "An option to edit your Address", Toast.LENGTH_SHORT).show();
            }
        });

        TextView logout = (TextView) view.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You have been log out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
