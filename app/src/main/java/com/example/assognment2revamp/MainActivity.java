 package com.example.assognment2revamp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Layout;

 public
class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String name[],location[],Info[];

    int images[]  = {R.drawable.maletsunyane_falls_lesotho,R.drawable.sehlabathebe_national_park,
                R.drawable.sani_pass_13,R.drawable.kome_cave_dwellings__ha_kome__in_lesotho___2382,R.drawable.thaba_bosiu,
                 R.drawable.katse_dam_lhwp_phase_1a_overspilling,R.drawable.dinofootprints1};

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        recyclerView=findViewById (R.id.recycleview );
        name=getResources ().getStringArray ( R.array.Names );
        Info = getResources ().getStringArray ( R.array.Info );


        adapter adapter1=new adapter (this,name,Info,images);
        recyclerView.setAdapter ( adapter1 );
       recyclerView.setLayoutManager ( new LinearLayoutManager (this) );
    }
}


