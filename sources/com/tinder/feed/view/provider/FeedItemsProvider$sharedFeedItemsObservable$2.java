package com.tinder.feed.view.provider;

import com.tinder.domain.feed.ActivityFeedItem;
import com.tinder.domain.feed.FeedResult;
import com.tinder.domain.meta.model.CurrentUser;
import com.tinder.feed.p249d.C9463c;
import com.tinder.feed.view.model.C11767j;
import com.tinder.feed.view.model.FeedItem;
import com.tinder.feed.view.provider.C9545e.C9544a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Func1;
import rx.functions.Func2;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lrx/Observable;", "Lcom/tinder/feed/view/provider/FeedItemsProvider$FeedItemsUpdate;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 10})
final class FeedItemsProvider$sharedFeedItemsObservable$2 extends Lambda implements Function0<Observable<C9544a>> {
    /* renamed from: a */
    final /* synthetic */ C9545e f44402a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tinder/domain/meta/model/CurrentUser;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.feed.view.provider.FeedItemsProvider$sharedFeedItemsObservable$2$1 */
    static final class C132901<T, R> implements Func1<CurrentUser, Boolean> {
        /* renamed from: a */
        public static final C132901 f42142a = new C132901();

        C132901() {
        }

        public /* synthetic */ Object call(Object obj) {
            return Boolean.valueOf(m51440a((CurrentUser) obj));
        }

        /* renamed from: a */
        public final boolean m51440a(CurrentUser currentUser) {
            return C2668g.a(currentUser, CurrentUser.CURRENT_GUEST_USER) ^ 1;
        }
    }

    FeedItemsProvider$sharedFeedItemsObservable$2(C9545e c9545e) {
        this.f44402a = c9545e;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53666a();
    }

    /* renamed from: a */
    public final Observable<C9544a> m53666a() {
        return Observable.a(this.f44402a.f31931e.execute().f(C132901.f42142a), this.f44402a.f31930d.execute(), new Func2<T1, T2, R>() {
            public /* synthetic */ Object call(Object obj, Object obj2) {
                return m51441a((CurrentUser) obj, (FeedResult) obj2);
            }

            @NotNull
            /* renamed from: a */
            public final List<FeedItem> m51441a(CurrentUser currentUser, FeedResult feedResult) {
                Collection arrayList = new ArrayList();
                for (Object next : feedResult.getItems()) {
                    if (this.f44402a.m39826a((ActivityFeedItem) next)) {
                        arrayList.add(next);
                    }
                }
                List list = (List) arrayList;
                C9463c c = this.f44402a.f31933g;
                C2668g.a(currentUser, "currentUser");
                currentUser = c.m39567a(list, currentUser);
                return feedResult.getHasMoreItems() != null ? C19301m.a((Collection) currentUser, C11767j.f38473a) : currentUser;
            }
        }).m().b(this.f44402a.f31928b, new Func2<R, T, R>() {
            public /* synthetic */ Object call(Object obj, Object obj2) {
                return m51442a((C9544a) obj, (List) obj2);
            }

            @NotNull
            /* renamed from: a */
            public final C9544a m51442a(C9544a c9544a, List<? extends FeedItem> list) {
                c9544a = c9544a.m39822c();
                C9545e c9545e = this.f44402a;
                C2668g.a(list, "newFeedItems");
                return c9545e.m39825a((List) c9544a, (List) list);
            }
        }).b(1).a(1).w();
    }
}
