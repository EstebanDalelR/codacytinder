package com.tinder.editprofile.p237a;

import com.tinder.deadshot.DeadshotTarget;
import com.tinder.deadshot.Take;
import com.tinder.editprofile.target.EditFeedSettingItemTarget;
import com.tinder.feed.p341b.C11695a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/tinder/editprofile/presenter/EditFeedSettingItemPresenter;", "", "feedExperimentUtility", "Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;", "(Lcom/tinder/feed/experiment/AbTestFeedExperimentUtility;)V", "target", "Lcom/tinder/editprofile/target/EditFeedSettingItemTarget;", "getTarget$Tinder_release", "()Lcom/tinder/editprofile/target/EditFeedSettingItemTarget;", "setTarget$Tinder_release", "(Lcom/tinder/editprofile/target/EditFeedSettingItemTarget;)V", "onEditFeedSettingItemSelected", "", "toggleEditFeedSettingItem", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.editprofile.a.a */
public final class C8947a {
    @DeadshotTarget
    @NotNull
    /* renamed from: a */
    public EditFeedSettingItemTarget f31208a;
    /* renamed from: b */
    private final C11695a f31209b;

    @Inject
    public C8947a(@NotNull C11695a c11695a) {
        C2668g.b(c11695a, "feedExperimentUtility");
        this.f31209b = c11695a;
    }

    @Take
    /* renamed from: a */
    public final void m37728a() {
        if (!this.f31209b.m47524c()) {
            EditFeedSettingItemTarget editFeedSettingItemTarget = this.f31208a;
            if (editFeedSettingItemTarget == null) {
                C2668g.b("target");
            }
            editFeedSettingItemTarget.disableFeedSettings();
        }
    }

    /* renamed from: b */
    public final void m37729b() {
        EditFeedSettingItemTarget editFeedSettingItemTarget = this.f31208a;
        if (editFeedSettingItemTarget == null) {
            C2668g.b("target");
        }
        editFeedSettingItemTarget.showFeedSettings();
    }
}
