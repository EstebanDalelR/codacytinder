package com.jakewharton.rxbinding2.internal;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestrictTo({Scope.LIBRARY_GROUP})
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface GenericTypeNullable {
}
