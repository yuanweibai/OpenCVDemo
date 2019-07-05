package com.rango.tool.opencvdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    private ImageView newImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newImageView = findViewById(R.id.new_image_view);
        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        findViewById(R.id.reset_btn).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

            }
        });

        findViewById(R.id.set_btn).setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

            }
        });
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    public native void getEdge(Object bitmap);
}
