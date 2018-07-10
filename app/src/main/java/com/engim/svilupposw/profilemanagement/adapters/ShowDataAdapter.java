package com.engim.svilupposw.profilemanagement.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.engim.svilupposw.profilemanagement.R;
import com.engim.svilupposw.profilemanagement.models.Rifornimento;

import java.util.ArrayList;

/**
 * Created by svilupposw on 27/03/18.
 */

public class ShowDataAdapter extends BaseAdapter{

    private Context ctx;
    private ArrayList<Rifornimento> values;

    public ShowDataAdapter(Context ctx, ArrayList<Rifornimento> values){
        this.ctx = ctx;
        this.values = values;
    }



    @Override
    public int getCount() {
        return values.size();
    }

    @Override
    public Object getItem(int position) {
        return values.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null) {
            LayoutInflater li = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = li.inflate(R.layout.show_data_list_item,null);
        }

        // ---- PRENDIAMO LE DUE TEXTVIEW CREATE NEL LAYOUT
        TextView nameText = view.findViewById(R.id.nameBenzinaio);
        TextView priceText = view.findViewById(R.id.price);
        // -- LO PRENDI E LO METTI NELLA TEXTVIEW
        nameText.setText(values.get(i).getNomeBenzinaio());
        priceText.setText(String.valueOf(values.get(i).getImporto()));

        return view;
    }
}
