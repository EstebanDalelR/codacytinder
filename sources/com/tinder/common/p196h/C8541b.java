package com.tinder.common.p196h;

import com.tinder.main.Badgeable$Trigger;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, d2 = {"onHide", "Lio/reactivex/Observable;", "", "Lcom/tinder/main/Badgeable$Trigger;", "onShow", "Tinder_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.common.h.b */
public final class C8541b {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.b$a */
    static final class C10674a<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ Badgeable$Trigger f35014a;

        C10674a(Badgeable$Trigger badgeable$Trigger) {
            this.f35014a = badgeable$Trigger;
        }

        public final void subscribe(@NotNull final ObservableEmitter<C15813i> observableEmitter) {
            C2668g.b(observableEmitter, "it");
            this.f35014a.register(new C10673a() {
                public void hideBadge() {
                    observableEmitter.onNext(C15813i.f49016a);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.b$b */
    static final class C10675b implements Action {
        /* renamed from: a */
        final /* synthetic */ Badgeable$Trigger f35015a;

        C10675b(Badgeable$Trigger badgeable$Trigger) {
            this.f35015a = badgeable$Trigger;
        }

        public final void run() {
            this.f35015a.unregister();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/ObservableEmitter;", "kotlin.jvm.PlatformType", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.b$c */
    static final class C10676c<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ Badgeable$Trigger f35016a;

        C10676c(Badgeable$Trigger badgeable$Trigger) {
            this.f35016a = badgeable$Trigger;
        }

        public final void subscribe(@NotNull final ObservableEmitter<C15813i> observableEmitter) {
            C2668g.b(observableEmitter, "it");
            this.f35016a.register(new C10673a() {
                public void showBadge() {
                    observableEmitter.onNext(C15813i.f49016a);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.h.b$d */
    static final class C10677d implements Action {
        /* renamed from: a */
        final /* synthetic */ Badgeable$Trigger f35017a;

        C10677d(Badgeable$Trigger badgeable$Trigger) {
            this.f35017a = badgeable$Trigger;
        }

        public final void run() {
            this.f35017a.unregister();
        }
    }

    @NotNull
    /* renamed from: a */
    public static final C3959e<C15813i> m36524a(@NotNull Badgeable$Trigger badgeable$Trigger) {
        C2668g.b(badgeable$Trigger, "$receiver");
        badgeable$Trigger = C3959e.create(new C10676c(badgeable$Trigger)).doOnDispose(new C10677d(badgeable$Trigger));
        C2668g.a(badgeable$Trigger, "Observable.create<Unit> …nDispose { unregister() }");
        return badgeable$Trigger;
    }

    @NotNull
    /* renamed from: b */
    public static final C3959e<C15813i> m36525b(@NotNull Badgeable$Trigger badgeable$Trigger) {
        C2668g.b(badgeable$Trigger, "$receiver");
        badgeable$Trigger = C3959e.create(new C10674a(badgeable$Trigger)).doOnDispose(new C10675b(badgeable$Trigger));
        C2668g.a(badgeable$Trigger, "Observable.create<Unit> …nDispose { unregister() }");
        return badgeable$Trigger;
    }
}
