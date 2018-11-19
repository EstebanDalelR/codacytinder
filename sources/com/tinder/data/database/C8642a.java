package com.tinder.data.database;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.sequences.C19285g;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "Landroid/database/Cursor;", "data_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: com.tinder.data.database.a */
public final class C8642a {
    @NotNull
    /* renamed from: a */
    public static final Sequence<Cursor> m36798a(@NotNull Cursor cursor) {
        C2668g.b(cursor, "$receiver");
        return C19285g.a(new CursorExtensionsKt$asSequence$1(cursor), new CursorExtensionsKt$asSequence$2(cursor));
    }
}
