package com.tinder.data.meta.module;

import com.tinder.data.meta.p227b.C10851a;
import com.tinder.data.meta.store.C10852a;
import com.tinder.data.meta.store.MetaStore;
import com.tinder.domain.meta.gateway.MetaGateway;
import dagger.Module;
import dagger.Provides;
import io.paperdb.Book;
import io.paperdb.Paper;
import javax.inject.Singleton;

@Module
/* renamed from: com.tinder.data.meta.module.a */
public class C8702a {
    @Singleton
    @Provides
    /* renamed from: a */
    MetaGateway m37165a(C10851a c10851a) {
        return c10851a;
    }

    @Singleton
    @MetaBook
    @Provides
    /* renamed from: a */
    Book m37166a() {
        return Paper.book("meta_book");
    }

    @Singleton
    @Provides
    /* renamed from: a */
    MetaStore m37164a(@MetaBook Book book) {
        return new C10852a(book);
    }
}
