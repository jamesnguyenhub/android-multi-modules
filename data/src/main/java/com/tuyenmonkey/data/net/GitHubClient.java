package com.tuyenmonkey.data.net;

import android.support.annotation.NonNull;
import com.tuyenmonkey.data.entity.UserEntity;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public class GitHubClient {
  private GitHubService service;

  public GitHubClient(@NonNull GitHubService service) {
    this.service = service;
  }

  public Observable<List<UserEntity>> getAllUsers() {
    return service.getAllUsers();
  }
}
