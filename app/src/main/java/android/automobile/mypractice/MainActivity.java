package android.automobile.mypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Word word;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        //String[] str={"a","a","a","a","a"};
        word = new Word();
        ArrayList myArray=new ArrayList<Word>();
        for(int i=0;i<100;i++) {
            myArray.add(new Word(i));

        }

        MyAdapter myAdapter=new MyAdapter(myArray);
        RecyclerView recyclerView= findViewById(R.id.list_item);
        //ListView listView = findViewById(R.id.list_item);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
