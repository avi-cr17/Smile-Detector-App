package com.example.mlkitcam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.zip.Inflater;

public class ResultDialouge extends DialogFragment {

    private Button okbutton;
    private TextView result;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_result,container,false);
        String result_text ="";
        okbutton = view.findViewById(R.id.result_ok_button);
        result = view.findViewById(R.id.result_text_view);

        Bundle bundle = getArguments();
        result_text= bundle.getString(LCOfacedetection.result_text);

        result.setText(result_text);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


        return view;
    }
}
