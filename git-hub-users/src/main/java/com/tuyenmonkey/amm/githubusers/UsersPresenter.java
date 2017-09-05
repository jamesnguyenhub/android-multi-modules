package com.tuyenmonkey.amm.githubusers;

import com.tuyenmonkey.amm.mvp.BasePresenter;
import com.tuyenmonkey.amm.mvp.MvpView;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public class UsersPresenter extends BasePresenter<UsersView> {

  @Override public UsersView getNoOptView() {
    return null;
  }
}
