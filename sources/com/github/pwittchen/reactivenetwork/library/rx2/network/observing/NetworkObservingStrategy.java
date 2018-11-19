package com.github.pwittchen.reactivenetwork.library.rx2.network.observing;

import android.content.Context;
import com.github.pwittchen.reactivenetwork.library.rx2.C1995a;
import io.reactivex.C3959e;

public interface NetworkObservingStrategy {
    C3959e<C1995a> observeNetworkConnectivity(Context context);

    void onError(String str, Exception exception);
}
