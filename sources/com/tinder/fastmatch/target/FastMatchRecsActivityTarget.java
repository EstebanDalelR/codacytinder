package com.tinder.fastmatch.target;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/tinder/fastmatch/target/FastMatchRecsActivityTarget;", "", "animateBoostButtonCounter", "", "count", "", "dismiss", "dismissPill", "finishActivity", "popPillIfNeeded", "setNewLikesCount", "newCount", "", "showBoostButtonTooltip", "showNewLikesCount", "newCountString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface FastMatchRecsActivityTarget {
    void animateBoostButtonCounter(@NotNull String str);

    void dismiss();

    void dismissPill();

    void finishActivity();

    void popPillIfNeeded();

    void setNewLikesCount(int i);

    void showBoostButtonTooltip();

    void showNewLikesCount(int i, @NotNull String str);
}
