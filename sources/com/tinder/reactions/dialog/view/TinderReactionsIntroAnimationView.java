package com.tinder.reactions.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.reactions.common.view.TinderLottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/dialog/view/TinderReactionsIntroAnimationView;", "Lcom/tinder/reactions/common/view/TinderLottieAnimationView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cacheAnimation", "Lrx/Observable;", "", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class TinderReactionsIntroAnimationView extends TinderLottieAnimationView {
    /* renamed from: a */
    public static final C14623a f59372a = new C14623a();
    /* renamed from: b */
    private static final String f59373b = "laugh_fullscreen.json";
    /* renamed from: c */
    private static final long f59374c = 3000;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/tinder/reactions/dialog/view/TinderReactionsIntroAnimationView$Companion;", "", "()V", "CACHE_DELAY_MS", "", "LAUGH_ANIMATION", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.dialog.view.TinderReactionsIntroAnimationView$a */
    public static final class C14623a {
        private C14623a() {
        }
    }

    public TinderReactionsIntroAnimationView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        b(true);
    }
}
