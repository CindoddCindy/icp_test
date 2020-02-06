package cindodcindy.mobiletest.icptest.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cindodcindy.mobiletest.icptest.BookDetail;
import cindodcindy.mobiletest.icptest.R;
import cindodcindy.mobiletest.icptest.pojo.Book;

public class BookList extends RecyclerView.Adapter<BookList.BookListChild> {


    public List<Book> bookList;
    Context context;


    public  BookList (List<Book> bookList,Context context){
        this.bookList=bookList;
        this.context=context;
    }

    public BookList(cindodcindy.mobiletest.icptest.Book book, List<Book> bookList1) {
        
    }

    @NonNull
    @Override
    public BookListChild onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.booklist, parent, false);
        BookListChild bookListChild = new BookListChild(mView);

        // KucingChildAdapter viewHolder = new KucingChildAdapter(layoutInflater.inflate(R.layout.meow_adapter, viewGroup, false));
        return bookListChild;

    }

    @Override
    public void onBindViewHolder(@NonNull BookListChild holder, int position) {

        final Book book= bookList.get(position);
        holder.textView_book.setText(book.getName());
        holder.cardView_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookDetail.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class BookListChild extends  RecyclerView.ViewHolder{
    public CardView cardView_book;
    public TextView textView_book;
        public BookListChild(@NonNull View itemView) {
            super(itemView);

            cardView_book=itemView.findViewById(R.id.cv_booklist);
            textView_book=itemView.findViewById(R.id.bookname);
        }
    }

}
