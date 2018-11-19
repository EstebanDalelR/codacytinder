package com.tinder.pushnotifications;

import android.os.Bundle;
import android.text.TextUtils;
import com.leanplum.LeanplumPushListenerService;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.fastmatch.provider.FastMatchConfigProvider;
import com.tinder.etl.event.su;
import com.tinder.etl.event.su.C9258a;
import com.tinder.managers.ManagerAnalytics;
import com.tinder.managers.ManagerApp;
import com.tinder.model.SparksEvent;
import com.tinder.pushnotifications.model.TinderNotification;
import com.tinder.pushnotifications.p380a.C14548a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19292p;
import kotlin.text.C19296q;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 )2\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020&H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/tinder/pushnotifications/TinderGcmListenerService;", "Lcom/leanplum/LeanplumPushListenerService;", "()V", "dispatcher", "Lcom/tinder/pushnotifications/NotificationDispatcher;", "getDispatcher", "()Lcom/tinder/pushnotifications/NotificationDispatcher;", "setDispatcher", "(Lcom/tinder/pushnotifications/NotificationDispatcher;)V", "fastMatchConfigProvider", "Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "getFastMatchConfigProvider", "()Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;", "setFastMatchConfigProvider", "(Lcom/tinder/domain/fastmatch/provider/FastMatchConfigProvider;)V", "fireworks", "Lcom/tinder/analytics/fireworks/Fireworks;", "getFireworks", "()Lcom/tinder/analytics/fireworks/Fireworks;", "setFireworks", "(Lcom/tinder/analytics/fireworks/Fireworks;)V", "managerAnalytics", "Lcom/tinder/managers/ManagerAnalytics;", "getManagerAnalytics", "()Lcom/tinder/managers/ManagerAnalytics;", "setManagerAnalytics", "(Lcom/tinder/managers/ManagerAnalytics;)V", "tinderNotificationFactory", "Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "getTinderNotificationFactory", "()Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;", "setTinderNotificationFactory", "(Lcom/tinder/pushnotifications/factory/TinderNotificationFactory;)V", "onMessageReceived", "", "from", "", "data", "Landroid/os/Bundle;", "trackLeanplumPushReceived", "trackTinderPushReceived", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderGcmListenerService extends LeanplumPushListenerService {
    /* renamed from: f */
    public static final C14543a f58109f = new C14543a();
    @Inject
    @NotNull
    /* renamed from: a */
    public C14550a f58110a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C2630h f58111b;
    @Inject
    @NotNull
    /* renamed from: c */
    public C14548a f58112c;
    @Inject
    @NotNull
    /* renamed from: d */
    public FastMatchConfigProvider f58113d;
    @Inject
    @NotNull
    /* renamed from: e */
    public ManagerAnalytics f58114e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tinder/pushnotifications/TinderGcmListenerService$Companion;", "", "()V", "EMPTY_STRING", "", "LEANPLUM_MESSAGE_IDENTIFIER", "LEANPLUM_TYPE_IDENTIFIER", "NOTIFICATION_PREFIX", "STRIPPED_CHARS_REGEX", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.pushnotifications.TinderGcmListenerService$a */
    public static final class C14543a {
        private C14543a() {
        }
    }

    public TinderGcmListenerService() {
        ManagerApp.e().inject(this);
    }

    public void onMessageReceived(@NotNull String str, @NotNull Bundle bundle) {
        C2668g.b(str, ManagerWebServices.PARAM_FROM);
        C2668g.b(bundle, ManagerWebServices.FB_DATA);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Got notification from ");
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(bundle);
        C0001a.b(stringBuilder.toString(), new Object[0]);
        super.onMessageReceived(str, bundle);
        if (bundle.containsKey("lp_message") != null) {
            m67086b(bundle);
            return;
        }
        m67085a(bundle);
        str = this.f58112c;
        if (str == null) {
            C2668g.b("tinderNotificationFactory");
        }
        TinderNotification a = str.m55562a(bundle);
        if (a != null) {
            bundle = this.f58110a;
            if (bundle == null) {
                C2668g.b("dispatcher");
            }
            bundle.m55573a(a);
        }
    }

    /* renamed from: a */
    private final void m67085a(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        SparksEvent put = new SparksEvent("Push.Receive").put("source", 0);
        for (String str : keySet) {
            C2668g.a(str, "key");
            String a = C19296q.m68672a(str, "notification.", "", false, 4, null);
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                put.put(a, Regex.f49051a.m59917a("^\"|\"$").m59919a((CharSequence) obj, ""));
            } else if (obj instanceof Boolean) {
                put.put(a, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                put.put(a, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                put.put(a, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                put.put(a, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                put.put(a, ((Number) obj).doubleValue());
            } else if (obj instanceof Character) {
                put.put(a, ((Character) obj).charValue());
            } else if (obj instanceof Byte) {
                put.put(a, ((Number) obj).byteValue());
            } else if (obj instanceof int[]) {
                put.put(a, (int[]) obj);
            } else if (obj instanceof byte[]) {
                put.put(a, (byte[]) obj);
            } else if (obj instanceof char[]) {
                put.put(a, (char[]) obj);
            } else if (obj instanceof Map) {
                HashMap hashMap = new HashMap();
                Map map = (Map) obj;
                Collection arrayList = new ArrayList();
                for (Object next : map.keySet()) {
                    if (next instanceof String) {
                        arrayList.add(next);
                    }
                }
                for (String str2 : (List) arrayList) {
                    hashMap.put(str2, map.get(str2));
                }
                put.put(a, hashMap);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported data value: ");
                stringBuilder.append(obj);
                C0001a.e(stringBuilder.toString(), new Object[0]);
            }
        }
        bundle = this.f58114e;
        if (bundle == null) {
            C2668g.b("managerAnalytics");
        }
        bundle.a(put);
    }

    /* renamed from: b */
    private final void m67086b(Bundle bundle) {
        C9258a b = su.a().b(Integer.valueOf(1));
        String string = bundle.getString("type");
        if (!TextUtils.isEmpty(string)) {
            b.b(string);
        }
        if (C2668g.a(string, "fast_match")) {
            FastMatchConfigProvider fastMatchConfigProvider = this.f58113d;
            if (fastMatchConfigProvider == null) {
                C2668g.b("fastMatchConfigProvider");
            }
            if (fastMatchConfigProvider.get().isEnabled()) {
                string = bundle.getString("lp_message");
                bundle = bundle.getString("frequency");
                if (string != null) {
                    b.a(string);
                }
                if (bundle != null) {
                    bundle = C19292p.m68642c(bundle);
                    if (bundle != null) {
                        b.a(Integer.valueOf(((Number) bundle).intValue()));
                    }
                }
            }
        }
        bundle = this.f58111b;
        if (bundle == null) {
            C2668g.b("fireworks");
        }
        bundle.a(b.a());
    }
}
