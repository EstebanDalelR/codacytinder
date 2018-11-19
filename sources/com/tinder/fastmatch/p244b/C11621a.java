package com.tinder.fastmatch.p244b;

import com.tinder.api.TinderApi;
import com.tinder.api.response.v2.FastMatchRecsResponse;
import com.tinder.data.adapter.ah;
import com.tinder.data.recs.C8786k;
import com.tinder.data.recs.C8786k.C10994b;
import com.tinder.data.recs.C8786k.C10996d;
import com.tinder.domain.recs.RecsApiClient;
import com.tinder.domain.recs.RecsEngine.ResetReason;
import com.tinder.domain.recs.model.Rec$Source;
import com.tinder.domain.recs.model.RecSource.FastMatch;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Single;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0003!\"#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0003J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u0018J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017J\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u0010\u0010 \u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u0014H\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR2\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsApiClient;", "Lcom/tinder/domain/recs/RecsApiClient;", "tinderApi", "Lcom/tinder/api/TinderApi;", "recDomainApiAdapter", "Lcom/tinder/data/adapter/RecDomainApiAdapter;", "(Lcom/tinder/api/TinderApi;Lcom/tinder/data/adapter/RecDomainApiAdapter;)V", "recSource", "Lcom/tinder/domain/recs/model/RecSource$FastMatch;", "getRecSource", "()Lcom/tinder/domain/recs/model/RecSource$FastMatch;", "recsResponseSubject", "Lrx/subjects/PublishSubject;", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse;", "kotlin.jvm.PlatformType", "state", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$State;", "createRecsFetchResults", "Lcom/tinder/data/recs/RecsFetchResults;", "response", "Lcom/tinder/api/response/v2/FastMatchRecsResponse;", "loadRecs", "Lrx/Single;", "observeRecResponse", "Lrx/Observable;", "reset", "", "reason", "Lcom/tinder/domain/recs/RecsEngine$ResetReason;", "updateResponse", "isFirstPage", "", "updateState", "Companion", "RecResponse", "State", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.fastmatch.b.a */
public final class C11621a implements RecsApiClient {
    /* renamed from: a */
    public static final C9374a f38035a = new C9374a();
    /* renamed from: g */
    private static final int f38036g = 20;
    @NotNull
    /* renamed from: b */
    private final FastMatch f38037b = FastMatch.INSTANCE;
    /* renamed from: c */
    private final PublishSubject<C9375b> f38038c = PublishSubject.w();
    /* renamed from: d */
    private C9376c f38039d = new C9376c(false, null, 3, null);
    /* renamed from: e */
    private final TinderApi f38040e;
    /* renamed from: f */
    private final ah f38041f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$Companion;", "", "()V", "PAGE_SIZE", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.a$a */
    public static final class C9374a {
        private C9374a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse;", "", "()V", "FirstPage", "NotFirstPage", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse$FirstPage;", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse$NotFirstPage;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.a$b */
    public static abstract class C9375b {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse$FirstPage;", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse;", "response", "Lcom/tinder/api/response/v2/FastMatchRecsResponse;", "(Lcom/tinder/api/response/v2/FastMatchRecsResponse;)V", "getResponse", "()Lcom/tinder/api/response/v2/FastMatchRecsResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.b.a$b$a */
        public static final class C11619a extends C9375b {
            @NotNull
            /* renamed from: a */
            private final FastMatchRecsResponse f38033a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C11619a) {
                        if (C2668g.a(this.f38033a, ((C11619a) obj).f38033a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                FastMatchRecsResponse fastMatchRecsResponse = this.f38033a;
                return fastMatchRecsResponse != null ? fastMatchRecsResponse.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FirstPage(response=");
                stringBuilder.append(this.f38033a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C11619a(@NotNull FastMatchRecsResponse fastMatchRecsResponse) {
                C2668g.b(fastMatchRecsResponse, "response");
                super();
                this.f38033a = fastMatchRecsResponse;
            }

            @NotNull
            /* renamed from: a */
            public final FastMatchRecsResponse m47355a() {
                return this.f38033a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse$NotFirstPage;", "Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$RecResponse;", "response", "Lcom/tinder/api/response/v2/FastMatchRecsResponse;", "(Lcom/tinder/api/response/v2/FastMatchRecsResponse;)V", "getResponse", "()Lcom/tinder/api/response/v2/FastMatchRecsResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.fastmatch.b.a$b$b */
        public static final class C11620b extends C9375b {
            @NotNull
            /* renamed from: a */
            private final FastMatchRecsResponse f38034a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C11620b) {
                        if (C2668g.a(this.f38034a, ((C11620b) obj).f38034a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                FastMatchRecsResponse fastMatchRecsResponse = this.f38034a;
                return fastMatchRecsResponse != null ? fastMatchRecsResponse.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("NotFirstPage(response=");
                stringBuilder.append(this.f38034a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C11620b(@NotNull FastMatchRecsResponse fastMatchRecsResponse) {
                C2668g.b(fastMatchRecsResponse, "response");
                super();
                this.f38034a = fastMatchRecsResponse;
            }
        }

        private C9375b() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/fastmatch/data/FastMatchRecsApiClient$State;", "", "hasMoreRecs", "", "nextPageToken", "", "(ZLjava/lang/String;)V", "getHasMoreRecs", "()Z", "getNextPageToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.a$c */
    private static final class C9376c {
        /* renamed from: a */
        private final boolean f31457a;
        @Nullable
        /* renamed from: b */
        private final String f31458b;

        public C9376c() {
            this(false, null, 3, null);
        }

        @NotNull
        /* renamed from: a */
        public final C9376c m39268a(boolean z, @Nullable String str) {
            return new C9376c(z, str);
        }

        /* renamed from: a */
        public final boolean m39269a() {
            return this.f31457a;
        }

        @Nullable
        /* renamed from: b */
        public final String m39270b() {
            return this.f31458b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9376c) {
                C9376c c9376c = (C9376c) obj;
                return (this.f31457a == c9376c.f31457a ? 1 : null) != null && C2668g.a(this.f31458b, c9376c.f31458b);
            }
        }

        public int hashCode() {
            int i = this.f31457a;
            if (i != 0) {
                i = 1;
            }
            i *= 31;
            String str = this.f31458b;
            return i + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("State(hasMoreRecs=");
            stringBuilder.append(this.f31457a);
            stringBuilder.append(", nextPageToken=");
            stringBuilder.append(this.f31458b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C9376c(boolean z, @Nullable String str) {
            this.f31457a = z;
            this.f31458b = str;
        }

        public /* synthetic */ C9376c(boolean z, String str, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                z = true;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            this(z, str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Single;", "Lcom/tinder/data/recs/RecsFetchResults;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.fastmatch.b.a$d */
    static final class C9377d<V> implements Callable<Single<T>> {
        /* renamed from: a */
        final /* synthetic */ C11621a f31459a;

        C9377d(C11621a c11621a) {
            this.f31459a = c11621a;
        }

        public /* synthetic */ Object call() {
            return m39271a();
        }

        /* renamed from: a */
        public final Single<C8786k> m39271a() {
            C9376c a = this.f31459a.f38039d;
            boolean a2 = a.m39269a();
            String b = a.m39270b();
            final boolean z = b == null;
            if (a2) {
                return this.f31459a.f38040e.fetchFastMatchRecs(C11621a.f38036g, b).d(new Action1<FastMatchRecsResponse>() {
                    public /* synthetic */ void call(Object obj) {
                        m53450a((FastMatchRecsResponse) obj);
                    }

                    /* renamed from: a */
                    public final void m53450a(FastMatchRecsResponse fastMatchRecsResponse) {
                        C11621a c11621a = this.f31459a;
                        C2668g.a(fastMatchRecsResponse, "it");
                        c11621a.m47357a(fastMatchRecsResponse);
                        this.f31459a.m47358a(fastMatchRecsResponse, z);
                    }
                }).d(new Func1<T, R>() {
                    public /* synthetic */ Object call(Object obj) {
                        return m51134a((FastMatchRecsResponse) obj);
                    }

                    @NotNull
                    /* renamed from: a */
                    public final C8786k m51134a(FastMatchRecsResponse fastMatchRecsResponse) {
                        C11621a c11621a = this.f31459a;
                        C2668g.a(fastMatchRecsResponse, "it");
                        return c11621a.m47362b(fastMatchRecsResponse);
                    }
                });
            }
            return Single.a(new C10994b(null, 1, null));
        }
    }

    public C11621a(@NotNull TinderApi tinderApi, @NotNull ah ahVar) {
        C2668g.b(tinderApi, "tinderApi");
        C2668g.b(ahVar, "recDomainApiAdapter");
        this.f38040e = tinderApi;
        this.f38041f = ahVar;
    }

    public /* synthetic */ Rec$Source getRecSource() {
        return m47365a();
    }

    @NotNull
    /* renamed from: a */
    public FastMatch m47365a() {
        return this.f38037b;
    }

    public synchronized void reset(@NotNull ResetReason resetReason) {
        C2668g.b(resetReason, "reason");
        this.f38039d = new C9376c(false, null, 3, null);
    }

    @NotNull
    /* renamed from: b */
    public final Observable<C9375b> m47366b() {
        Observable<C9375b> e = this.f38038c.e();
        C2668g.a(e, "recsResponseSubject.asObservable()");
        return e;
    }

    @NotNull
    public Single<C8786k> loadRecs() {
        Single<C8786k> b = Single.b(new C9377d(this));
        C2668g.a(b, "Single.defer<RecsFetchRe…}\n            }\n        }");
        return b;
    }

    /* renamed from: a */
    private final synchronized void m47358a(FastMatchRecsResponse fastMatchRecsResponse, boolean z) {
        if (z) {
            z = (C9375b) new C11619a(fastMatchRecsResponse);
        } else {
            z = (C9375b) new C11620b(fastMatchRecsResponse);
        }
        this.f38038c.onNext(z);
    }

    /* renamed from: a */
    private final synchronized void m47357a(FastMatchRecsResponse fastMatchRecsResponse) {
        fastMatchRecsResponse = fastMatchRecsResponse.data();
        fastMatchRecsResponse = fastMatchRecsResponse != null ? fastMatchRecsResponse.nextPageToken() : null;
        this.f38039d = this.f38039d.m39268a(fastMatchRecsResponse != null, fastMatchRecsResponse);
    }

    /* renamed from: b */
    private final synchronized C8786k m47362b(FastMatchRecsResponse fastMatchRecsResponse) {
        C8786k c10996d;
        fastMatchRecsResponse = fastMatchRecsResponse.data();
        String nextPageToken = fastMatchRecsResponse != null ? fastMatchRecsResponse.nextPageToken() : null;
        if (fastMatchRecsResponse != null) {
            fastMatchRecsResponse = fastMatchRecsResponse.results();
            if (fastMatchRecsResponse != null) {
                fastMatchRecsResponse = this.f38041f.a(fastMatchRecsResponse);
                if (nextPageToken == null) {
                    C2668g.a(fastMatchRecsResponse, "recs");
                    c10996d = new C10996d(fastMatchRecsResponse);
                } else {
                    C2668g.a(fastMatchRecsResponse, "recs");
                    c10996d = new C10994b(fastMatchRecsResponse);
                }
            }
        }
        fastMatchRecsResponse = C19301m.a();
        fastMatchRecsResponse = this.f38041f.a(fastMatchRecsResponse);
        if (nextPageToken == null) {
            C2668g.a(fastMatchRecsResponse, "recs");
            c10996d = new C10994b(fastMatchRecsResponse);
        } else {
            C2668g.a(fastMatchRecsResponse, "recs");
            c10996d = new C10996d(fastMatchRecsResponse);
        }
        return c10996d;
    }
}
