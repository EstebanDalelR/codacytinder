package com.tinder.match.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tinder.common.p191d.C8529a;
import com.tinder.feed.p341b.C11695a;
import com.tinder.module.MainActivityComponentProvider;
import com.tinder.module.MatchesViewComponentProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tinder/match/views/MatchMainView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "getFeedExperimentUtility$Tinder_release", "()Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "setFeedExperimentUtility$Tinder_release", "(Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;)V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MatchMainView extends FrameLayout {
    @Inject
    @NotNull
    /* renamed from: a */
    public C11695a f32732a;

    public /* synthetic */ MatchMainView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public MatchMainView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            attributeSet = ((MainActivityComponentProvider) context).provideMainActivityComponent().b().matchMainView(this).build();
            ((MatchesViewComponentProvider) context).setMatchesViewComponent(attributeSet);
            attributeSet.inject(this);
        }
        attributeSet = this.f32732a;
        if (attributeSet == null) {
            C2668g.b("feedExperimentUtility");
        }
        if (attributeSet.m47526e() != null) {
            attributeSet = (FrameLayout) new C12108h(context);
        } else {
            attributeSet = (FrameLayout) new MatchListView(context);
        }
        attributeSet.setLayoutParams(C8529a.f30276a.m36493a());
        addView((View) attributeSet);
    }

    @NotNull
    public final C11695a getFeedExperimentUtility$Tinder_release() {
        C11695a c11695a = this.f32732a;
        if (c11695a == null) {
            C2668g.b("feedExperimentUtility");
        }
        return c11695a;
    }

    public final void setFeedExperimentUtility$Tinder_release(@NotNull C11695a c11695a) {
        C2668g.b(c11695a, "<set-?>");
        this.f32732a = c11695a;
    }
}
