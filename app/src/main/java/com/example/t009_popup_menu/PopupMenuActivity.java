package com.example.t009_popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {

    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        btn = findViewById(R.id.showpopupmenu);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getApplicationContext(),btn);
                popupMenu.inflate(R.menu.popupmenufile);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.fax:
                                Toast.makeText(getApplicationContext(), "Popup Item Selected 'Fax'", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.call:
                                Toast.makeText(getApplicationContext(), "Popup Item Selected 'Call'", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.sms:
                                Toast.makeText(getApplicationContext(), "Popup Item Selected 'SMS'", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.email:
                                Toast.makeText(getApplicationContext(), "Popup Item Selected 'Email'", Toast.LENGTH_SHORT).show();
                                break;
                        }

                        return false;
                    }
                });
                popupMenu.show();
            }
        });

    }
}