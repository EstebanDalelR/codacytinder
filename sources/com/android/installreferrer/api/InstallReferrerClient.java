package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
    }

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$a */
    public static final class C0897a {
        /* renamed from: a */
        private final Context f2324a;

        private C0897a(Context context) {
            this.f2324a = context;
        }

        @UiThread
        /* renamed from: a */
        public InstallReferrerClient m3023a() {
            if (this.f2324a != null) {
                return new InstallReferrerClientImpl(this.f2324a);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    @UiThread
    /* renamed from: a */
    public abstract void mo1180a();

    @UiThread
    /* renamed from: a */
    public abstract void mo1181a(@NonNull InstallReferrerStateListener installReferrerStateListener);

    @UiThread
    /* renamed from: b */
    public abstract C0900a mo1182b() throws RemoteException;

    @UiThread
    /* renamed from: a */
    public static C0897a m3024a(@NonNull Context context) {
        return new C0897a(context);
    }
}
