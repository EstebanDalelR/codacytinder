package com.tinder.pushnotifications.usecase;

import android.app.NotificationManager;
import com.tinder.api.TinderApi;
import com.tinder.common.provider.C2643c;
import com.tinder.data.p218g.p220b.C8665a;
import com.tinder.domain.utils.RxJavaInteropExtKt;
import com.tinder.managers.C2652a;
import com.tinder.managers.bk;
import io.reactivex.C3956a;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;
import rx.Completable;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/pushnotifications/usecase/NotifyPushServer;", "", "tinderApi", "Lcom/tinder/api/TinderApi;", "notificationManager", "Landroid/app/NotificationManager;", "authManager", "Lcom/tinder/managers/AuthenticationManager;", "preferencesManager", "Lcom/tinder/managers/ManagerSharedPreferences;", "localeProvider", "Lcom/tinder/common/provider/DefaultLocaleProvider;", "tokenProvider", "Lcom/tinder/data/settings/notifications/GCMTokenProvider;", "(Lcom/tinder/api/TinderApi;Landroid/app/NotificationManager;Lcom/tinder/managers/AuthenticationManager;Lcom/tinder/managers/ManagerSharedPreferences;Lcom/tinder/common/provider/DefaultLocaleProvider;Lcom/tinder/data/settings/notifications/GCMTokenProvider;)V", "notifyAppOpened", "", "request", "Lcom/tinder/pushnotifications/usecase/NotifyPushServer$NotifyReason;", "updateLanguage", "Lrx/Completable;", "NotifyReason", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class NotifyPushServer {
    /* renamed from: a */
    private final TinderApi f46001a;
    /* renamed from: b */
    private final NotificationManager f46002b;
    /* renamed from: c */
    private final C2652a f46003c;
    /* renamed from: d */
    private final bk f46004d;
    /* renamed from: e */
    private final C2643c f46005e;
    /* renamed from: f */
    private final C8665a f46006f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/pushnotifications/usecase/NotifyPushServer$NotifyReason;", "", "(Ljava/lang/String;I)V", "APP_OPENED", "PN_RECEIVED_IN_FOREGROUND", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public enum NotifyReason {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.NotifyPushServer$f */
    static final class C16271f<T, R> implements Function<String, CompletableSource> {
        /* renamed from: a */
        final /* synthetic */ NotifyPushServer f50679a;

        C16271f(NotifyPushServer notifyPushServer) {
            this.f50679a = notifyPushServer;
        }

        public /* synthetic */ Object apply(Object obj) {
            return m61449a((String) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C3956a m61449a(@NotNull String str) {
            C2668g.b(str, "it");
            str = this.f50679a.f46001a.updatePushSettings(str, null);
            C2668g.a(str, "tinderApi.updatePushSettings(it, null)");
            return RxJavaInteropExtKt.toV2Completable(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.NotifyPushServer$a */
    static final class C17886a<T, R> implements Func1<T, R> {
        /* renamed from: a */
        final /* synthetic */ NotifyPushServer f55778a;

        C17886a(NotifyPushServer notifyPushServer) {
            this.f55778a = notifyPushServer;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65175a((String) obj));
        }

        /* renamed from: a */
        public final boolean m65175a(String str) {
            return C2668g.a(this.f55778a.f46004d.ag(), str) ^ 1;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lrx/Completable;", "kotlin.jvm.PlatformType", "it", "", "call", "(Ljava/lang/Boolean;)Lrx/Completable;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.NotifyPushServer$b */
    static final class C17887b<T, R> implements Func1<Boolean, Completable> {
        /* renamed from: a */
        final /* synthetic */ NotifyPushServer f55779a;

        C17887b(NotifyPushServer notifyPushServer) {
            this.f55779a = notifyPushServer;
        }

        public /* synthetic */ Object call(Object obj) {
            return m65176a((Boolean) obj);
        }

        /* renamed from: a */
        public final Completable m65176a(Boolean bool) {
            C2668g.a(bool, "it");
            return bool.booleanValue() != null ? this.f55779a.m55605a() : Completable.a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.NotifyPushServer$c */
    static final class C17888c<T, R> implements Func1<Throwable, Boolean> {
        /* renamed from: a */
        public static final C17888c f55780a = new C17888c();

        C17888c() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65177a((Throwable) obj));
        }

        /* renamed from: a */
        public final boolean m65177a(Throwable th) {
            C0001a.c(th);
            return true;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.NotifyPushServer$d */
    static final class C18651d implements Action0 {
        /* renamed from: a */
        public static final C18651d f58120a = new C18651d();

        C18651d() {
        }

        public final void call() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.usecase.NotifyPushServer$e */
    static final class C18652e<T> implements Action1<Throwable> {
        /* renamed from: a */
        public static final C18652e f58121a = new C18652e();

        C18652e() {
        }

        public /* synthetic */ void call(Object obj) {
            m67090a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m67090a(Throwable th) {
            C0001a.c(th);
        }
    }

    @Inject
    public NotifyPushServer(@NotNull TinderApi tinderApi, @NotNull NotificationManager notificationManager, @NotNull C2652a c2652a, @NotNull bk bkVar, @NotNull C2643c c2643c, @NotNull C8665a c8665a) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(notificationManager, "notificationManager");
        C2668g.b(c2652a, "authManager");
        C2668g.b(bkVar, "preferencesManager");
        C2668g.b(c2643c, "localeProvider");
        C2668g.b(c8665a, "tokenProvider");
        this.f46001a = tinderApi;
        this.f46002b = notificationManager;
        this.f46003c = c2652a;
        this.f46004d = bkVar;
        this.f46005e = c2643c;
        this.f46006f = c8665a;
    }

    /* renamed from: a */
    public final void m55608a(@org.jetbrains.annotations.NotNull com.tinder.pushnotifications.usecase.NotifyPushServer.NotifyReason r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = "request";
        kotlin.jvm.internal.C2668g.b(r3, r0);
        r0 = com.tinder.pushnotifications.usecase.NotifyPushServer.NotifyReason.APP_OPENED;
        if (r3 != r0) goto L_0x000e;
    L_0x0009:
        r3 = r2.f46002b;	 Catch:{ SecurityException -> 0x000e }
        r3.cancelAll();	 Catch:{ SecurityException -> 0x000e }
    L_0x000e:
        r3 = r2.f46003c;
        r3 = r3.d();
        if (r3 == 0) goto L_0x005f;
    L_0x0016:
        r3 = r2.f46005e;
        r3 = r3.a();
        r3 = r3.getLanguage();
        r3 = rx.Single.a(r3);
        r0 = new com.tinder.pushnotifications.usecase.NotifyPushServer$a;
        r0.<init>(r2);
        r0 = (rx.functions.Func1) r0;
        r3 = r3.d(r0);
        r0 = new com.tinder.pushnotifications.usecase.NotifyPushServer$b;
        r0.<init>(r2);
        r0 = (rx.functions.Func1) r0;
        r3 = r3.c(r0);
        r0 = com.tinder.pushnotifications.usecase.NotifyPushServer.C17888c.f55780a;
        r0 = (rx.functions.Func1) r0;
        r3 = r3.a(r0);
        r0 = r2.f46001a;
        r0 = r0.notifyPushServerAppOpen();
        r3 = r3.b(r0);
        r0 = rx.schedulers.Schedulers.io();
        r3 = r3.b(r0);
        r0 = com.tinder.pushnotifications.usecase.NotifyPushServer.C18651d.f58120a;
        r0 = (rx.functions.Action0) r0;
        r1 = com.tinder.pushnotifications.usecase.NotifyPushServer.C18652e.f58121a;
        r1 = (rx.functions.Action1) r1;
        r3.a(r0, r1);
    L_0x005f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.pushnotifications.usecase.NotifyPushServer.a(com.tinder.pushnotifications.usecase.NotifyPushServer$NotifyReason):void");
    }

    /* renamed from: a */
    private final Completable m55605a() {
        this.f46004d.i(this.f46005e.a().getLanguage());
        C3956a d = this.f46006f.a().d(new C16271f(this));
        C2668g.a(d, "tokenProvider.token\n    …null).toV2Completable() }");
        return RxJavaInteropExtKt.toV1Completable(d);
    }
}
