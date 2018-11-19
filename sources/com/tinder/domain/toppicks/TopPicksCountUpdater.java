package com.tinder.domain.toppicks;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/tinder/domain/toppicks/TopPicksCountUpdater;", "", "decrement", "", "i", "", "increment", "set", "domain_release"}, k = 1, mv = {1, 1, 10})
public interface TopPicksCountUpdater {

    @Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
    public static final class DefaultImpls {
        public static /* synthetic */ void increment$default(TopPicksCountUpdater topPicksCountUpdater, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: increment");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            topPicksCountUpdater.increment(i);
        }

        public static /* synthetic */ void decrement$default(TopPicksCountUpdater topPicksCountUpdater, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrement");
            }
            if ((i2 & 1) != 0) {
                i = 1;
            }
            topPicksCountUpdater.decrement(i);
        }
    }

    void decrement(int i);

    void increment(int i);

    void set(int i);
}
