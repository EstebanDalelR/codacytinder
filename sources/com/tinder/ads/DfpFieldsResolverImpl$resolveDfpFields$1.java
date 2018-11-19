package com.tinder.ads;

import android.location.Location;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.recs.card.CardSize;
import com.tinder.recsads.model.C14754b;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.functions.Func3;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lcom/tinder/recsads/model/DfpAdFields;", "location", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "Lcom/tinder/recs/card/CardSize;", "currentUser", "Lcom/tinder/domain/meta/model/CurrentUser;", "call"}, k = 3, mv = {1, 1, 10})
final class DfpFieldsResolverImpl$resolveDfpFields$1<T1, T2, T3, R> implements Func3<T1, T2, T3, R> {
    final /* synthetic */ DfpFieldsResolverImpl this$0;

    DfpFieldsResolverImpl$resolveDfpFields$1(DfpFieldsResolverImpl dfpFieldsResolverImpl) {
        this.this$0 = dfpFieldsResolverImpl;
    }

    @NotNull
    public final C14754b call(Location location, CardSize cardSize, CurrentUser currentUser) {
        C2668g.a(location, "location");
        DfpFieldsResolverImpl dfpFieldsResolverImpl = this.this$0;
        C2668g.a(currentUser, "currentUser");
        return new C14754b(location, dfpFieldsResolverImpl.parseAge(currentUser), this.this$0.parseGenderId(currentUser));
    }
}
