package com.tinder.common.tracker.recyclerview.adapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/tinder/common/tracker/recyclerview/adapter/TrackerAdapter;", "", "itemIdAtPosition", "", "position", "", "positionForId", "id", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface TrackerAdapter {
    @NotNull
    String itemIdAtPosition(int i);

    int positionForId(@NotNull String str);
}
