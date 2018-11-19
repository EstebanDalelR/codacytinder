package com.tinder.smsauth.ui;

import android.arch.lifecycle.C0030o;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.smsauth.di.Injectable;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.view.ErrorContainerView;
import com.tinder.smsauth.ui.view.ErrorContainerView.Listener;
import com.tinder.smsauth.ui.viewmodel.ErrorViewModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/tinder/smsauth/ui/ErrorFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/tinder/smsauth/di/Injectable;", "()V", "errorContainerView", "Lcom/tinder/smsauth/ui/view/ErrorContainerView;", "getErrorContainerView", "()Lcom/tinder/smsauth/ui/view/ErrorContainerView;", "viewModel", "Lcom/tinder/smsauth/ui/viewmodel/ErrorViewModel;", "viewModelFactory", "Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "getViewModelFactory", "()Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "setViewModelFactory", "(Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.c */
public final class C18137c extends Fragment implements Injectable {
    @Inject
    @NotNull
    /* renamed from: a */
    public SmsAuthViewModelFactory f56275a;
    /* renamed from: b */
    private ErrorViewModel f56276b;
    /* renamed from: c */
    private HashMap f56277c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "errorCode", "", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.c$a */
    static final class C16777a<T> implements Observer<String> {
        /* renamed from: a */
        final /* synthetic */ C18137c f51794a;

        C16777a(C18137c c18137c) {
            this.f51794a = c18137c;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62299a((String) obj);
        }

        /* renamed from: a */
        public final void m62299a(@Nullable String str) {
            ErrorContainerView b = this.f51794a.m65808b();
            if (str == null) {
                str = "";
            }
            b.setErrorCode(str);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/smsauth/ui/ErrorFragment$onViewCreated$1", "Lcom/tinder/smsauth/ui/view/ErrorContainerView$Listener;", "(Lcom/tinder/smsauth/ui/ErrorFragment;)V", "onTryAgainButtonClicked", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.c$b */
    public static final class C16778b implements Listener {
        /* renamed from: a */
        final /* synthetic */ C18137c f51795a;

        C16778b(C18137c c18137c) {
            this.f51795a = c18137c;
        }

        public void onTryAgainButtonClicked() {
            C18137c.m65807a(this.f51795a).m62355c().m65686a();
        }
    }

    /* renamed from: a */
    public void m65810a() {
        if (this.f56277c != null) {
            this.f56277c.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m65810a();
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ ErrorViewModel m65807a(C18137c c18137c) {
        c18137c = c18137c.f56276b;
        if (c18137c == null) {
            C2668g.b("viewModel");
        }
        return c18137c;
    }

    /* renamed from: b */
    private final ErrorContainerView m65808b() {
        View view = getView();
        if (view != null) {
            return (ErrorContainerView) view;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.tinder.smsauth.ui.view.ErrorContainerView");
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2668g.b(layoutInflater, "inflater");
        return layoutInflater.inflate(C15006e.error_fragment, viewGroup, false);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        C2668g.b(view, "view");
        super.onViewCreated(view, bundle);
        m65808b().setListener((Listener) new C16778b(this));
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Fragment fragment = this;
        SmsAuthViewModelFactory smsAuthViewModelFactory = this.f56275a;
        if (smsAuthViewModelFactory == null) {
            C2668g.b("viewModelFactory");
        }
        bundle = C0030o.a(fragment, smsAuthViewModelFactory).a(ErrorViewModel.class);
        C2668g.a(bundle, "ViewModelProviders.of(th…rorViewModel::class.java)");
        this.f56276b = (ErrorViewModel) bundle;
        bundle = this.f56276b;
        if (bundle == null) {
            C2668g.b("viewModel");
        }
        bundle.m62354b().a(this, new C16777a(this));
    }
}
