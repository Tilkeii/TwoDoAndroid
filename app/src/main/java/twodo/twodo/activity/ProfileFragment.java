package twodo.twodo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

import twodo.twodo.R;

public class ProfileFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_profile, container, false);

        ImageView photo = (ImageView) view.findViewById(R.id.imageprofile);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView email = (TextView) view.findViewById(R.id.email);
        TextView phone = (TextView) view.findViewById(R.id.phone);
        TextView address = (TextView) view.findViewById(R.id.address);
        Spinner searchCategory = (Spinner) view.findViewById(R.id.spinner1_profile);
        Spinner offerCategory = (Spinner) view.findViewById(R.id.spinner2_profile);
        TextView description = (TextView) view.findViewById(R.id.description);
        Button addCategory = (Button) view.findViewById(R.id.btn_add_category_profile);
        Button register = (Button) view.findViewById(R.id.btn_register_profile);

        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CropImage.activity()
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setAspectRatio(1,1)
                        .setCropShape(CropImageView.CropShape.OVAL)
                        .setRequestedSize(300, 300)
                        .start(getActivity());
            }
        });

        return view;
    }
}