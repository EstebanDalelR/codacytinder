package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.support.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ad;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.zzan;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class Api<O extends ApiOptions> {
    /* renamed from: a */
    private final C3787a<?, O> f7410a;
    /* renamed from: b */
    private final C3789e<?, O> f7411b = null;
    /* renamed from: c */
    private final C3788d<?> f7412c;
    /* renamed from: d */
    private final C3790f<?> f7413d;
    /* renamed from: e */
    private final String f7414e;

    public interface ApiOptions {

        public interface HasOptions extends ApiOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }

        public interface HasAccountOptions extends HasOptions, NotRequiredOptions {
            Account getAccount();
        }

        public interface HasGoogleSignInAccountOptions extends HasOptions {
            GoogleSignInAccount getGoogleSignInAccount();
        }

        public interface Optional extends HasOptions, NotRequiredOptions {
        }
    }

    /* renamed from: com.google.android.gms.common.api.Api$b */
    public static class C2462b<C extends zzb> {
    }

    /* renamed from: com.google.android.gms.common.api.Api$c */
    public static abstract class C2463c<T extends zzb, O> {
        /* renamed from: a */
        public int m8842a() {
            return ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }

        /* renamed from: a */
        public List<Scope> mo3559a(O o) {
            return Collections.emptyList();
        }
    }

    public interface zzb {
    }

    /* renamed from: com.google.android.gms.common.api.Api$a */
    public static abstract class C3787a<T extends zze, O> extends C2463c<T, O> {
        /* renamed from: a */
        public abstract T mo3558a(Context context, Looper looper, av avVar, O o, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener);
    }

    /* renamed from: com.google.android.gms.common.api.Api$d */
    public static final class C3788d<C extends zze> extends C2462b<C> {
    }

    /* renamed from: com.google.android.gms.common.api.Api$e */
    public static abstract class C3789e<T extends zzg, O> extends C2463c<T, O> {
    }

    /* renamed from: com.google.android.gms.common.api.Api$f */
    public static final class C3790f<C extends zzg> extends C2462b<C> {
    }

    public interface zze extends zzb {
        void disconnect();

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void zza(zzan zzan, Set<Scope> set);

        void zza(zzj zzj);

        void zza(zzp zzp);

        boolean zzaay();

        boolean zzabj();

        boolean zzagg();

        @Nullable
        IBinder zzagh();

        String zzagi();
    }

    public interface zzg<T extends IInterface> extends zzb {
    }

    public <C extends zze> Api(String str, C3787a<C, O> c3787a, C3788d<C> c3788d) {
        ad.m9046a((Object) c3787a, (Object) "Cannot construct an Api with a null ClientBuilder");
        ad.m9046a((Object) c3788d, (Object) "Cannot construct an Api with a null ClientKey");
        this.f7414e = str;
        this.f7410a = c3787a;
        this.f7412c = c3788d;
        this.f7413d = null;
    }

    /* renamed from: a */
    public final C2463c<?, O> m8844a() {
        return this.f7410a;
    }

    /* renamed from: b */
    public final C3787a<?, O> m8845b() {
        ad.m9051a(this.f7410a != null, (Object) "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f7410a;
    }

    /* renamed from: c */
    public final C2462b<?> m8846c() {
        if (this.f7412c != null) {
            return this.f7412c;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: d */
    public final String m8847d() {
        return this.f7414e;
    }
}
