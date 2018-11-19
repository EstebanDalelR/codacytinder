package com.tinder.smsauth.ui;

import android.arch.lifecycle.C0030o;
import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.common.logger.Logger;
import com.tinder.smsauth.di.Injectable;
import com.tinder.smsauth.entity.C14978g;
import com.tinder.smsauth.entity.C14980h;
import com.tinder.smsauth.entity.Flow.C14974c.C16739a;
import com.tinder.smsauth.entity.Flow.Error.OneTimePasswordVerifiedAsInvalid;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.C15008k.C15007f;
import com.tinder.smsauth.ui.view.OneTimePasswordCollectionContainerView;
import com.tinder.smsauth.ui.view.OneTimePasswordCollectionContainerView.Listener;
import com.tinder.smsauth.ui.viewmodel.OneTimePasswordCollectionViewModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/tinder/smsauth/ui/OneTimePasswordCollectionFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/tinder/smsauth/di/Injectable;", "()V", "logger", "Lcom/tinder/common/logger/Logger;", "getLogger", "()Lcom/tinder/common/logger/Logger;", "setLogger", "(Lcom/tinder/common/logger/Logger;)V", "oneTimePasswordCollectionContainerView", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView;", "viewModel", "Lcom/tinder/smsauth/ui/viewmodel/OneTimePasswordCollectionViewModel;", "viewModelFactory", "Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "getViewModelFactory", "()Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "setViewModelFactory", "(Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.e */
public final class C18138e extends Fragment implements Injectable {
    @Inject
    @NotNull
    /* renamed from: a */
    public SmsAuthViewModelFactory f56278a;
    @Inject
    @NotNull
    /* renamed from: b */
    public Logger f56279b;
    /* renamed from: c */
    private OneTimePasswordCollectionViewModel f56280c;
    /* renamed from: d */
    private OneTimePasswordCollectionContainerView f56281d;
    /* renamed from: e */
    private HashMap f56282e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/smsauth/entity/Flow$State$CollectingOneTimePassword;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.e$a */
    static final class C16780a<T> implements Observer<C16739a> {
        /* renamed from: a */
        final /* synthetic */ C18138e f51797a;

        C16780a(C18138e c18138e) {
            this.f51797a = c18138e;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62302a((C16739a) obj);
        }

        /* renamed from: a */
        public final void m62302a(@Nullable C16739a c16739a) {
            if (c16739a == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.smsauth.entity.Flow.State.CollectingOneTimePassword");
            }
            C14978g b = c16739a.m62248b();
            C14980h a = c16739a.mo12366a().m56580a();
            OneTimePasswordCollectionContainerView a2 = C18138e.m65811a(this.f51797a);
            a2.setPhoneNumber(a.m56578d());
            a2.setContinueButtonEnabled(b.m56570b());
            a2.setOneTimePasswordCodeLength(b.m56569a().m56566a());
            String b2 = b.m56569a().m56568b();
            if (b2 != null) {
                a2.setOneTimePasswordCode(b2);
            }
            if (c16739a.m62249c() == OneTimePasswordVerifiedAsInvalid.f51713a) {
                c16739a = this.f51797a.getString(C15007f.sms_auth_invalid_code);
            } else {
                c16739a = c16739a.m62249c();
                if (c16739a != null) {
                    c16739a = c16739a.getMessage();
                    if (c16739a != null) {
                    }
                }
                c16739a = "";
            }
            C2668g.a(c16739a, "when {\n                 … \"\"\n                    }");
            a2.setErrorMessage(c16739a);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/tinder/smsauth/ui/OneTimePasswordCollectionFragment$onViewCreated$1", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView$Listener;", "(Lcom/tinder/smsauth/ui/OneTimePasswordCollectionFragment;)V", "onContinueButtonClicked", "", "onOneTimePasswordTextChanged", "newValue", "", "onResendButtonClicked", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.e$b */
    public static final class C16781b implements Listener {
        /* renamed from: a */
        final /* synthetic */ C18138e f51798a;

        C16781b(C18138e c18138e) {
            this.f51798a = c18138e;
        }

        public void onOneTimePasswordTextChanged(@NotNull String str) {
            C2668g.b(str, "newValue");
            C18138e.m65812b(this.f51798a).m62362c().m65724a(str, false);
        }

        public void onContinueButtonClicked() {
            C18138e.m65812b(this.f51798a).m62363d().m65702a();
        }

        public void onResendButtonClicked() {
            C18138e.m65812b(this.f51798a).m62364e().m65716a();
        }
    }

    /* renamed from: a */
    public void m65813a() {
        if (this.f56282e != null) {
            this.f56282e.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m65813a();
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ OneTimePasswordCollectionContainerView m65811a(C18138e c18138e) {
        c18138e = c18138e.f56281d;
        if (c18138e == null) {
            C2668g.b("oneTimePasswordCollectionContainerView");
        }
        return c18138e;
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ OneTimePasswordCollectionViewModel m65812b(C18138e c18138e) {
        c18138e = c18138e.f56280c;
        if (c18138e == null) {
            C2668g.b("viewModel");
        }
        return c18138e;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Fragment fragment = this;
        SmsAuthViewModelFactory smsAuthViewModelFactory = this.f56278a;
        if (smsAuthViewModelFactory == null) {
            C2668g.b("viewModelFactory");
        }
        bundle = C0030o.a(fragment, smsAuthViewModelFactory).a(OneTimePasswordCollectionViewModel.class);
        C2668g.a(bundle, "ViewModelProviders.of(th…ionViewModel::class.java)");
        this.f56280c = (OneTimePasswordCollectionViewModel) bundle;
        bundle = this.f56280c;
        if (bundle == null) {
            C2668g.b("viewModel");
        }
        bundle.m62361b().a(this, new C16780a(this));
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2668g.b(layoutInflater, "inflater");
        return layoutInflater.inflate(C15006e.one_time_password_collection_fragment, viewGroup, false);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        C2668g.b(view, "view");
        super.onViewCreated(view, bundle);
        this.f56281d = (OneTimePasswordCollectionContainerView) view;
        view = this.f56281d;
        if (view == null) {
            C2668g.b("oneTimePasswordCollectionContainerView");
        }
        view.setListener((Listener) new C16781b(this));
    }
}
