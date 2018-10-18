package twodo.twodo.dto.api;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import twodo.twodo.dto.model.EUser;

public interface ApiService {

    @FormUrlEncoded
    @POST("users/login/")
    Call<EUser> login(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("user/")
    Call<EUser> register(@Field("first_name") String firstName, @Field("last_name") String lastName, @Field("email") String email, @Field("phone") String phone, @Field("address") String address, @Field("password") String password);
}
