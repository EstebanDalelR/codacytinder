package com.tinder.overflow.model;

import com.tinder.enums.ReportCause;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, k = 3, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.model.c */
public final /* synthetic */ class C10030c {
    /* renamed from: a */
    public static final /* synthetic */ int[] f32914a = new int[ReportCause.values().length];

    static {
        f32914a[ReportCause.OTHER.ordinal()] = 1;
        f32914a[ReportCause.SPAM.ordinal()] = 2;
        f32914a[ReportCause.INAPPROPRIATE_PHOTOS.ordinal()] = 3;
        f32914a[ReportCause.OFFLINE_BEHAVIOR.ordinal()] = 4;
        f32914a[ReportCause.INAPPROPRIATE_MESSAGES.ordinal()] = 5;
    }
}
