package com.tinder.toppicks.counter;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/toppicks/counter/TopPicksBottomCounterTarget;", "", "hideLoading", "", "showLoading", "updateCount", "newCount", "", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksBottomCounterTarget {
    void hideLoading();

    void showLoading();

    void updateCount(int i);
}
