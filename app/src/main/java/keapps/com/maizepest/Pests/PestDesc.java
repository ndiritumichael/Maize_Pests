package keapps.com.maizepest.Pests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import keapps.com.maizepest.R;

public class PestDesc extends AppCompatActivity {
    private TextView tvName,tvDSesc,controlTv;
    private ImageView img;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest_desc);
        tvName = findViewById(R.id.descTV);
        tvDSesc= findViewById(R.id.descMain);
        img = findViewById(R.id.descIV);
        controlTv= findViewById(R.id.controlTV);
        btn= findViewById(R.id.controlBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controlTv.setVisibility(View.VISIBLE);
            }
        });
       /* Intent intent = getIntent();
        String Name = intent.getExtras().getString("Name");*/

        Intent intent = getIntent();
        String Name = intent.getExtras().getString("Name");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");
       String Measures = intent.getExtras().getString("Measures");


        tvName.setText(Name);

        tvDSesc.setText(Description);
        img.setImageResource(image);
       controlTv.setText(Measures);



    }
}
