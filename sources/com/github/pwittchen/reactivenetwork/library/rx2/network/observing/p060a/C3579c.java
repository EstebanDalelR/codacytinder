package com.github.pwittchen.reactivenetwork.library.rx2.network.observing.p060a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.util.Log;
import com.github.pwittchen.reactivenetwork.library.rx2.C1995a;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.NetworkObservingStrategy;
import io.reactivex.C15679f.C17362c;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.disposables.C15676b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.p453a.p455b.C15674a;

/* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.network.observing.a.c */
public class C3579c implements NetworkObservingStrategy {
    public C3959e<C1995a> observeNetworkConnectivity(final Context context) {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return C3959e.create(new ObservableOnSubscribe<C1995a>(this) {
            /* renamed from: c */
            final /* synthetic */ C3579c f10676c;

            public void subscribe(final ObservableEmitter<C1995a> observableEmitter) throws Exception {
                final BroadcastReceiver c20011 = new BroadcastReceiver(this) {
                    /* renamed from: b */
                    final /* synthetic */ C35771 f5428b;

                    public void onReceive(Context context, Intent intent) {
                        observableEmitter.onNext(C1995a.m7201a(context));
                    }
                };
                context.registerReceiver(c20011, intentFilter);
                observableEmitter.setDisposable(this.f10676c.m13437a(new Action(this) {
                    /* renamed from: b */
                    final /* synthetic */ C35771 f10673b;

                    public void run() {
                        this.f10673b.f10676c.m13438a(context, c20011);
                    }
                }));
            }
        }).defaultIfEmpty(C1995a.m7200a());
    }

    /* renamed from: a */
    protected void m13438a(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Context context2) {
            onError("receiver was already unregistered", context2);
        }
    }

    public void onError(String str, Exception exception) {
        Log.e("ReactiveNetwork", str, exception);
    }

    /* renamed from: a */
    private Disposable m13437a(final Action action) {
        return C15676b.a(new Action(this) {
            /* renamed from: b */
            final /* synthetic */ C3579c f10678b;

            public void run() throws Exception {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    action.run();
                    return;
                }
                final C17362c a = C15674a.a().a();
                a.a(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C35782 f5430b;

                    public void run() {
                        try {
                            action.run();
                        } catch (Exception e) {
                            this.f5430b.f10678b.onError("Could not unregister receiver in UI Thread", e);
                        }
                        a.dispose();
                    }
                });
            }
        });
    }
}
