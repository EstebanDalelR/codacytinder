package com.tinder.recs.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import com.tinder.domain.recs.SwipeDataStore;
import com.tinder.domain.recs.model.Swipe;
import io.paperdb.Book;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import p000a.p001a.C0001a;
import rx.Observable;
import rx.Single;
import rx.schedulers.Schedulers;
import rx.subjects.C19785a;

@Singleton
public class PaperSwipeRepository implements SwipeDataStore {
    private static final boolean DEBUG = false;
    private static final int THROTTLE_INTERVAL_MILLIS = 750;
    private final SwipeCache swipeCache = new SwipeCache();
    private final SwipeStorage swipeStorage;

    private static class SwipeCache {
        private final Map<String, Swipe> swipeMap;
        private final C19785a<Set<Swipe>> swipesSubject;

        private SwipeCache() {
            this.swipeMap = new HashMap();
            this.swipesSubject = C19785a.f(Collections.emptySet());
        }

        @NonNull
        Set<String> ids() {
            return this.swipeMap.keySet();
        }

        @NonNull
        Set<Swipe> swipes() {
            return new HashSet(this.swipeMap.values());
        }

        @Nullable
        Swipe loadSwipe(@NonNull String str) {
            return (Swipe) this.swipeMap.get(str);
        }

        Observable<Set<Swipe>> observeSwipes() {
            return this.swipesSubject.m().g().e();
        }

        void saveSwipe(@NonNull Swipe swipe) {
            saveSwipes(Collections.singleton(swipe));
        }

        void saveSwipes(@NonNull Set<Swipe> set) {
            for (Swipe swipe : set) {
                this.swipeMap.put(PaperSwipeRepository.findId(swipe), swipe);
            }
            emitSwipes();
        }

        void removeSwipes(@NonNull Set<Swipe> set) {
            for (Swipe access$600 : set) {
                this.swipeMap.remove(PaperSwipeRepository.findId(access$600));
            }
            emitSwipes();
        }

        void removeAllSwipes() {
            this.swipeMap.clear();
            emitSwipes();
        }

        private void emitSwipes() {
            this.swipesSubject.onNext(swipes());
        }
    }

    private static class SwipeStorage {
        private final Book book;

        private void mimicTimeConsumingIoOperation() {
        }

        private SwipeStorage(Book book) {
            this.book = book;
        }

        @Nullable
        @WorkerThread
        private Swipe loadSwipe(@NonNull String str) {
            try {
                mimicTimeConsumingIoOperation();
                return (Swipe) this.book.read(str);
            } catch (Throwable th) {
                C0001a.c(th, "Cannot read swipe: %s", new Object[]{str});
                return null;
            }
        }

        @WorkerThread
        private Single<Set<Swipe>> loadAllSwipes() {
            return Observable.a(loadAllSwipeIds()).h(new PaperSwipeRepository$SwipeStorage$$Lambda$0(this)).v().k(PaperSwipeRepository$SwipeStorage$$Lambda$1.$instance).a();
        }

        final /* synthetic */ Observable lambda$loadAllSwipes$0$PaperSwipeRepository$SwipeStorage(String str) {
            str = loadSwipe(str);
            if (str == null) {
                return Observable.c();
            }
            return Observable.a(str);
        }

        @android.support.annotation.WorkerThread
        @android.support.annotation.NonNull
        private java.util.Set<java.lang.String> loadAllSwipeIds() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r2.mimicTimeConsumingIoOperation();	 Catch:{ Throwable -> 0x000f }
            r0 = new java.util.HashSet;	 Catch:{ Throwable -> 0x000f }
            r1 = r2.book;	 Catch:{ Throwable -> 0x000f }
            r1 = r1.getAllKeys();	 Catch:{ Throwable -> 0x000f }
            r0.<init>(r1);	 Catch:{ Throwable -> 0x000f }
            return r0;
        L_0x000f:
            r0 = "Cannot load all swipe ids";
            r1 = 0;
            r1 = new java.lang.Object[r1];
            p000a.p001a.C0001a.e(r0, r1);
            r0 = java.util.Collections.emptySet();
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.data.PaperSwipeRepository.SwipeStorage.loadAllSwipeIds():java.util.Set<java.lang.String>");
        }

