package com.tinder.settings.p405c;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tinder.common.utils.C8578a;
import com.tinder.core.experiment.AbTestUtility;
import com.tinder.domain.profile.repository.CustomGenderRepository;
import io.reactivex.C3960g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.tinder.settings.c.a */
public class C16617a implements CustomGenderRepository {
    /* renamed from: a */
    private final Gson f51474a;
    /* renamed from: b */
    private final AbTestUtility f51475b;
    /* renamed from: c */
    private List<String> f51476c;

    /* renamed from: com.tinder.settings.c.a$1 */
    class C166161 extends TypeToken<Map<String, List<String>>> {
        /* renamed from: a */
        final /* synthetic */ C16617a f51473a;

        C166161(C16617a c16617a) {
            this.f51473a = c16617a;
        }
    }

    @Inject
    C16617a(Gson gson, AbTestUtility abTestUtility) {
        this.f51474a = gson;
        this.f51475b = abTestUtility;
    }

    @NotNull
    public C3960g<List<String>> loadMoreGenderList() {
        if (this.f51476c == null || this.f51476c.isEmpty()) {
            return C3960g.c(new C14866b(this));
        }
        return C3960g.a(this.f51476c);
    }

    /* renamed from: a */
    final /* synthetic */ List m62060a() throws Exception {
        Object customGenderOptions = this.f51475b.getCustomGenderOptions();
        if (C8578a.a(customGenderOptions)) {
            this.f51476c = Collections.emptyList();
        } else {
            this.f51476c = (List) ((Map) this.f51474a.fromJson(customGenderOptions, new C166161(this).getType())).get("gender_options");
        }
        return this.f51476c;
    }
}
