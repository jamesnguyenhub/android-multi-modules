package com.tuyenmonkey.androidmultimodules.di.component;

import com.tuyenmonkey.androidmultimodules.AmmApp;
import com.tuyenmonkey.androidmultimodules.di.module.AppModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

@Singleton
@Component(modules = {
    AppModule.class
})
public interface AppComponent {
  void inject(AmmApp ammApp);
}
