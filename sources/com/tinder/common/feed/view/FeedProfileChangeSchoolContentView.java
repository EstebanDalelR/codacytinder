package com.tinder.common.feed.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.chat.view.model.C10636b;
import com.tinder.common.feed.interfaces.OnFeedMediaContentLoadedListener;
import com.tinder.common.feed.view.FeedImageContentView.Companion.ContentState;
import com.tinder.common.p191d.C8529a;
import com.tinder.common.view.extension.C8587g;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J \u0010\u000b\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/common/feed/view/FeedProfileChangeSchoolContentView;", "Lcom/tinder/common/feed/view/FeedImageContentView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "schoolBindDisposable", "Lio/reactivex/disposables/Disposable;", "bind", "", "schoolText", "", "viewModels", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "onFeedMediaContentLoadedListener", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedProfileChangeSchoolContentView extends FeedImageContentView {
    /* renamed from: b */
    private Disposable f41168b;
    /* renamed from: c */
    private HashMap f41169c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/feed/view/FeedImageContentView$Companion$ContentState;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedProfileChangeSchoolContentView$a */
    static final class C10665a<T> implements Consumer<ContentState> {
        /* renamed from: a */
        final /* synthetic */ FeedProfileChangeSchoolContentView f34982a;
        /* renamed from: b */
        final /* synthetic */ String f34983b;

        C10665a(FeedProfileChangeSchoolContentView feedProfileChangeSchoolContentView, String str) {
            this.f34982a = feedProfileChangeSchoolContentView;
            this.f34983b = str;
        }

        public /* synthetic */ void accept(Object obj) {
            m42988a((ContentState) obj);
        }

        /* renamed from: a */
        public final void m42988a(ContentState contentState) {
            TextView textView = (TextView) this.f34982a.mo11001a(C6248a.feedChangeSchoolTextView);
            textView.setText(this.f34983b);
            C8587g.m36614a(textView, true);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedProfileChangeSchoolContentView$b */
    static final class C10666b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ FeedProfileChangeSchoolContentView f34984a;

        C10666b(FeedProfileChangeSchoolContentView feedProfileChangeSchoolContentView) {
            this.f34984a = feedProfileChangeSchoolContentView;
        }

        public /* synthetic */ void accept(Object obj) {
            m42989a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42989a(Throwable th) {
            C0001a.c(th, "Error observing content loaded", new Object[0]);
            C8587g.m36614a((TextView) this.f34984a.mo11001a(C6248a.feedChangeSchoolTextView), false);
        }
    }

    @JvmOverloads
    public FeedProfileChangeSchoolContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FeedProfileChangeSchoolContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11001a(int i) {
        if (this.f41169c == null) {
            this.f41169c = new HashMap();
        }
        View view = (View) this.f41169c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f41169c.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ FeedProfileChangeSchoolContentView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public FeedProfileChangeSchoolContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        ConstraintLayout.inflate(context, R.layout.activity_feed_profile_change_school_content_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.f41168b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public void mo11004a(@NotNull List<C10636b> list, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(list, "viewModels");
        Disposable disposable = this.f41168b;
        if (disposable != null) {
            disposable.dispose();
        }
        TextView textView = (TextView) mo11001a(C6248a.feedChangeSchoolTextView);
        C2668g.a(textView, "feedChangeSchoolTextView");
        textView.setVisibility(8);
        super.mo11004a(list, onFeedMediaContentLoadedListener);
    }

    /* renamed from: a */
    public static /* synthetic */ void m50254a(FeedProfileChangeSchoolContentView feedProfileChangeSchoolContentView, String str, List list, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener, int i, Object obj) {
        if ((i & 2) != null) {
            list = null;
        }
        if ((i & 4) != 0) {
            onFeedMediaContentLoadedListener = null;
        }
        feedProfileChangeSchoolContentView.m50256a(str, list, onFeedMediaContentLoadedListener);
    }

    /* renamed from: a */
    public final void m50256a(@NotNull String str, @Nullable List<C10636b> list, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(str, "schoolText");
        if (list != null) {
            super.mo11004a(list, onFeedMediaContentLoadedListener);
        }
        list = this.f41168b;
        if (list != null) {
            list.dispose();
        }
        this.f41168b = m42984a().observeOn(C15674a.a()).subscribe((Consumer) new C10665a(this, str), (Consumer) new C10666b(this));
    }
}
