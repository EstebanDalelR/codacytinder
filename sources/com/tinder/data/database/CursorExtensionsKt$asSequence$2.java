package com.tinder.data.database;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/database/Cursor;", "it", "invoke"}, k = 3, mv = {1, 1, 10})
final class CursorExtensionsKt$asSequence$2 extends Lambda implements Function1<Cursor, Cursor> {
    /* renamed from: a */
    final /* synthetic */ Cursor f43803a;

    CursorExtensionsKt$asSequence$2(Cursor cursor) {
        this.f43803a = cursor;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return m53370a((Cursor) obj);
    }

    @Nullable
    /* renamed from: a */
    public final Cursor m53370a(@NotNull Cursor cursor) {
        C2668g.b(cursor, "it");
        return this.f43803a.moveToNext() != null ? this.f43803a : null;
    }
}
