package org.d3ifcool.nhernak.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.ColorRes;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import org.d3ifcool.nhernak.R;
import org.d3ifcool.nhernak.fragment.ArticleFragment;
import org.d3ifcool.nhernak.fragment.HomeFragment;
import org.d3ifcool.nhernak.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBottomNav = (BottomNavigationView) findViewById(R.id.navigation);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.container, new HomeFragment());
        ft.commit();


        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()){
                    case R.id.menu_home :
                        fragment = new HomeFragment();
                        break;
                    case R.id.menu_article:
                        fragment = new ArticleFragment();
                        break;
                    case R.id.menu_profile:
                        fragment = new ProfileFragment();
                        break;
                }

                if (fragment != null){
                    FragmentTransaction ft = getFragmentManager().beginTransaction();
                    ft.replace(R.id.container, fragment);
                    ft.commit();
                }
                return true;
            }
        });

    }
}
