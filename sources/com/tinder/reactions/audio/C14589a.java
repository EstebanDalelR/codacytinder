package com.tinder.reactions.audio;

import android.content.Context;
import com.tinder.R;
import com.tinder.domain.reactions.model.GrandGestureType;
import com.tinder.reactions.p385c.C14597a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/tinder/reactions/audio/GrandGestureAudioHelper;", "", "reactionsAudioPlayer", "Lcom/tinder/reactions/audio/ReactionsAudioPlayer;", "chatBubbleSoundSettingCache", "Lcom/tinder/reactions/usecase/ChatBubbleSoundSettingCache;", "(Lcom/tinder/reactions/audio/ReactionsAudioPlayer;Lcom/tinder/reactions/usecase/ChatBubbleSoundSettingCache;)V", "cacheSoundSettings", "", "clear", "playAudio", "context", "Landroid/content/Context;", "config", "Lcom/tinder/reactions/audio/GrandGestureAudioHelper$AudioConfig;", "playChatBubbleAudio", "audioFileResId", "", "AudioConfig", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.audio.a */
public final class C14589a {
    /* renamed from: a */
    private final C14593d f46041a;
    /* renamed from: b */
    private final C14597a f46042b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/audio/GrandGestureAudioHelper$AudioConfig;", "", "grandGestureType", "Lcom/tinder/domain/reactions/model/GrandGestureType;", "ignoreSoundToggle", "", "(Lcom/tinder/domain/reactions/model/GrandGestureType;Z)V", "getGrandGestureType", "()Lcom/tinder/domain/reactions/model/GrandGestureType;", "getIgnoreSoundToggle", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.reactions.audio.a$a */
    public static final class C14588a {
        @NotNull
        /* renamed from: a */
        private final GrandGestureType f46039a;
        /* renamed from: b */
        private final boolean f46040b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C14588a) {
                C14588a c14588a = (C14588a) obj;
                if (C2668g.a(this.f46039a, c14588a.f46039a)) {
                    if ((this.f46040b == c14588a.f46040b ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            GrandGestureType grandGestureType = this.f46039a;
            int hashCode = (grandGestureType != null ? grandGestureType.hashCode() : 0) * 31;
            int i = this.f46040b;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioConfig(grandGestureType=");
            stringBuilder.append(this.f46039a);
            stringBuilder.append(", ignoreSoundToggle=");
            stringBuilder.append(this.f46040b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C14588a(@NotNull GrandGestureType grandGestureType, boolean z) {
            C2668g.b(grandGestureType, "grandGestureType");
            this.f46039a = grandGestureType;
            this.f46040b = z;
        }

        @NotNull
        /* renamed from: a */
        public final GrandGestureType m55643a() {
            return this.f46039a;
        }

        /* renamed from: b */
        public final boolean m55644b() {
            return this.f46040b;
        }
    }

    @Inject
    public C14589a(@NotNull C14593d c14593d, @NotNull C14597a c14597a) {
        C2668g.b(c14593d, "reactionsAudioPlayer");
        C2668g.b(c14597a, "chatBubbleSoundSettingCache");
        this.f46041a = c14593d;
        this.f46042b = c14597a;
    }

    /* renamed from: a */
    public final void m55647a(@NotNull Context context, @NotNull C14588a c14588a) {
        C2668g.b(context, "context");
        C2668g.b(c14588a, "config");
        switch (C14590b.f46043a[c14588a.m55643a().ordinal()]) {
            case 1:
                m55645a(context, R.raw.really_reaction_voiceover, c14588a);
                return;
            case 2:
                m55645a(context, R.raw.ugh_reaction_voiceover, c14588a);
                return;
            case 3:
                m55645a(context, R.raw.nope_reaction_voiceover, c14588a);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void m55646a() {
        this.f46041a.m55654a();
        this.f46042b.m55693c();
    }

    /* renamed from: b */
    public final void m55648b() {
        this.f46042b.m55692b();
    }

    /* renamed from: a */
    private final void m55645a(Context context, int i, C14588a c14588a) {
        if (c14588a.m55644b() != null || this.f46042b.m55691a() != null) {
            this.f46041a.m55655a(context, i);
        }
    }
}
