package com.example.myfirstapp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PostFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PostFragment extends Fragment {

    @Nullable

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;

    public PostFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PostFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PostFragment newInstance(String param1, String param2) {
        PostFragment fragment = new PostFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_post, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

        datamodel ob1 = new datamodel(R.drawable.banyantree, "榕樹", "banyan tree");
        dataholder.add(ob1);

        datamodel ob2 = new datamodel(R.drawable.dandelion, "蒲公英", "dandelion");
        dataholder.add(ob2);

        datamodel ob3 = new datamodel(R.drawable.hibiscus, "水芙蓉", "hibiscus");
        dataholder.add(ob3);

        datamodel ob4 = new datamodel(R.drawable.maple, "楓葉樹", "maple");
        dataholder.add(ob4);

        datamodel ob5 = new datamodel(R.drawable.pine, "松樹", "pine");
        dataholder.add(ob5);

        datamodel ob6 = new datamodel(R.drawable.banyantree, "榕樹", "banyan tree");
        dataholder.add(ob6);

        datamodel ob7 = new datamodel(R.drawable.dandelion, "蒲公英", "dandelion");
        dataholder.add(ob7);

        datamodel ob8 = new datamodel(R.drawable.hibiscus, "水芙蓉", "hibiscus");
        dataholder.add(ob8);

        datamodel ob9 = new datamodel(R.drawable.maple, "楓葉樹", "maple");
        dataholder.add(ob9);

        datamodel ob10 = new datamodel(R.drawable.pine, "松樹", "pine");
        dataholder.add(ob10);

        recyclerView.setAdapter(new myadapter(dataholder));

        return view;
    }
}