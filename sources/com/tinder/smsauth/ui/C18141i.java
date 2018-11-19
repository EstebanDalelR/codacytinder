package com.tinder.smsauth.ui;

import android.arch.lifecycle.C0030o;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tinder.common.logger.Logger;
import com.tinder.smsauth.di.Injectable;
import com.tinder.smsauth.entity.Flow.C14974c.C16740b;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView;
import com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView.Listener;
import com.tinder.smsauth.ui.view.PhoneNumberCollectionContainerView.Listener.C15022a;
import com.tinder.smsauth.ui.viewmodel.PhoneNumberCollectionViewModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\"\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020%2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010,\u001a\u00020\u001bH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, d2 = {"Lcom/tinder/smsauth/ui/PhoneNumberCollectionFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/tinder/smsauth/di/Injectable;", "()V", "logger", "Lcom/tinder/common/logger/Logger;", "getLogger", "()Lcom/tinder/common/logger/Logger;", "setLogger", "(Lcom/tinder/common/logger/Logger;)V", "phoneNumberCollector", "Lcom/tinder/smsauth/ui/PhoneNumberCollector;", "getPhoneNumberCollector", "()Lcom/tinder/smsauth/ui/PhoneNumberCollector;", "setPhoneNumberCollector", "(Lcom/tinder/smsauth/ui/PhoneNumberCollector;)V", "phoneNumberContainerView", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView;", "viewModel", "Lcom/tinder/smsauth/ui/viewmodel/PhoneNumberCollectionViewModel;", "viewModelFactory", "Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "getViewModelFactory", "()Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;", "setViewModelFactory", "(Lcom/tinder/smsauth/ui/SmsAuthViewModelFactory;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "requestPhoneNumberHint", "Companion", "ui_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.smsauth.ui.i */
public final class C18141i extends Fragment implements Injectable {
    /* renamed from: d */
    public static final C15001a f56285d = new C15001a();
    @Inject
    @NotNull
    /* renamed from: a */
    public Logger f56286a;
    @Inject
    @NotNull
    /* renamed from: b */
    public SmsAuthViewModelFactory f56287b;
    @Inject
    @NotNull
    /* renamed from: c */
    public PhoneNumberCollector f56288c;
    /* renamed from: e */
    private PhoneNumberCollectionViewModel f56289e;
    /* renamed from: f */
    private PhoneNumberCollectionContainerView f56290f;
    /* renamed from: g */
    private HashMap f56291g;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/smsauth/ui/PhoneNumberCollectionFragment$Companion;", "", "()V", "REQUEST_CODE_RESOLVE_HINT", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.i$a */
    public static final class C15001a {
        private C15001a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/tinder/smsauth/entity/Flow$State$CollectingPhoneNumber;", "onChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.i$b */
    static final class C16783b<T> implements Observer<C16740b> {
        /* renamed from: a */
        final /* synthetic */ C18141i f51801a;

        C16783b(C18141i c18141i) {
            this.f51801a = c18141i;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62306a((C16740b) obj);
        }

        /* renamed from: a */
        public final void m62306a(@Nullable C16740b c16740b) {
            if (c16740b == null) {
                C2668g.a();
            }
            c16740b = c16740b.mo12366a();
            PhoneNumberCollectionContainerView a = C18141i.m65816a(this.f51801a);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(c16740b.m56580a().m56576b());
            stringBuilder.append(" +");
            stringBuilder.append(c16740b.m56580a().m56574a());
            a.setCountryCode(stringBuilder.toString());
            C18141i.m65816a(this.f51801a).setPhoneNumber(c16740b.m56580a().m56577c());
            C18141i.m65816a(this.f51801a).setContinueButtonEnabled(c16740b.m56581b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "shouldRequestPhoneNumberHint", "", "onChanged", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.i$c */
    static final class C16784c<T> implements Observer<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C18141i f51802a;

        C16784c(C18141i c18141i) {
            this.f51802a = c18141i;
        }

        public /* synthetic */ void onChanged(Object obj) {
            m62307a((Boolean) obj);
        }

        /* renamed from: a */
        public final void m62307a(@Nullable Boolean bool) {
            if (C2668g.a(bool, Boolean.valueOf(true)) != null) {
                this.f51802a.m65817b();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/tinder/smsauth/ui/PhoneNumberCollectionFragment$onViewCreated$1", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener;", "(Lcom/tinder/smsauth/ui/PhoneNumberCollectionFragment;)V", "onContinueButtonClicked", "", "onCountryCodeClicked", "onPhoneNumberTextChanged", "phoneNumberTextUpdate", "Lcom/tinder/smsauth/ui/view/PhoneNumberCollectionContainerView$Listener$PhoneNumberTextUpdate;", "ui_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.i$d */
    public static final class C16785d implements Listener {
        /* renamed from: a */
        final /* synthetic */ C18141i f51803a;

        C16785d(C18141i c18141i) {
            this.f51803a = c18141i;
        }

        public void onPhoneNumberTextChanged(@NotNull C15022a c15022a) {
            C2668g.b(c15022a, "phoneNumberTextUpdate");
            C18141i.m65819c(this.f51803a).m62370e().m65728a(c15022a.m56626b(), false);
        }

        public void onCountryCodeClicked() {
            C18141i.m65819c(this.f51803a).m62369d().m65712a();
        }

        public void onContinueButtonClicked() {
            C18141i.m65819c(this.f51803a).m62371f().m65702a();
        }
    }

    /* renamed from: a */
    public void m65820a() {
        if (this.f56291g != null) {
            this.f56291g.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m65820a();
    }

    @NotNull
    /* renamed from: a */
    public static final /* synthetic */ PhoneNumberCollectionContainerView m65816a(C18141i c18141i) {
        c18141i = c18141i.f56290f;
        if (c18141i == null) {
            C2668g.b("phoneNumberContainerView");
        }
        return c18141i;
    }

    @NotNull
    /* renamed from: c */
    public static final /* synthetic */ PhoneNumberCollectionViewModel m65819c(C18141i c18141i) {
        c18141i = c18141i.f56289e;
        if (c18141i == null) {
            C2668g.b("viewModel");
        }
        return c18141i;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Fragment fragment = this;
        SmsAuthViewModelFactory smsAuthViewModelFactory = this.f56287b;
        if (smsAuthViewModelFactory == null) {
            C2668g.b("viewModelFactory");
        }
        bundle = C0030o.a(fragment, smsAuthViewModelFactory).a(PhoneNumberCollectionViewModel.class);
        C2668g.a(bundle, "ViewModelProviders.of(th…ionViewModel::class.java)");
        this.f56289e = (PhoneNumberCollectionViewModel) bundle;
        bundle = this.f56289e;
        if (bundle == null) {
            C2668g.b("viewModel");
        }
        LifecycleOwner lifecycleOwner = this;
        bundle.m62367b().a(lifecycleOwner, new C16783b(this));
        bundle = this.f56289e;
        if (bundle == null) {
            C2668g.b("viewModel");
        }
        bundle.m62368c().a(lifecycleOwner, new C16784c(this));
        bundle = getLifecycle();
        PhoneNumberCollector phoneNumberCollector = this.f56288c;
        if (phoneNumberCollector == null) {
            C2668g.b("phoneNumberCollector");
        }
        bundle.a(phoneNumberCollector);
    }

    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2668g.b(layoutInflater, "inflater");
        return layoutInflater.inflate(C15006e.phone_number_collection_fragment, viewGroup, false);
    }

    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        C2668g.b(view, "view");
        super.onViewCreated(view, bundle);
        this.f56290f = (PhoneNumberCollectionContainerView) view;
        view = this.f56290f;
        if (view == null) {
            C2668g.b("phoneNumberContainerView");
        }
        view.setListener((Listener) new C16785d(this));
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 42 && i2 == -1) {
            i = this.f56288c;
            if (i == 0) {
                C2668g.b("phoneNumberCollector");
            }
            i = i.phoneNumberFromResult(intent);
            if (i != 0) {
                i2 = this.f56289e;
                if (i2 == 0) {
                    C2668g.b("viewModel");
                }
                i2.m62370e().m65728a(i, true);
            }
        }
    }

    /* renamed from: b */
    private final void m65817b() {
        PhoneNumberCollector phoneNumberCollector = this.f56288c;
        if (phoneNumberCollector == null) {
            C2668g.b("phoneNumberCollector");
        }
        try {
            startIntentSenderForResult(phoneNumberCollector.createIntent().getIntentSender(), 42, null, 0, 0, 0, null);
        } catch (SendIntentException e) {
            Logger logger = this.f56286a;
            if (logger == null) {
                C2668g.b("logger");
            }
            logger.error(e, "Could not start hint picker Intent");
        }
    }
}
