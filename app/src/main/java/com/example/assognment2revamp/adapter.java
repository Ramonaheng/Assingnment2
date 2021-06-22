package com.example.assognment2revamp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


class adapter extends RecyclerView.Adapter<adapter.ViewHolder>
{

    String data[],data2[];

    int images[];
    Context context;




    public  adapter( Context ct, String[] name, String[] Info, int[] imgs)
    {
        context=ct;
        data=name;
        data2=Info;
        images=imgs;





    }

    @NonNull
    @Override
    public
    ViewHolder onCreateViewHolder ( @NonNull ViewGroup parent, int viewType ) {
        LayoutInflater inflater = LayoutInflater.from ( context );
       View view =   inflater.inflate ( R.layout.activity_layout,parent,false );
        return new ViewHolder ( view );
    }

    @Override
    public
    void onBindViewHolder ( @NonNull ViewHolder holder, int position )
    {
        holder.text1.setText ( data[position] );
        holder.text2.setText ( data2[position] );
        holder.images2.setImageResource ( images[position]);


    }

    @Override
    public
    int getItemCount ( ) {
        return images.length;
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder
    {
        TextView text1,text2,content;
        ImageView images2;

        public
        ViewHolder ( @NonNull View itemView ) {
            super ( itemView );
            text1=itemView.findViewById (R.id.heading);
            text2=itemView.findViewById ( R.id.body );
            images2=itemView.findViewById ( R.id.image1);

            itemView.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public
                void onClick ( View view ) {
                    Intent intent = new Intent (context,details.class );
                    intent.putExtra ( "images2",images[getAdapterPosition ()]);

                    context.startActivity (intent);
                }
            } );
        }
    }
}

