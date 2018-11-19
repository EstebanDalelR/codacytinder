package com.tinder.screenshot.analytics;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.common.navigation.Screen;
import com.tinder.common.navigation.Screen.C10682a;
import com.tinder.common.navigation.Screen.C10684c;
import com.tinder.common.navigation.Screen.C10685d;
import com.tinder.common.navigation.Screen.C10686e;
import com.tinder.common.navigation.Screen.C10687f;
import com.tinder.common.navigation.Screen.C10688g;
import com.tinder.common.navigation.Screen.C10689h;
import com.tinder.common.navigation.Screen.C10690i;
import com.tinder.common.navigation.Screen.C10691j;
import com.tinder.common.navigation.Screen.C10692k;
import com.tinder.common.navigation.Screen.C10693l;
import com.tinder.common.navigation.Screen.Matches;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.etl.event.au;
import com.tinder.etl.event.au.C8982a;
import com.tinder.profile.ProfileScreenSource;
import io.reactivex.C3956a;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0002¢\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent$Request;", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "execute", "", "request", "analyticsSource", "", "Lcom/tinder/common/navigation/Screen;", "(Lcom/tinder/common/navigation/Screen;)Ljava/lang/Integer;", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.screenshot.analytics.a */
public final class C16562a implements VoidUseCase<C14824a> {
    /* renamed from: a */
    private final C2630h f51252a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tinder/screenshot/analytics/AddAppScreenshotEvent$Request;", "", "currentScreen", "Lcom/tinder/common/navigation/Screen;", "profileSource", "Lcom/tinder/profile/ProfileScreenSource;", "otherId", "", "photosPermissionEnabled", "", "(Lcom/tinder/common/navigation/Screen;Lcom/tinder/profile/ProfileScreenSource;Ljava/lang/String;Z)V", "getCurrentScreen", "()Lcom/tinder/common/navigation/Screen;", "getOtherId", "()Ljava/lang/String;", "getPhotosPermissionEnabled", "()Z", "getProfileSource", "()Lcom/tinder/profile/ProfileScreenSource;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.analytics.a$a */
    public static final class C14824a {
        @NotNull
        /* renamed from: a */
        private final Screen f46421a;
        @Nullable
        /* renamed from: b */
        private final ProfileScreenSource f46422b;
        @Nullable
        /* renamed from: c */
        private final String f46423c;
        /* renamed from: d */
        private final boolean f46424d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14824a) {
                C14824a c14824a = (C14824a) obj;
                if (C2668g.a(this.f46421a, c14824a.f46421a) && C2668g.a(this.f46422b, c14824a.f46422b) && C2668g.a(this.f46423c, c14824a.f46423c)) {
                    if ((this.f46424d == c14824a.f46424d ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            Screen screen = this.f46421a;
            int i = 0;
            int hashCode = (screen != null ? screen.hashCode() : 0) * 31;
            ProfileScreenSource profileScreenSource = this.f46422b;
            hashCode = (hashCode + (profileScreenSource != null ? profileScreenSource.hashCode() : 0)) * 31;
            String str = this.f46423c;
            if (str != null) {
                i = str.hashCode();
            }
            hashCode = (hashCode + i) * 31;
            i = this.f46424d;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(currentScreen=");
            stringBuilder.append(this.f46421a);
            stringBuilder.append(", profileSource=");
            stringBuilder.append(this.f46422b);
            stringBuilder.append(", otherId=");
            stringBuilder.append(this.f46423c);
            stringBuilder.append(", photosPermissionEnabled=");
            stringBuilder.append(this.f46424d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14824a(@NotNull Screen screen, @Nullable ProfileScreenSource profileScreenSource, @Nullable String str, boolean z) {
            C2668g.b(screen, "currentScreen");
            this.f46421a = screen;
            this.f46422b = profileScreenSource;
            this.f46423c = str;
            this.f46424d = z;
        }

        @NotNull
        /* renamed from: a */
        public final Screen m56175a() {
            return this.f46421a;
        }

        @Nullable
        /* renamed from: b */
        public final ProfileScreenSource m56176b() {
            return this.f46422b;
        }

        @Nullable
        /* renamed from: c */
        public final String m56177c() {
            return this.f46423c;
        }

        /* renamed from: d */
        public final boolean m56178d() {
            return this.f46424d;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.analytics.a$b */
    static final class C16560b implements Action {
        /* renamed from: a */
        final /* synthetic */ C16562a f51249a;
        /* renamed from: b */
        final /* synthetic */ C14824a f51250b;

        C16560b(C16562a c16562a, C14824a c14824a) {
            this.f51249a = c16562a;
            this.f51250b = c14824a;
        }

        public final void run() {
            C8982a a = au.a();
            Integer a2 = this.f51249a.m61990a(this.f51250b.m56175a());
            if (a2 != null) {
                a.a(Integer.valueOf(a2.intValue()));
            }
            ProfileScreenSource b = this.f51250b.m56176b();
            if (b != null) {
                a.a(b.getAnalyticsSourceFrom());
            }
            String c = this.f51250b.m56177c();
            if (c != null) {
                a.b(c);
            }
            a.a(Boolean.valueOf(this.f51250b.m56178d()));
            this.f51249a.f51252a.a(a.a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.screenshot.analytics.a$c */
    static final class C16561c implements Action {
        /* renamed from: a */
        final /* synthetic */ C14824a f51251a;

        C16561c(C14824a c14824a) {
            this.f51251a = c14824a;
        }

        public final void run() {
            C0001a.b("App.Screenshot event added with %s", new Object[]{this.f51251a});
        }
    }

    @Inject
    public C16562a(@NotNull C2630h c2630h) {
        C2668g.b(c2630h, "fireworks");
        this.f51252a = c2630h;
    }

    public /* synthetic */ void execute(Object obj) {
        m61992a((C14824a) obj);
    }

    /* renamed from: a */
    public void m61992a(@NotNull C14824a c14824a) {
        C2668g.b(c14824a, "request");
        C3956a b = C3956a.a(new C16560b(this, c14824a)).b(C15756a.m59010b());
        Action c16561c = new C16561c(c14824a);
        c14824a = (Function1) AddAppScreenshotEvent$execute$3.f59396a;
        if (c14824a != null) {
            c14824a = new C16563b(c14824a);
        }
        b.a(c16561c, (Consumer) c14824a);
    }

    /* renamed from: a */
    private final Integer m61990a(@NotNull Screen screen) {
        if (screen instanceof C10692k) {
            return Integer.valueOf(1);
        }
        if (screen instanceof C10691j) {
            return Integer.valueOf(2);
        }
        if (screen instanceof C10685d) {
            return Integer.valueOf(3);
        }
        if (screen instanceof C10682a) {
            return Integer.valueOf(4);
        }
        if (screen instanceof Matches) {
            return Integer.valueOf(6);
        }
        if (screen instanceof C10686e) {
            return Integer.valueOf(7);
        }
        if (screen instanceof C10684c) {
            return Integer.valueOf(8);
        }
        if (screen instanceof C10688g) {
            return Integer.valueOf(9);
        }
        if (screen instanceof C10693l) {
            return Integer.valueOf(10);
        }
        if (screen instanceof C10689h) {
            return Integer.valueOf(11);
        }
        if (screen instanceof C10690i) {
            return Integer.valueOf(12);
        }
        return (screen instanceof C10687f) != null ? Integer.valueOf(13) : null;
    }
}
