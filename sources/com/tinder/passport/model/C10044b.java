package com.tinder.passport.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/tinder/passport/model/PassportLocationInfo;", "", "passportLocation", "Lcom/tinder/passport/model/PassportLocation;", "isFromUserAction", "", "(Lcom/tinder/passport/model/PassportLocation;Z)V", "()Z", "getPassportLocation", "()Lcom/tinder/passport/model/PassportLocation;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.passport.model.b */
public final class C10044b {
    @Nullable
    /* renamed from: a */
    private final PassportLocation f32937a;
    /* renamed from: b */
    private final boolean f32938b;

    public C10044b() {
        this(null, false, 3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10044b) {
            C10044b c10044b = (C10044b) obj;
            if (C2668g.a(this.f32937a, c10044b.f32937a)) {
                if ((this.f32938b == c10044b.f32938b ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        PassportLocation passportLocation = this.f32937a;
        int hashCode = (passportLocation != null ? passportLocation.hashCode() : 0) * 31;
        int i = this.f32938b;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PassportLocationInfo(passportLocation=");
        stringBuilder.append(this.f32937a);
        stringBuilder.append(", isFromUserAction=");
        stringBuilder.append(this.f32938b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10044b(@Nullable PassportLocation passportLocation, boolean z) {
        this.f32937a = passportLocation;
        this.f32938b = z;
    }

    public /* synthetic */ C10044b(PassportLocation passportLocation, boolean z, int i, C15823e c15823e) {
        if ((i & 1) != null) {
            passportLocation = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        this(passportLocation, z);
    }

    @Nullable
    /* renamed from: a */
    public final PassportLocation m41095a() {
        return this.f32937a;
    }

    /* renamed from: b */
    public final boolean m41096b() {
        return this.f32938b;
    }
}
