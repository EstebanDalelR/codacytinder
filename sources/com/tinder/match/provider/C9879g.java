package com.tinder.match.provider;

import android.support.annotation.UiThread;
import com.jakewharton.rxbinding.support.design.widget.TabLayoutSelectionEvent.Kind;
import com.tinder.common.p078c.C2642a;
import com.tinder.match.viewmodel.MatchTabsPage;
import io.reactivex.C3959e;
import io.reactivex.subjects.C19040a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nJ\b\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/match/provider/MatchesTabSelectedProvider;", "", "mainThreadExecutionVerifier", "Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;", "(Lcom/tinder/common/concurrency/MainThreadExecutionVerifier;)V", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/tinder/match/provider/MatchesTabSelectedProvider$TabSelectedEvent;", "kotlin.jvm.PlatformType", "observe", "Lio/reactivex/Observable;", "selectFeedTab", "", "selectMessagesTab", "update", "event", "TabSelectedEvent", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.match.provider.g */
public final class C9879g {
    /* renamed from: a */
    private final C19040a<C9878a> f32708a = C19040a.a(new C9878a(MatchTabsPage.MESSAGES.ordinal(), MatchTabsPage.MESSAGES, Kind.SELECTED));
    /* renamed from: b */
    private final C2642a f32709b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/match/provider/MatchesTabSelectedProvider$TabSelectedEvent;", "", "position", "", "matchTabsPage", "Lcom/tinder/match/viewmodel/MatchTabsPage;", "kind", "Lcom/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent$Kind;", "(ILcom/tinder/match/viewmodel/MatchTabsPage;Lcom/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent$Kind;)V", "getKind", "()Lcom/jakewharton/rxbinding/support/design/widget/TabLayoutSelectionEvent$Kind;", "getMatchTabsPage", "()Lcom/tinder/match/viewmodel/MatchTabsPage;", "getPosition", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.match.provider.g$a */
    public static final class C9878a {
        /* renamed from: a */
        private final int f32705a;
        @NotNull
        /* renamed from: b */
        private final MatchTabsPage f32706b;
        @NotNull
        /* renamed from: c */
        private final Kind f32707c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9878a) {
                C9878a c9878a = (C9878a) obj;
                return (this.f32705a == c9878a.f32705a ? 1 : null) != null && C2668g.a(this.f32706b, c9878a.f32706b) && C2668g.a(this.f32707c, c9878a.f32707c);
            }
        }

        public int hashCode() {
            int i = this.f32705a * 31;
            MatchTabsPage matchTabsPage = this.f32706b;
            int i2 = 0;
            i = (i + (matchTabsPage != null ? matchTabsPage.hashCode() : 0)) * 31;
            Kind kind = this.f32707c;
            if (kind != null) {
                i2 = kind.hashCode();
            }
            return i + i2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TabSelectedEvent(position=");
            stringBuilder.append(this.f32705a);
            stringBuilder.append(", matchTabsPage=");
            stringBuilder.append(this.f32706b);
            stringBuilder.append(", kind=");
            stringBuilder.append(this.f32707c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9878a(int i, @NotNull MatchTabsPage matchTabsPage, @NotNull Kind kind) {
            C2668g.b(matchTabsPage, "matchTabsPage");
            C2668g.b(kind, "kind");
            this.f32705a = i;
            this.f32706b = matchTabsPage;
            this.f32707c = kind;
        }

        @NotNull
        /* renamed from: a */
        public final MatchTabsPage m40640a() {
            return this.f32706b;
        }

        @NotNull
        /* renamed from: b */
        public final Kind m40641b() {
            return this.f32707c;
        }
    }

    @Inject
    public C9879g(@NotNull C2642a c2642a) {
        C2668g.b(c2642a, "mainThreadExecutionVerifier");
        this.f32709b = c2642a;
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<C9878a> m40642a() {
        C3959e<C9878a> hide = this.f32708a.hide();
        C2668g.a(hide, "subject.hide()");
        return hide;
    }

    @UiThread
    /* renamed from: a */
    public final void m40643a(@NotNull C9878a c9878a) {
        C2668g.b(c9878a, "event");
        this.f32709b.a();
        C19040a c19040a = this.f32708a;
        C2668g.a(c19040a, "subject");
        if ((C2668g.a((C9878a) c19040a.b(), c9878a) ^ 1) != 0 || c9878a.m40641b() == Kind.RESELECTED) {
            this.f32708a.onNext(c9878a);
        }
    }

    @UiThread
    /* renamed from: b */
    public final void m40644b() {
        m40643a(new C9878a(MatchTabsPage.FEED.ordinal(), MatchTabsPage.FEED, Kind.SELECTED));
    }

    @UiThread
    /* renamed from: c */
    public final void m40645c() {
        m40643a(new C9878a(MatchTabsPage.MESSAGES.ordinal(), MatchTabsPage.MESSAGES, Kind.SELECTED));
    }
}
