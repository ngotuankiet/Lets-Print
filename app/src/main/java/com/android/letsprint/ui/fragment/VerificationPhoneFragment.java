package com.android.letsprint.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.letsprint.R;
import com.android.letsprint.databinding.FragmentVerificationPhoneBinding;

public class VerificationPhoneFragment extends Fragment {

    private FragmentVerificationPhoneBinding binding;

    public VerificationPhoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentVerificationPhoneBinding.inflate(inflater, container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding.btnGetOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = VerificationPhoneFragmentDirections.actionVerificationPhoneFragmentToOTPFragment();
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}