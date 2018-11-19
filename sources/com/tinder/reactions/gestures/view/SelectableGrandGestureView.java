package com.tinder.reactions.gestures.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ToggleButton;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider;
import com.tinder.deadshot.Deadshot;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.profile.p365d.C14398a;
import com.tinder.reactions.common.p388b.C14612a;
import com.tinder.reactions.gestures.common.GestureEvent.State;
import com.tinder.reactions.gestures.p394b.C14657g;
import com.tinder.reactions.gestures.target.SelectableGrandGestureTarget;
import com.tinder.utils.av;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.p494a.p496b.C19397a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\u0019\u001a\u00020\u0011H\u0014J\b\u0010\u001a\u001a\u00020\u0011H\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0013H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/tinder/reactions/gestures/view/SelectableGrandGestureView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/reactions/gestures/target/SelectableGrandGestureTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/reactions/gestures/presenter/SelectableGrandGesturePresenter;", "getPresenter$Tinder_release", "()Lcom/tinder/reactions/gestures/presenter/SelectableGrandGesturePresenter;", "setPresenter$Tinder_release", "(Lcom/tinder/reactions/gestures/presenter/SelectableGrandGesturePresenter;)V", "screenHeight", "", "adjustViewDimensions", "", "areChildrenMeasured", "", "getCurrentGrandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "getGrandGestureStateObservable", "Lrx/Observable;", "Lcom/tinder/reactions/gestures/common/GestureEvent$State;", "onAttachedToWindow", "onDetachedFromWindow", "onFinishInflate", "resetTargetPosition", "setSoundToggleButtonChecked", "isChecked", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class SelectableGrandGestureView extends LinearLayout implements SelectableGrandGestureTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14657g f50878a;
    /* renamed from: b */
    private final float f50879b = ((float) av.c());
    /* renamed from: c */
    private HashMap f50880c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.SelectableGrandGestureView$c */
    static final class C14672c implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ SelectableGrandGestureView f46249a;

        C14672c(SelectableGrandGestureView selectableGrandGestureView) {
            this.f46249a = selectableGrandGestureView;
        }

        public final void onClick(View view) {
            if (view == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.ToggleButton");
            }
            ToggleButton toggleButton = (ToggleButton) view;
            this.f46249a.getPresenter$Tinder_release().m55881a(toggleButton.isChecked(), this.f46249a.getCurrentGrandGestureType());
            toggleButton.setChecked(toggleButton.isChecked() ^ 1);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.SelectableGrandGestureView$a */
    static final class C17988a<T, R> implements Func1<Void, Boolean> {
        /* renamed from: a */
        final /* synthetic */ SelectableGrandGestureView f55921a;

        C17988a(SelectableGrandGestureView selectableGrandGestureView) {
            this.f55921a = selectableGrandGestureView;
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m65343a((Void) obj));
        }

        /* renamed from: a */
        public final boolean m65343a(Void voidR) {
            return this.f55921a.m61702b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.gestures.view.SelectableGrandGestureView$b */
    static final class C18750b<T> implements Action1<Void> {
        /* renamed from: a */
        final /* synthetic */ SelectableGrandGestureView f58248a;

        C18750b(SelectableGrandGestureView selectableGrandGestureView) {
            this.f58248a = selectableGrandGestureView;
        }

        public /* synthetic */ void call(Object obj) {
            m67187a((Void) obj);
        }

        /* renamed from: a */
        public final void m67187a(Void voidR) {
            this.f58248a.getPresenter$Tinder_release().m55884d();
        }
    }

    /* renamed from: a */
    public View m61703a(int i) {
        if (this.f50880c == null) {
            this.f50880c = new HashMap();
        }
        View view = (View) this.f50880c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f50880c.put(Integer.valueOf(i), view);
        return view;
    }

    public SelectableGrandGestureView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        attributeSet = C14398a.m54830a(context);
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.chat.injection.provider.ChatActivitySubcomponentProvider");
        }
        ((ChatActivitySubcomponentProvider) attributeSet).provideChatActivityComponent().inject(this);
        LinearLayout.inflate(context, R.layout.view_selectable_grand_gesture, this);
        setOrientation(1);
        setLayoutParams(new LayoutParams(-1, -1));
    }

    @NotNull
    public final C14657g getPresenter$Tinder_release() {
        C14657g c14657g = this.f50878a;
        if (c14657g == null) {
            C2668g.b("presenter");
        }
        return c14657g;
    }

    public final void setPresenter$Tinder_release(@NotNull C14657g c14657g) {
        C2668g.b(c14657g, "<set-?>");
        this.f50878a = c14657g;
    }

    @NotNull
    public final Observable<State> getGrandGestureStateObservable() {
        return ((TappableGrandGestureView) m61703a(C6248a.gestureActivator)).getGrandGestureStateObservable();
    }

    @NotNull
    public final GrandGestureType getCurrentGrandGestureType() {
        return ((GrandGestureSelectorView) m61703a(C6248a.gestureSelector)).getCurrentGrandGestureType();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        m61700a();
        View view = this;
        C5707b.c(view).j(C14612a.f46118a.m55756a(view)).f(new C17988a(this)).c(1).a(C19397a.a()).d(new C18750b(this));
        ((ToggleButton) m61703a(C6248a.soundToggle)).setOnClickListener(new C14672c(this));
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14657g c14657g = this.f50878a;
        if (c14657g == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14657g);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
    }

    public void setSoundToggleButtonChecked(boolean z) {
        ToggleButton toggleButton = (ToggleButton) m61703a(C6248a.soundToggle);
        C2668g.a(toggleButton, "soundToggle");
        toggleButton.setChecked(z);
    }

    public void resetTargetPosition() {
        float f = this.f50879b * 0.2f;
        float f2 = this.f50879b * 0.23f;
        ToggleButton toggleButton = (ToggleButton) m61703a(C6248a.soundToggle);
        C2668g.a(toggleButton, "soundToggle");
        toggleButton.setY(f);
        GrandGestureSelectorView grandGestureSelectorView = (GrandGestureSelectorView) m61703a(C6248a.gestureSelector);
        C2668g.a(grandGestureSelectorView, "gestureSelector");
        ToggleButton toggleButton2 = (ToggleButton) m61703a(C6248a.soundToggle);
        C2668g.a(toggleButton2, "soundToggle");
        grandGestureSelectorView.setY(f + ((float) toggleButton2.getBottom()));
        TappableGrandGestureView tappableGrandGestureView = (TappableGrandGestureView) m61703a(C6248a.gestureActivator);
        C2668g.a(tappableGrandGestureView, "gestureActivator");
        grandGestureSelectorView = (GrandGestureSelectorView) m61703a(C6248a.gestureSelector);
        C2668g.a(grandGestureSelectorView, "gestureSelector");
        tappableGrandGestureView.setY(grandGestureSelectorView.getY() + f2);
    }

    /* renamed from: a */
    private final void m61700a() {
        float b = (float) av.b();
        int i = (int) (b - (0.07f * b));
        int i2 = (int) (((float) i) - (b * 0.63f));
        GrandGestureSelectorView grandGestureSelectorView = (GrandGestureSelectorView) m61703a(C6248a.gestureSelector);
        C2668g.a(grandGestureSelectorView, "gestureSelector");
        LayoutParams layoutParams = grandGestureSelectorView.getLayoutParams();
        layoutParams.width = i;
        GrandGestureSelectorView grandGestureSelectorView2 = (GrandGestureSelectorView) m61703a(C6248a.gestureSelector);
        C2668g.a(grandGestureSelectorView2, "gestureSelector");
        grandGestureSelectorView2.setLayoutParams(layoutParams);
        TappableGrandGestureView tappableGrandGestureView = (TappableGrandGestureView) m61703a(C6248a.gestureActivator);
        C2668g.a(tappableGrandGestureView, "gestureActivator");
        LayoutParams layoutParams2 = tappableGrandGestureView.getLayoutParams();
        layoutParams2.height = (int) (this.f50879b * 0.33f);
        layoutParams2.width = i2;
        TappableGrandGestureView tappableGrandGestureView2 = (TappableGrandGestureView) m61703a(C6248a.gestureActivator);
        C2668g.a(tappableGrandGestureView2, "gestureActivator");
        tappableGrandGestureView2.setLayoutParams(layoutParams2);
    }

    /* renamed from: b */
    private final boolean m61702b() {
        TappableGrandGestureView tappableGrandGestureView = (TappableGrandGestureView) m61703a(C6248a.gestureActivator);
        C2668g.a(tappableGrandGestureView, "gestureActivator");
        if (tappableGrandGestureView.getMeasuredWidth() > 0) {
            tappableGrandGestureView = (TappableGrandGestureView) m61703a(C6248a.gestureActivator);
            C2668g.a(tappableGrandGestureView, "gestureActivator");
            if (tappableGrandGestureView.getMeasuredHeight() > 0) {
                GrandGestureSelectorView grandGestureSelectorView = (GrandGestureSelectorView) m61703a(C6248a.gestureSelector);
                C2668g.a(grandGestureSelectorView, "gestureSelector");
                if (grandGestureSelectorView.getMeasuredWidth() > 0) {
                    grandGestureSelectorView = (GrandGestureSelectorView) m61703a(C6248a.gestureSelector);
                    C2668g.a(grandGestureSelectorView, "gestureSelector");
                    if (grandGestureSelectorView.getMeasuredHeight() > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
