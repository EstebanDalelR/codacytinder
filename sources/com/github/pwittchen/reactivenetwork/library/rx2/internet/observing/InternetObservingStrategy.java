package com.github.pwittchen.reactivenetwork.library.rx2.internet.observing;

import com.github.pwittchen.reactivenetwork.library.rx2.internet.observing.error.ErrorHandler;
import io.reactivex.C3959e;
import io.reactivex.C3960g;

public interface InternetObservingStrategy {
    C3960g<Boolean> checkInternetConnectivity(String str, int i, int i2, ErrorHandler errorHandler);

    String getDefaultPingHost();

    C3959e<Boolean> observeInternetConnectivity(int i, int i2, String str, int i3, int i4, ErrorHandler errorHandler);
}
