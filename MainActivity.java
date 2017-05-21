package com.prasad.selectrecyclerviewitems;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CheckBox chk_select_all, chk_select;
    private Button btn_delete_all;

    private ArrayList<ModelExercises> item_list = new ArrayList<>();
    private ModelExercisesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_exercise_for_training);

        initControls();
    }

    private void initControls() {


        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
//        btn_delete_all = (Button) findViewById(R.id.btn_delete_all);


        item_list.add(new ModelExercises("Alpha", false));
        item_list.add(new ModelExercises("Beta", false));
        item_list.add(new ModelExercises("Cup Cake", false));
        item_list.add(new ModelExercises("Donut", false));
        item_list.add(new ModelExercises("Eclair", false));
        item_list.add(new ModelExercises("Froyo", false));
        item_list.add(new ModelExercises("Ginger Bread", false));
        item_list.add(new ModelExercises("Honycomb", false));
        item_list.add(new ModelExercises("Icecream Sandwhich", false));
        item_list.add(new ModelExercises("Jelly Bean", false));
        item_list.add(new ModelExercises("Kitkat", false));
        item_list.add(new ModelExercises("Lolly Pop", false));
        item_list.add(new ModelExercises("Marsh Mallow", false));
        item_list.add(new ModelExercises("Nougat", false));


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ModelExercisesAdapter(item_list);
        recyclerView.setAdapter(mAdapter);

//        btn_delete_all.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }
}