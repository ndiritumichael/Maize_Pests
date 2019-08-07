package keapps.com.maizepest.Pests;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import keapps.com.maizepest.R;

public class RecyclerViewADapter extends RecyclerView.Adapter <RecyclerViewADapter.MyViewHolder>{

    private Context mContext;
    private List<PestGet> mData;

    public RecyclerViewADapter(Context mContext, List<PestGet> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.pestsrv,viewGroup,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder,final  int i) {

        myViewHolder.mPesttv.setText(mData.get(i).getName());
        myViewHolder.mPestiv.setImageResource(mData.get(i).getThumbnail());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, PestDesc.class);
                mContext.startActivity(intent);

                intent.putExtra("Name", mData.get(i).getName());
                intent.putExtra("Description", mData.get(i).getDescription());
                intent.putExtra("Measures",mData.get(i).getMeasures());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

            }
        } );
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }





    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mPesttv;
        CardView cardView;
        ImageView mPestiv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mPestiv = itemView.findViewById(R.id.imageRv);
            mPesttv = itemView.findViewById(R.id.textRv);
            cardView = itemView.findViewById(R.id.cardCV);
        }
    }

                                                    /* @Override
                                                     public int getItemCount() {

                                                     }*/






    }

