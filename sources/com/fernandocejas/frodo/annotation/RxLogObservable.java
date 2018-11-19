package com.fernandocejas.frodo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RxLogObservable {

    public enum Scope {
        EVERYTHING,
        STREAM,
        SCHEDULERS,
        EVENTS,
        NOTHING
    }

    Scope value() default Scope.EVERYTHING;
}
