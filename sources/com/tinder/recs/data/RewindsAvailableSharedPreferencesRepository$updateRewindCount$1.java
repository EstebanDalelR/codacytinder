package com.tinder.recs.data;

import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
final class RewindsAvailableSharedPreferencesRepository$updateRewindCount$1<V> implements Callable<Object> {
    final /* synthetic */ int $rewindCount;
    final /* synthetic */ RewindsAvailableSharedPreferencesRepository this$0;

    RewindsAvailableSharedPreferencesRepository$updateRewindCount$1(RewindsAvailableSharedPreferencesRepository rewindsAvailableSharedPreferencesRepository, int i) {
        this.this$0 = rewindsAvailableSharedPreferencesRepository;
        this.$rewindCount = i;
    }

    public final void call() {
        this.this$0.sharedPreferences.edit().putInt("rewinds_available", this.$rewindCount).apply();
    }
}
