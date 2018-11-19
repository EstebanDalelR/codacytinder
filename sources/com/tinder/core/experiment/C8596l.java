package com.tinder.core.experiment;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/tinder/core/experiment/NewNewExperiment;", "", "editProfileNudgeEnabled", "", "cardSwipeTutorialEnabled", "gamepadSwipeHighlightEnabled", "recsRateDialogDisabled", "introEnabled", "(ZZZZZ)V", "getCardSwipeTutorialEnabled", "()Z", "getEditProfileNudgeEnabled", "getGamepadSwipeHighlightEnabled", "getIntroEnabled", "getRecsRateDialogDisabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.core.experiment.l */
public final class C8596l {
    /* renamed from: a */
    private final boolean f30422a;
    /* renamed from: b */
    private final boolean f30423b;
    /* renamed from: c */
    private final boolean f30424c;
    /* renamed from: d */
    private final boolean f30425d;
    /* renamed from: e */
    private final boolean f30426e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8596l) {
            C8596l c8596l = (C8596l) obj;
            if ((this.f30422a == c8596l.f30422a ? 1 : null) != null) {
                if ((this.f30423b == c8596l.f30423b ? 1 : null) != null) {
                    if ((this.f30424c == c8596l.f30424c ? 1 : null) != null) {
                        if ((this.f30425d == c8596l.f30425d ? 1 : null) != null) {
                            if ((this.f30426e == c8596l.f30426e ? 1 : null) != null) {
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
        int i = this.f30422a;
        int i2 = 1;
        if (i != 0) {
            i = 1;
        }
        i *= 31;
        int i3 = this.f30423b;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.f30424c;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        i3 = this.f30425d;
        if (i3 != 0) {
            i3 = 1;
        }
        i = (i + i3) * 31;
        boolean z = this.f30426e;
        if (!z) {
            i2 = z;
        }
        return i + i2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NewNewExperiment(editProfileNudgeEnabled=");
        stringBuilder.append(this.f30422a);
        stringBuilder.append(", cardSwipeTutorialEnabled=");
        stringBuilder.append(this.f30423b);
        stringBuilder.append(", gamepadSwipeHighlightEnabled=");
        stringBuilder.append(this.f30424c);
        stringBuilder.append(", recsRateDialogDisabled=");
        stringBuilder.append(this.f30425d);
        stringBuilder.append(", introEnabled=");
        stringBuilder.append(this.f30426e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C8596l(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f30422a = z;
        this.f30423b = z2;
        this.f30424c = z3;
        this.f30425d = z4;
        this.f30426e = z5;
    }

    /* renamed from: a */
    public final boolean m36692a() {
        return this.f30422a;
    }

    /* renamed from: b */
    public final boolean m36693b() {
        return this.f30423b;
    }

    /* renamed from: c */
    public final boolean m36694c() {
        return this.f30424c;
    }

    /* renamed from: d */
    public final boolean m36695d() {
        return this.f30425d;
    }

    /* renamed from: e */
    public final boolean m36696e() {
        return this.f30426e;
    }
}
