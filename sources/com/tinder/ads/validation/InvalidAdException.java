package com.tinder.ads.validation;

import com.tinder.ads.AdException;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/ads/validation/InvalidAdException;", "Lcom/tinder/ads/AdException;", "message", "", "(Ljava/lang/String;)V", "aggregator_release"}, k = 1, mv = {1, 1, 7})
public final class InvalidAdException extends AdException {
    public InvalidAdException(@NotNull String str) {
        C2668g.b(str, "message");
        super(str);
    }
}
