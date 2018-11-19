package com.tinder.reactions.drawer.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.reactions.drawer.mediator.AnimatorControllerInterface;
import com.tinder.reactions.drawer.p392c.C14625a;
import com.tinder.reactions.drawer.p392c.C14626b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/tinder/reactions/drawer/view/DragHandleView;", "Landroid/widget/FrameLayout;", "Lcom/tinder/reactions/drawer/mediator/AnimatorControllerInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "alphaTransformer", "Lcom/tinder/reactions/drawer/transformer/AlphaTransformer;", "heightLayoutTransformer", "Lcom/tinder/reactions/drawer/transformer/HeightLayoutTransformer;", "maxHeight", "", "minHeight", "allowDrag", "", "onProgressUpdate", "", "progress", "", "Companion", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class DragHandleView extends FrameLayout implements AnimatorControllerInterface {
    /* renamed from: a */
    public static final C14640a f50812a = new C14640a();
    /* renamed from: b */
    private final int f50813b;
    /* renamed from: c */
    private final int f50814c;
    /* renamed from: d */
    private final C14626b f50815d = new C14626b(this.f50814c, this.f50813b);
    /* renamed from: e */
    private final C14625a f50816e = new C14625a(0.0f, 1.0f, 0.5f, 2);
    /* renamed from: f */
    private HashMap f50817f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/reactions/drawer/view/DragHandleView$Companion;", "", "()V", "ALPHA_MULTIPLIER", "", "DRAG_HANDLE_ARROW_ANIMATION_FILE", "", "EMPTY_ALPHA", "", "FULL_ALPHA", "PROGRESS_HALFWAY_POINT", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.drawer.view.DragHandleView$a */
    public static final class C14640a {
        private C14640a() {
        }
    }

    /* renamed from: a */
    public View m61616a(int i) {
        if (this.f50817f == null) {
            this.f50817f = new HashMap();
        }
        View view = (View) this.f50817f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f50817f.put(Integer.valueOf(i), view);
        return view;
    }

    public boolean allowDrag() {
        return true;
    }

    public DragHandleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f50813b = (int) context.getResources().getDimension(R.dimen.handle_max_height);
        this.f50814c = (int) context.getResources().getDimension(R.dimen.handle_min_height);
        FrameLayout.inflate(context, R.layout.view_drag_handle, this);
        setBackground((Drawable) null);
        if (isInEditMode() == null) {
            ((LottieAnimationView) m61616a(C6248a.handleAnimation)).setAnimation("arrow.json");
            context = m61616a(C6248a.handleBackground);
            C2668g.a(context, "handleBackground");
            context.setAlpha(0.0f);
        }
    }

    /* renamed from: a */
    public final void m61617a(float f) {
        C14625a c14625a = this.f50816e;
        View a = m61616a(C6248a.handleBackground);
        C2668g.a(a, "handleBackground");
        c14625a.m55790a(f, a);
        this.f50815d.m55792a(f, this);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m61616a(C6248a.handleAnimation);
        C2668g.a(lottieAnimationView, "handleAnimation");
        lottieAnimationView.setProgress(f);
    }
}
