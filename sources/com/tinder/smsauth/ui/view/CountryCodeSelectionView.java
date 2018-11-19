package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.util.AttributeSet;
import android.view.View;
import com.tinder.smsauth.entity.C14975c;
import com.tinder.smsauth.ui.C15008k.C15005d;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0014\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "countryCodeAdapter", "Lcom/tinder/smsauth/ui/view/CountryCodeAdapter;", "listener", "Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView$Listener;", "getListener", "()Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView$Listener;", "setListener", "(Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView$Listener;)V", "onFinishInflate", "", "setCountries", "countries", "", "Lcom/tinder/smsauth/entity/Country;", "Listener", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class CountryCodeSelectionView extends ConstraintLayout {
    @Nullable
    /* renamed from: a */
    private Listener f51818a;
    /* renamed from: b */
    private final C16807a f51819b;
    /* renamed from: c */
    private HashMap f51820c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView$Listener;", "", "onCountrySelected", "", "country", "Lcom/tinder/smsauth/entity/Country;", "ui_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onCountrySelected(@NotNull C14975c c14975c);
    }

    /* renamed from: a */
    public View m62320a(int i) {
        if (this.f51820c == null) {
            this.f51820c = new HashMap();
        }
        View view = (View) this.f51820c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51820c.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ CountryCodeSelectionView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public CountryCodeSelectionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f51819b = new C16807a((Function1) new CountryCodeSelectionView$countryCodeAdapter$1(this));
    }

    @Nullable
    public final Listener getListener() {
        return this.f51818a;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f51818a = listener;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) m62320a(C15005d.countryCodeRecyclerView);
        recyclerView.setAdapter(this.f51819b);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    public final void setCountries(@NotNull List<C14975c> list) {
        C2668g.b(list, "countries");
        RecyclerView recyclerView = (RecyclerView) m62320a(C15005d.countryCodeRecyclerView);
        C2668g.a(recyclerView, "countryCodeRecyclerView");
        Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.smsauth.ui.view.CountryCodeAdapter");
        }
        ((C16807a) adapter).m62342a((List) list);
    }
}
