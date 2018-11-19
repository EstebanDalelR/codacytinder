package com.tinder.common.navigation;

import com.tinder.app.AppVisibilityTracker;
import com.tinder.app.AppVisibilityTracker$Visibility;
import com.tinder.common.navigation.Screen.C10683b;
import com.tinder.common.provider.C8549a;
import io.reactivex.C3959e;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/common/navigation/CurrentScreenNotifierAndTracker;", "Lcom/tinder/common/navigation/CurrentScreenNotifier;", "Lcom/tinder/common/navigation/CurrentScreenTracker;", "currentScreenProvider", "Lcom/tinder/common/provider/CurrentScreenProvider;", "appVisibilityTracker", "Lcom/tinder/app/AppVisibilityTracker;", "(Lcom/tinder/common/provider/CurrentScreenProvider;Lcom/tinder/app/AppVisibilityTracker;)V", "mapVisibilityToScreen", "Lio/reactivex/Observable;", "Lcom/tinder/common/navigation/Screen;", "visibility", "Lcom/tinder/app/AppVisibilityTracker$Visibility;", "notify", "", "currentScreen", "observe", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.common.navigation.a */
public final class C10694a implements CurrentScreenNotifier, CurrentScreenTracker {
    /* renamed from: a */
    private final C8549a f35035a;
    /* renamed from: b */
    private final AppVisibilityTracker f35036b;

    @Inject
    public C10694a(@NotNull C8549a c8549a, @NotNull AppVisibilityTracker appVisibilityTracker) {
        C2668g.b(c8549a, "currentScreenProvider");
        C2668g.b(appVisibilityTracker, "appVisibilityTracker");
        this.f35035a = c8549a;
        this.f35036b = appVisibilityTracker;
    }

    public void notify(@NotNull Screen screen) {
        C2668g.b(screen, "currentScreen");
        this.f35035a.m36533a(screen);
    }

    @NotNull
    public C3959e<Screen> observe() {
        C3959e<Screen> switchMap = this.f35036b.trackVisibility().switchMap(new C10695c(new CurrentScreenNotifierAndTracker$observe$1(this)));
        C2668g.a(switchMap, "appVisibilityTracker.tra…(::mapVisibilityToScreen)");
        return switchMap;
    }

    /* renamed from: a */
    private final C3959e<Screen> m43012a(AppVisibilityTracker$Visibility appVisibilityTracker$Visibility) {
        switch (C8547b.f30291a[appVisibilityTracker$Visibility.ordinal()]) {
            case 1:
                appVisibilityTracker$Visibility = C3959e.just(C10683b.f35024a);
                C2668g.a(appVisibilityTracker$Visibility, "Observable.just(Screen.Background)");
                return appVisibilityTracker$Visibility;
            case 2:
                return this.f35035a.m36532a();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
