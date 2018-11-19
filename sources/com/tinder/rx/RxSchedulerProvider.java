package com.tinder.rx;

import io.reactivex.C15679f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/rx/RxSchedulerProvider;", "", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "rx_release"}, k = 1, mv = {1, 1, 10})
public interface RxSchedulerProvider {
    @NotNull
    C15679f computation();

    @NotNull
    C15679f io();

    @NotNull
    C15679f ui();
}
