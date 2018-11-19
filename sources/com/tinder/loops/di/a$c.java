package com.tinder.loops.di;

import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.profile.usecase.CheckTutorialViewedStatus;
import com.tinder.domain.profile.usecase.ConfirmTutorialsViewedStatus;
import com.tinder.loops.activity.MediaSelectorActivity;
import com.tinder.loops.analytics.C11912a;
import com.tinder.loops.di.p271a.C13359e;
import com.tinder.loops.p268b.C9760a;
import com.tinder.loops.p268b.C9761b;
import com.tinder.loops.p268b.C9762c;
import com.tinder.loops.p269c.C9763a;
import com.tinder.loops.views.C11984b;
import com.tinder.loops.views.C11985c;
import com.tinder.loops.views.C11986d;
import com.tinder.loops.views.EmptyStateContainerView;
import com.tinder.loops.views.MediaSelectorView;
import com.tinder.loops.views.MediaTabsView;
import dagger.internal.C15521i;

final class a$c implements MediaSelectorActivitySubComponent {
    /* renamed from: a */
    final /* synthetic */ C3933a f38834a;

    public void inject(MediaSelectorActivity mediaSelectorActivity) {
    }

    private a$c(C3933a c3933a, a$b a_b) {
        this.f38834a = c3933a;
    }

    /* renamed from: a */
    private C9762c m47931a() {
        return new C9762c((C9763a) C3933a.a(this.f38834a).get());
    }

    /* renamed from: b */
    private C9760a m47935b() {
        return new C9760a((C9763a) C3933a.a(this.f38834a).get());
    }

    /* renamed from: c */
    private C11912a m47936c() {
        return new C11912a((C2630h) C15521i.a(C3933a.b(this.f38834a).fireworks(), "Cannot return null from a non-@Nullable component method"), C13359e.m51680b(C3933a.c(this.f38834a)));
    }

    /* renamed from: d */
    private C9761b m47937d() {
        return new C9761b((C9763a) C3933a.a(this.f38834a).get(), (CheckTutorialViewedStatus) C15521i.a(C3933a.b(this.f38834a).provideCheckedTutorialViewedStatus(), "Cannot return null from a non-@Nullable component method"), m47936c(), (ConfirmTutorialsViewedStatus) C15521i.a(C3933a.b(this.f38834a).provideConfirmTutorialViewedStatus(), "Cannot return null from a non-@Nullable component method"), C13359e.m51680b(C3933a.c(this.f38834a)));
    }

    public void inject(MediaTabsView mediaTabsView) {
        m47934a(mediaTabsView);
    }

    public void inject(EmptyStateContainerView emptyStateContainerView) {
        m47932a(emptyStateContainerView);
    }

    public void inject(MediaSelectorView mediaSelectorView) {
        m47933a(mediaSelectorView);
    }

    /* renamed from: a */
    private MediaTabsView m47934a(MediaTabsView mediaTabsView) {
        C11986d.m48025a(mediaTabsView, m47931a());
        return mediaTabsView;
    }

    /* renamed from: a */
    private EmptyStateContainerView m47932a(EmptyStateContainerView emptyStateContainerView) {
        C11984b.m48021a(emptyStateContainerView, m47935b());
        return emptyStateContainerView;
    }

    /* renamed from: a */
    private MediaSelectorView m47933a(MediaSelectorView mediaSelectorView) {
        C11985c.m48023a(mediaSelectorView, m47937d());
        return mediaSelectorView;
    }
}
