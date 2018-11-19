package com.tinder.loops.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.support.v4.content.C0432b;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.jakewharton.rxbinding2.p135a.p138b.p139a.C5714b;
import com.jakewharton.rxbinding2.p135a.p138b.p139a.C5715e;
import com.tinder.p236e.C8946a.C8942a;
import com.tinder.p236e.C8946a.C8943b;
import com.tinder.p236e.C8946a.C8944c;
import com.tinder.p258h.C9694a;
import io.reactivex.C3959e;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import io.reactivex.subjects.C19040a;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0014J\b\u0010&\u001a\u00020#H\u0002J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020 0(J\b\u0010)\u001a\u00020#H\u0014J\b\u0010*\u001a\u00020#H\u0014J\f\u0010+\u001a\u00020#*\u00020,H\u0002J\f\u0010-\u001a\u00020#*\u00020,H\u0002R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R2\u0010\u001e\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010 0  !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010 0 \u0018\u00010\u001f0\u001fX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/tinder/loops/ui/view/VideoTimeline;", "Landroid/support/v7/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "borderWidth", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "frameHeight", "getFrameHeight", "()I", "frameWidth", "interpolator", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "redPaint", "Landroid/graphics/Paint;", "getRedPaint", "()Landroid/graphics/Paint;", "redPaint$delegate", "Lkotlin/Lazy;", "selectionBox", "Landroid/graphics/Rect;", "getSelectionBox", "()Landroid/graphics/Rect;", "selectionBox$delegate", "selectionBoxWidth", "startTimeSubject", "Lio/reactivex/subjects/BehaviorSubject;", "", "kotlin.jvm.PlatformType", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "observeScrollEvent", "observeSelectedStartTimePosition", "Lio/reactivex/Observable;", "onAttachedToWindow", "onDetachedFromWindow", "animateScaleEffects", "Landroid/support/v7/widget/LinearLayoutManager;", "calculateStartTime", "loopsengine_release"}, k = 1, mv = {1, 1, 10})
public final class VideoTimeline extends RecyclerView {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f44528a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(VideoTimeline.class), "selectionBox", "getSelectionBox()Landroid/graphics/Rect;")), C15825i.a(new PropertyReference1Impl(C15825i.a(VideoTimeline.class), "redPaint", "getRedPaint()Landroid/graphics/Paint;"))};
    /* renamed from: b */
    private final int f44529b;
    /* renamed from: c */
    private final int f44530c;
    /* renamed from: d */
    private final int f44531d;
    /* renamed from: e */
    private final int f44532e;
    /* renamed from: f */
    private final AccelerateDecelerateInterpolator f44533f;
    /* renamed from: g */
    private final C19040a<Long> f44534g;
    /* renamed from: h */
    private final C17356a f44535h;
    /* renamed from: i */
    private final Lazy f44536i;
    /* renamed from: j */
    private final Lazy f44537j;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/jakewharton/rxbinding2/support/v7/widget/RecyclerViewScrollEvent;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.VideoTimeline$a */
    static final class C11963a<T> implements Consumer<C5714b> {
        /* renamed from: a */
        final /* synthetic */ VideoTimeline f38897a;

        C11963a(VideoTimeline videoTimeline) {
            this.f38897a = videoTimeline;
        }

        public /* synthetic */ void accept(Object obj) {
            m47995a((C5714b) obj);
        }

        /* renamed from: a */
        public final void m47995a(C5714b c5714b) {
            c5714b = this.f38897a.getLayoutManager();
            if (!(c5714b instanceof LinearLayoutManager)) {
                c5714b = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c5714b;
            if (linearLayoutManager != null) {
                this.f38897a.m53773a(linearLayoutManager);
                this.f38897a.m53777b(linearLayoutManager);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.VideoTimeline$b */
    static final class C11964b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C11964b f38898a = new C11964b();

        C11964b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m47996a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m47996a(Throwable th) {
            C2668g.a(th, "it");
            C9694a.m40150a(th);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "test", "(Ljava/lang/Integer;)Z"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.VideoTimeline$c */
    static final class C11965c<T> implements Predicate<Integer> {
        /* renamed from: a */
        public static final C11965c f38899a = new C11965c();

        C11965c() {
        }

        public /* synthetic */ boolean test(Object obj) {
            return m47997a((Integer) obj);
        }

        /* renamed from: a */
        public final boolean m47997a(@NotNull Integer num) {
            C2668g.b(num, "it");
            return num.intValue() == null ? true : null;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "startTime", "<anonymous parameter 1>", "", "apply", "(Ljava/lang/Long;Ljava/lang/Integer;)Ljava/lang/Long;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.loops.ui.view.VideoTimeline$d */
    static final class C11966d<T1, T2, R> implements BiFunction<Long, Integer, Long> {
        /* renamed from: a */
        public static final C11966d f38900a = new C11966d();

        C11966d() {
        }

        @NotNull
        /* renamed from: a */
        public final Long m47998a(@NotNull Long l, @NotNull Integer num) {
            C2668g.b(l, "startTime");
            C2668g.b(num, "<anonymous parameter 1>");
            return l;
        }

        public /* synthetic */ Object apply(Object obj, Object obj2) {
            return m47998a((Long) obj, (Integer) obj2);
        }
    }

    @JvmOverloads
    public VideoTimeline(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public VideoTimeline(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Paint getRedPaint() {
        Lazy lazy = this.f44537j;
        KProperty kProperty = f44528a[1];
        return (Paint) lazy.getValue();
    }

    private final Rect getSelectionBox() {
        Lazy lazy = this.f44536i;
        KProperty kProperty = f44528a[0];
        return (Rect) lazy.getValue();
    }

    @JvmOverloads
    public /* synthetic */ VideoTimeline(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public VideoTimeline(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        this.f44529b = getResources().getDimensionPixelSize(C8943b.timeline_frame_height);
        this.f44530c = getResources().getDimensionPixelSize(C8943b.selection_box_border);
        this.f44531d = getResources().getDimensionPixelSize(C8943b.timeline_frame_width);
        this.f44532e = this.f44531d * 2;
        this.f44533f = new AccelerateDecelerateInterpolator();
        this.f44534g = C19040a.a(Long.valueOf(null));
        this.f44535h = new C17356a();
        this.f44536i = C18451c.a((Function0) new VideoTimeline$selectionBox$2(this));
        this.f44537j = C18451c.a((Function0) new VideoTimeline$redPaint$2(this));
    }

    public final int getFrameHeight() {
        return this.f44529b;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m53776b();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44535h.a();
    }

    /* renamed from: b */
    private final void m53776b() {
        this.f44535h.add(C5715e.a(this).subscribe(new C11963a(this), C11964b.f38898a));
    }

    @NotNull
    /* renamed from: a */
    public final C3959e<Long> m53779a() {
        C3959e<Long> distinctUntilChanged = C3959e.combineLatest(this.f44534g.hide(), C5715e.b(this).startWith(Integer.valueOf(0)).filter(C11965c.f38899a), C11966d.f38900a).distinctUntilChanged();
        C2668g.a(distinctUntilChanged, "Observable.combineLatest… ).distinctUntilChanged()");
        return distinctUntilChanged;
    }

    /* renamed from: a */
    private final void m53773a(@NotNull LinearLayoutManager linearLayoutManager) {
        linearLayoutManager = linearLayoutManager.findFirstVisibleItemPosition();
        View view = findViewHolderForAdapterPosition(linearLayoutManager).itemView;
        if (view != null) {
            this.f44534g.onNext(Long.valueOf((((long) linearLayoutManager) * 1000) + (((long) ((int) ((((float) (getSelectionBox().left - view.getLeft())) / ((float) this.f44531d)) * ((float) 10)))) * 100)));
        }
    }

    /* renamed from: b */
    private final void m53777b(@NotNull LinearLayoutManager linearLayoutManager) {
        linearLayoutManager = linearLayoutManager.getItemCount() - 1;
        if (linearLayoutManager >= null) {
            int i = 0;
            while (true) {
                ViewHolder findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition != null) {
                    View view = findViewHolderForAdapterPosition.itemView;
                    if (view != null) {
                        View findViewById = view.findViewById(C8944c.frameTimelineImageView);
                        C2668g.a(findViewById, "findViewById(R.id.frameTimelineImageView)");
                        ImageView imageView = (ImageView) findViewById;
                        if ((view.getLeft() <= getSelectionBox().left || view.getLeft() >= getSelectionBox().right) && (view.getRight() <= getSelectionBox().left || view.getRight() >= getSelectionBox().right)) {
                            view.animate().scaleY(0.85f).setInterpolator(this.f44533f);
                            imageView.setColorFilter(C0432b.c(view.getContext(), C8942a.whiteFadeOut), Mode.MULTIPLY);
                        } else {
                            view.animate().scaleY(0.95f).setInterpolator(this.f44533f);
                            imageView.setColorFilter((ColorFilter) null);
                        }
                    }
                }
                if (i != linearLayoutManager) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    protected void dispatchDraw(@Nullable Canvas canvas) {
        super.dispatchDraw(canvas);
        setPadding(getWidth() / 2, 0, (getWidth() / 2) - this.f44532e, 0);
        if (canvas != null) {
            canvas.drawRect(getSelectionBox(), getRedPaint());
        }
    }
}
