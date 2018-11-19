package com.tinder.data.profile;

import dagger.Module;
import dagger.Provides;
import io.paperdb.Book;
import io.paperdb.Paper;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/tinder/data/profile/ProfileBookModule;", "", "()V", "provideProfileBook", "Lio/paperdb/Book;", "data_release"}, k = 1, mv = {1, 1, 10})
@Module
/* renamed from: com.tinder.data.profile.g */
public final class C8760g {
    @NotNull
    @ProfileBook
    @Provides
    /* renamed from: a */
    public final Book m37306a() {
        Book book = Paper.book("profile-data-book");
        C2668g.a(book, "Paper.book(PROFILE_BOOK_NAME)");
        return book;
    }
}
