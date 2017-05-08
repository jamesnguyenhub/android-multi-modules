package com.tuyenmonkey.data.repository.datasource;

import com.tuyenmonkey.data.entity.UserEntity;
import io.reactivex.Observable;
import java.util.List;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public interface DataStore {
  Observable<List<UserEntity>> getAllUsers();
}
