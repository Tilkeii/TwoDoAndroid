package twodo.twodo.dto.api;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import twodo.twodo.dto.mapper.CategoryMapper;
import twodo.twodo.dto.mapper.UserMapper;
import twodo.twodo.dto.model.Category;
import twodo.twodo.dto.model.ECategory;
import twodo.twodo.dto.model.EUser;
import twodo.twodo.dto.model.User;

public class ApiProvider {

    private static final String API_URL = "http://52.47.107.0/";
    /*private static final String API_URL = "http://10.0.2.2:5000/";*/

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
                    if (response.code() == 200) {
                        UserMapper userMapper = new UserMapper();
                        User user = userMapper.map(response.body());
                        listener.onSuccess(user);
                    } else {
                        listener.onError(new Throwable(response.message()));
                    }
                }
            }

            @Override
            public void onFailure(Call<EUser> call, Throwable t) {
                if (listener != null) listener.onError(t);
            }
        });
    }

    public void getCategories(final ApiListener<ArrayList<Category>> listener) {
        apiService.getCategories().enqueue(new Callback<ArrayList<ECategory>>() {
            @Override
            public void onResponse(Call<ArrayList<ECategory>> call, Response<ArrayList<ECategory>> response) {
                if (listener != null) {
                    CategoryMapper categoryMapper = new CategoryMapper();
                    ArrayList<Category> categoryList = categoryMapper.map(response.body());
                    listener.onSuccess(categoryList);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<ECategory>> call, Throwable t) {
                if (listener != null) listener.onError(t);
            }
        });
    }
}
