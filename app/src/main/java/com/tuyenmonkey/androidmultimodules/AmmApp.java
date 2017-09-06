package com.tuyenmonkey.androidmultimodules;

import android.app.Application;
import com.tuyenmonkey.amm.data.DataModule;
import com.tuyenmonkey.androidmultimodules.di.component.AppComponent;
import com.tuyenmonkey.androidmultimodules.di.component.DaggerAppComponent;
import com.tuyenmonkey.androidmultimodules.di.module.AppModule;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public class AmmApp extends Application {
  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();

    setupAppComponent();
  }

  private void setupAppComponent() {
    appComponent = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .dataModule(new DataModule(BuildConfig.DEBUG))
        .build();

    appComponent.inject(this);
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }
}
