package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AFragment extends Fragment {
    private TextView mTVFrgment;
    private Activity mActivity;


    public static AFragment newInstance(String text){
        AFragment fragment=new AFragment ();
        Bundle bundle=new Bundle ();
        bundle.putString ("text",text);
        fragment.setArguments (bundle);//传参数
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate (R.layout.fragment_a,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated (view, savedInstanceState);

        //
        mTVFrgment=view.findViewById (R.id.tv_fragement);
        /*if (getActivity ()!=null){
            //
        }
        else {

        }*/

        if (getArguments ()!=null){
            mTVFrgment.setText (getArguments ().getString ("text"));
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach (context);
        /*mActivity= (Activity) context;*///不推荐
    }

    @Override
    public void onDetach() {
        super.onDetach ();
    }

    @Override
    public void onDestroy() {
        super.onDestroy ();
        //取消异步
    }
}
