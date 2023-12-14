package com.example.website;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn(View view) {
        String websiteUrl = "https://www.swarnandhraexambranch.com/";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
            startActivity(i);

    }
    public void btn2(View view) {
        String websiteUrl = "https://swarnandhra.ac.in/eceabout.php";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(i);

    }
}
