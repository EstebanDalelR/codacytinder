package com.tinder.pushnotifications.usecase;

import com.tinder.api.TinderApi;
import com.tinder.api.model.settings.PushSettings;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/pushnotifications/usecase/UpdatePushSetting;", "", "tokenProvider", "Lcom/tinder/data/settings/notifications/GCMTokenProvider;", "tinderApi", "Lcom/tinder/api/TinderApi;", "(Lcom/tinder/data/settings/notifications/GCMTokenProvider;Lcom/tinder/api/TinderApi;)V", "execute", "Lrx/Completable;", "settings", "Lcom/tinder/api/model/settings/PushSettings;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.pushnotifications.usecase.e */
public final class C14576e {
    /* renamed from: a */
    private final C8665a f46010a;
    /* renamed from: b */
    private final TinderApi f46011b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "token", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.e$a */
    static final class C17891a<T, R> implements Func1<String, Completable> {
        /* renamed from: a */
        final /* synthetic */ C14576e f55788a;
        /* renamed from: b */
        final /* synthetic */ PushSettings f55789b;

        C17891a(C14576e c14576e, PushSettings pushSettings) {
            this.f55788a = c14576e;
            this.f55789b = pushSettings;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65184a((String) obj);
        }

        /* renamed from: a */
        public final Completable m65184a(String str) {
            return this.f55788a.f46011b.updatePushSettings(str, this.f55789b);
        }
    }

    @Inject
    public C14576e(@NotNull C8665a c8665a, @NotNull TinderApi tinderApi) {
        C2668g.b(c8665a, "tokenProvider");
        C2668g.b(tinderApi, "tinderApi");
        this.f46010a = c8665a;
        this.f46011b = tinderApi;
    }

    @NotNull
    /* renamed from: a */
    public final Completable m55613a(@NotNull PushSettings pushSettings) {
        C2668g.b(pushSettings, "settings");
        pushSettings = RxJavaInteropExtKt.toV1Single(this.f46010a.a()).c(new C17891a(this, pushSettings));
        C2668g.a(pushSettings, "tokenProvider\n          …tings(token, settings) })");
        return pushSettings;
    }
}
