package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public final class bp extends BasePendingResult<Status> {
    public bp(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* renamed from: a */
    protected final /* synthetic */ Result mo3568a(Status status) {
        return status;
    }
}
