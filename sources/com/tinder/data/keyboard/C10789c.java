package com.tinder.data.keyboard;

import io.reactivex.C3959e;
import io.reactivex.C3960g;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/keyboard/KeyboardHeightProviderAndNotifier;", "Lcom/tinder/data/keyboard/KeyboardHeightProvider;", "Lcom/tinder/data/keyboard/KeyboardHeightNotifier;", "keyboardHeightDataRepository", "Lcom/tinder/data/keyboard/KeyboardHeightDataRepository;", "(Lcom/tinder/data/keyboard/KeyboardHeightDataRepository;)V", "clear", "", "observe", "Lio/reactivex/Single;", "", "observeCurrent", "Lio/reactivex/Observable;", "update", "height", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.keyboard.c */
public final class C10789c implements KeyboardHeightNotifier, KeyboardHeightProvider {
    /* renamed from: a */
    private final C10788a f35224a;

    @Inject
    public C10789c(@NotNull C10788a c10788a) {
        C2668g.b(c10788a, "keyboardHeightDataRepository");
        this.f35224a = c10788a;
    }

    @NotNull
    public C3960g<Integer> observe() {
        return this.f35224a.observe();
    }

    @NotNull
    public C3959e<Integer> observeCurrent() {
        return this.f35224a.observeCurrent();
    }

    public void update(int i) {
        this.f35224a.update(i);
    }

    public void clear() {
        this.f35224a.clear();
    }
}
