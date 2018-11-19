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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR$\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/tinder/profile/view/MatchOverflowButton;", "Lcom/tinder/overflow/OverflowButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "actionItems", "Ljava/util/LinkedHashSet;", "Lcom/tinder/overflow/actionitem/ActionItem;", "Lkotlin/collections/LinkedHashSet;", "getActionItems", "()Ljava/util/LinkedHashSet;", "feedbackListener", "Lcom/tinder/overflow/OverflowReportFeedbackListener;", "recommendProfileActionItem", "Lcom/tinder/overflow/actionitem/RecommendProfileActionItem;", "reportProfileActionItem", "Lcom/tinder/overflow/actionitem/ReportProfileActionItem;", "bind", "", "profile", "Lcom/tinder/profile/model/Profile;", "matchId", "", "reportFeedbackListener", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MatchOverflowButton extends OverflowButton {
    /* renamed from: a */
    private final C12231g f50235a;
    /* renamed from: b */
    private final C12234k f50236b;
    @NotNull
    /* renamed from: c */
    private final LinkedHashSet<C10020a> f50237c = am.m64180c(new C10020a[]{(C10020a) this.f50235a, (C10020a) this.f50236b});
    /* renamed from: d */
    private OverflowReportFeedbackListener f50238d;

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ OverflowReportFeedbackListener m61013a(MatchOverflowButton matchOverflowButton) {
        matchOverflowButton = matchOverflowButton.f50238d;
        if (matchOverflowButton == null) {
            C2668g.b("feedbackListener");
        }
        return matchOverflowButton;
    }

    public MatchOverflowButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        String string = getResources().getString(R.string.share_profile);
        C2668g.a(string, "resources.getString(R.string.share_profile)");
        this.f50235a = new C12231g(context, string, MatchOverflowButton$recommendProfileActionItem$1.f57985a);
        string = getResources().getString(R.string.report);
        C2668g.a(string, "resources.getString(R.string.report)");
        this.f50236b = new C12234k(context, string, MatchOverflowButton$reportProfileActionItem$1.f57986a, new MatchOverflowButton$reportProfileActionItem$2(this));
    }

    @NotNull
    protected LinkedHashSet<C10020a> getActionItems() {
        return this.f50237c;
    }

    /* renamed from: a */
    public final void m61014a(@NotNull Profile profile, @NotNull String str, @NotNull OverflowReportFeedbackListener overflowReportFeedbackListener) {
        C2668g.b(profile, "profile");
        C2668g.b(str, "matchId");
        C2668g.b(overflowReportFeedbackListener, "reportFeedbackListener");
        this.f50235a.a(profile, OverflowSource.MATCH);
        this.f50236b.b(str);
        this.f50238d = overflowReportFeedbackListener;
    }
}
