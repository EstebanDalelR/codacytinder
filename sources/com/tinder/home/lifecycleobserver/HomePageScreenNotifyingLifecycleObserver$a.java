package com.tinder.home.lifecycleobserver;

import com.tinder.common.navigation.CurrentScreenNotifier;
import com.tinder.common.navigation.Screen;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/navigation/Screen;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
final class HomePageScreenNotifyingLifecycleObserver$a<T> implements Consumer<Screen> {
    /* renamed from: a */
    final /* synthetic */ HomePageScreenNotifyingLifecycleObserver f38702a;

    HomePageScreenNotifyingLifecycleObserver$a(HomePageScreenNotifyingLifecycleObserver homePageScreenNotifyingLifecycleObserver) {
        this.f38702a = homePageScreenNotifyingLifecycleObserver;
    }

    public /* synthetic */ void accept(Object obj) {
        m47838a((Screen) obj);
    }

    /* renamed from: a */
    public final void m47838a(Screen screen) {
        CurrentScreenNotifier a = HomePageScreenNotifyingLifecycleObserver.a(this.f38702a);
        C2668g.a(screen, "it");
        a.notify(screen);
    }
}
