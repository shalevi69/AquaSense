package com.example.shalevifrach.aquasensebeta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter, adapter2;
    List<String> items;
    FrameLayout frameNewMission, frameItemsList;
    ListView lstChooseItems, lstChkItems;
    String[] itemsThatWasChoosen = new String[5];
    String[] itemsName = {
            "צינור 8 ממ",
            "צינור 6 ממ",
            "צינור 12 ממ",
            "משאבת מינון 20",
            "משאבת מינון 40",
            "משאבת מינון 60",
            "מזרקים",
            "בקר מקס-5",
            "אנטי סיפון",
            "קונטקטור",
            "מפסק זרימה",
            "שבשבת",
            "אלקטרודת כלור",
            "אלקטרוליט"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameNewMission = (FrameLayout)findViewById(R.id.frameNewMission);
        frameItemsList = (FrameLayout)findViewById(R.id.frameItemsList);
        lstChooseItems = (ListView)findViewById(R.id.lstChooseItems);
        lstChkItems = (ListView)findViewById(R.id.lstChkItems);

        items = new ArrayList<>();
        adapter = new ArrayAdapter<String>(this,R.layout.item_item, R.id.lblItem, itemsName);
        adapter2 = new ArrayAdapter<String>(this,R.layout.item_item, R.id.lblItem, itemsThatWasChoosen);

        List<Item> items = new ArrayList<>();
        for (String itemName : itemsName) {
            Item item = new Item(itemName);
            items.add(item);
        }

        lstChooseItems.setAdapter(adapter);
        lstChooseItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "" + itemsName[position], Toast.LENGTH_SHORT).show();
                for (int i = 0; i < itemsThatWasChoosen.length; i++) {
                    if (itemsThatWasChoosen[i] == null){
                        itemsThatWasChoosen[i] = itemsName[position];
                        return;
                    }
                }
            }
        });

    }


    public void onClickNewMission(View view) {
        frameNewMission.setVisibility(View.VISIBLE);
    }

    public void onClickSaveMission(View view) {
        frameNewMission.setVisibility(View.GONE);
    }


    public void onClickAddItems(View view) {
        frameNewMission.setVisibility(View.GONE);
        frameItemsList.setVisibility(View.VISIBLE);
    }

    public void onClickSaveItems(View view) {
        for (String itemName : itemsThatWasChoosen) {
            if (itemName !=  null) {
                Item item = new Item(itemName);
                items.add(item.toString());
            }
        }
        lstChkItems.setAdapter(adapter2);

        frameItemsList.setVisibility(View.GONE);
        frameNewMission.setVisibility(View.VISIBLE);
    }
}
