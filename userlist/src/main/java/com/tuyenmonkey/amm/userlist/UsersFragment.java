package com.tuyenmonkey.amm.userlist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tuyenmonkey.amm.mvp.MvpFragment;

/**
 * Created by Tuyen Monkey on 9/6/17.
 */

public class UsersFragment extends MvpFragment {

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_git_hub_users, container, false);
  }
}
