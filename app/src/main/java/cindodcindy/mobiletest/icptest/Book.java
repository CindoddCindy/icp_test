package cindodcindy.mobiletest.icptest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cindodcindy.mobiletest.icptest.adapter.BookList;
import cindodcindy.mobiletest.icptest.pojo.DataBook;
import cindodcindy.mobiletest.icptest.pojo.DataUser;
import cindodcindy.mobiletest.icptest.pojo.GetBookResponse;
import cindodcindy.mobiletest.icptest.pojo.UserProfile;
import cindodcindy.mobiletest.icptest.retrofit.AmbilMetod;
import cindodcindy.mobiletest.icptest.retrofit.RetroUrl;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Book extends AppCompatActivity {

    RecyclerView recyclerView;
    BookList bookList ;
    List<cindodcindy.mobiletest.icptest.pojo.Book> bookList1 = new ArrayList<>();

    RetroUrl retroUrl;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        recyclerView = findViewById(R.id.rv_booklist);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    public void getBookListRv(){

        AmbilMetod ambilMetod   = RetroUrl.getRetrofit().create(AmbilMetod.class);


        Call<GetBookResponse> bookResponseCall = ambilMetod.bookList();
        bookResponseCall.enqueue(new Callback<GetBookResponse>() {
            @Override
            public void onResponse(@Nullable Call<GetBookResponse> call, @Nullable Response<GetBookResponse> response) {
                GetBookResponse getBookResponse = response.body();
                DataBook dataBook =getBookResponse.getData();

                if (response.isSuccessful()) {
                    Log.d("Server Response", "failed" + getBookResponse.getData());

                    bookList1= dataBook.getBooks();
                    BookList bookList = new BookList(Book.this, bookList1);
                    recyclerView.setAdapter(bookList);



                }


            }

            @Override
            public void onFailure(Call<GetBookResponse> call, Throwable t) {
                //hidepDialog();
                Log.d("onFailure", t.toString());
            }
        });



    }

}
