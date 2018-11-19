package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.jakewharton.rxbinding2.p141c.C5717c;
import com.tinder.smsauth.ui.C15008k.C15005d;
import io.reactivex.disposables.C17356a;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/ui/view/CountryCodeSearchView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "listener", "Lcom/tinder/smsauth/ui/view/CountryCodeSearchView$Listener;", "getListener", "()Lcom/tinder/smsauth/ui/view/CountryCodeSearchView$Listener;", "setListener", "(Lcom/tinder/smsauth/ui/view/CountryCodeSearchView$Listener;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "Listener", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class CountryCodeSearchView extends ConstraintLayout {
    @Nullable
    /* renamed from: a */
    private Listener f51815a;
    /* renamed from: b */
    private final C17356a f51816b;
    /* renamed from: c */
    private HashMap f51817c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/smsauth/ui/view/CountryCodeSearchView$Listener;", "", "onQueryChanged", "", "query", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onQueryChanged(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.CountryCodeSearchView$a */
    static final class C16791a<T> implements Consumer<CharSequence> {
        /* renamed from: a */
        final /* synthetic */ CountryCodeSearchView f51814a;

        C16791a(CountryCodeSearchView countryCodeSearchView) {
            this.f51814a = countryCodeSearchView;
        }

        public /* synthetic */ void accept(Object obj) {
            m62318a((CharSequence) obj);
        }

        /* renamed from: a */
        public final void m62318a(CharSequence charSequence) {
            Listener listener = this.f51814a.getListener();
            if (listener != null) {
                listener.onQueryChanged(charSequence.toString());
            }
        }
    }

    /* renamed from: a */
    public View m62319a(int i) {
        if (this.f51817c == null) {
            this.f51817c = new HashMap();
        }
        View view = (View) this.f51817c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51817c.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ CountryCodeSearchView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public CountryCodeSearchView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f51816b = new C17356a();
    }

    @Nullable
    public final Listener getListener() {
        return this.f51815a;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f51815a = listener;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51816b.add(C5717c.a((EditText) m62319a(C15005d.countryCodeSearch)).debounce(100, TimeUnit.MILLISECONDS).observeOn(C15674a.m58830a()).subscribe(new C16791a(this)));
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f51816b.m63446a();
    }
}
