package com.tinder.fastmatch.view;

import com.tinder.fastmatch.presenter.C9385a;
import com.tinder.fastmatch.preview.C9404e;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.tinder.fastmatch.view.d */
public final class C11675d implements MembersInjector<FastMatchPreviewView> {
    /* renamed from: a */
    private final Provider<C9385a> f38162a;
    /* renamed from: b */
    private final Provider<C9404e> f38163b;

    public /* synthetic */ void injectMembers(Object obj) {
        m47469a((FastMatchPreviewView) obj);
    }

    /* renamed from: a */
    public void m47469a(FastMatchPreviewView fastMatchPreviewView) {
        C11675d.m47467a(fastMatchPreviewView, (C9385a) this.f38162a.get());
        C11675d.m47468a(fastMatchPreviewView, (C9404e) this.f38163b.get());
    }

    /* renamed from: a */
    public static void m47467a(FastMatchPreviewView fastMatchPreviewView, C9385a c9385a) {
        fastMatchPreviewView.f38128a = c9385a;
    }

    /* renamed from: a */
    public static void m47468a(FastMatchPreviewView fastMatchPreviewView, C9404e c9404e) {
        fastMatchPreviewView.f38129b = c9404e;
    }
}
