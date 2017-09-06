package com.tuyenmonkey.amm.userlist;

import com.tuyenmonkey.amm.common.dagger.PerActivity;
import dagger.Subcomponent;

/**
 * Created by Tuyen Monkey on 9/6/17.
 */

@PerActivity
@Subcomponent(modules = UsersModule.class)
public interface UsersComponent {
  void inject(UsersActivity usersActivity);
  void inject(UsersFragment usersFragment);
}
