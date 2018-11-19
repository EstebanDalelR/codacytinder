package com.foursquare.pilgrim;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.job.C1133b;
import com.evernote.android.job.C1139e;
import com.foursquare.internal.data.db.DatabaseProvider;
import com.foursquare.internal.network.C1920b;
import com.foursquare.internal.network.C1923d;
import com.foursquare.internal.network.C1928e;
import com.foursquare.internal.util.C1940b;
import com.foursquare.internal.util.FsLog;
import java.security.SecureRandom;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

@RestrictTo({Scope.LIBRARY})
class au {
    /* renamed from: a */
    private static final String f5310a = "au";

    /* renamed from: com.foursquare.pilgrim.au$1 */
    class C35331 implements as {
        C35331() {
        }

        /* renamed from: a */
        public boolean mo2046a() {
            return bh.m7123c();
        }
    }

    au() {
    }

    @MainThread
    /* renamed from: a */
    void m6977a(@NonNull Context context) {
        FsLog.m6800a(f5310a, "Initializing the Pilgrim SDK");
        C1139e.m3820a(context).m3831a(new C3565o());
        bh.m7111a(context);
        ao.m6945a(context);
        PilgrimSdk.m6875a(new PilgrimSdk(context, av.m6987a(), new ba(context)));
        C1133b.m3795a(new C3566p());
        String a = C1971b.m7058a(context, "pilgrim_sdk_hostname", "sdk.foursquare.com");
        String a2 = C1971b.m7058a(context, "pilgrim_sdk_path_prefix", "");
        if ("".equals(a2) || !(a2.startsWith("/") || a2.endsWith("/"))) {
            m6975a(m6973a(context, "pilgrim_sdk_key"), m6973a(context, "pilgrim_sdk_secret"), new Builder().a("https").d(a).c(), a2);
            m6976b(context);
            FsLog.m6800a(f5310a, "Pilgrim SDK initialization complete");
            return;
        }
        throw new IllegalArgumentException("Path prefix must not contain leading or trailing '/'");
    }

    /* renamed from: a */
    void m6978a(@NonNull String str, @NonNull String str2) {
        C1920b.m6688a().m6695a(str, str2);
        m6974a();
    }

    /* renamed from: b */
    private static void m6976b(@NonNull Context context) {
        bf.m7090a(context);
        DatabaseProvider.m6656a(context, "pilgrimsdk.db", 42, null, C1981f.f5387a);
        byte[] k = bh.m7135k();
        if (k == null) {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            bh.m7114a(bArr);
            k = bArr;
        }
        C1940b.m6818a(false, k);
        C1923d.m6726a(context);
        ax.m7005a(context);
        aj.m6924a(new aj(new bl(), new C35331(), PilgrimLogger.f5244a));
        m6974a();
    }

    /* renamed from: a */
    private static void m6975a(@NonNull String str, @NonNull String str2, @NonNull HttpUrl httpUrl, @NonNull String str3) {
        C1920b.m6689a(al.m6935b(), BuildConfig.API_VERSION, 1, str, str2, httpUrl, str3, null, false);
    }

    @NonNull
    /* renamed from: a */
    private static String m6973a(@NonNull Context context, @NonNull String str) {
        context = C1971b.m7058a(context, str, "");
        if (TextUtils.isEmpty(context) != null) {
            Log.w(f5310a, "Missing client information in the manifest, must use PilgrimSdk.with to initialize these values");
        }
        return context;
    }

    /* renamed from: a */
    private static void m6974a() {
        if (!bh.m7126d() && !TextUtils.isEmpty(C1920b.m6688a().m6698c())) {
            C1928e.m6757a().m6760a(bf.m7089a().m7099b());
            bh.m7119b(true);
        }
    }
}
