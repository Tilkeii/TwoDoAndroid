package twodo.twodo.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.inflationx.calligraphy3.CalligraphyConfig;
import io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import io.github.inflationx.viewpump.ViewPump;
import io.github.inflationx.viewpump.ViewPumpContextWrapper;
import twodo.twodo.R;

public class RegisterActivity extends AppCompatActivity {

    @BindView(R.id.scroll_view)
    ScrollView scrollView;

    @BindView(R.id.btn_register_register)
    Button btnRegister;

    @BindView(R.id.btn_cancel_register)
    Button btnCancel;

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
        Toast.makeText(getApplicationContext(), "TODO: implement me", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_cancel_register) public void registerButtonPressed(Button button) {
        //Toast.makeText(getApplicationContext(), "TODO: implement me", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
    }

}
