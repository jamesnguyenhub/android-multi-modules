package com.tuyenmonkey.amm.mvp;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public abstract class BasePresenter<V extends MvpView> {
  private V view;

  public void attachView(V view) {
    this.view = view;
  }

  public void detachView() {
    if (view != null) {
      view = null;
    }
  }

  public V getView() {
    return view != null ? view : getNoOptView();
  }

  abstract public V getNoOptView();
}
