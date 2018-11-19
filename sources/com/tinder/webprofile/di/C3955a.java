package com.tinder.webprofile.di;

import android.view.inputmethod.InputMethodManager;
import com.tinder.analytics.fireworks.C2630h;
import com.tinder.domain.profile.repository.ProfileLocalRepository;
import com.tinder.domain.profile.repository.WebProfileRepository;
import com.tinder.domain.profile.usecase.DeleteWebProfileUsername;
import com.tinder.domain.profile.usecase.LoadProfileOptionData;
import com.tinder.domain.profile.usecase.UpdateWebProfileUsername;
import com.tinder.webprofile.activity.C17272a;
import com.tinder.webprofile.activity.WebProfileUsernameActivity;
import com.tinder.webprofile.di.WebProfileComponent.Parent;
import com.tinder.webprofile.p486a.C17267a;
import com.tinder.webprofile.p486a.C17269b;
import com.tinder.webprofile.p486a.C17271c;
import com.tinder.webprofile.presenter.C15486a;
import dagger.internal.C15521i;

/* renamed from: com.tinder.webprofile.di.a */
public final class C3955a implements WebProfileComponent {
    /* renamed from: a */
    private Parent f12564a;

    /* renamed from: com.tinder.webprofile.di.a$a */
    public static final class C2661a {
        /* renamed from: a */
        private Parent f8407a;

        private C2661a() {
        }

        /* renamed from: a */
        public WebProfileComponent m10235a() {
            if (this.f8407a != null) {
                return new C3955a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Parent.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        /* renamed from: a */
        public C2661a m10236a(Parent parent) {
            this.f8407a = (Parent) C15521i.a(parent);
            return this;
        }
    }

    private C3955a(C2661a c2661a) {
        m15175a(c2661a);
    }

    /* renamed from: a */
    public static C2661a m15174a() {
        return new C2661a();
    }

    /* renamed from: b */
    private LoadProfileOptionData m15176b() {
        return new LoadProfileOptionData((ProfileLocalRepository) C15521i.a(this.f12564a.profileLocalRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: c */
    private UpdateWebProfileUsername m15177c() {
        return new UpdateWebProfileUsername((WebProfileRepository) C15521i.a(this.f12564a.webProfileRepository(), "Cannot return null from a non-@Nullable component method"), (ProfileLocalRepository) C15521i.a(this.f12564a.profileLocalRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: d */
    private DeleteWebProfileUsername m15178d() {
        return new DeleteWebProfileUsername((WebProfileRepository) C15521i.a(this.f12564a.webProfileRepository(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: e */
    private C17267a m15179e() {
        return new C17267a((C2630h) C15521i.a(this.f12564a.fireworks(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: f */
    private C17269b m15180f() {
        return new C17269b((C2630h) C15521i.a(this.f12564a.fireworks(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: g */
    private C17271c m15181g() {
        return new C17271c((C2630h) C15521i.a(this.f12564a.fireworks(), "Cannot return null from a non-@Nullable component method"));
    }

    /* renamed from: h */
    private C15486a m15182h() {
        return new C15486a(m15176b(), m15177c(), m15178d(), m15179e(), m15180f(), m15181g());
    }

    /* renamed from: a */
    private void m15175a(C2661a c2661a) {
        this.f12564a = c2661a.f8407a;
    }

    public void inject(WebProfileUsernameActivity webProfileUsernameActivity) {
        m15173a(webProfileUsernameActivity);
    }

    /* renamed from: a */
    private WebProfileUsernameActivity m15173a(WebProfileUsernameActivity webProfileUsernameActivity) {
        C17272a.a(webProfileUsernameActivity, m15182h());
        C17272a.a(webProfileUsernameActivity, (InputMethodManager) C15521i.a(this.f12564a.inputMethodManager(), "Cannot return null from a non-@Nullable component method"));
        return webProfileUsernameActivity;
    }
}
