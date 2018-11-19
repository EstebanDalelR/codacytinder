package com.tinder.api.annotation;

import com.squareup.moshi.JsonQualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@JsonQualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonObjectOrFalse {
}
