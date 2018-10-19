package twodo.twodo.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import twodo.twodo.R;
import twodo.twodo.dto.api.ApiListener;
import twodo.twodo.dto.api.ApiProvider;
import twodo.twodo.dto.model.User;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.scroll_view) ScrollView scrollView;
    @BindView(R.id.btn_register_register) Button btnRegister;
    @BindView(R.id.btn_cancel_register) Button btnCancel;
    @BindView(R.id.input_first_name_register) TextView firstname;
    @BindView(R.id.input_last_name_register) TextView lastname;
    @BindView(R.id.input_email_register) TextView email;
    @BindView(R.id.input_phone_register) TextView phone;
    @BindView(R.id.input_address_register) TextView address;
    @BindView(R.id.input_password_register) TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .setDefaultFontPath("fonts/roboto_light.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());

        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    @OnClick(R.id.btn_register_register) public void loginButtonPressed(Button button) {

        ApiProvider apiProvider = new ApiProvider();
        apiProvider.register(
                lastname.getText().toString(),
                firstname.getText().toString(),
                email.getText().toString(),
                phone.getText().toString(),
                address.getText().toString(),
                password.getText().toString(),
                new ApiListener<User>() {
                    @Override
                    public void onSuccess(User response) {
                        Toast.makeText(getApplicationContext(), "Successfully registered!", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        throwable.printStackTrace();
                        Toast.makeText(getApplicationContext(), throwable.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    @OnClick(R.id.btn_cancel_register) public void registerButtonPressed(Button button) {
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }
}
