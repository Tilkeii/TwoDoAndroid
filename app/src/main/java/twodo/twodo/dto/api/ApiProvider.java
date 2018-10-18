package twodo.twodo.dto.api;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import twodo.twodo.dto.mapper.UserMapper;
import twodo.twodo.dto.model.EUser;
import twodo.twodo.dto.model.User;

public class ApiProvider {

    private static final String API_URL = "https://twodo-api.com/";

    private ApiService apiService;

    public ApiProvider() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(createOkHttpClient())
                .build();

        apiService = retrofit.create(ApiService.class);
    }

    private OkHttpClient createOkHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        return builder.build();
    }

    public void login(String email, String password, final ApiListener<User> listener) {
        apiService.login(email, password).enqueue(new Callback<EUser>() {
            @Override
            public void onResponse(Call<EUser> call, Response<EUser> response) {
                if (listener != null) {
                    User user = new User();

                    if (response.code() == 200) {
                        UserMapper userMapper = new UserMapper();
                        user = userMapper.map(response.body());
                    }

                    listener.onSuccess(user);
                }
            }

            @Override
            public void onFailure(Call<EUser> call, Throwable t) {
                if (listener != null) listener.onError(t);
            }
        });
    }

    public void register(String firstName, String lastName, String email, String phone, String address, String password, final ApiListener<User> listener) {

        apiService.register(firstName, lastName, email, phone, address, password).enqueue(new Callback<EUser>(){

            @Override
            public void onResponse(Call<EUser> call, Response<EUser> response) {
                if(listener != null) {
                    User user = new User();

                    if(response.code() == 200) {
                        UserMapper userMapper = new UserMapper();
                        user = userMapper.map(response.body());
                    }

                    listener.onSuccess(user);

                }
            }

            @Override
            public void onFailure(Call<EUser> call, Throwable t) {
                if (listener != null) listener.onError(t);
            }
        });

    }
}
