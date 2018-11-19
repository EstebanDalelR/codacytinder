package com.tinder.data.crash.p214b;

import com.tinder.domain.crash.queue.CrashTimestampsQueue;
import io.paperdb.Book;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/data/crash/store/CrashTimeStampStore;", "", "book", "Lio/paperdb/Book;", "(Lio/paperdb/Book;)V", "clear", "", "readCrashesTimeStamp", "Lcom/tinder/domain/crash/queue/CrashTimestampsQueue;", "saveCrashesTimeStamp", "crashesTimeStamp", "data_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.data.crash.b.a */
public final class C8638a {
    /* renamed from: a */
    private final Book f30492a;

    public C8638a(@NotNull Book book) {
        C2668g.b(book, "book");
        this.f30492a = book;
    }

    @NotNull
    /* renamed from: a */
    public final synchronized CrashTimestampsQueue m36792a() {
        Object read;
        read = this.f30492a.read("crash_ts", new CrashTimestampsQueue());
        C2668g.a(read, "book.read(CRASH_TIMESTAMP, CrashTimestampsQueue())");
        return (CrashTimestampsQueue) read;
    }

    /* renamed from: a */
    public final synchronized void m36793a(@NotNull CrashTimestampsQueue crashTimestampsQueue) {
        C2668g.b(crashTimestampsQueue, "crashesTimeStamp");
        this.f30492a.write("crash_ts", crashTimestampsQueue);
    }

    /* renamed from: b */
    public final synchronized void m36794b() {
        this.f30492a.destroy();
    }
}
