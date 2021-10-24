package phd.rahimi.ahmad.bottomnavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView navigationView;
    TextView textView;
    Button Btn1;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = findViewById(R.id.bottonnav);
        frameLayout = findViewById(R.id.frame_layout);
        textView = findViewById(R.id.textview);
        Btn1 = findViewById(R.id.Btn01);

        textView.setText("HOME");
        frameLayout.setBackgroundColor(Color.GREEN);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){
                    case R.id.men01:
                        frameLayout.setBackgroundColor(Color.GREEN);
                        textView.setText("HOME");
                        Btn1.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.men02:
                        frameLayout.setBackgroundColor(Color.BLUE);
                        textView.setText("PAGE");
                        Btn1.setVisibility(View.INVISIBLE);
                        break;
                    case R.id.men03:
                        frameLayout.setBackgroundColor(Color.GRAY);
                        textView.setText("OTHER");
                        Btn1.setVisibility(View.VISIBLE);
                        break;
                }


                return true;
            }
        });
    }
}