package com.tinder.profile.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.R;
import com.tinder.overflow.OverflowButton;
import com.tinder.overflow.OverflowReportFeedbackListener;
import com.tinder.overflow.actionitem.C10020a;
import com.tinder.overflow.actionitem.C12231g;
import com.tinder.overflow.actionitem.C12234k;
import com.tinder.overflow.model.OverflowSource;
import com.tinder.profile.model.Profile;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eR$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/tinder/profile/view/RecOverflowButton;", "Lcom/tinder/overflow/OverflowButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionItems", "Ljava/util/LinkedHashSet;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lkotlin/collections/LinkedHashSet;", "getActionItems", "()Ljava/util/LinkedHashSet;", "feedbackListener", "Lcom/tinder/overflow/OverflowReportFeedbackListener;", "recommendProfileActionItem", "Lcom/tinder/overflow/actionitem/RecommendProfileActionItem;", "reportProfileActionItem", "Lcom/tinder/overflow/actionitem/ReportProfileActionItem;", "bind", "", "profile", "Lcom/tinder/profile/model/Profile;", "reportFeedbackListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class RecOverflowButton extends OverflowButton {
    /* renamed from: a */
    private final C12231g f50301a;
    /* renamed from: b */
    private final C12234k f50302b;
    @NotNull
    /* renamed from: c */
    private final LinkedHashSet<C10020a> f50303c = am.m64180c(new C10020a[]{(C10020a) this.f50301a, (C10020a) this.f50302b});
    /* renamed from: d */
    private OverflowReportFeedbackListener f50304d;

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ OverflowReportFeedbackListener m61047a(RecOverflowButton recOverflowButton) {
        recOverflowButton = recOverflowButton.f50304d;
        if (recOverflowButton == null) {
            C2668g.b("feedbackListener");
        }
        return recOverflowButton;
    }

    public RecOverflowButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        String string = getResources().getString(R.string.share_profile);
        C2668g.a(string, "resources.getString(R.string.share_profile)");
        this.f50301a = new C12231g(context, string, RecOverflowButton$recommendProfileActionItem$1.f57989a);
        string = getResources().getString(R.string.report);
        C2668g.a(string, "resources.getString(R.string.report)");
        this.f50302b = new C12234k(context, string, RecOverflowButton$reportProfileActionItem$1.f57990a, new RecOverflowButton$reportProfileActionItem$2(this));
    }

    @NotNull
    protected LinkedHashSet<C10020a> getActionItems() {
        return this.f50303c;
    }

    /* renamed from: a */
    public final void m61048a(@NotNull Profile profile, @NotNull OverflowReportFeedbackListener overflowReportFeedbackListener) {
        C2668g.b(profile, "profile");
        C2668g.b(overflowReportFeedbackListener, "reportFeedbackListener");
        this.f50301a.a(profile, OverflowSource.RECS);
        C12234k c12234k = this.f50302b;
        profile = profile.mo11651a();
        C2668g.a(profile, "profile.id()");
        c12234k.c(profile);
        this.f50304d = overflowReportFeedbackListener;
    }
}
