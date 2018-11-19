package com.tinder.pushnotifications;

import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2632i.C2631a;
import com.tinder.analytics.fireworks.C2633r;
import com.tinder.analytics.fireworks.EventInterceptor;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/pushnotifications/PushReceiveBugInterceptor;", "Lcom/tinder/analytics/fireworks/EventInterceptor;", "()V", "intercept", "Lcom/tinder/analytics/fireworks/FireworksEvent;", "builder", "Lcom/tinder/analytics/fireworks/FireworksEvent$Builder;", "PushReceivedLoggingException", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PushReceiveBugInterceptor implements EventInterceptor {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tinder/pushnotifications/PushReceiveBugInterceptor$PushReceivedLoggingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class PushReceivedLoggingException extends Exception {
        public PushReceivedLoggingException(@NotNull String str) {
            C2668g.b(str, "message");
            super(str);
        }
    }

    @NotNull
    public C2632i intercept(@NotNull C2631a c2631a) {
        C2668g.b(c2631a, "builder");
        c2631a = c2631a.a();
        C2668g.a(c2631a, "event");
        if (C2668g.a(c2631a.b(), "Push.Receive")) {
            Map c = c2631a.c();
            Collection arrayList = new ArrayList();
            for (Object next : c.keySet()) {
                C2633r c2633r = (C2633r) next;
                C2668g.a(c2633r, "it");
                if (C2668g.a(c2633r.a(), "type")) {
                    arrayList.add(next);
                }
            }
            C2633r c2633r2 = (C2633r) C19299w.m68831g((List) arrayList);
            if (c2633r2 == null || C2668g.a(c.get(c2633r2), ManagerWebServices.NULL_STRING_VALUE)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found Push.Receive event with null type:\n");
                stringBuilder.append(c2631a.toString());
                for (C2633r c2633r3 : c.keySet()) {
                    stringBuilder.append("\n");
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("");
                    C2668g.a(c2633r3, "key");
                    stringBuilder2.append(c2633r3.a());
                    stringBuilder2.append(": ");
                    stringBuilder2.append(c.get(c2633r3));
                    stringBuilder.append(stringBuilder2.toString());
                }
                String stringBuilder3 = stringBuilder.toString();
                C2668g.a(stringBuilder3, "stringBuilder.toString()");
                C0001a.c(new PushReceivedLoggingException(stringBuilder3));
            }
        }
        return c2631a;
    }
}
