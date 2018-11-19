package com.tinder.match.navigation;

import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent.Kind;
import com.tinder.common.navigation.Screen.Matches.Subscreen;
import com.tinder.match.p291b.C12042a;
import com.tinder.match.provider.C9879g;
import com.tinder.match.provider.C9879g.C9878a;
import io.reactivex.C3959e;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/match/navigation/MatchTabSubscreenTracker;", "Lcom/tinder/match/navigation/MatchSubscreensTracker;", "matchTabSelectedProvider", "Lcom/tinder/match/provider/MatchesTabSelectedProvider;", "matchTabsPageSubscreenMapper", "Lcom/tinder/match/mapper/MatchTabsPageSubscreenMapper;", "(Lcom/tinder/match/provider/MatchesTabSelectedProvider;Lcom/tinder/match/mapper/MatchTabsPageSubscreenMapper;)V", "observe", "Lio/reactivex/Observable;", "Lcom/tinder/common/navigation/Screen$Matches$Subscreen;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.navigation.b */
public final class C12057b implements MatchSubscreensTracker {
    /* renamed from: a */
    private final C9879g f39198a;
    /* renamed from: b */
    private final C12042a f39199b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/match/provider/MatchesTabSelectedProvider$TabSelectedEvent;", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.navigation.b$a */
    static final class C12056a<T> implements Predicate<C9878a> {
        /* renamed from: a */
        public static final C12056a f39197a = new C12056a();

        C12056a() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m48165a((C9878a) obj);
        }

        /* renamed from: a */
        public final boolean m48165a(@NotNull C9878a c9878a) {
            C2668g.b(c9878a, "it");
            return c9878a.m40641b() == Kind.SELECTED ? true : null;
        }
    }

    public C12057b(@NotNull C9879g c9879g, @NotNull C12042a c12042a) {
        C2668g.b(c9879g, "matchTabSelectedProvider");
        C2668g.b(c12042a, "matchTabsPageSubscreenMapper");
        this.f39198a = c9879g;
        this.f39199b = c12042a;
    }

    @NotNull
    public C3959e<Subscreen> observe() {
        C3959e filter = this.f39198a.m40642a().filter(C12056a.f39197a);
        Function1 function1 = MatchTabSubscreenTracker$observe$2.f45345a;
        if (function1 != null) {
            function1 = new C12058c(function1);
        }
        C3959e<Subscreen> map = filter.map((Function) function1).distinctUntilChanged().map(new C12058c(new MatchTabSubscreenTracker$observe$3(this.f39199b)));
        C2668g.a(map, "matchTabSelectedProvider…PageSubscreenMapper::map)");
        return map;
    }
}
