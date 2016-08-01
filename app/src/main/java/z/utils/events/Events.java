package z.utils.events;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import z.utils.DemoActivity;
import z.utils.R;

/**
 * Created by zhuruqiao on 16/7/25.
 */
public class Events {

    public static void click(View view) {
        Context context = view.getContext();
        Intent intent = new Intent();
//        Intent intent1 = new Intent("com.miguan.folder.service.enable");
        intent.setPackage("com.miguan.folder");
        switch (view.getId()) {
            case R.id.tv_on:
                intent.setAction("com.miguan.folder.service.enable");
                Toast.makeText(context, "打开", Toast.LENGTH_SHORT).show();
                context.startService(intent);
                break;
            case R.id.tv_off:
                intent.setAction("com.miguan.folder.service.refuse");
                context.startService(intent);
                Toast.makeText(context, "关闭", Toast.LENGTH_LONG).show();
                break;
        }

    }

    public static void jump2OtherPage(View v) {

        v.getContext().startActivity(new Intent(v.getContext(), DemoActivity.class));


    }
}
