package com.tinder.core.experiment;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/tinder/core/experiment/GrandGestureExperiment;", "", "gestureChatBubbleEnable", "", "gestureMartiniEnable", "gestureEyerollEnable", "gestureStrikeEnable", "gestureBallsInYourCourtEnable", "(ZZZZZ)V", "getGestureBallsInYourCourtEnable", "()Z", "getGestureChatBubbleEnable", "getGestureEyerollEnable", "getGestureMartiniEnable", "getGestureStrikeEnable", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.j */
public final class C8595j {
    /* renamed from: a */
    private final boolean f30417a;
    /* renamed from: b */
    private final boolean f30418b;
    /* renamed from: c */
    private final boolean f30419c;
    /* renamed from: d */
    private final boolean f30420d;
    /* renamed from: e */
    private final boolean f30421e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8595j) {
            C8595j c8595j = (C8595j) obj;
            if ((this.f30417a == c8595j.f30417a ? 1 : null) != null) {
                if ((this.f30418b == c8595j.f30418b ? 1 : null) != null) {
                    if ((this.f30419c == c8595j.f30419c ? 1 : null) != null) {
                        if ((this.f30420d == c8595j.f30420d ? 1 : null) != null) {
                            if ((this.f30421e == c8595j.f30421e ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f30417a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.f30418b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.f30419c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.f30420d;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.f30421e;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GrandGestureExperiment(gestureChatBubbleEnable=");
        stringBuilder.append(this.f30417a);
        stringBuilder.append(", gestureMartiniEnable=");
        stringBuilder.append(this.f30418b);
        stringBuilder.append(", gestureEyerollEnable=");
        stringBuilder.append(this.f30419c);
        stringBuilder.append(", gestureStrikeEnable=");
        stringBuilder.append(this.f30420d);
        stringBuilder.append(", gestureBallsInYourCourtEnable=");
        stringBuilder.append(this.f30421e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8595j(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f30417a = z;
        this.f30418b = z2;
        this.f30419c = z3;
        this.f30420d = z4;
        this.f30421e = z5;
    }

    /* renamed from: a */
    public final boolean m36687a() {
        return this.f30417a;
    }

    /* renamed from: b */
    public final boolean m36688b() {
        return this.f30418b;
    }

    /* renamed from: c */
    public final boolean m36689c() {
        return this.f30419c;
    }

    /* renamed from: d */
    public final boolean m36690d() {
        return this.f30420d;
    }

    /* renamed from: e */
    public final boolean m36691e() {
        return this.f30421e;
    }
}
