package com.tuyenmonkey.amm.userlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.tuyenmonkey.amm.mvp.MvpActivity;

/**
 * Created by Tuyen Monkey on 9/6/17.
 */

public class UsersActivity extends MvpActivity {

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_git_hub_users);
  }
}
