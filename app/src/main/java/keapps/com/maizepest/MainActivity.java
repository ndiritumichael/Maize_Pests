package keapps.com.maizepest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import keapps.com.maizepest.Pests.PestGet;
import keapps.com.maizepest.Pests.RecyclerViewADapter;

public class MainActivity extends AppCompatActivity {
    List<PestGet>  lstPest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPest = new ArrayList<>();
        lstPest.add(new PestGet(R.drawable.maize_curtworm1,"Cutworm","Cutworms cut maize seedlings at or a little below ground level",""));
        lstPest.add(new PestGet(R.drawable.maize_stalk_borer1,"Stalkborer","Stem/stalk borers are the most important insect pests of maize in Kenya.","Spray"));
        lstPest.add(new PestGet(R.drawable.maize_aphid,"Aphids","It is a soft dark green to bluish-green in colour insect.","Insecticide"));
        lstPest.add(new PestGet(R.drawable.maize_weevil,"Maize Weevil","The attack starts in the field where the female lays eggs in a slight hollow on the maize seed.","Dusting"));
        lstPest.add(new PestGet(R.drawable.maize_termites,"Termites","Often referred to as “white ants”","Destroy nest"));
        lstPest.add(new PestGet(R.drawable.maize_curtworm1,"Cutworm","Cutworms cut maize seedlings at or a little below ground level","Spray"));
        lstPest.add(new PestGet(R.drawable.maize_stalk_borer1,"Stalkborer","Stem/stalk borers are the most important insect pests of maize in Kenya.","Spray"));
        lstPest.add(new PestGet(R.drawable.maize_weevil,"Maize Weevil","The attack starts in the field where the female lays eggs in a slight hollow on the maize seed.","Dusting"));
        lstPest.add(new PestGet(R.drawable.maize_termites,"Termites","Often referred to as “white ants”","Destroy nest"));
        lstPest.add(new PestGet(R.drawable.maize_aphid,"Aphids","It is a soft dark green to bluish-green in colour insect.","Insecticide"));

        RecyclerView rvView = findViewById(R.id.reCyc);
        RecyclerViewADapter myAdapter = new RecyclerViewADapter(this,lstPest);
        rvView.setLayoutManager(new GridLayoutManager(this,2));
        rvView.setAdapter(myAdapter);




    }
}
