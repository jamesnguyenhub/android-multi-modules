package com.tuyenmonkey.amm.common.base;

import android.app.Application;
import android.content.Context;

/**
 * Created by Tuyen Monkey on 9/6/17.
 */

public abstract class BaseApp extends Application {

  private boolean running;

  public static BaseApp from(Context context) {
    return ((BaseApp) context.getApplicationContext());
  }

  public abstract <T> T makeSubComponent(Object module);

  public abstract void inject(Object target);

  public void onStart() {
    running = true;
  }

  public void onStop() {
    running = false;
  }

  public boolean isRunning() {
    return running;
  }
}
