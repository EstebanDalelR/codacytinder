package com.tinder.places.settings.view;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.jakewharton.rxbinding2.p140b.C5716a;
import com.jakewharton.rxbinding2.p141c.C5717c;
import com.jakewharton.rxbinding2.p141c.C5718d;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.places.settings.activity.PlacesSurveyOtherActivity;
import com.tinder.places.settings.presenter.C14321h;
import com.tinder.places.settings.target.PlacesSurveyOtherTarget;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/places/settings/view/PlacesSurveyOtherView;", "Landroid/support/design/widget/CoordinatorLayout;", "Lcom/tinder/places/settings/target/PlacesSurveyOtherTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "presenter", "Lcom/tinder/places/settings/presenter/PlacesSurveyOtherPresenter;", "getPresenter", "()Lcom/tinder/places/settings/presenter/PlacesSurveyOtherPresenter;", "setPresenter", "(Lcom/tinder/places/settings/presenter/PlacesSurveyOtherPresenter;)V", "submitClickSubscriber", "Lio/reactivex/disposables/Disposable;", "submitEnabledSubscriber", "onAttachedToWindow", "", "onCustomReasonSuccess", "onDetachedFromWindow", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class PlacesSurveyOtherView extends CoordinatorLayout implements PlacesSurveyOtherTarget {
    @Inject
    @NotNull
    /* renamed from: f */
    public C14321h f57845f;
    /* renamed from: g */
    private Disposable f57846g;
    /* renamed from: h */
    private Disposable f57847h;
    /* renamed from: i */
    private HashMap f57848i;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSurveyOtherView$a */
    static final class C16033a<T> implements Consumer<Object> {
        /* renamed from: a */
        final /* synthetic */ PlacesSurveyOtherView f49806a;

        C16033a(PlacesSurveyOtherView placesSurveyOtherView) {
            this.f49806a = placesSurveyOtherView;
        }

        public final void accept(Object obj) {
            obj = this.f49806a.getPresenter();
            EditText editText = (EditText) this.f49806a.m67039b(C6248a.otherInput);
            C2668g.a(editText, "otherInput");
            Editable text = editText.getText();
            obj.m54639a(text != null ? text.toString() : null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSurveyOtherView$b */
    static final class C16034b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16034b f49807a = new C16034b();

        C16034b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60798a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60798a(Throwable th) {
            C0001a.e("Error submitting other reason in Places exit survey", new Object[0]);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/jakewharton/rxbinding2/widget/TextViewAfterTextChangeEvent;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSurveyOtherView$c */
    static final class C16035c<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C16035c f49808a = new C16035c();

        C16035c() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(m60799a((C5718d) obj));
        }

        /* renamed from: a */
        public final boolean m60799a(@NotNull C5718d c5718d) {
            C2668g.b(c5718d, "it");
            c5718d = c5718d.b();
            if (c5718d != null) {
                c5718d = c5718d.toString();
                if (c5718d != null) {
                    c5718d = c5718d.length();
                    return c5718d <= null;
                }
            }
            c5718d = null;
            if (c5718d <= null) {
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSurveyOtherView$d */
    static final class C16036d<T> implements Consumer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ PlacesSurveyOtherView f49809a;

        C16036d(PlacesSurveyOtherView placesSurveyOtherView) {
            this.f49809a = placesSurveyOtherView;
        }

        public /* synthetic */ void accept(Object obj) {
            m60800a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m60800a(Boolean bool) {
            TextView textView = (TextView) this.f49809a.m67039b(C6248a.submit);
            C2668g.a(textView, "submit");
            C2668g.a(bool, "it");
            textView.setEnabled(bool.booleanValue());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.places.settings.view.PlacesSurveyOtherView$e */
    static final class C16037e<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16037e f49810a = new C16037e();

        C16037e() {
        }

        public /* synthetic */ void accept(Object obj) {
            m60801a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m60801a(Throwable th) {
            C0001a.e("Error observing text changes in Places exit survey", new Object[0]);
        }
    }

    /* renamed from: b */
    public View m67039b(int i) {
        if (this.f57848i == null) {
            this.f57848i = new HashMap();
        }
        View view = (View) this.f57848i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f57848i.put(Integer.valueOf(i), view);
        return view;
    }

    public PlacesSurveyOtherView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = context.getApplicationContext();
        if (attributeSet == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) attributeSet).h().placesSurveyOtherComponentBuilder().placesSurveyOtherActivity((PlacesSurveyOtherActivity) context).build().inject(this);
        View.inflate(context, R.layout.view_places_survey_other, this);
    }

    @NotNull
    public final C14321h getPresenter() {
        C14321h c14321h = this.f57845f;
        if (c14321h == null) {
            C2668g.b("presenter");
        }
        return c14321h;
    }

    public final void setPresenter(@NotNull C14321h c14321h) {
        C2668g.b(c14321h, "<set-?>");
        this.f57845f = c14321h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14321h c14321h = this.f57845f;
        if (c14321h == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, c14321h);
        Disposable disposable = this.f57846g;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f57846g = C5716a.b((TextView) m67039b(C6248a.submit)).subscribe(new C16033a(this), C16034b.f49807a);
        disposable = this.f57847h;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f57847h = C5717c.c((EditText) m67039b(C6248a.otherInput)).map(C16035c.f49808a).distinctUntilChanged().subscribe(new C16036d(this), C16037e.f49810a);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Deadshot.drop(this);
        Disposable disposable = this.f57846g;
        if (disposable != null) {
            disposable.dispose();
        }
        disposable = this.f57847h;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public void onCustomReasonSuccess() {
        Context context = getContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        Activity activity = (Activity) context;
        activity.setResult(-1);
        activity.finish();
    }
}
