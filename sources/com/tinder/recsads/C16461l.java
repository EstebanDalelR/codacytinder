package com.tinder.recsads;

import com.tinder.addy.Ad;
import com.tinder.recsads.analytics.C16432d;
import com.tinder.recsads.analytics.C16432d.C14735a;
import com.tinder.recsads.analytics.C16434j;
import com.tinder.recsads.analytics.C16434j.C14739a;
import com.tinder.recsads.analytics.C16439r;
import com.tinder.recsads.analytics.C16439r.C14745a;
import com.tinder.recsads.model.RecsNativeVideoAd;
import com.tinder.recsads.view.NativeVideoAdRecCard$Listener;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/recsads/NativeVideoAdRecCardAnalyticsListener;", "Lcom/tinder/recsads/view/NativeVideoAdRecCard$Listener;", "addAdPlayEvent", "Lcom/tinder/recsads/analytics/AddAdPlayEvent;", "addAdToggleAudioEvent", "Lcom/tinder/recsads/analytics/AddAdToggleAudioEvent;", "addAdCompleteEvent", "Lcom/tinder/recsads/analytics/AddAdCompleteEvent;", "(Lcom/tinder/recsads/analytics/AddAdPlayEvent;Lcom/tinder/recsads/analytics/AddAdToggleAudioEvent;Lcom/tinder/recsads/analytics/AddAdCompleteEvent;)V", "onVideoEnd", "", "ad", "Lcom/tinder/recsads/model/RecsNativeVideoAd;", "onVideoMuted", "onVideoPlay", "recs-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.l */
public final class C16461l implements NativeVideoAdRecCard$Listener {
    /* renamed from: a */
    private final C16434j f51045a;
    /* renamed from: b */
    private final C16439r f51046b;
    /* renamed from: c */
    private final C16432d f51047c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.l$a */
    static final class C18779a implements Action0 {
        /* renamed from: a */
        public static final C18779a f58290a = new C18779a();

        C18779a() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.l$b */
    static final class C18780b<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18780b f58291a = new C18780b();

        C18780b() {
        }

        public /* synthetic */ void call(Object obj) {
            m67220a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67220a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.l$c */
    static final class C18781c implements Action0 {
        /* renamed from: a */
        public static final C18781c f58292a = new C18781c();

        C18781c() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.l$d */
    static final class C18782d<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18782d f58293a = new C18782d();

        C18782d() {
        }

        public /* synthetic */ void call(Object obj) {
            m67221a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67221a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.l$e */
    static final class C18783e implements Action0 {
        /* renamed from: a */
        public static final C18783e f58294a = new C18783e();

        C18783e() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.l$f */
    static final class C18784f<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18784f f58295a = new C18784f();

        C18784f() {
        }

        public /* synthetic */ void call(Object obj) {
            m67222a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67222a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public C16461l(@NotNull C16434j c16434j, @NotNull C16439r c16439r, @NotNull C16432d c16432d) {
        C2668g.b(c16434j, "addAdPlayEvent");
        C2668g.b(c16439r, "addAdToggleAudioEvent");
        C2668g.b(c16432d, "addAdCompleteEvent");
        this.f51045a = c16434j;
        this.f51046b = c16439r;
        this.f51047c = c16432d;
    }

    public void onVideoPlay(@NotNull RecsNativeVideoAd recsNativeVideoAd) {
        C2668g.b(recsNativeVideoAd, "ad");
        this.f51045a.m56002a((Object) C14739a.m56005d().mo12172a(), (Ad) recsNativeVideoAd).b(Schedulers.io()).a(C18783e.f58294a, C18784f.f58295a);
    }

    public void onVideoMuted(@NotNull RecsNativeVideoAd recsNativeVideoAd) {
        C2668g.b(recsNativeVideoAd, "ad");
        this.f51046b.m56002a((Object) C14745a.m56017c().mo12181a(), (Ad) recsNativeVideoAd).b(Schedulers.io()).a(C18781c.f58292a, C18782d.f58293a);
    }

    public void onVideoEnd(@NotNull RecsNativeVideoAd recsNativeVideoAd) {
        C2668g.b(recsNativeVideoAd, "ad");
        this.f51047c.m56002a((Object) C14735a.m55997c().mo12169a(), (Ad) recsNativeVideoAd).b(Schedulers.io()).a(C18779a.f58290a, C18780b.f58291a);
    }
}
