package com.tinder.passport.provider;

import com.tinder.passport.model.C10044b;
import com.tinder.passport.model.PassportLocation;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/passport/provider/PassportLocationProvider;", "", "currentPassportLocation", "Lcom/tinder/passport/model/PassportLocation;", "observeUpdates", "Lrx/Observable;", "Lcom/tinder/passport/model/PassportLocationInfo;", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public interface PassportLocationProvider {
    @Nullable
    PassportLocation currentPassportLocation();

    @NotNull
    Observable<C10044b> observeUpdates();
}
