package com.tinder.toppicks.presenter;

import com.tinder.purchase.domain.model.TransactionFlowError.ReportType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.toppicks.presenter.k */
public final /* synthetic */ class C15290k {
    /* renamed from: a */
    public static final /* synthetic */ int[] f47434a = new int[ReportType.values().length];

    static {
        f47434a[ReportType.FATAL.ordinal()] = 1;
        f47434a[ReportType.NON_FATAL.ordinal()] = 2;
        f47434a[ReportType.SILENT.ordinal()] = 3;
        f47434a[ReportType.NON_PAYWALL_ONLY.ordinal()] = 4;
    }
}
