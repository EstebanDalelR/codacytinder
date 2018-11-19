package com.tinder.feed.usecase;

import com.tinder.common.navigation.CurrentScreenTracker;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10686e;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.common.tracker.recyclerview.rx.ViewVisibleObserver;
import io.reactivex.C3959e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/feed/usecase/ObserveFeedVisible;", "Lcom/tinder/common/tracker/recyclerview/rx/ViewVisibleObserver;", "screenTracker", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "(Lcom/tinder/common/navigation/CurrentScreenTracker;)V", "mapToFeedVisible", "", "screen", "Lcom/tinder/common/navigation/Screen;", "observe", "Lio/reactivex/Observable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.usecase.c */
public final class C11707c implements ViewVisibleObserver {
    /* renamed from: a */
    private final CurrentScreenTracker f38217a;

    @Inject
    public C11707c(@NotNull CurrentScreenTracker currentScreenTracker) {
        C2668g.b(currentScreenTracker, "screenTracker");
        this.f38217a = currentScreenTracker;
    }

    @NotNull
    public C3959e<Boolean> observe() {
        C3959e<Boolean> distinctUntilChanged = this.f38217a.observe().map(new C11708e(new ObserveFeedVisible$observe$1(this))).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "screenTracker\n          …  .distinctUntilChanged()");
        return distinctUntilChanged;
    }

    /* renamed from: a */
    private final boolean m47533a(Screen screen) {
        if (screen instanceof Matches) {
            switch (C9473d.f31774a[((Matches) screen).m43011a().ordinal()]) {
                case 1:
                    return false;
                case 2:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if ((screen instanceof C10686e) == null) {
            return false;
        }
        return true;
    }
}
