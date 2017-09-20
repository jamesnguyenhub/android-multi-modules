package com.tuyenmonkey.androidmultimodules;

import android.app.Application;
import com.tuyenmonkey.amm.common.base.BaseApp;
import com.tuyenmonkey.amm.common.dagger.DaggerHelper;
import com.tuyenmonkey.amm.data.DataModule;
import com.tuyenmonkey.androidmultimodules.di.component.AppComponent;
import com.tuyenmonkey.androidmultimodules.di.module.AppModule;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public class AmmApp extends BaseApp {
  private AppComponent appComponent;

  @Override public void onCreate() {
    super.onCreate();

    setupAppComponent();
  }

  private void setupAppComponent() {
//    appComponent = DaggerAppComponent.builder()
//        .appModule(new AppModule(this))
//        .dataModule(new DataModule(BuildConfig.DEBUG))
//        .build();
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }

  @Override public <T> T makeSubComponent(Object module) {
    return DaggerHelper.makeSubComponent(appComponent, module);
  }

  @Override public void inject(Object target) {
    DaggerHelper.inject(this, target);
  }
}
