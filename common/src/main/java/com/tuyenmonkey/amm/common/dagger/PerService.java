package com.tuyenmonkey.amm.common.dagger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * Created by Tuyen Monkey on 9/5/17.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerService {
}
