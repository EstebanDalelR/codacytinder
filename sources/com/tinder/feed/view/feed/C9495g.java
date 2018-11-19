package com.tinder.feed.view.feed;

import android.support.constraint.C0132c;
import android.support.constraint.ConstraintLayout;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/feed/view/feed/FeedItemViewConstraintHelper;", "", "constraintLayout", "Landroid/support/constraint/ConstraintLayout;", "(Landroid/support/constraint/ConstraintLayout;)V", "constraintsComment", "Landroid/support/constraint/ConstraintSet;", "constraintsNoComment", "applyConstraints", "", "hasComment", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.feed.g */
public final class C9495g {
    /* renamed from: a */
    private final C0132c f31810a = new C0132c();
    /* renamed from: b */
    private final C0132c f31811b = new C0132c();
    /* renamed from: c */
    private final ConstraintLayout f31812c;

    public C9495g(@NotNull ConstraintLayout constraintLayout) {
        C2668g.b(constraintLayout, "constraintLayout");
        this.f31812c = constraintLayout;
        this.f31810a.a(this.f31812c);
        this.f31811b.a(this.f31810a);
        this.f31811b.a(R.id.feedFooterContainer, 3, R.id.feedMediaContainer, 4);
    }

    /* renamed from: a */
    public final void m39718a(boolean z) {
        if (z) {
            this.f31810a.b(this.f31812c);
        } else {
            this.f31811b.b(this.f31812c);
        }
    }
}
