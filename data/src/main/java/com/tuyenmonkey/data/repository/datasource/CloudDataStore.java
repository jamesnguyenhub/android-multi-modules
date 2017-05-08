package com.tuyenmonkey.data.repository.datasource;

import com.tuyenmonkey.data.entity.UserEntity;
import com.tuyenmonkey.data.net.GitHubClient;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public class CloudDataStore implements DataStore {
  private GitHubClient client;

  @Override public Observable<List<UserEntity>> getAllUsers() {
    return client.getAllUsers();
  }
}
