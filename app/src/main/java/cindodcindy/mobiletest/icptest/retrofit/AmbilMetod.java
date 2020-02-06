package cindodcindy.mobiletest.icptest.retrofit;

import cindodcindy.mobiletest.icptest.pojo.GetBookResponse;
import cindodcindy.mobiletest.icptest.pojo.UserLoginResponse;
import cindodcindy.mobiletest.icptest.pojo.UserProfile;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AmbilMetod {

    @FormUrlEncoded
    @POST("users/login")
    Call<UserLoginResponse> userLogin(@Field("username") String name,
                                       @Field("password") String password);

    @GET("users/me")
    Call<UserProfile> userProfile();


    @GET("books")
    Call<GetBookResponse> bookList();



/*
    @FormUrlEncoded
    @PUT("/insert")
    Call<EditRespon> editDataInsert(@Field("id") long id,
                                    @Field("name") String name,
                                    @Field("email") String email,
                                    @Field("password") String password,
                                    @Field("data") String data);




    @FormUrlEncoded
    @PUT("kontak")
    Call<> putKontak(@Field("id") String id,
                                     @Field("nama") String nama,
                                     @Field("nomor") String nomor);
    @FormUrlEncoded
    @HTTP(method = "delete", path = "/insert", hasBody = true)
    Call<DeleteInsertRespon> deleteKontak(@Field("id") long id);


    @DELETE("/insert/{id}")
    Call<DeleteInsertRespon> deteleInsert(@Path("id") long id);

*/



}
