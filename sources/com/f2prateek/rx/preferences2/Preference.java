package com.f2prateek.rx.preferences2;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import io.reactivex.C3959e;
import io.reactivex.functions.Consumer;

public interface Preference<T> {

    public interface Converter<T> {
        @NonNull
        T deserialize(@NonNull String str);

        @NonNull
        String serialize(@NonNull T t);
    }

    @CheckResult
    @NonNull
    Consumer<? super T> asConsumer();

    @CheckResult
    @NonNull
    C3959e<T> asObservable();

    @NonNull
    T defaultValue();

    void delete();

    @NonNull
    T get();

    boolean isSet();

    @NonNull
    String key();

    void set(@NonNull T t);
}
