package com.tinder.common.reactivex.schedulers;

import io.reactivex.C15679f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/common/reactivex/schedulers/Schedulers;", "", "computation", "Lio/reactivex/Scheduler;", "io", "mainThread", "trampoline", "reactivex"}, k = 1, mv = {1, 1, 10})
public interface Schedulers {
    @NotNull
    C15679f computation();

    @NotNull
    C15679f io();

    @NotNull
    C15679f mainThread();

    @NotNull
    C15679f trampoline();
}
