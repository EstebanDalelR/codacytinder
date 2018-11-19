package com.tinder.data.database;

import android.database.Cursor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/database/Cursor;", "invoke"}, k = 3, mv = {1, 1, 10})
final class CursorExtensionsKt$asSequence$1 extends Lambda implements Function0<Cursor> {
    /* renamed from: a */
    final /* synthetic */ Cursor f43802a;

    CursorExtensionsKt$asSequence$1(Cursor cursor) {
        this.f43802a = cursor;
        super(0);
    }

    public /* synthetic */ Object invoke() {
        return m53369a();
    }

    @Nullable
    /* renamed from: a */
    public final Cursor m53369a() {
        return this.f43802a.moveToFirst() ? this.f43802a : null;
    }
}
