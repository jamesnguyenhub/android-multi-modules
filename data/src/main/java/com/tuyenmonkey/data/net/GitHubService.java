package com.tuyenmonkey.data.net;

import com.tuyenmonkey.data.entity.UserEntity;
import io.reactivex.Observable;
import java.util.List;
import retrofit2.http.GET;

/**
 * Created by Tuyen Monkey on 5/8/17.
 */

public interface GitHubService {
  @GET("users") Observable<List<UserEntity>> getAllUsers();
}
