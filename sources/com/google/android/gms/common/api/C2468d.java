package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.api.internal.bp;
import com.google.android.gms.common.internal.ad;

/* renamed from: com.google.android.gms.common.api.d */
public final class C2468d {

    /* renamed from: com.google.android.gms.common.api.d$a */
    static final class C4290a<R extends Result> extends BasePendingResult<R> {
        /* renamed from: a */
        private final R f13943a;

        public C4290a(GoogleApiClient googleApiClient, R r) {
            super(googleApiClient);
            this.f13943a = r;
        }

        /* renamed from: a */
        protected final R mo3568a(Status status) {
            return this.f13943a;
        }
    }

    /* renamed from: com.google.android.gms.common.api.d$b */
    static final class C4291b<R extends Result> extends BasePendingResult<R> {
        public C4291b(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: a */
        protected final R mo3568a(Status status) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    /* renamed from: a */
    public static <R extends Result> PendingResult<R> m8908a(R r, GoogleApiClient googleApiClient) {
        ad.m9046a((Object) r, (Object) "Result must not be null");
        ad.m9055b(r.getStatus().isSuccess() ^ 1, "Status code must not be SUCCESS");
        PendingResult c4290a = new C4290a(googleApiClient, r);
        c4290a.m14223a((Result) r);
        return c4290a;
    }

    /* renamed from: a */
    public static PendingResult<Status> m8909a(Status status, GoogleApiClient googleApiClient) {
        ad.m9046a((Object) status, (Object) "Result must not be null");
        PendingResult bpVar = new bp(googleApiClient);
        bpVar.m14223a((Result) status);
        return bpVar;
    }

    /* renamed from: b */
    public static <R extends Result> C3791c<R> m8910b(R r, GoogleApiClient googleApiClient) {
        ad.m9046a((Object) r, (Object) "Result must not be null");
        PendingResult c4291b = new C4291b(googleApiClient);
        c4291b.m14223a((Result) r);
        return new bf(c4291b);
    }
}
