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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013J \u0010\u000b\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\fH\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/common/feed/view/FeedProfileChangeWorkContentView;", "Lcom/tinder/common/feed/view/FeedImageContentView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "workBindDisposable", "Lio/reactivex/disposables/Disposable;", "bind", "", "companyText", "", "viewModels", "", "Lcom/tinder/chat/view/model/ActivityFeedImageViewModel;", "onFeedMediaContentLoadedListener", "Lcom/tinder/common/feed/interfaces/OnFeedMediaContentLoadedListener;", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class FeedProfileChangeWorkContentView extends FeedImageContentView {
    /* renamed from: b */
    private Disposable f41170b;
    /* renamed from: c */
    private HashMap f41171c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/common/feed/view/FeedImageContentView$Companion$ContentState;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedProfileChangeWorkContentView$a */
    static final class C10667a<T> implements Consumer<ContentState> {
        /* renamed from: a */
        final /* synthetic */ FeedProfileChangeWorkContentView f34985a;
        /* renamed from: b */
        final /* synthetic */ String f34986b;

        C10667a(FeedProfileChangeWorkContentView feedProfileChangeWorkContentView, String str) {
            this.f34985a = feedProfileChangeWorkContentView;
            this.f34986b = str;
        }

        public /* synthetic */ void accept(Object obj) {
            m42990a((ContentState) obj);
        }

        /* renamed from: a */
        public final void m42990a(ContentState contentState) {
            TextView textView = (TextView) this.f34985a.mo11001a(C6248a.feedChangeCompanyTextView);
            textView.setText(this.f34986b);
            C8587g.m36614a(textView, true);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.common.feed.view.FeedProfileChangeWorkContentView$b */
    static final class C10668b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        final /* synthetic */ FeedProfileChangeWorkContentView f34987a;

        C10668b(FeedProfileChangeWorkContentView feedProfileChangeWorkContentView) {
            this.f34987a = feedProfileChangeWorkContentView;
        }

        public /* synthetic */ void accept(Object obj) {
            m42991a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m42991a(Throwable th) {
            C0001a.c(th, "Error observing content loaded", new Object[0]);
            C8587g.m36614a((TextView) this.f34987a.mo11001a(C6248a.feedChangeCompanyTextView), false);
        }
    }

    @JvmOverloads
    public FeedProfileChangeWorkContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public FeedProfileChangeWorkContentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo11001a(int i) {
        if (this.f41171c == null) {
            this.f41171c = new HashMap();
        }
        View view = (View) this.f41171c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f41171c.put(Integer.valueOf(i), view);
        return view;
    }

    @JvmOverloads
    public /* synthetic */ FeedProfileChangeWorkContentView(Context context, AttributeSet attributeSet, int i, int i2, C15823e c15823e) {
        if ((i2 & 2) != null) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    @JvmOverloads
    public FeedProfileChangeWorkContentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        C2668g.b(context, "context");
        super(context, attributeSet, i);
        ConstraintLayout.inflate(context, R.layout.activity_feed_profile_change_work_content_view, this);
        setLayoutParams(C8529a.f30276a.m36494b());
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Disposable disposable = this.f41170b;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public void mo11004a(@NotNull List<C10636b> list, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(list, "viewModels");
        Disposable disposable = this.f41170b;
        if (disposable != null) {
            disposable.dispose();
        }
        TextView textView = (TextView) mo11001a(C6248a.feedChangeCompanyTextView);
        C2668g.a(textView, "feedChangeCompanyTextView");
        textView.setVisibility(8);
        super.mo11004a(list, onFeedMediaContentLoadedListener);
    }

    /* renamed from: a */
    public static /* synthetic */ void m50258a(FeedProfileChangeWorkContentView feedProfileChangeWorkContentView, String str, List list, OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener, int i, Object obj) {
        if ((i & 2) != null) {
            list = null;
        }
        if ((i & 4) != 0) {
            onFeedMediaContentLoadedListener = null;
        }
        feedProfileChangeWorkContentView.m50260a(str, list, onFeedMediaContentLoadedListener);
    }

    /* renamed from: a */
    public final void m50260a(@NotNull String str, @Nullable List<C10636b> list, @Nullable OnFeedMediaContentLoadedListener onFeedMediaContentLoadedListener) {
        C2668g.b(str, "companyText");
        if (list != null) {
            super.mo11004a(list, onFeedMediaContentLoadedListener);
        }
        list = this.f41170b;
        if (list != null) {
            list.dispose();
        }
        this.f41170b = m42984a().observeOn(C15674a.a()).subscribe((Consumer) new C10667a(this, str), (Consumer) new C10668b(this));
    }
}
