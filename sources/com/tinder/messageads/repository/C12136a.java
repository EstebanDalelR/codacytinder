package com.tinder.messageads.repository;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.model.C9912b.C9911a;
import io.reactivex.C3956a;
import io.reactivex.C3960g;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C19282g;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/messageads/repository/MessageAdSettingsSharedPreferencesRepository;", "Lcom/tinder/messageads/repository/MessageAdSettingsRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "load", "Lio/reactivex/Single;", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "save", "Lio/reactivex/Completable;", "messageAdMatchSettings", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.repository.a */
public final class C12136a implements MessageAdSettingsRepository {
    /* renamed from: a */
    private final SharedPreferences f39369a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "it", "", "Lcom/tinder/messageads/model/MessageAdMatchSettings$TypeOptInSetting;", "apply"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.repository.a$a */
    static final class C12134a<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C12134a f39366a = new C12134a();

        C12134a() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m48280a((Set) obj);
        }

        @NotNull
        /* renamed from: a */
        public final C9912b m48280a(@NotNull Set<C9911a> set) {
            C2668g.b(set, "it");
            return new C9912b(set);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.repository.a$b */
    static final class C12135b implements Action {
        /* renamed from: a */
        final /* synthetic */ C12136a f39367a;
        /* renamed from: b */
        final /* synthetic */ C9912b f39368b;

        C12135b(C12136a c12136a, C9912b c9912b) {
            this.f39367a = c12136a;
            this.f39368b = c9912b;
        }

        public final void run() {
            Editor edit = this.f39367a.f39369a.edit();
            for (C9911a c9911a : this.f39368b.m40754b()) {
                edit.putBoolean(c9911a.m40750a().name(), c9911a.m40751b());
            }
            edit.apply();
        }
    }

    public C12136a(@NotNull SharedPreferences sharedPreferences) {
        C2668g.b(sharedPreferences, "sharedPreferences");
        this.f39369a = sharedPreferences;
    }

    @NotNull
    public C3960g<C9912b> load() {
        C3960g<C9912b> e = C3960g.a(C19285g.h(C19285g.e(C19285g.a(C19282g.n(Type.values()), MessageAdSettingsSharedPreferencesRepository$load$1.f44606a), new MessageAdSettingsSharedPreferencesRepository$load$2(this)))).e(C12134a.f39366a);
        C2668g.a(e, "Single.just(MessageAdMat…sageAdMatchSettings(it) }");
        return e;
    }

    @NotNull
    public C3956a save(@NotNull C9912b c9912b) {
        C2668g.b(c9912b, "messageAdMatchSettings");
        c9912b = C3956a.a(new C12135b(this, c9912b));
        C2668g.a(c9912b, "Completable.fromAction {… editor.apply()\n        }");
        return c9912b;
    }
}
