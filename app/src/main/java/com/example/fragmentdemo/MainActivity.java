package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name={ "Rana","Prodip","Prohor","Lemon","Showmin","Babu","Shawon","Akash","Shohel","Juna" };

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Fragment fragment;
        if (position==0)
        {
            fragment=new RanaFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==1)
        {
            fragment=new ProdipFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==2)
        {
            fragment=new ProhorFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==3)
        {
            fragment=new LemonFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==4)
        {
            fragment=new ShowminFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==5)
        {
            fragment=new BabuFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==6)
        {
            fragment=new ShaownFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==7)
        {
            fragment=new AkashFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==8)
        {
            fragment=new ShohelFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }
        else if (position==9)
        {
            fragment=new JunaFragment();
            FragmentManager fragmentManager=getFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentid,fragment);
            fragmentTransaction.commit();
        }


    }
}
