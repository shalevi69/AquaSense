package com.example.shalevifrach.aquasensebeta;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by shalevifrach on 21/06/2017.
 */

public class ItemsArrayAdapter extends ArrayAdapter<Item> {

    Context context;
    List<Item> items;

    public ItemsArrayAdapter(Context context, List<Item> items) {
        super(context, R.layout.item_item);
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