        @android.support.annotation.WorkerThread
        private void saveSwipe(@android.support.annotation.NonNull com.tinder.domain.recs.model.Swipe r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r3.mimicTimeConsumingIoOperation();	 Catch:{ Throwable -> 0x000d }
            r0 = r3.book;	 Catch:{ Throwable -> 0x000d }
            r1 = com.tinder.recs.data.PaperSwipeRepository.findId(r4);	 Catch:{ Throwable -> 0x000d }
            r0.write(r1, r4);	 Catch:{ Throwable -> 0x000d }
            goto L_0x001c;
        L_0x000d:
            r0 = "Cannot save swipe: %s";
            r1 = 1;
            r1 = new java.lang.Object[r1];
            r2 = 0;
            r4 = com.tinder.recs.data.PaperSwipeRepository.findId(r4);
            r1[r2] = r4;
            p000a.p001a.C0001a.e(r0, r1);
        L_0x001c:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.data.PaperSwipeRepository.SwipeStorage.saveSwipe(com.tinder.domain.recs.model.Swipe):void");
        }

        @android.support.annotation.WorkerThread
        private void removeSwipe(@android.support.annotation.NonNull java.lang.String r4) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r3 = this;
            r3.mimicTimeConsumingIoOperation();	 Catch:{ Throwable -> 0x0009 }
            r0 = r3.book;	 Catch:{ Throwable -> 0x0009 }
            r0.delete(r4);	 Catch:{ Throwable -> 0x0009 }
            goto L_0x0014;
        L_0x0009:
            r0 = "Cannot remove swipe: %s";
            r1 = 1;
            r1 = new java.lang.Object[r1];
            r2 = 0;
            r1[r2] = r4;
            p000a.p001a.C0001a.e(r0, r1);
        L_0x0014:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.data.PaperSwipeRepository.SwipeStorage.removeSwipe(java.lang.String):void");
        }

        @android.support.annotation.WorkerThread
        void removeAllSwipes() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r2.mimicTimeConsumingIoOperation();	 Catch:{ Throwable -> 0x0009 }
            r0 = r2.book;	 Catch:{ Throwable -> 0x0009 }
            r0.destroy();	 Catch:{ Throwable -> 0x0009 }
            goto L_0x0011;
        L_0x0009:
            r0 = "Cannot remove all swipes";
            r1 = 0;
            r1 = new java.lang.Object[r1];
            p000a.p001a.C0001a.e(r0, r1);
        L_0x0011:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.recs.data.PaperSwipeRepository.SwipeStorage.removeAllSwipes():void");
        }
    }

    public PaperSwipeRepository(Book book) {
        this.swipeStorage = new SwipeStorage(book);
        subscribeToCacheUpdate();
        loadCacheFromStorage();
    }

    public Observable<Set<Swipe>> observeSwipes() {
        return this.swipeCache.observeSwipes();
    }

    public synchronized void addSwipe(@NonNull Swipe swipe) {
        this.swipeCache.saveSwipe(swipe);
    }

    public synchronized void removeAllSwipes() {
        this.swipeCache.removeAllSwipes();
    }

    public synchronized void removeSwipe(@NonNull Swipe swipe) {
        removeSwipes(Collections.singleton(swipe));
    }

    public synchronized void removeSwipes(@NonNull Set<Swipe> set) {
        if (!set.isEmpty()) {
            this.swipeCache.removeSwipes(set);
        }
    }

    private void loadCacheFromStorage() {
        Single b = this.swipeStorage.loadAllSwipes().b(Schedulers.io());
        SwipeCache swipeCache = this.swipeCache;
        swipeCache.getClass();
        b.a(PaperSwipeRepository$$Lambda$0.get$Lambda(swipeCache), PaperSwipeRepository$$Lambda$1.$instance);
    }

    private void subscribeToCacheUpdate() {
        this.swipeCache.observeSwipes().g(750, TimeUnit.MILLISECONDS).a(Schedulers.io()).a(new PaperSwipeRepository$$Lambda$2(this), PaperSwipeRepository$$Lambda$3.$instance);
    }

    final /* synthetic */ void lambda$subscribeToCacheUpdate$1$PaperSwipeRepository(Set set) {
        saveCacheToStorage();
    }

    private void saveCacheToStorage() {
        Collection access$300 = this.swipeStorage.loadAllSwipeIds();
        Set<String> hashSet = new HashSet(this.swipeCache.ids());
        hashSet.removeAll(access$300);
        Set<String> hashSet2 = new HashSet(access$300);
        hashSet2.removeAll(this.swipeCache.ids());
        if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
            if (hashSet.isEmpty() && hashSet2.equals(access$300)) {
                this.swipeStorage.removeAllSwipes();
                return;
            }
            for (String loadSwipe : hashSet) {
                Swipe loadSwipe2 = this.swipeCache.loadSwipe(loadSwipe);
                if (loadSwipe2 != null) {
                    this.swipeStorage.saveSwipe(loadSwipe2);
                }
            }
            for (String loadSwipe3 : hashSet2) {
                this.swipeStorage.removeSwipe(loadSwipe3);
            }
        }
    }

    private static String findId(@NonNull Swipe swipe) {
        return swipe.getRec().getId();
    }
}
