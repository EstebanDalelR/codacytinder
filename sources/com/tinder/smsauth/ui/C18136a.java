package com.tinder.smsauth.ui;

import android.arch.lifecycle.C0030o;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.api.ManagerWebServices;
import com.tinder.smsauth.di.Injectable;
import com.tinder.smsauth.entity.C14975c;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.view.CountryCodeSelectionView;
import com.tinder.smsauth.ui.view.CountryCodeSelectionView.Listener;
import com.tinder.smsauth.ui.viewmodel.CountryCodeSelectionViewModel;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tinder/smsauth/ui/CountryCodeSelectionFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/tinder/smsauth/di/Injectable;", "()V", "countryCodeSelectionView", "Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView;", "getCountryCodeSelectionView", "()Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView;", "viewModel", "Lcom/tinder/smsauth/ui/viewmodel/CountryCodeSelectionViewModel;", "viewModelFactory", "Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "getViewModelFactory", "()Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "setViewModelFactory", "(Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.a */
public final class C18136a extends Fragment implements Injectable {
    @Inject
    @NotNull
    /* renamed from: a */
    public SmsAuthViewModelFactory f56272a;
    /* renamed from: b */
    private CountryCodeSelectionViewModel f56273b;
    /* renamed from: c */
    private HashMap f56274c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "countries", "", "Lcom/tinder/smsauth/entity/Country;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.a$a */
    static final class C16774a<T> implements Observer<List<? extends C14975c>> {
        /* renamed from: a */
        final /* synthetic */ C18136a f51791a;

        C16774a(C18136a c18136a) {
            this.f51791a = c18136a;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62296a((List) obj);
        }

        /* renamed from: a */
        public final void m62296a(@Nullable List<C14975c> list) {
            CountryCodeSelectionView b = this.f51791a.m65804b();
            if (list == null) {
                list = C17554o.m64195a();
            }
            b.setCountries(list);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/smsauth/ui/CountryCodeSelectionFragment$onViewCreated$1", "Lcom/tinder/smsauth/ui/view/CountryCodeSelectionView$Listener;", "(Lcom/tinder/smsauth/ui/CountryCodeSelectionFragment;)V", "onCountrySelected", "", "country", "Lcom/tinder/smsauth/entity/Country;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.a$b */
    public static final class C16775b implements Listener {
        /* renamed from: a */
        final /* synthetic */ C18136a f51792a;

        C16775b(C18136a c18136a) {
            this.f51792a = c18136a;
        }

        public void onCountrySelected(@NotNull C14975c c14975c) {
            C2668g.b(c14975c, ManagerWebServices.PARAM_COUNTRY);
            C18136a.m65803a(this.f51792a).m62348a(c14975c);
        }
    }

    /* renamed from: a */
    public void m65806a() {
        if (this.f56274c != null) {
            this.f56274c.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m65806a();
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ CountryCodeSelectionViewModel m65803a(C18136a c18136a) {
        c18136a = c18136a.f56273b;
        if (c18136a == null) {
            C2668g.b("viewModel");
        }
        return c18136a;
    }

    /* renamed from: b */
    private final CountryCodeSelectionView m65804b() {
        View view = getView();
        if (view != null) {
            return (CountryCodeSelectionView) view;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.smsauth.ui.view.CountryCodeSelectionView");
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2668g.b(layoutInflater, "inflater");
        return layoutInflater.inflate(C15006e.country_code_selection_fragment, viewGroup, false);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        C2668g.b(view, "view");
        super.onViewCreated(view, bundle);
        m65804b().setListener((Listener) new C16775b(this));
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Fragment fragment = this;
        SmsAuthViewModelFactory smsAuthViewModelFactory = this.f56272a;
        if (smsAuthViewModelFactory == null) {
            C2668g.b("viewModelFactory");
        }
        bundle = C0030o.a(fragment, smsAuthViewModelFactory).a(CountryCodeSelectionViewModel.class);
        C2668g.a(bundle, "ViewModelProviders.of(th…ionViewModel::class.java)");
        this.f56273b = (CountryCodeSelectionViewModel) bundle;
        bundle = this.f56273b;
        if (bundle == null) {
            C2668g.b("viewModel");
        }
        bundle.m62350c().a(this, new C16774a(this));
    }
}
