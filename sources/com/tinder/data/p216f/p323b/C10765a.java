package com.tinder.data.p216f.p323b;

import com.tinder.api.ManagerWebServices;
import com.tinder.api.TinderApi;
import com.tinder.data.p216f.p217a.C8646a;
import com.tinder.domain.pushnotifications.repository.PushTokenRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.functions.Action1;
import rx.functions.Func0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/data/pushnotifications/repository/PushTokenDataRepository;", "Lcom/tinder/domain/pushnotifications/repository/PushTokenRepository;", "tinderApi", "Lcom/tinder/api/TinderApi;", "dataStore", "Lcom/tinder/data/pushnotifications/datastore/PushTokenDataStore;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/pushnotifications/datastore/PushTokenDataStore;)V", "registerToken", "Lrx/Completable;", "token", "", "unregisterToken", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.f.b.a */
public final class C10765a implements PushTokenRepository {
    /* renamed from: a */
    private final TinderApi f35163a;
    /* renamed from: b */
    private final C8646a f35164b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lrx/Completable;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.f.b.a$a */
    static final class C12859a<R> implements Func0<Completable> {
        /* renamed from: a */
        final /* synthetic */ C10765a f41305a;
        /* renamed from: b */
        final /* synthetic */ String f41306b;

        C12859a(C10765a c10765a, String str) {
            this.f41305a = c10765a;
            this.f41306b = str;
        }

        public /* synthetic */ Object call() {
            return m50495a();
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50495a() {
            return this.f41305a.f35164b.m36881a(this.f41306b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lrx/Completable;", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.f.b.a$c */
    static final class C12860c<R> implements Func0<Completable> {
        /* renamed from: a */
        final /* synthetic */ C10765a f41307a;

        C12860c(C10765a c10765a) {
            this.f41307a = c10765a;
        }

        public /* synthetic */ Object call() {
            return m50496a();
        }

        @NotNull
        /* renamed from: a */
        public final Completable m50496a() {
            return this.f41307a.f35164b.m36880a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.f.b.a$b */
    static final class C13799b<T> implements Action1<Throwable> {
        /* renamed from: a */
        final /* synthetic */ C10765a f43806a;

        C13799b(C10765a c10765a) {
            this.f43806a = c10765a;
        }

        public /* synthetic */ void call(Object obj) {
            m53371a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m53371a(Throwable th) {
            this.f43806a.f35164b.m36880a();
        }
    }

    @Inject
    public C10765a(@NotNull TinderApi tinderApi, @NotNull C8646a c8646a) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(c8646a, "dataStore");
        this.f35163a = tinderApi;
        this.f35164b = c8646a;
    }

    @NotNull
    public Completable registerToken(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        str = this.f35163a.registerPushToken(str).a(Completable.a(new C12859a(this, str))).c(new C13799b(this));
        C2668g.a(str, "tinderApi\n              …dataStore.deleteToken() }");
        return str;
    }

    @NotNull
    public Completable unregisterToken(@NotNull String str) {
        C2668g.b(str, ManagerWebServices.PARAM_TOKEN);
        str = this.f35163a.unregisterPush(str).a(Completable.a(new C12860c(this)));
        C2668g.a(str, "tinderApi.unregisterPush…ataStore.deleteToken() })");
        return str;
    }
}
