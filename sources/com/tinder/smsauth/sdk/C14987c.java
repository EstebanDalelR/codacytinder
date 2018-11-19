package com.tinder.smsauth.sdk;

import com.tinder.smsauth.entity.SmsAuthType;
import com.tinder.smsauth.sdk.analytics.SmsAuthTracker;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/tinder/smsauth/sdk/SmsAuthConfig;", "", "baseUrl", "", "smsAuthType", "Lcom/tinder/smsauth/entity/SmsAuthType;", "interceptors", "", "Lokhttp3/Interceptor;", "smsAuthTracker", "Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "testMode", "", "(Ljava/lang/String;Lcom/tinder/smsauth/entity/SmsAuthType;Ljava/util/Set;Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;Z)V", "getBaseUrl", "()Ljava/lang/String;", "getInterceptors", "()Ljava/util/Set;", "getSmsAuthTracker", "()Lcom/tinder/smsauth/sdk/analytics/SmsAuthTracker;", "getSmsAuthType", "()Lcom/tinder/smsauth/entity/SmsAuthType;", "getTestMode", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.sdk.c */
public final class C14987c {
    @NotNull
    /* renamed from: a */
    private final String f46763a;
    @NotNull
    /* renamed from: b */
    private final SmsAuthType f46764b;
    @NotNull
    /* renamed from: c */
    private final Set<Interceptor> f46765c;
    @Nullable
    /* renamed from: d */
    private final SmsAuthTracker f46766d;
    /* renamed from: e */
    private final boolean f46767e;

    @JvmOverloads
    public C14987c(@NotNull String str, @NotNull SmsAuthType smsAuthType, @NotNull Set<? extends Interceptor> set, @Nullable SmsAuthTracker smsAuthTracker) {
        this(str, smsAuthType, set, smsAuthTracker, false, 16, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14987c) {
            C14987c c14987c = (C14987c) obj;
            if (C2668g.a(this.f46763a, c14987c.f46763a) && C2668g.a(this.f46764b, c14987c.f46764b) && C2668g.a(this.f46765c, c14987c.f46765c) && C2668g.a(this.f46766d, c14987c.f46766d)) {
                if ((this.f46767e == c14987c.f46767e ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f46763a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SmsAuthType smsAuthType = this.f46764b;
        hashCode = (hashCode + (smsAuthType != null ? smsAuthType.hashCode() : 0)) * 31;
        Set set = this.f46765c;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        SmsAuthTracker smsAuthTracker = this.f46766d;
        if (smsAuthTracker != null) {
            i = smsAuthTracker.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.f46767e;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SmsAuthConfig(baseUrl=");
        stringBuilder.append(this.f46763a);
        stringBuilder.append(", smsAuthType=");
        stringBuilder.append(this.f46764b);
        stringBuilder.append(", interceptors=");
        stringBuilder.append(this.f46765c);
        stringBuilder.append(", smsAuthTracker=");
        stringBuilder.append(this.f46766d);
        stringBuilder.append(", testMode=");
        stringBuilder.append(this.f46767e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @JvmOverloads
    public C14987c(@NotNull String str, @NotNull SmsAuthType smsAuthType, @NotNull Set<? extends Interceptor> set, @Nullable SmsAuthTracker smsAuthTracker, boolean z) {
        C2668g.b(str, "baseUrl");
        C2668g.b(smsAuthType, "smsAuthType");
        C2668g.b(set, "interceptors");
        this.f46763a = str;
        this.f46764b = smsAuthType;
        this.f46765c = set;
        this.f46766d = smsAuthTracker;
        this.f46767e = z;
    }

    @NotNull
    /* renamed from: a */
    public final String m56590a() {
        return this.f46763a;
    }

    @NotNull
    /* renamed from: b */
    public final SmsAuthType m56591b() {
        return this.f46764b;
    }

    @JvmOverloads
    public /* synthetic */ C14987c(String str, SmsAuthType smsAuthType, Set set, SmsAuthTracker smsAuthTracker, boolean z, int i, C15823e c15823e) {
        if ((i & 4) != null) {
            set = am.m64176a();
        }
        Set set2 = set;
        if ((i & 8) != null) {
            smsAuthTracker = (SmsAuthTracker) null;
        }
        this(str, smsAuthType, set2, smsAuthTracker, (i & 16) != null ? false : z);
    }

    @NotNull
    /* renamed from: c */
    public final Set<Interceptor> m56592c() {
        return this.f46765c;
    }

    @Nullable
    /* renamed from: d */
    public final SmsAuthTracker m56593d() {
        return this.f46766d;
    }
}
