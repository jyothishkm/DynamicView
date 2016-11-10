package com.example.bridgeit.dynamicallyview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
LinearLayout mLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayout = (LinearLayout)findViewById(R.id.linear_layout);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                                                                            ActionBar.LayoutParams.WRAP_CONTENT);

   for (int i = 0; i<4; i++) {

       LinearLayout linearLayoutl = new LinearLayout(this);
       linearLayoutl.setOrientation(LinearLayout.VERTICAL);

       //creating textview
       TextView product = new TextView(this);
       product.setText(" Product"+i+"    ");
       linearLayoutl.addView(product);

       TextView price = new TextView(this);
       product.setText(" $"+i+"    ");
       linearLayoutl.addView(price);

       //creating Button
       Button btn = new Button(this);
btn.setId(i + 1);
       btn.setText("Add To Cart");
       btn.setLayoutParams(params);

final int index = i+1;


       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "postion:"+index, Toast.LENGTH_SHORT).show();
           }
       });
       //Add button to LinearLayout
       linearLayoutl.addView(btn);
       //Add button to LinearLayout defined in XML
       mLayout.addView(linearLayoutl);
   }
    }
}
