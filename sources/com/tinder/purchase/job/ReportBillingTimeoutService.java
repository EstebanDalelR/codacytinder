package com.tinder.purchase.job;

import android.content.Context;
import android.os.Bundle;
import com.firebase.jobdispatcher.JobParameters;
import com.firebase.jobdispatcher.JobService;
import com.tinder.managers.ManagerApp;
import com.tinder.purchase.domain.exception.PurchaseClientException.PurchaseTimeoutException;
import com.tinder.purchase.logging.C14522a;
import com.tinder.usecase.C17225j.C15345a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/tinder/purchase/job/ReportBillingTimeoutService;", "Lcom/firebase/jobdispatcher/JobService;", "()V", "purchaseLogger", "Lcom/tinder/purchase/logging/PurchaseLogger;", "getPurchaseLogger$Tinder_release", "()Lcom/tinder/purchase/logging/PurchaseLogger;", "setPurchaseLogger$Tinder_release", "(Lcom/tinder/purchase/logging/PurchaseLogger;)V", "onStartJob", "", "parameters", "Lcom/firebase/jobdispatcher/JobParameters;", "onStopJob", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class ReportBillingTimeoutService extends JobService {
    /* renamed from: b */
    public static final C14518a f50560b = new C14518a();
    @Inject
    @NotNull
    /* renamed from: a */
    public C14522a f50561a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/purchase/job/ReportBillingTimeoutService$Companion;", "", "()V", "JOB_NAME", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.purchase.job.ReportBillingTimeoutService$a */
    public static final class C14518a {
        private C14518a() {
        }
    }

    /* renamed from: b */
    public boolean m61279b(@Nullable JobParameters jobParameters) {
        return false;
    }

    /* renamed from: a */
    public boolean m61278a(@Nullable JobParameters jobParameters) {
        Context applicationContext = getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        String string;
        ((ManagerApp) applicationContext).h().inject(this);
        String str = null;
        if (jobParameters != null) {
            Bundle extras = jobParameters.getExtras();
            if (extras != null) {
                string = extras.getString(C15345a.f47579a.m57551b());
                if (jobParameters != null) {
                    jobParameters = jobParameters.getExtras();
                    if (jobParameters != null) {
                        str = jobParameters.getString(C15345a.f47579a.m57550a());
                    }
                }
                jobParameters = this.f50561a;
                if (jobParameters == null) {
                    C2668g.b("purchaseLogger");
                }
                jobParameters.m55478a(new PurchaseTimeoutException(string, str));
                return null;
            }
        }
        string = null;
        if (jobParameters != null) {
            jobParameters = jobParameters.getExtras();
            if (jobParameters != null) {
                str = jobParameters.getString(C15345a.f47579a.m57550a());
            }
        }
        jobParameters = this.f50561a;
        if (jobParameters == null) {
            C2668g.b("purchaseLogger");
        }
        jobParameters.m55478a(new PurchaseTimeoutException(string, str));
        return null;
    }
}
