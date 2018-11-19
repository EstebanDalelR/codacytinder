package com.github.pwittchen.reactivenetwork.library.rx2.network.observing.p060a;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkRequest.Builder;
import android.os.PowerManager;
import android.support.annotation.NonNull;
import android.util.Log;
import com.github.pwittchen.reactivenetwork.library.rx2.C1995a;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.NetworkObservingStrategy;
import io.reactivex.BackpressureStrategy;
import io.reactivex.C3959e;
import io.reactivex.functions.Action;
import io.reactivex.subjects.PublishSubject;

@TargetApi(23)
/* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.network.observing.a.b */
public class C3575b implements NetworkObservingStrategy {
    /* renamed from: a */
    private NetworkCallback f10669a;
    /* renamed from: b */
    private PublishSubject<C1995a> f10670b = PublishSubject.a();
    /* renamed from: c */
    private BroadcastReceiver f10671c = m13429a();

    /* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.network.observing.a.b$2 */
    class C19992 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C3575b f5424a;

        C19992(C3575b c3575b) {
            this.f5424a = c3575b;
        }

        public void onReceive(Context context, Intent intent) {
            if (this.f5424a.m13433b(context) != null) {
                this.f5424a.m13432a(C1995a.m7200a());
            } else {
                this.f5424a.m13432a(C1995a.m7201a(context));
            }
        }
    }

    public C3959e<C1995a> observeNetworkConnectivity(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10669a = m13435d(context);
        m13430a(context);
        connectivityManager.registerNetworkCallback(new Builder().addCapability(12).addCapability(13).build(), this.f10669a);
        return this.f10670b.toFlowable(BackpressureStrategy.LATEST).m15364b(new Action(this) {
            /* renamed from: c */
            final /* synthetic */ C3575b f10668c;

            public void run() {
                this.f10668c.m13431a(connectivityManager);
                this.f10668c.m13434c(context);
            }
        }).m15377c(C1995a.m7201a(context)).m15381d().m15404p();
    }

    /* renamed from: a */
    protected void m13430a(Context context) {
        context.registerReceiver(this.f10671c, new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
    }

    @NonNull
    /* renamed from: a */
    protected BroadcastReceiver m13429a() {
        return new C19992(this);
    }

    /* renamed from: b */
    protected boolean m13433b(Context context) {
        String packageName = context.getPackageName();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return (powerManager.isDeviceIdleMode() == null || powerManager.isIgnoringBatteryOptimizations(packageName)) ? null : true;
    }

    /* renamed from: a */
    protected void m13431a(ConnectivityManager connectivityManager) {
        try {
            connectivityManager.unregisterNetworkCallback(this.f10669a);
        } catch (ConnectivityManager connectivityManager2) {
            onError("could not unregister network callback", connectivityManager2);
        }
    }

    /* renamed from: c */
    protected void m13434c(Context context) {
        try {
            context.unregisterReceiver(this.f10671c);
        } catch (Context context2) {
            onError("could not unregister receiver", context2);
        }
    }

    public void onError(String str, Exception exception) {
        Log.e("ReactiveNetwork", str, exception);
    }

    /* renamed from: d */
    protected NetworkCallback m13435d(final Context context) {
        return new NetworkCallback(this) {
            /* renamed from: b */
            final /* synthetic */ C3575b f5426b;

            public void onAvailable(Network network) {
                this.f5426b.m13432a(C1995a.m7201a(context));
            }

            public void onLost(Network network) {
                this.f5426b.m13432a(C1995a.m7201a(context));
            }
        };
    }

    /* renamed from: a */
    protected void m13432a(C1995a c1995a) {
        this.f10670b.onNext(c1995a);
    }
}
