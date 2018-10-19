package twodo.twodo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
import butterknife.BindView;
import butterknife.ButterKnife;
import twodo.twodo.R;
import twodo.twodo.dto.model.User;

public class ProfileFragment extends Fragment {

    @BindView(R.id.name_profile) TextView name;
    @BindView(R.id.picture_profile) ImageView picture;
    @BindView(R.id.email_profile) TextView email;
    @BindView(R.id.phone_profile) TextView phone;
    @BindView(R.id.address_profile) TextView address;
    @BindView(R.id.spinner1_profile) Spinner spinner1;
    @BindView(R.id.spinner2_profile) Spinner spinner2;
    @BindView(R.id.offer_description_profile) TextView description;
    @BindView(R.id.btn_add_category_profile) Button addCategory;
    @BindView(R.id.btn_save_profile) Button saveProfile;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        name.setText(User.getCurrentUser().getFullname());
        email.setText(User.getCurrentUser().getEmail());
        phone.setText(User.getCurrentUser().getPhone());
        address.setText(User.getCurrentUser().getAddress());

        picture.setOnClickListener(new View.OnClickListener() {
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
    }
}