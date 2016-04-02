package info.androidhive.materialdesign.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import info.androidhive.materialdesign.R;

/**
 * Created by Ravi on 29/07/15.
 */
public class MessagesFragment extends Fragment {

    String title;
    Integer price;
    Button button;
    EditText title2,price2,description;

    public MessagesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        title2 = (EditText)getActivity().findViewById(R.id.title);
        price2= (EditText)getActivity().findViewById(R.id.price);
        description = (EditText)getActivity().findViewById(R.id.editText4);
        button = (Button)getActivity().findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                title=title2.getText().toString();
                price=Integer.parseInt(price2.getText().toString());
                title2.setText("");
                price2.setText("");
                description.setText("");


            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_messages, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
