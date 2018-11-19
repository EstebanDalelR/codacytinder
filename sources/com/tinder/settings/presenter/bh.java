package com.tinder.settings.presenter;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Drop;
import com.tinder.deadshot.Take;
import com.tinder.domain.meta.model.DiscoverySettings;
import com.tinder.domain.meta.model.DiscoverySettings.GenderFilter;
import com.tinder.domain.profile.usecase.ObserveDiscoverySettings;
import com.tinder.settings.p404b.C14865b;
import com.tinder.settings.targets.ShowMeTarget;
import io.reactivex.disposables.C17356a;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import javax.inject.Inject;
import p000a.p001a.C0001a;

public class bh {
    @DeadshotTarget
    /* renamed from: a */
    ShowMeTarget f46591a;
    /* renamed from: b */
    private final ObserveDiscoverySettings f46592b;
    /* renamed from: c */
    private final C14865b f46593c;
    /* renamed from: d */
    private final C17356a f46594d = new C17356a();

    /* renamed from: com.tinder.settings.presenter.bh$1 */
    static /* synthetic */ class C148951 {
        /* renamed from: a */
        static final /* synthetic */ int[] f46590a = new int[GenderFilter.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = com.tinder.domain.meta.model.DiscoverySettings.GenderFilter.values();
            r0 = r0.length;
            r0 = new int[r0];
            f46590a = r0;
            r0 = f46590a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.tinder.domain.meta.model.DiscoverySettings.GenderFilter.MALE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f46590a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.tinder.domain.meta.model.DiscoverySettings.GenderFilter.FEMALE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = f46590a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.tinder.domain.meta.model.DiscoverySettings.GenderFilter.BOTH;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.settings.presenter.bh.1.<clinit>():void");
        }
    }

    /* renamed from: a */
    final /* synthetic */ void m56370a(DiscoverySettings discoverySettings) {
        m56368b(discoverySettings);
    }

    @Inject
    bh(ObserveDiscoverySettings observeDiscoverySettings, C14865b c14865b) {
        this.f46592b = observeDiscoverySettings;
        this.f46593c = c14865b;
    }

    /* renamed from: a */
    public void m56372a(boolean z, boolean z2) {
        this.f46593c.m56287a(z, z2);
    }

    @Take
    /* renamed from: a */
    void m56369a() {
        this.f46594d.add(this.f46592b.execute().subscribeOn(C15756a.m59010b()).observeOn(C15674a.m58830a()).subscribe(new bi(this), new bj(this)));
    }

    /* renamed from: a */
    final /* synthetic */ void m56371a(Throwable th) throws Exception {
        C0001a.c(th, "Error observing discovery settings", new Object[0]);
        this.f46591a.showErrorMessage();
    }

    @Drop
    /* renamed from: b */
    void m56373b() {
        this.f46594d.m63446a();
    }

    /* renamed from: b */
    private void m56368b(DiscoverySettings discoverySettings) {
        discoverySettings = discoverySettings.genderFilter();
        boolean z = false;
        boolean z2 = true;
        switch (C148951.f46590a[discoverySettings.ordinal()]) {
            case 1:
                break;
            case 2:
                z = true;
                z2 = false;
                break;
            case 3:
                z = true;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("updateShowMe with unsupported gender filter: ");
                stringBuilder.append(discoverySettings);
                throw new IllegalStateException(stringBuilder.toString());
        }
        this.f46591a.initShowMeSelection(z2, z);
    }
}
