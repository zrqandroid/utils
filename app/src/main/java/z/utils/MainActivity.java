package z.utils;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;

import z.utils.databinding.HomeBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }

}
