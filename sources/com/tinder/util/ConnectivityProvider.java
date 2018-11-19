package com.tinder.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.subjects.C19785a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/tinder/util/ConnectivityProvider;", "", "applicationContext", "Landroid/content/Context;", "connectivityManager", "Landroid/net/ConnectivityManager;", "(Landroid/content/Context;Landroid/net/ConnectivityManager;)V", "connectivityStatusUpdatesBroadcastReceiver", "Lcom/tinder/util/ConnectivityProvider$ConnectivityChangesBroadcastReceiver;", "isConnected", "", "()Z", "observeConnectivityStatusChanges", "Lrx/Observable;", "ConnectivityChangesBroadcastReceiver", "NoInternetConnectionException", "engine_release"}, k = 1, mv = {1, 1, 9})
public final class ConnectivityProvider {
    /* renamed from: a */
    private final C15347a f47588a = new C15347a();
    /* renamed from: b */
    private final ConnectivityManager f47589b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tinder/util/ConnectivityProvider$NoInternetConnectionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "engine_release"}, k = 1, mv = {1, 1, 9})
    public static final class NoInternetConnectionException extends RuntimeException {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/util/ConnectivityProvider$ConnectivityChangesBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "connectivityChangesSubject", "Lrx/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "observe", "Lrx/Observable;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "engine_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.util.ConnectivityProvider$a */
    private static final class C15347a extends BroadcastReceiver {
        /* renamed from: a */
        private final C19785a<Boolean> f47587a = C19785a.w();

        @NotNull
        /* renamed from: a */
        public final Observable<Boolean> m57558a() {
            Observable<Boolean> e = this.f47587a.e();
            C2668g.a(e, "connectivityChangesSubject.asObservable()");
            return e;
        }

        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C2668g.b(context, "context");
            C2668g.b(intent, "intent");
            context = intent.getExtras();
            context = (context == null || context.getBoolean("noConnectivity") != null) ? null : true;
            this.f47587a.onNext(Boolean.valueOf(context));
        }
    }

    public ConnectivityProvider(@NotNull Context context, @NotNull ConnectivityManager connectivityManager) {
        C2668g.b(context, "applicationContext");
        C2668g.b(connectivityManager, "connectivityManager");
        this.f47589b = connectivityManager;
        connectivityManager = new IntentFilter();
        connectivityManager.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this.f47588a, connectivityManager);
    }

    /* renamed from: a */
    public final boolean m57559a() {
        NetworkInfo activeNetworkInfo = this.f47589b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @NotNull
    /* renamed from: b */
    public final Observable<Boolean> m57560b() {
        return this.f47588a.m57558a();
    }
}
