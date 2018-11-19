package io.fabric.sdk.android.services.network;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: io.fabric.sdk.android.services.network.c */
public final class C15651c {
    /* renamed from: a */
    public static final SSLSocketFactory m58805a(PinningInfoProvider pinningInfoProvider) throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        C15652d c15652d = new C15652d(new C15653e(pinningInfoProvider.getKeyStoreStream(), pinningInfoProvider.getKeyStorePassword()), pinningInfoProvider);
        instance.init(null, new TrustManager[]{c15652d}, null);
        return instance.getSocketFactory();
    }
}
