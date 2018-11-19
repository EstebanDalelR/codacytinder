package com.tinder.data.message;

import android.content.Context;
import com.f2prateek.rx.preferences.C1159e;
import com.f2prateek.rx.preferences.Preference;
import com.tinder.domain.message.ReactionSettingsRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Completable;
import rx.Observable;
import rx.functions.Action0;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/data/message/PreferenceReactionSettingsRepository;", "Lcom/tinder/domain/message/ReactionSettingsRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "chatBubbleSoundState", "Lcom/f2prateek/rx/preferences/Preference;", "", "rxPreferences", "Lcom/f2prateek/rx/preferences/RxSharedPreferences;", "clearReactionSettings", "Lrx/Completable;", "observeChatBubbleSoundState", "Lrx/Observable;", "updateChatBubbleSoundState", "soundState", "data_release"}, k = 1, mv = {1, 1, 10})
public final class ay implements ReactionSettingsRepository {
    /* renamed from: a */
    private final C1159e f35434a;
    /* renamed from: b */
    private final Preference<Boolean> f35435b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ay$a */
    static final class C13845a implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ay f43906a;

        C13845a(ay ayVar) {
            this.f43906a = ayVar;
        }

        public final void call() {
            this.f43906a.f35435b.b();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.message.ay$b */
    static final class C13846b implements Action0 {
        /* renamed from: a */
        final /* synthetic */ ay f43907a;
        /* renamed from: b */
        final /* synthetic */ boolean f43908b;

        C13846b(ay ayVar, boolean z) {
            this.f43907a = ayVar;
            this.f43908b = z;
        }

        public final void call() {
            this.f43907a.f35435b.a(Boolean.valueOf(this.f43908b));
        }
    }

    public ay(@NotNull Context context) {
        C2668g.b(context, "context");
        context = C1159e.a(context.getSharedPreferences("PreferenceReactionSettingsRepository_reaction_settings", 0));
        C2668g.a(context, "RxSharedPreferences.create(sharedPreferences)");
        this.f35434a = context;
        context = this.f35434a.a("chat-bubble-sound-state", Boolean.valueOf(false));
        C2668g.a(context, "rxPreferences.getBoolean…UBBLE_SOUND_STATE, false)");
        this.f35435b = context;
    }

    @NotNull
    public Observable<Boolean> observeChatBubbleSoundState() {
        Observable<Boolean> c = this.f35435b.c();
        C2668g.a(c, "chatBubbleSoundState.asObservable()");
        return c;
    }

    @NotNull
    public Completable updateChatBubbleSoundState(boolean z) {
        z = Completable.a(new C13846b(this, z));
        C2668g.a(z, "Completable.fromAction {…ndState.set(soundState) }");
        return z;
    }

    @NotNull
    public Completable clearReactionSettings() {
        Completable a = Completable.a(new C13845a(this));
        C2668g.a(a, "Completable.fromAction {…bbleSoundState.delete() }");
        return a;
    }
}
