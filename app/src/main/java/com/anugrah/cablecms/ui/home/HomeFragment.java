package com.anugrah.cablecms.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.anugrah.cablecms.R;
import com.anugrah.cablecms.addNewUserpage;
import com.anugrah.cablecms.addNewWorkerPage;
import com.anugrah.cablecms.viewComplaintsPage;
import com.anugrah.cablecms.viewCustomerAccount;
import com.anugrah.cablecms.viewNotificationPage;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    Button bt1, bt2, bt3, bt4, bt5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        bt1 = (Button) root.findViewById(R.id.addnewuserbt);
        bt2 = (Button) root.findViewById(R.id.addNewWorkerBt);
        bt3 = (Button) root.findViewById(R.id.viewComplaintsBt);
        bt4 = (Button) root.findViewById(R.id.viewNotificationBt);
        bt5 = (Button) root.findViewById(R.id.viewCustomerAccountBt);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), addNewUserpage.class);
                startActivity(intent);

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), addNewWorkerPage.class);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), viewComplaintsPage.class);
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), viewNotificationPage.class);
                startActivity(intent);

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getActivity(), viewCustomerAccount.class);
                startActivity(intent);
            }
        });


        return root;
    }
}
