package com.tuyenmonkey.androidmultimodules;

import com.tuyenmonkey.amm.common.base.AppConfig;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

public class AppConfigImpl implements AppConfig {
  @Override public boolean debug() {
    return BuildConfig.DEBUG;
  }

  @Override public String applicationId() {
    return BuildConfig.APPLICATION_ID;
  }

  @Override public String gitHubBaseUrl() {
    return BuildConfig.GIT_HUB_BASE_URL;
  }
}
