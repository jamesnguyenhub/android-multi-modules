package com.tuyenmonkey.base;

import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import butterknife.ButterKnife;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

  @Override public void setContentView(@LayoutRes int layoutResID) {
    super.setContentView(layoutResID);
    ButterKnife.bind(this);
  }
}
