package com.tuyenmonkey.amm.common.dagger;

import android.content.Context;
import java.lang.reflect.Method;

/**
 * Created by Tuyen Monkey on 9/6/17.
 */

public final class DaggerHelper {

  public static final String DAGGER_COMPONENT = "DaggerComponent";

  private DaggerHelper() {
    //no instance
  }

  @SuppressWarnings("unchecked")
  public static <T> T makeSubComponent(Object component, Object module) {
    final Class<?> componentClass = component.getClass();
    final Method plusMethod = findMethod(componentClass, "plus", module);
    try {
      return (T) plusMethod.invoke(component, module);
    } catch (Exception e) {
      throw new IllegalArgumentException("can not create component with " + module.getClass()
          .getName());
    }
  }

  @SuppressWarnings("WrongConstant") public static void inject(Context context, Object target) {
    final Object daggerComponent = context.getSystemService(DaggerHelper.DAGGER_COMPONENT);
    if (daggerComponent == null) {
      throw new IllegalArgumentException(context.getClass().getName()
          + " should provide DaggerComponent via Context.getSystemService(DaggerHelper"
          + ".DAGGER_COMPONENT)");
    }
    try {
      injectDependencies(daggerComponent, target);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  static void injectDependencies(Object component, Object target) {
    final Class<?> componentClass = component.getClass();
    final Method injectMethod = findMethod(componentClass, "inject", target);
    try {
      injectMethod.invoke(component, target);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static Method findMethod(Class<?> target, String name, Object parameter) {
    try {
      return target.getDeclaredMethod(name, parameter.getClass());
    } catch (NoSuchMethodException e) {
      throw new IllegalArgumentException(
          "Can not find method"
              + target.getName()
              + "."
              + name
              + "("
              + parameter
              + ")",
          e);
    }
  }
}
