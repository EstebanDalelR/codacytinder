package com.tinder.ads;

import android.location.Location;
import kotlin.Metadata;
import rx.functions.Func1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
final class DfpFieldsResolverImpl$observeLocation$1<T, R> implements Func1<Location, Boolean> {
    public static final DfpFieldsResolverImpl$observeLocation$1 INSTANCE = new DfpFieldsResolverImpl$observeLocation$1();

    DfpFieldsResolverImpl$observeLocation$1() {
    }

    public final boolean call(Location location) {
        return location != null;
    }

    public /* synthetic */ Object call(Object obj) {
        return Boolean.valueOf(call((Location) obj));
    }
}
