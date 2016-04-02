package info.androidhive.materialdesign.activity;

/**
 * Created by Ravi on 29/07/15.
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import info.androidhive.materialdesign.R;


public class HomeFragment extends Fragment implements View.OnClickListener {

    Context context;
    Button button,button2;
    TextView title1;
    //TextView textView2=(TextView)getView().findViewById(R.id.textView2);
    //TextView textView3=(TextView)getView().findViewById(R.id.textView3);
    //TextView textView4=(TextView)getView().findViewById(R.id.textView4);
    //TextView textView5=(TextView)getView().findViewById(R.id.textView5);
    //TextView textView6=(TextView)getView().findViewById(R.id.textView6);
    //TextView textView7=(TextView)getView().findViewById(R.id.textView7);
    //TextView textView8=(TextView)getView().findViewById(R.id.textView8);
    //TextView textView9=(TextView)getView().findViewById(R.id.textView9);
    //TextView textView10=(TextView)getView().findViewById(R.id.textView10);
    //TextView textView11=(TextView)getView().findViewById(R.id.textView11);
    //ImageView imageView =(ImageView)getView().findViewById(R.id.imageView);
    //ImageView imageView2 =(ImageView)getView().findViewById(R.id.imageView2);
    //ImageView imageView3 =(ImageView)getView().findViewById(R.id.imageView3);
    //Button entry1=(Button)getView().findViewById(R.id.entry1);
    //Button entry2=(Button)getView().findViewById(R.id.entry2);



    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            Button entry1 = (Button) getActivity().findViewById(R.id.entry1);




            //button.setOnClickListener(new View.OnClickListener() {
                //@Override
                //public void onClick(View view) {

                    //button2.setVisibility(View.INVISIBLE);
                    //textView2.setVisibility(View.VISIBLE);
                    //textView3.setVisibility(View.VISIBLE);
                    //textView4.setVisibility(View.VISIBLE);
                    //textView5.setVisibility(View.VISIBLE);
                    //textView6.setVisibility(View.VISIBLE);
                    //textView7.setVisibility(View.VISIBLE);
                    //textView8.setVisibility(View.VISIBLE);
                    //textView9.setVisibility(View.VISIBLE);
                    //textView10.setVisibility(View.VISIBLE);
                    //textView11.setVisibility(View.VISIBLE);
                    //imageView.setVisibility(View.VISIBLE);
                    //imageView2.setVisibility(View.VISIBLE);
                    //imageView3.setVisibility(View.VISIBLE);
                    //entry1.setVisibility(View.VISIBLE);
                    //entry2.setVisibility(View.VISIBLE);
                    //entry3.setVisibility(View.VISIBLE);

                //}

            //});
           /* try {
                entry1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getActivity(), MainActivity.class);
                        startActivity(i);
                    }
                });
            }catch (Exception e){
                e.printStackTrace();
            }*/



    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);



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

    @Override
    public void onClick(View view) {
        System.out.println("omg works!");
    }
}
