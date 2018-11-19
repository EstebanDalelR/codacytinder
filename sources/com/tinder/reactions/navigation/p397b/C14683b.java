package com.tinder.reactions.navigation.p397b;

import com.tinder.reactions.common.feature.C14614a;
import com.tinder.reactions.common.feature.FeatureLifecycle;
import com.tinder.reactions.navigation.view.GestureNavigationLoadingView;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"bind", "", "Lcom/tinder/reactions/navigation/feature/GestureNavigationLoadingFeature;", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.navigation.b.b */
public final class C14683b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.b.b$a */
    static final class C16370a<T> implements Consumer<GestureNavigationLoadingView> {
        /* renamed from: a */
        final /* synthetic */ C16369a f50914a;

        C16370a(C16369a c16369a) {
            this.f50914a = c16369a;
        }

        public /* synthetic */ void accept(Object obj) {
            m61741a((GestureNavigationLoadingView) obj);
        }

        /* renamed from: a */
        public final void m61741a(GestureNavigationLoadingView gestureNavigationLoadingView) {
            C16369a c16369a = this.f50914a;
            C2668g.a(gestureNavigationLoadingView, "view");
            c16369a.m61739a(gestureNavigationLoadingView);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/reactions/navigation/view/GestureNavigationLoadingView;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.b.b$b */
    static final class C16371b<T> implements Consumer<GestureNavigationLoadingView> {
        /* renamed from: a */
        final /* synthetic */ C16369a f50915a;

        C16371b(C16369a c16369a) {
            this.f50915a = c16369a;
        }

        public /* synthetic */ void accept(Object obj) {
            m61742a((GestureNavigationLoadingView) obj);
        }

        /* renamed from: a */
        public final void m61742a(GestureNavigationLoadingView gestureNavigationLoadingView) {
            C14614a.m55766a((FeatureLifecycle) this.f50915a, this.f50915a.m61738a());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.navigation.b.b$c */
    static final class C16372c<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16372c f50916a = new C16372c();

        C16372c() {
        }

        public /* synthetic */ void accept(Object obj) {
            m61743a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m61743a(Throwable th) {
            C0001a.c(th, "Error observing views", new Object[0]);
        }
    }

    /* renamed from: a */
    public static final void m55935a(@NotNull C16369a c16369a) {
        C2668g.b(c16369a, "$receiver");
        c16369a.m61740b().m55946a().doOnNext(new C16370a(c16369a)).observeOn(C15674a.m58830a()).take(1).subscribe(new C16371b(c16369a), (Consumer) C16372c.f50916a);
    }
}
