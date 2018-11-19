package com.tinder.bitmoji.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ViewSwitcher;
import com.bumptech.glide.C0994i;
import com.tinder.bitmoji.C8328l.C8324a;
import com.tinder.bitmoji.C8328l.C8325b;
import com.tinder.bitmoji.C8328l.C8326c;
import com.tinder.bitmoji.di.BitmojiComponentProvider;
import com.tinder.bitmoji.presenter.C8329a;
import com.tinder.bitmoji.target.BitmojiIconTarget;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.subjects.PublishSubject;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\nJ\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aJ\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u001a\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0006\u0010\"\u001a\u00020\u0017J\u0010\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0017H\u0016R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/tinder/bitmoji/view/BitmojiIconView;", "Landroid/widget/ViewSwitcher;", "Lcom/tinder/bitmoji/target/BitmojiIconTarget;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bitmojiIconStateSubject", "Lrx/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "closeButton", "Landroid/widget/ImageView;", "icon", "isOpen", "presenter", "Lcom/tinder/bitmoji/presenter/BitmojiIconPresenter;", "getPresenter$bitmoji_release", "()Lcom/tinder/bitmoji/presenter/BitmojiIconPresenter;", "setPresenter$bitmoji_release", "(Lcom/tinder/bitmoji/presenter/BitmojiIconPresenter;)V", "closeIcon", "", "isIconOpen", "observeIconState", "Lrx/Observable;", "onAttachedToWindow", "onDetachedFromWindow", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "", "openIcon", "showBitmojiIcon", "imageUrl", "", "showDefaultBitmojiIcon", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
public final class BitmojiIconView extends ViewSwitcher implements BitmojiIconTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8329a f33883a;
    /* renamed from: b */
    private final PublishSubject<Boolean> f33884b = PublishSubject.w();
    /* renamed from: c */
    private final ImageView f33885c;
    /* renamed from: d */
    private boolean f33886d;
    /* renamed from: e */
    private final ImageView f33887e;

    public BitmojiIconView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
        attributeSet = context.getApplicationContext();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.bitmoji.di.BitmojiComponentProvider");
        }
        ((BitmojiComponentProvider) attributeSet).provideBitmojiComponent().inject(this);
        View.inflate(context, C8326c.bitmoji_icon_view, this);
        context = findViewById(C8325b.icon_close);
        C2668g.a(context, "findViewById(R.id.icon_close)");
        this.f33885c = (ImageView) context;
        context = findViewById(C8325b.bitmoji_icon);
        C2668g.a(context, "findViewById(R.id.bitmoji_icon)");
        this.f33887e = (ImageView) context;
        setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                if (this.f33886d != null) {
                    this.setDisplayedChild(0);
                    this.f33886d = false;
                } else {
                    this.setDisplayedChild(1);
                    this.f33886d = true;
                }
                this.f33884b.onNext(Boolean.valueOf(this.f33886d));
            }
        });
    }

    @NotNull
    public final C8329a getPresenter$bitmoji_release() {
        C8329a c8329a = this.f33883a;
        if (c8329a == null) {
            C2668g.b("presenter");
        }
        return c8329a;
    }

    public final void setPresenter$bitmoji_release(@NotNull C8329a c8329a) {
        C2668g.b(c8329a, "<set-?>");
        this.f33883a = c8329a;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8329a c8329a = this.f33883a;
        if (c8329a == null) {
            C2668g.b("presenter");
        }
        c8329a.m35443a((BitmojiIconTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8329a c8329a = this.f33883a;
        if (c8329a == null) {
            C2668g.b("presenter");
        }
        c8329a.m35442a();
    }

    public void showBitmojiIcon(@NotNull String str) {
        C2668g.b(str, "imageUrl");
        C0994i.b(getContext()).a(str).b(C8324a.default_bitmoji_input_icon).a(this.f33887e);
    }

    public void showDefaultBitmojiIcon() {
        this.f33887e.setImageResource(C8324a.default_bitmoji_input_icon);
    }

    protected void onVisibilityChanged(@Nullable View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            view = this.f33883a;
            if (view == null) {
                C2668g.b("presenter");
            }
            view.m35444b();
        }
    }

    /* renamed from: a */
    public final boolean m42218a() {
        return this.f33886d;
    }

    /* renamed from: b */
    public final void m42219b() {
        if (m42218a()) {
            performClick();
        }
    }

    /* renamed from: c */
    public final void m42220c() {
        if (!m42218a()) {
            performClick();
        }
    }

    @NotNull
    /* renamed from: d */
    public final Observable<Boolean> m42221d() {
        Observable<Boolean> e = this.f33884b.e();
        C2668g.a(e, "bitmojiIconStateSubject.asObservable()");
        return e;
    }
}
