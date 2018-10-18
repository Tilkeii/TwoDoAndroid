package twodo.twodo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
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

public class LoginActivity  extends AppCompatActivity {

    @BindView(R.id.input_email_login)
    EditText email;

    @BindView(R.id.input_password_login)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewPump.init(ViewPump.builder()
                .addInterceptor(new CalligraphyInterceptor(
                        new CalligraphyConfig.Builder()
                                .setDefaultFontPath("fonts/roboto_light.ttf")
                                .setFontAttrId(R.attr.fontPath)
                                .build()))
                .build());

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    @OnClick(R.id.btn_login_login) public void loginButtonPressed(Button button) {
        ApiProvider apiProvider = new ApiProvider();
        apiProvider.login(email.getText().toString(), password.getText().toString(), new ApiListener<User>() {
            @Override
            public void onSuccess(User response) {
                Toast.makeText(getApplicationContext(), "Successfully logged in!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
                Toast.makeText(getApplicationContext(), throwable.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @OnClick(R.id.btn_register_login) public void registerButtonPressed(Button button) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }
}
