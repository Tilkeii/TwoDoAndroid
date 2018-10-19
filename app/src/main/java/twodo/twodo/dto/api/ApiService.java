package twodo.twodo.dto.api;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import twodo.twodo.dto.model.ECategory;
import twodo.twodo.dto.model.EMatch;
import twodo.twodo.dto.model.EUser;

public interface ApiService {

    @FormUrlEncoded
    @POST("user/")
    Call<EUser> register(@Field("lastname") String lastname, @Field("firstname") String firstname, @Field("email") String email, @Field("phone") String phone, @Field("address") String address, @Field("password") String password);

    @FormUrlEncoded
    @POST("user/login")
    Call<EUser> login(@Field("email") String email, @Field("password") String password);

    @GET("category/getAll") Call<ArrayList<ECategory>> getCategories();

    @FormUrlEncoded
    @PUT("/user/update")
    Call<EUser> saveProfile(@Field("id") Integer id, @Field("firstname") String firstName, @Field("lastname") String lastName, @Field("phone") String phone, @Field("email") String email, @Field("address") String address, @Field("password") String password, @Field("id_category") Integer idCategory);

    @GET("match/getAllMatch/{id}") Call<ArrayList<EMatch>> getMatches(@Path("id") String id);
}
