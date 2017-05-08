package com.tuyenmonkey.data.repository.datasource;

import com.tuyenmonkey.data.entity.UserEntity;
import io.reactivex.Observable;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public class CacheDataStore implements DataStore {
  @Override public Observable<List<UserEntity>> getAllUsers() {
    return Observable.just(Collections.<UserEntity>emptyList());
  }
}
