package com.tinder.reactions.gestures.viewmodel;

import android.widget.ImageView.ScaleType;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.gestures.animation.C16332a;
import com.tinder.reactions.gestures.animation.C17973b;
import com.tinder.reactions.gestures.animation.ReactionEntranceAnimationDecorator;
import com.tinder.reactions.gestures.animation.ReactionExitAnimationDecorator;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/tinder/reactions/gestures/viewmodel/GrandGestureReactionViewModel;", "", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "animationFile", "", "scaleType", "Landroid/widget/ImageView$ScaleType;", "enterAnimation", "Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "exitAnimation", "Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "loopDurationMs", "", "(Lcom/tinder/domain/reactions/model/GrandGestureType;Ljava/lang/String;Landroid/widget/ImageView$ScaleType;Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;J)V", "getAnimationFile", "()Ljava/lang/String;", "getEnterAnimation", "()Lcom/tinder/reactions/gestures/animation/ReactionEntranceAnimationDecorator;", "getExitAnimation", "()Lcom/tinder/reactions/gestures/animation/ReactionExitAnimationDecorator;", "getGrandGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "getLoopDurationMs", "()J", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.gestures.viewmodel.f */
public final class C14676f {
    @NotNull
    /* renamed from: a */
    private final GrandGestureType f46255a;
    @NotNull
    /* renamed from: b */
    private final String f46256b;
    @NotNull
    /* renamed from: c */
    private final ScaleType f46257c;
    @NotNull
    /* renamed from: d */
    private final ReactionEntranceAnimationDecorator f46258d;
    @NotNull
    /* renamed from: e */
    private final ReactionExitAnimationDecorator f46259e;
    /* renamed from: f */
    private final long f46260f;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14676f) {
            C14676f c14676f = (C14676f) obj;
            if (C2668g.a(this.f46255a, c14676f.f46255a) && C2668g.a(this.f46256b, c14676f.f46256b) && C2668g.a(this.f46257c, c14676f.f46257c) && C2668g.a(this.f46258d, c14676f.f46258d) && C2668g.a(this.f46259e, c14676f.f46259e)) {
                if ((this.f46260f == c14676f.f46260f ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        GrandGestureType grandGestureType = this.f46255a;
        int i = 0;
        int hashCode = (grandGestureType != null ? grandGestureType.hashCode() : 0) * 31;
        String str = this.f46256b;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ScaleType scaleType = this.f46257c;
        hashCode = (hashCode + (scaleType != null ? scaleType.hashCode() : 0)) * 31;
        ReactionEntranceAnimationDecorator reactionEntranceAnimationDecorator = this.f46258d;
        hashCode = (hashCode + (reactionEntranceAnimationDecorator != null ? reactionEntranceAnimationDecorator.hashCode() : 0)) * 31;
        ReactionExitAnimationDecorator reactionExitAnimationDecorator = this.f46259e;
        if (reactionExitAnimationDecorator != null) {
            i = reactionExitAnimationDecorator.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long j = this.f46260f;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GrandGestureReactionViewModel(grandGestureType=");
        stringBuilder.append(this.f46255a);
        stringBuilder.append(", animationFile=");
        stringBuilder.append(this.f46256b);
        stringBuilder.append(", scaleType=");
        stringBuilder.append(this.f46257c);
        stringBuilder.append(", enterAnimation=");
        stringBuilder.append(this.f46258d);
        stringBuilder.append(", exitAnimation=");
        stringBuilder.append(this.f46259e);
        stringBuilder.append(", loopDurationMs=");
        stringBuilder.append(this.f46260f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public C14676f(@NotNull GrandGestureType grandGestureType, @NotNull String str, @NotNull ScaleType scaleType, @NotNull ReactionEntranceAnimationDecorator reactionEntranceAnimationDecorator, @NotNull ReactionExitAnimationDecorator reactionExitAnimationDecorator, long j) {
        C2668g.b(grandGestureType, "grandGestureType");
        C2668g.b(str, "animationFile");
        C2668g.b(scaleType, "scaleType");
        C2668g.b(reactionEntranceAnimationDecorator, "enterAnimation");
        C2668g.b(reactionExitAnimationDecorator, "exitAnimation");
        this.f46255a = grandGestureType;
        this.f46256b = str;
        this.f46257c = scaleType;
        this.f46258d = reactionEntranceAnimationDecorator;
        this.f46259e = reactionExitAnimationDecorator;
        this.f46260f = j;
    }

    @NotNull
    /* renamed from: a */
    public final GrandGestureType m55925a() {
        return this.f46255a;
    }

    @NotNull
    /* renamed from: b */
    public final String m55926b() {
        return this.f46256b;
    }

    public /* synthetic */ C14676f(GrandGestureType grandGestureType, String str, ScaleType scaleType, ReactionEntranceAnimationDecorator reactionEntranceAnimationDecorator, ReactionExitAnimationDecorator reactionExitAnimationDecorator, long j, int i, C15823e c15823e) {
        this(grandGestureType, str, (i & 4) != 0 ? ScaleType.CENTER_CROP : scaleType, (i & 8) != 0 ? new C16332a() : reactionEntranceAnimationDecorator, (i & 16) != 0 ? new C17973b() : reactionExitAnimationDecorator, (i & 32) != 0 ? 0 : j);
    }

    @NotNull
    /* renamed from: c */
    public final ScaleType m55927c() {
        return this.f46257c;
    }

    @NotNull
    /* renamed from: d */
    public final ReactionEntranceAnimationDecorator m55928d() {
        return this.f46258d;
    }

    @NotNull
    /* renamed from: e */
    public final ReactionExitAnimationDecorator m55929e() {
        return this.f46259e;
    }

    /* renamed from: f */
    public final long m55930f() {
        return this.f46260f;
    }
}
