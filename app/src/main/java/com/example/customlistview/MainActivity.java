package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import com.example.customlistview.adapter.CustomAdapter;
import com.example.customlistview.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView) findViewById(R.id.lv_contact);

        ArrayList<Contact>  arrayList = new ArrayList<Contact>();

        Contact contact1 = new Contact(R.drawable.logo, "Võ Anh Nguyên","099 991 xxxx");
        Contact contact2 = new Contact(R.drawable.logo, "Võ Hoàng Lâm","099 991 2222");
        Contact contact3 = new Contact(R.drawable.logo, "Trương Minh Đạt","099 991 3333");
        Contact contact4 = new Contact(R.drawable.logo, "Trần Chí","099 991 5555");
        Contact contact5 = new Contact(R.drawable.logo, "Võ Thanh Thoại","099 991 4444");
        Contact contact6 = new Contact(R.drawable.logo, "Trương Minh Đạt","099 991 3333");
        Contact contact7 = new Contact(R.drawable.logo, "Trần Chí","099 991 5555");
        Contact contact8 = new Contact(R.drawable.logo, "Võ Thanh Thoại","099 991 4444");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);
        arrayList.add(contact7);
        arrayList.add(contact8);
        CustomAdapter customAdapter = new CustomAdapter(this,R.layout.row_item_contact,arrayList);
        lvContact.setAdapter(customAdapter);
    }
}