package twodo.twodo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import twodo.twodo.R;
import twodo.twodo.dto.api.ApiListener;
import twodo.twodo.dto.api.ApiProvider;
import twodo.twodo.dto.model.Category;
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

<<<<<<< HEAD
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
=======
        ApiProvider apiProvider = new ApiProvider();
        apiProvider.getCategories(new ApiListener<ArrayList<Category>>() {
            @Override
            public void onSuccess(ArrayList<Category> response) {
                List<String> categoryList = new ArrayList<>();

                for(Category category: response) {
                    categoryList.add(category.getName());
                }

                ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_item, categoryList);
                adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner1.setAdapter(adapter1);

                ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_item, categoryList);
                adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinner2.setAdapter(adapter2);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                Toast.makeText(getActivity().getApplicationContext(), throwable.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.btn_save_profile) public void saveProfileButtonPressed(Button button) {
        // TODO
>>>>>>> Hydrate my profile fragment - 2
    }
}