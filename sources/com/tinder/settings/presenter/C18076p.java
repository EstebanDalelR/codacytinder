package com.tinder.settings.presenter;

import com.tinder.domain.profile.usecase.LoadMoreGenderList;
import com.tinder.presenters.PresenterBase;
import com.tinder.settings.targets.MoreGenderSearchViewTarget;
import io.reactivex.functions.Consumer;
import io.reactivex.p453a.p455b.C15674a;
import io.reactivex.schedulers.C15756a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.p001a.C0001a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/settings/presenter/MoreGenderSearchPresenter;", "Lcom/tinder/presenters/PresenterBase;", "Lcom/tinder/settings/targets/MoreGenderSearchViewTarget;", "loadMoreGenderList", "Lcom/tinder/domain/profile/usecase/LoadMoreGenderList;", "(Lcom/tinder/domain/profile/usecase/LoadMoreGenderList;)V", "loadGenderForSearch", "", "word", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settings.presenter.p */
public final class C18076p extends PresenterBase<MoreGenderSearchViewTarget> {
    /* renamed from: a */
    private final LoadMoreGenderList f56129a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "list", "", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.p$a */
    static final class C16672a<T> implements Consumer<List<? extends String>> {
        /* renamed from: a */
        final /* synthetic */ C18076p f51590a;

        C16672a(C18076p c18076p) {
            this.f51590a = c18076p;
        }

        public /* synthetic */ void accept(Object obj) {
            m62158a((List) obj);
        }

        /* renamed from: a */
        public final void m62158a(List<String> list) {
            MoreGenderSearchViewTarget moreGenderSearchViewTarget = (MoreGenderSearchViewTarget) this.f51590a.H();
            if (moreGenderSearchViewTarget != null) {
                C2668g.a(list, "list");
                moreGenderSearchViewTarget.setGenderList(list);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settings.presenter.p$b */
    static final class C16673b<T> implements Consumer<Throwable> {
        /* renamed from: a */
        public static final C16673b f51591a = new C16673b();

        C16673b() {
        }

        public /* synthetic */ void accept(Object obj) {
            m62159a((Throwable) obj);
        }

        /* renamed from: a */
        public final void m62159a(Throwable th) {
            C0001a.c(th, "Error loading more gender list", new Object[0]);
        }
    }

    @Inject
    public C18076p(@NotNull LoadMoreGenderList loadMoreGenderList) {
        C2668g.b(loadMoreGenderList, "loadMoreGenderList");
        this.f56129a = loadMoreGenderList;
    }

    /* renamed from: a */
    public final void m65598a(@Nullable String str) {
        this.f56129a.invoke(str).b(C15756a.m59010b()).a(C15674a.m58830a()).a(new C16672a(this), C16673b.f51591a);
    }
}
