package twodo.twodo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import twodo.twodo.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button back = (Button) findViewById(R.id.back);
        ImageView photo = (ImageView) findViewById(R.id.photo);
        TextView name = (TextView) findViewById(R.id.name);
        TextView age = (TextView) findViewById(R.id.age);
        TextView phone = (TextView) findViewById(R.id.phone);
        TextView email = (TextView) findViewById(R.id.email);
        TextView address = (TextView) findViewById(R.id.address);
        TextView category = (TextView) findViewById(R.id.category);
        TextView description = (TextView) findViewById(R.id.description);

        Intent i = getIntent();

        if (i !=null && i.getExtras()!=null) {

            String photoStr = i.getExtras().getString("photo");
            String nameStr = i.getExtras().getString("name");
            String ageStr = i.getExtras().getString("age");
            String phoneStr = i.getExtras().getString("phone");
            String emailStr = i.getExtras().getString("email");
            String addressStr = i.getExtras().getString("address");
            String categoryStr = i.getExtras().getString("category");
            String descriptionStr = i.getExtras().getString("description");

            if (photoStr != null && photoStr != "") {
                //INSERER PHOTO
            }

            if (nameStr != null && nameStr != "") {
                name.setText(nameStr);
            }

            if (ageStr != null && ageStr != "") {
                age.setText(ageStr);
            }

            if (phoneStr != null && phoneStr != "") {
                phone.setText(phoneStr);
            }

            if (emailStr != null && emailStr != "") {
                email.setText(emailStr);
            }

            if (addressStr != null && addressStr != "") {
                address.setText(addressStr);
            }

            if (categoryStr != null && categoryStr != "") {
                category.setText(categoryStr);
            }

            if (descriptionStr != null && descriptionStr != "") {
                description.setText(descriptionStr);
            }
        }

        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
