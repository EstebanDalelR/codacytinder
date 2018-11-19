package com.tinder.recsads;

import android.content.Context;
import android.view.View;
import butterknife.ButterKnife;
import com.tinder.R;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.recs.model.Rec;
import com.tinder.profile.ProfileScreenSource;
import com.tinder.profile.model.Profile;
import com.tinder.recs.view.RecProfileView;
import com.tinder.recs.view.RecProfileView.GamepadButtonStates;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/tinder/recsads/BrandedAdRecProfileView;", "Lcom/tinder/recs/view/RecProfileView;", "Lcom/tinder/recsads/BrandedAdRecProfileView$BpcAdRecProfileViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "adRecProfileViewModel", "boundData", "getBoundData", "()Lcom/tinder/recsads/BrandedAdRecProfileView$BpcAdRecProfileViewModel;", "bindData", "", "data", "BpcAdRecProfileViewModel", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsads.c */
public final class C16456c extends RecProfileView<C14753a> {
    /* renamed from: a */
    private C14753a f51041a;
    /* renamed from: b */
    private HashMap f51042b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/tinder/recsads/BrandedAdRecProfileView$BpcAdRecProfileViewModel;", "", "adRec", "Lcom/tinder/domain/recs/model/Rec;", "profile", "Lcom/tinder/profile/model/Profile;", "gamepadButtonStates", "Lcom/tinder/recs/view/RecProfileView$GamepadButtonStates;", "(Lcom/tinder/domain/recs/model/Rec;Lcom/tinder/profile/model/Profile;Lcom/tinder/recs/view/RecProfileView$GamepadButtonStates;)V", "getAdRec", "()Lcom/tinder/domain/recs/model/Rec;", "getGamepadButtonStates", "()Lcom/tinder/recs/view/RecProfileView$GamepadButtonStates;", "getProfile", "()Lcom/tinder/profile/model/Profile;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsads.c$a */
    public static final class C14753a {
        @NotNull
        /* renamed from: a */
        private final Rec f46316a;
        @NotNull
        /* renamed from: b */
        private final Profile f46317b;
        @NotNull
        /* renamed from: c */
        private final GamepadButtonStates f46318c;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C14753a) {
                    C14753a c14753a = (C14753a) obj;
                    if (C2668g.a(this.f46316a, c14753a.f46316a) && C2668g.a(this.f46317b, c14753a.f46317b) && C2668g.a(this.f46318c, c14753a.f46318c)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Rec rec = this.f46316a;
            int i = 0;
            int hashCode = (rec != null ? rec.hashCode() : 0) * 31;
            Profile profile = this.f46317b;
            hashCode = (hashCode + (profile != null ? profile.hashCode() : 0)) * 31;
            GamepadButtonStates gamepadButtonStates = this.f46318c;
            if (gamepadButtonStates != null) {
                i = gamepadButtonStates.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BpcAdRecProfileViewModel(adRec=");
            stringBuilder.append(this.f46316a);
            stringBuilder.append(", profile=");
            stringBuilder.append(this.f46317b);
            stringBuilder.append(", gamepadButtonStates=");
            stringBuilder.append(this.f46318c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14753a(@NotNull Rec rec, @NotNull Profile profile, @NotNull GamepadButtonStates gamepadButtonStates) {
            C2668g.b(rec, "adRec");
            C2668g.b(profile, "profile");
            C2668g.b(gamepadButtonStates, "gamepadButtonStates");
            this.f46316a = rec;
            this.f46317b = profile;
            this.f46318c = gamepadButtonStates;
        }

        @NotNull
        /* renamed from: a */
        public final Rec m56026a() {
            return this.f46316a;
        }

        @NotNull
        /* renamed from: b */
        public final Profile m56027b() {
            return this.f46317b;
        }

        @NotNull
        /* renamed from: c */
        public final GamepadButtonStates m56028c() {
            return this.f46318c;
        }
    }

    public void _$_clearFindViewByIdCache() {
        if (this.f51042b != null) {
            this.f51042b.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this.f51042b == null) {
            this.f51042b = new HashMap();
        }
        View view = (View) this.f51042b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51042b.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ void bindData(Object obj) {
        m61871a((C14753a) obj);
    }

    public C16456c(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context);
        View.inflate(context, R.layout.profile_user_rec, this);
        ButterKnife.a(this);
    }

    @NotNull
    public C14753a getBoundData() {
        C14753a c14753a = this.f51041a;
        if (c14753a == null) {
            C2668g.b("adRecProfileViewModel");
        }
        return c14753a;
    }

    /* renamed from: a */
    public void m61871a(@NotNull C14753a c14753a) {
        C2668g.b(c14753a, ManagerWebServices.FB_DATA);
        this.f51041a = c14753a;
        getProfileView().a(ProfileScreenSource.RECS);
        c14753a = getProfileView();
        C14753a c14753a2 = this.f51041a;
        if (c14753a2 == null) {
            C2668g.b("adRecProfileViewModel");
        }
        c14753a.a(c14753a2.m56027b());
        c14753a = this.f51041a;
        if (c14753a == null) {
            C2668g.b("adRecProfileViewModel");
        }
        bindGamepadButtonStates(c14753a.m56028c());
    }
}
