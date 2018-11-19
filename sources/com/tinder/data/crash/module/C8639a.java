package com.tinder.data.crash.module;

import com.tinder.data.crash.p213a.C10762a;
import com.tinder.data.crash.p214b.C8638a;
import com.tinder.domain.crash.gateway.CrashTimeStampGateway;
import dagger.Module;
import dagger.Provides;
import io.paperdb.Book;
import io.paperdb.Paper;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\nJ\u0017\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/tinder/data/crash/module/CrashDataModule;", "", "()V", "provideCrashTimeStampBook", "Lio/paperdb/Book;", "provideCrashTimeStampBook$data_release", "provideCrashTimeStampGateway", "Lcom/tinder/domain/crash/gateway/CrashTimeStampGateway;", "crashStoreGateway", "Lcom/tinder/data/crash/gateway/CrashTimeStampStoreGateway;", "provideCrashTimeStampGateway$data_release", "provideCrashTimeStampStore", "Lcom/tinder/data/crash/store/CrashTimeStampStore;", "book", "provideCrashTimeStampStore$data_release", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.crash.module.a */
public final class C8639a {
    @Singleton
    @NotNull
    @CrashTimeStampBook
    @Provides
    /* renamed from: a */
    public final Book m36797a() {
        Book book = Paper.book("crash_timestamp_book");
        C2668g.a(book, "Paper.book(CRASH_TIMESTAMP_BOOK)");
        return book;
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final C8638a m36795a(@NotNull @CrashTimeStampBook Book book) {
        C2668g.b(book, "book");
        return new C8638a(book);
    }

    @Singleton
    @NotNull
    @Provides
    /* renamed from: a */
    public final CrashTimeStampGateway m36796a(@NotNull C10762a c10762a) {
        C2668g.b(c10762a, "crashStoreGateway");
        return c10762a;
    }
}
