package info.androidhive.loginandregistration.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

import info.androidhive.loginandregistration.R;

/**
 * Created by dionelrodriguez on 8/24/16.
 */
public class timeviewadapter extends RecyclerView.Adapter<timeviewadapter.ViewHolder> {


    Context context;

            ArrayList<Bitmap> images = new ArrayList<Bitmap>();




    public timeviewadapter(Context context) {

        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.logo));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.logo));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.logo));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.logo));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.logo));
        images.add(BitmapFactory.decodeResource(context.getResources(), R.drawable.logo));

    }

    @Override
    public timeviewadapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.timeselectrow, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(timeviewadapter.ViewHolder holder, int position) {
       holder.timecardimage1.setImageBitmap(images.get(position));
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
             ImageView timecardimage1;
        public ViewHolder(View itemView) {

            super(itemView);
            timecardimage1 = (ImageView) itemView.findViewById(R.id.timecardimage);
        }
    }

}
