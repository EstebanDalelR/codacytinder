package com.tinder.feed.view.model;

import com.tinder.overflow.model.C10028a;
import com.tinder.overflow.model.FeedbackType;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/tinder/feed/view/model/FeedbackInfo;", "", "feedbackType", "Lcom/tinder/overflow/model/FeedbackType;", "feedbackAction", "Lcom/tinder/overflow/model/FeedbackAction;", "reasonCustom", "", "(Lcom/tinder/overflow/model/FeedbackType;Lcom/tinder/overflow/model/FeedbackAction;Ljava/lang/String;)V", "getFeedbackAction", "()Lcom/tinder/overflow/model/FeedbackAction;", "getFeedbackType", "()Lcom/tinder/overflow/model/FeedbackType;", "getReasonCustom", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.model.g */
public final class C9541g {
    @NotNull
    /* renamed from: a */
    private final FeedbackType f31920a;
    @NotNull
    /* renamed from: b */
    private final C10028a f31921b;
    @Nullable
    /* renamed from: c */
    private final String f31922c;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9541g) {
                C9541g c9541g = (C9541g) obj;
                if (C2668g.a(this.f31920a, c9541g.f31920a) && C2668g.a(this.f31921b, c9541g.f31921b) && C2668g.a(this.f31922c, c9541g.f31922c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        FeedbackType feedbackType = this.f31920a;
        int i = 0;
        int hashCode = (feedbackType != null ? feedbackType.hashCode() : 0) * 31;
        C10028a c10028a = this.f31921b;
        hashCode = (hashCode + (c10028a != null ? c10028a.hashCode() : 0)) * 31;
        String str = this.f31922c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedbackInfo(feedbackType=");
        stringBuilder.append(this.f31920a);
        stringBuilder.append(", feedbackAction=");
        stringBuilder.append(this.f31921b);
        stringBuilder.append(", reasonCustom=");
        stringBuilder.append(this.f31922c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C9541g(@NotNull FeedbackType feedbackType, @NotNull C10028a c10028a, @Nullable String str) {
        C2668g.b(feedbackType, "feedbackType");
        C2668g.b(c10028a, "feedbackAction");
        this.f31920a = feedbackType;
        this.f31921b = c10028a;
        this.f31922c = str;
    }

    @NotNull
    /* renamed from: a */
    public final FeedbackType m39814a() {
        return this.f31920a;
    }

    @NotNull
    /* renamed from: b */
    public final C10028a m39815b() {
        return this.f31921b;
    }

    @Nullable
    /* renamed from: c */
    public final String m39816c() {
        return this.f31922c;
    }
}
