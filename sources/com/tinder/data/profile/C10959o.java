package com.tinder.data.profile;

import com.tinder.data.profile.persistence.ProfileDataStore;
import com.tinder.domain.profile.model.DataNotAvailableException;
import com.tinder.domain.profile.model.ProfileOption;
import io.paperdb.Book;
import io.reactivex.C3956a;
import io.reactivex.C3959e;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.Experimental;
import io.reactivex.functions.Action;
import io.reactivex.functions.Cancellable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00120\t0\b\"\u0004\b\u0000\u0010\u0012H\u0002J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\b\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016J\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00120\b\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0015H\u0016J)\u0010\u0017\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152\u0006\u0010\u0018\u001a\u0002H\u0012H\u0016¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/tinder/data/profile/ProfilePaperDataStore;", "Lcom/tinder/data/profile/persistence/ProfileDataStore;", "book", "Lio/paperdb/Book;", "(Lio/paperdb/Book;)V", "listener", "Lcom/tinder/data/profile/ProfilePaperDataStore$OnDataChangedListener;", "source", "Lio/reactivex/Observable;", "Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;", "", "getSource", "()Lio/reactivex/Observable;", "source$delegate", "Lkotlin/Lazy;", "clear", "Lio/reactivex/Completable;", "createDataChangesObservable", "T", "get", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "observeDataChanges", "save", "data", "(Lcom/tinder/domain/profile/model/ProfileOption;Ljava/lang/Object;)Lio/reactivex/Completable;", "OnDataChangedListener", "ProfileData", "data_release"}, k = 1, mv = {1, 1, 10})
@Experimental
/* renamed from: com.tinder.data.profile.o */
public final class C10959o implements ProfileDataStore {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f35664a = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(C10959o.class), "source", "getSource()Lio/reactivex/Observable;"))};
    /* renamed from: b */
    private C8764a f35665b;
    /* renamed from: c */
    private final Lazy f35666c = C18451c.a((Function0) new ProfilePaperDataStore$source$2(this));
    /* renamed from: d */
    private final Book f35667d;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/tinder/data/profile/ProfilePaperDataStore$OnDataChangedListener;", "", "onDataChanged", "", "DATA", "data", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "(Ljava/lang/Object;Lcom/tinder/domain/profile/model/ProfileOption;)V", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$a */
    private interface C8764a {
        /* renamed from: a */
        <DATA> void mo9844a(DATA data, @NotNull ProfileOption<? extends DATA> profileOption);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;", "T", "", "data", "option", "Lcom/tinder/domain/profile/model/ProfileOption;", "(Ljava/lang/Object;Lcom/tinder/domain/profile/model/ProfileOption;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getOption", "()Lcom/tinder/domain/profile/model/ProfileOption;", "component1", "component2", "copy", "(Ljava/lang/Object;Lcom/tinder/domain/profile/model/ProfileOption;)Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;", "equals", "", "other", "hashCode", "", "toString", "", "data_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$b */
    private static final class C8765b<T> {
        /* renamed from: a */
        private final T f30811a;
        @NotNull
        /* renamed from: b */
        private final ProfileOption<T> f30812b;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C8765b) {
                    C8765b c8765b = (C8765b) obj;
                    if (C2668g.a(this.f30811a, c8765b.f30811a) && C2668g.a(this.f30812b, c8765b.f30812b)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f30811a;
            int i = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            ProfileOption profileOption = this.f30812b;
            if (profileOption != null) {
                i = profileOption.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ProfileData(data=");
            stringBuilder.append(this.f30811a);
            stringBuilder.append(", option=");
            stringBuilder.append(this.f30812b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C8765b(T t, @NotNull ProfileOption<? extends T> profileOption) {
            C2668g.b(profileOption, "option");
            this.f30811a = t;
            this.f30812b = profileOption;
        }

        /* renamed from: a */
        public final T m37368a() {
            return this.f30811a;
        }

        @NotNull
        /* renamed from: b */
        public final ProfileOption<T> m37369b() {
            return this.f30812b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "call", "()Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$e */
    static final class C8766e<V> implements Callable<T> {
        /* renamed from: a */
        final /* synthetic */ C10959o f30813a;
        /* renamed from: b */
        final /* synthetic */ ProfileOption f30814b;

        C8766e(C10959o c10959o, ProfileOption profileOption) {
            this.f30813a = c10959o;
            this.f30814b = profileOption;
        }

        public final T call() {
            T read = this.f30813a.f35667d.read(this.f30814b.getName());
            if (read != null) {
                return read;
            }
            throw new DataNotAvailableException(this.f30814b);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$c */
    static final class C10952c implements Action {
        /* renamed from: a */
        final /* synthetic */ C10959o f35655a;

        C10952c(C10959o c10959o) {
            this.f35655a = c10959o;
        }

        public final void run() {
            this.f35655a.f35667d.destroy();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "emitter", "Lio/reactivex/ObservableEmitter;", "Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;", "subscribe"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$d */
    static final class C10955d<T> implements ObservableOnSubscribe<T> {
        /* renamed from: a */
        final /* synthetic */ C10959o f35658a;

        C10955d(C10959o c10959o) {
            this.f35658a = c10959o;
        }

        public final void subscribe(@NotNull final ObservableEmitter<C8765b<T>> observableEmitter) {
            C2668g.b(observableEmitter, "emitter");
            this.f35658a.f35665b = new C8764a() {
                /* renamed from: a */
                public <DATA> void mo9844a(DATA data, @NotNull ProfileOption<? extends DATA> profileOption) {
                    C2668g.b(profileOption, "option");
                    observableEmitter.onNext(new C8765b(data, profileOption));
                }
            };
            observableEmitter.setCancellable(new Cancellable() {
                public final void cancel() {
                    this.f35658a.f35665b = (C8764a) null;
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;", "", "test"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$f */
    static final class C10956f<T> implements Predicate<C8765b<Object>> {
        /* renamed from: a */
        final /* synthetic */ ProfileOption f35659a;

        C10956f(ProfileOption profileOption) {
            this.f35659a = profileOption;
        }

        public /* synthetic */ boolean test(Object obj) {
            return m43549a((C8765b) obj);
        }

        /* renamed from: a */
        public final boolean m43549a(@NotNull C8765b<Object> c8765b) {
            C2668g.b(c8765b, "it");
            return C2668g.a(this.f35659a, c8765b.m37369b());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "it", "Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;", "", "apply", "(Lcom/tinder/data/profile/ProfilePaperDataStore$ProfileData;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$g */
    static final class C10957g<T, R> implements Function<T, R> {
        /* renamed from: a */
        public static final C10957g f35660a = new C10957g();

        C10957g() {
        }

        public /* synthetic */ Object apply(Object obj) {
            return m43550a((C8765b) obj);
        }

        /* renamed from: a */
        public final T m43550a(@NotNull C8765b<Object> c8765b) {
            C2668g.b(c8765b, "it");
            return c8765b.m37368a();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.data.profile.o$h */
    static final class C10958h implements Action {
        /* renamed from: a */
        final /* synthetic */ C10959o f35661a;
        /* renamed from: b */
        final /* synthetic */ ProfileOption f35662b;
        /* renamed from: c */
        final /* synthetic */ Object f35663c;

        C10958h(C10959o c10959o, ProfileOption profileOption, Object obj) {
            this.f35661a = c10959o;
            this.f35662b = profileOption;
            this.f35663c = obj;
        }

        public final void run() {
            this.f35661a.f35667d.write(this.f35662b.getName(), this.f35663c);
            C8764a b = this.f35661a.f35665b;
            if (b != null) {
                b.mo9844a(this.f35663c, this.f35662b);
            }
        }
    }

    /* renamed from: a */
    private final C3959e<C8765b<Object>> m43552a() {
        Lazy lazy = this.f35666c;
        KProperty kProperty = f35664a[0];
        return (C3959e) lazy.getValue();
    }

    @Inject
    public C10959o(@NotNull @ProfileBook Book book) {
        C2668g.b(book, "book");
        this.f35667d = book;
    }

    @NotNull
    public <T> C3959e<T> get(@NotNull ProfileOption<? extends T> profileOption) {
        C2668g.b(profileOption, "option");
        profileOption = C3959e.fromCallable(new C8766e(this, profileOption));
        C2668g.a(profileOption, "Observable.fromCallable …ception(option)\n        }");
        return profileOption;
    }

    @NotNull
    public <T> C3956a save(@NotNull ProfileOption<? extends T> profileOption, T t) {
        C2668g.b(profileOption, "option");
        profileOption = C3956a.a(new C10958h(this, profileOption, t));
        C2668g.a(profileOption, "Completable.fromAction {…d(data, option)\n        }");
        return profileOption;
    }

    @NotNull
    public <T> C3959e<T> observeDataChanges(@NotNull ProfileOption<? extends T> profileOption) {
        C2668g.b(profileOption, "option");
        profileOption = m43552a().filter(new C10956f(profileOption)).map(C10957g.f35660a).distinctUntilChanged();
        C2668g.a(profileOption, "source.filter { option =…  .distinctUntilChanged()");
        return profileOption;
    }

    /* renamed from: b */
    private final <T> C3959e<C8765b<T>> m43555b() {
        C3959e<C8765b<T>> share = C3959e.create(new C10955d(this)).share();
        C2668g.a(share, "Observable.create({ emit…null }\n        }).share()");
        return share;
    }

    @NotNull
    public C3956a clear() {
        C3956a a = C3956a.a(new C10952c(this));
        C2668g.a(a, "Completable.fromAction { book.destroy() }");
        return a;
    }
}
