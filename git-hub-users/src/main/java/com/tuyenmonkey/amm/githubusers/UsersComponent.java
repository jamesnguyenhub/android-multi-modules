package com.tuyenmonkey.amm.githubusers;

import com.tuyenmonkey.amm.common.dagger.PerActivity;
import dagger.Subcomponent;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

@PerActivity
@Subcomponent(modules = UsersModule.class)
public interface UsersComponent {
  void inject(UsersActivity usersActivity);
}
