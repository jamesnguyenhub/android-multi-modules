package com.tuyenmonkey.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public abstract class BaseFragment extends Fragment {
  private Unbinder unbinder;

  @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    unbinder = ButterKnife.bind(this, view);
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    if (unbinder != null) {
      unbinder = null;
    }
  }
}
