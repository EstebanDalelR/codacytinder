package com.tinder.addy.source.fan;

import com.facebook.ads.AdError;
import com.tinder.addy.AdException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C15828l;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/addy/source/fan/FanException;", "Lcom/tinder/addy/AdException;", "adError", "Lcom/facebook/ads/AdError;", "(Lcom/facebook/ads/AdError;)V", "addy-source-fan_release"}, k = 1, mv = {1, 1, 10})
public final class FanException extends AdException {
    public FanException(@NotNull AdError adError) {
        C2668g.b(adError, "adError");
        C15828l c15828l = C15828l.f49033a;
        Locale locale = Locale.ENGLISH;
        C2668g.a(locale, "Locale.ENGLISH");
        Object[] objArr = new Object[]{Integer.valueOf(adError.getErrorCode()), adError.getErrorMessage()};
        adError = String.format(locale, "FAN AdError with code [%d] and message [%s]", Arrays.copyOf(objArr, objArr.length));
        C2668g.a(adError, "java.lang.String.format(locale, format, *args)");
        super(adError);
    }
}
