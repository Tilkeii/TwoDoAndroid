package twodo.twodo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import twodo.twodo.R;

public class MatchingFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_matching, container, false);

        ImageView photo = (ImageView) view.findViewById(R.id.photo);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView age = (TextView) view.findViewById(R.id.age);
        TextView description = (TextView) view.findViewById(R.id.description);
        Button pass = (Button) view.findViewById(R.id.pass);
        Button like = (Button) view.findViewById(R.id.like);

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("PASS");
            }
        });

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("LIKE");
            }
        });

        return view;
    }
}