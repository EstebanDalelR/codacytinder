package com.tinder.feed.usecase;

import com.tinder.design.tabbedpagelayout.TabbedPageLayout$Page;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.home.p259b.C9695a;
import com.tinder.main.model.MainPage;
import io.reactivex.C3956a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/feed/usecase/FeedMainTabFirstOpened;", "Lcom/tinder/feed/usecase/FeedFirstOpened;", "homePageTabSelectedProvider", "Lcom/tinder/home/provider/HomePageTabSelectedProvider;", "(Lcom/tinder/home/provider/HomePageTabSelectedProvider;)V", "execute", "Lio/reactivex/Completable;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.usecase.a */
public final class C13272a implements FeedFirstOpened {
    /* renamed from: a */
    private final C9695a f42036a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/design/tabbedpagelayout/TabbedPageLayout$Page;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.usecase.a$a */
    static final class C13271a<T, R> implements Func1<TabbedPageLayout$Page, Boolean> {
        /* renamed from: a */
        public static final C13271a f42035a = new C13271a();

        C13271a() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51329a((TabbedPageLayout$Page) obj));
        }

        /* renamed from: a */
        public final boolean m51329a(TabbedPageLayout$Page tabbedPageLayout$Page) {
            return tabbedPageLayout$Page == MainPage.FEED ? true : null;
        }
    }

    public C13272a(@NotNull C9695a c9695a) {
        C2668g.b(c9695a, "homePageTabSelectedProvider");
        this.f42036a = c9695a;
    }

    @NotNull
    public C3956a execute() {
        Completable b = this.f42036a.m40151a().f(C13271a.f42035a).c(1).b();
        C2668g.a(b, "homePageTabSelectedProvi…         .toCompletable()");
        return RxJavaInteropExtKt.toV2Completable(b);
    }
}
