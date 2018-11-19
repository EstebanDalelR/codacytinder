package com.github.pwittchen.reactivenetwork.library.rx2.network.observing.p060a;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkRequest.Builder;
import android.util.Log;
import com.github.pwittchen.reactivenetwork.library.rx2.C1995a;
import com.github.pwittchen.reactivenetwork.library.rx2.network.observing.NetworkObservingStrategy;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;

@TargetApi(21)
/* renamed from: com.github.pwittchen.reactivenetwork.library.rx2.network.observing.a.a */
public class C3573a implements NetworkObservingStrategy {
    /* renamed from: a */
    private NetworkCallback f10665a;

    public C3959e<C1995a> observeNetworkConnectivity(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return C3959e.create(new ObservableOnSubscribe<C1995a>(this) {
            /* renamed from: c */
            final /* synthetic */ C3573a f10664c;

            public void subscribe(ObservableEmitter<C1995a> observableEmitter) throws Exception {
                this.f10664c.f10665a = this.f10664c.m13426a((ObservableEmitter) observableEmitter, context);
                connectivityManager.registerNetworkCallback(new Builder().build(), this.f10664c.f10665a);
            }
        }).doOnDispose(new Action(this) {
            /* renamed from: b */
            final /* synthetic */ C3573a f10661b;

            public void run() {
                this.f10661b.m13427a(connectivityManager);
            }
        }).startWith(C1995a.m7201a(context)).distinctUntilChanged();
    }

    /* renamed from: a */
    private void m13427a(ConnectivityManager connectivityManager) {
        try {
            connectivityManager.unregisterNetworkCallback(this.f10665a);
        } catch (ConnectivityManager connectivityManager2) {
            onError("could not unregister network callback", connectivityManager2);
        }
    }

    public void onError(String str, Exception exception) {
        Log.e("ReactiveNetwork", str, exception);
    }

    /* renamed from: a */
    private NetworkCallback m13426a(final ObservableEmitter<C1995a> observableEmitter, final Context context) {
        return new NetworkCallback(this) {
            /* renamed from: c */
            final /* synthetic */ C3573a f5423c;

            public void onAvailable(Network network) {
                observableEmitter.onNext(C1995a.m7201a(context));
            }

            public void onLost(Network network) {
                observableEmitter.onNext(C1995a.m7201a(context));
            }
        };
    }
}
