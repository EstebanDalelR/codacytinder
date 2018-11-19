package com.tinder.usecase;

import android.os.Bundle;
import com.firebase.jobdispatcher.C1886n;
import com.firebase.jobdispatcher.FirebaseJobDispatcher;
import com.firebase.jobdispatcher.RetryStrategy;
import com.tinder.api.model.purchase.PurchaseLog.Source;
import com.tinder.domain.common.usecase.VoidUseCase;
import com.tinder.purchase.job.ReportBillingTimeoutService;
import com.tinder.utils.RxUtils;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Completable;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/usecase/StartBillingTimeoutJob;", "Lcom/tinder/domain/common/usecase/VoidUseCase;", "Lcom/tinder/usecase/StartBillingTimeoutJob$Request;", "jobDispatcher", "Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;", "(Lcom/firebase/jobdispatcher/FirebaseJobDispatcher;)V", "execute", "", "request", "Request", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.usecase.j */
public final class C17225j implements VoidUseCase<C15345a> {
    /* renamed from: a */
    private final FirebaseJobDispatcher f52805a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/usecase/StartBillingTimeoutJob$Request;", "", "responseBody", "", "source", "Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "(Ljava/lang/String;Lcom/tinder/api/model/purchase/PurchaseLog$Source;)V", "getResponseBody", "()Ljava/lang/String;", "getSource", "()Lcom/tinder/api/model/purchase/PurchaseLog$Source;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.j$a */
    public static final class C15345a {
        /* renamed from: a */
        public static final C15344a f47579a = new C15344a();
        @NotNull
        /* renamed from: d */
        private static final String f47580d = "StartBillingTimeoutJob.Request#source";
        @NotNull
        /* renamed from: e */
        private static final String f47581e = "StartBillingTimeoutJob.Request#responseBody";
        @Nullable
        /* renamed from: b */
        private final String f47582b;
        @NotNull
        /* renamed from: c */
        private final Source f47583c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/usecase/StartBillingTimeoutJob$Request$Companion;", "", "()V", "RESPONSE_BODY_KEY", "", "getRESPONSE_BODY_KEY", "()Ljava/lang/String;", "SOURCE_KEY", "getSOURCE_KEY", "Tinder_release"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.usecase.j$a$a */
        public static final class C15344a {
            private C15344a() {
            }

            @NotNull
            /* renamed from: a */
            public final String m57550a() {
                return C15345a.f47580d;
            }

            @NotNull
            /* renamed from: b */
            public final String m57551b() {
                return C15345a.f47581e;
            }
        }

        @JvmOverloads
        public C15345a() {
            this(null, null, 3, null);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C15345a) {
                    C15345a c15345a = (C15345a) obj;
                    if (C2668g.a(this.f47582b, c15345a.f47582b) && C2668g.a(this.f47583c, c15345a.f47583c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f47582b;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Source source = this.f47583c;
            if (source != null) {
                i = source.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(responseBody=");
            stringBuilder.append(this.f47582b);
            stringBuilder.append(", source=");
            stringBuilder.append(this.f47583c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        @JvmOverloads
        public C15345a(@Nullable String str, @NotNull Source source) {
            C2668g.b(source, "source");
            this.f47582b = str;
            this.f47583c = source;
        }

        @Nullable
        /* renamed from: a */
        public final String m57554a() {
            return this.f47582b;
        }

        @JvmOverloads
        public /* synthetic */ C15345a(String str, Source source, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                str = "";
            }
            if ((i & 2) != 0) {
                source = Source.OTHER;
            }
            this(str, source);
        }

        @NotNull
        /* renamed from: b */
        public final Source m57555b() {
            return this.f47583c;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.usecase.j$b */
    static final class C18986b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ C17225j f58724a;
        /* renamed from: b */
        final /* synthetic */ int f58725b;
        /* renamed from: c */
        final /* synthetic */ int f58726c;
        /* renamed from: d */
        final /* synthetic */ Bundle f58727d;

        C18986b(C17225j c17225j, int i, int i2, Bundle bundle) {
            this.f58724a = c17225j;
            this.f58725b = i;
            this.f58726c = i2;
            this.f58727d = bundle;
        }

        public final void call() {
            this.f58724a.f52805a.a(this.f58724a.f52805a.a().a(ReportBillingTimeoutService.class).a(C1886n.a(this.f58725b, this.f58726c)).a(2).a("billing-timeout-report-job").a(true).a(RetryStrategy.f5101b).a(this.f58727d).a());
        }
    }

    @Inject
    public C17225j(@NotNull FirebaseJobDispatcher firebaseJobDispatcher) {
        C2668g.b(firebaseJobDispatcher, "jobDispatcher");
        this.f52805a = firebaseJobDispatcher;
    }

    public /* synthetic */ void execute(Object obj) {
        m63114a((C15345a) obj);
    }

    /* renamed from: a */
    public void m63114a(@NotNull C15345a c15345a) {
        C2668g.b(c15345a, "request");
        int toSeconds = (int) TimeUnit.MINUTES.toSeconds(1);
        int toSeconds2 = ((int) TimeUnit.MINUTES.toSeconds(5)) + toSeconds;
        Bundle bundle = new Bundle();
        bundle.putString(C15345a.f47579a.m57550a(), c15345a.m57555b().name());
        bundle.putString(C15345a.f47579a.m57551b(), c15345a.m57554a());
        Completable.a((Action0) new C18986b(this, toSeconds, toSeconds2, bundle)).b(Schedulers.io()).b(RxUtils.b());
    }
}
