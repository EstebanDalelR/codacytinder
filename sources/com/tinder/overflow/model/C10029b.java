package com.tinder.overflow.model;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/overflow/model/FeedbackFinishedInfo;", "", "feedbackAction", "Lcom/tinder/overflow/model/FeedbackAction;", "reasonCustom", "", "(Lcom/tinder/overflow/model/FeedbackAction;Ljava/lang/String;)V", "getFeedbackAction", "()Lcom/tinder/overflow/model/FeedbackAction;", "getReasonCustom", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.overflow.model.b */
public final class C10029b {
    @NotNull
    /* renamed from: a */
    private final C10028a f32912a;
    @Nullable
    /* renamed from: b */
    private final String f32913b;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10029b) {
                C10029b c10029b = (C10029b) obj;
                if (C2668g.a(this.f32912a, c10029b.f32912a) && C2668g.a(this.f32913b, c10029b.f32913b)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C10028a c10028a = this.f32912a;
        int i = 0;
        int hashCode = (c10028a != null ? c10028a.hashCode() : 0) * 31;
        String str = this.f32913b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedbackFinishedInfo(feedbackAction=");
        stringBuilder.append(this.f32912a);
        stringBuilder.append(", reasonCustom=");
        stringBuilder.append(this.f32913b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C10029b(@NotNull C10028a c10028a, @Nullable String str) {
        C2668g.b(c10028a, "feedbackAction");
        this.f32912a = c10028a;
        this.f32913b = str;
    }

    @NotNull
    /* renamed from: a */
    public final C10028a m41081a() {
        return this.f32912a;
    }

    @Nullable
    /* renamed from: b */
    public final String m41082b() {
        return this.f32913b;
    }
}
