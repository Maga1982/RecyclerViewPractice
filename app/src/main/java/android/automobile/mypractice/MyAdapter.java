package android.automobile.mypractice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
    Word word;
    ArrayList<Word> myArray;


    public MyAdapter( ArrayList<Word> myArray) {

this.myArray=myArray;
    }

    // ViewHolder class
    public class ViewHolder extends  RecyclerView.ViewHolder implements  View.OnClickListener{

        public TextView textView;
        public Context context;
        public ViewHolder(View myview,Context context){
            super(myview);
        this.context=context;
        textView= myview.findViewById(R.id.textview_id);
        myview.setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Word word=myArray.get(position);
            String num=Integer.toString(word.getNumber());
            Toast.makeText(context,num,Toast.LENGTH_SHORT).show();

        }
    }
    //oncreate view holder
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewtype){
        Context context = parent.getContext();
        View myView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(myView,context);
        return viewHolder;

    }
    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder viewHolder,int position){
        Word word=myArray.get(position);
        String myText=  String.valueOf(word.getNumber());
        Log.v("text",myText);
        TextView textView = viewHolder.textView;
        textView.setText(myText);
    }

    @Override
    public int getItemCount() {
        return myArray.size();
    }




  /*  @NonNull
    @Override
   public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View myView= convertView;
        if(myView == null)
            myView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        Word word=getItem(position);
        String myText=  String.valueOf(word.getNumber());
        Log.v("text",myText);
        TextView textView = myView.findViewById(R.id.textview_id);
        textView.setText(myText);
        return myView;
    }*/
}
