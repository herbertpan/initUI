package com.example.panmeilong.test1;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.makeramen.roundedimageview.RoundedImageView;

import butterknife.Bind;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_othersinfo_name)                      TextView tv_name;
    @Bind(R.id.im_othersinfo_avatar)                    RoundedImageView im_avatar;
    @Bind(R.id.tv_othersinfo_num_fans)                  TextView tv_num_fans;
    @Bind(R.id.tv_othersinfo_num_follow)                TextView tv_num_follows;
    @Bind(R.id.btn_othersinfo_status)                   Button   btn_status;
    @Bind(R.id.btn_othersinfo_follow)                   Button   btn_follow;
    @Bind(R.id.btn_othersinfo_add_friend)               Button   btn_add_friend;
    @Bind(R.id.tv_othersinfo_sign2)                     TextView tv_sign2;
    @Bind(R.id.tv_othersinfo_num_created_landmark)      TextView tv_num_created_landmark;
    @Bind(R.id.tv_othersinfo_created_landmark1)         TextView tv_created_landmark1;
    @Bind(R.id.tv_othersinfo_created_landmark2)         TextView tv_created_landmark2;
    @Bind(R.id.tv_othersinfo_num_added_landmark)        TextView tv_num_added_landmark;
    @Bind(R.id.tv_othersinfo_added_landmark1)           TextView tv_added_landmark1;
    @Bind(R.id.tv_othersinfo_added_landmark2)           TextView tv_added_landmark2;
    @Bind(R.id.tv_othersinfo_num_post)                  TextView tv_num_post;
    @Bind(R.id.tv_othersinfo_post1)                     TextView tv_post1;
    @Bind(R.id.tv_othersinfo_post2)                     TextView tv_post2;

    private DrawerLayout mDrawerLayout;
    private static final String TAG = "testLONG";
    private LinearLayout rootLayout;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        //butterknife应该定义在哪儿？定义在最上面好像没有关联到。
        RoundedImageView im_avatar = (RoundedImageView) findViewById(R.id.im_othersinfo_avatar);
        Toast.makeText(MainActivity.this, "" + im_avatar.getCornerRadius(), Toast.LENGTH_LONG).show();
        String string = "123";
        Toast.makeText(MainActivity.this, "" + string, Toast.LENGTH_LONG).show();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);

            if(Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
                //将侧边栏顶部延伸至status bar
                mDrawerLayout.setFitsSystemWindows(true);
                //将主页面顶部延伸至status bar;虽默认为false,但经测试,DrawerLayout需显示设置
                mDrawerLayout.setClipToPadding(false);
            }
        }
    }

    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.othersinfo_toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

}
