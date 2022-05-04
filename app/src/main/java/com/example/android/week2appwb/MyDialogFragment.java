package com.example.android.week2appwb;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {

    public static String TAG = "MyDialogFragment";

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.d("Fragment LifeCycle: ", "onAttach()");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Fragment LifeCycle: ", "onCreate()");
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Log.d("Fragment LifeCycle: ", "onCreateDialog()");
        return new AlertDialog.Builder(requireContext())
                .setMessage("Перед вами AlertDialog. Хотите закрыть его?")
                .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Fragment LifeCycle: ", "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Fragment LifeCycle: ", "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Fragment LifeCycle: ", "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Fragment LifeCycle: ", "onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Fragment LifeCycle: ", "onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Fragment LifeCycle: ", "onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Fragment LifeCycle: ", "onDetach()");
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        Log.d("Fragment LifeCycle: ", "onDismiss()");
    }

    @Override
    public void onCancel(@NonNull DialogInterface dialog) {
        super.onCancel(dialog);
        Log.d("Fragment LifeCycle: ", "onCancel()");
    }
}
