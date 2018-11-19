package com.tinder.scarlet.lifecycle.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.tinder.scarlet.Lifecycle;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.Lifecycle.C14785a.C16490b;
import com.tinder.scarlet.Lifecycle.C14785a.C16491c.C18033a;
import com.tinder.scarlet.lifecycle.C18043d;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Subscriber;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H\u0001¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J9\u0010\r\u001a\u00020\f2.\u0010\u000e\u001a*\u0012\u000e\b\u0000\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010 \u0011*\u0014\u0012\u000e\b\u0000\u0012\n \u0011*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\u000f0\u000fH\u0001J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/ConnectivityOnLifecycle;", "Lcom/tinder/scarlet/Lifecycle;", "applicationContext", "Landroid/content/Context;", "lifecycleRegistry", "Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;", "(Landroid/content/Context;Lcom/tinder/scarlet/lifecycle/LifecycleRegistry;)V", "combineWith", "others", "", "([Lcom/tinder/scarlet/Lifecycle;)Lcom/tinder/scarlet/Lifecycle;", "emitCurrentConnectivity", "", "subscribe", "p0", "Lorg/reactivestreams/Subscriber;", "Lcom/tinder/scarlet/Lifecycle$State;", "kotlin.jvm.PlatformType", "subscribeToConnectivityChange", "toLifecycleState", "isConnected", "", "Landroid/net/ConnectivityManager;", "ConnectivityChangeBroadcastReceiver", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.lifecycle.android.c */
public final class C18041c implements Lifecycle {
    /* renamed from: a */
    private final C18043d f56042a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/lifecycle/android/ConnectivityOnLifecycle$ConnectivityChangeBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/tinder/scarlet/lifecycle/android/ConnectivityOnLifecycle;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "scarlet-lifecycle-android_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.lifecycle.android.c$a */
    private final class C14817a extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C18041c f46419a;

        public C14817a(C18041c c18041c) {
            this.f46419a = c18041c;
        }

        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            C2668g.b(context, "context");
            C2668g.b(intent, "intent");
            context = intent.getExtras();
            if (context != null) {
                this.f46419a.f56042a.m65511a(this.f46419a.m65505a((boolean) context.getBoolean("noConnectivity") ^ 1));
            }
        }
    }

    @NotNull
    public Lifecycle combineWith(@NotNull Lifecycle... lifecycleArr) {
        C2668g.b(lifecycleArr, "others");
        return this.f56042a.combineWith(lifecycleArr);
    }

    public void subscribe(Subscriber<? super C14785a> subscriber) {
        this.f56042a.subscribe(subscriber);
    }

    public C18041c(@NotNull Context context, @NotNull C18043d c18043d) {
        C2668g.b(context, "applicationContext");
        C2668g.b(c18043d, "lifecycleRegistry");
        this.f56042a = c18043d;
        m65507a(context);
        m65509b(context);
    }

    public /* synthetic */ C18041c(Context context, C18043d c18043d, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            c18043d = new C18043d(0, 1, null);
        }
        this(context, c18043d);
    }

    /* renamed from: a */
    private final void m65507a(Context context) {
        context = context.getSystemService("connectivity");
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
        }
        this.f56042a.m65511a(m65505a(m65508a((ConnectivityManager) context)));
    }

    /* renamed from: b */
    private final void m65509b(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C14817a(this), intentFilter);
    }

    /* renamed from: a */
    private final boolean m65508a(@NotNull ConnectivityManager connectivityManager) {
        connectivityManager = connectivityManager.getActiveNetworkInfo();
        return (connectivityManager == null || connectivityManager.isConnectedOrConnecting() == null) ? null : true;
    }

    /* renamed from: a */
    private final C14785a m65505a(boolean z) {
        if (z) {
            return (C14785a) C16490b.f51167a;
        }
        return (C14785a) C18033a.f56033a;
    }
}
