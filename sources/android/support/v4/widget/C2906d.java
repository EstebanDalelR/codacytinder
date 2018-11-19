package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.widget.C0638e.C0637a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import com.tinder.api.ManagerWebServices;

/* renamed from: android.support.v4.widget.d */
public abstract class C2906d extends BaseAdapter implements C0637a, Filterable {
    @Deprecated
    public static final int FLAG_AUTO_REQUERY = 1;
    public static final int FLAG_REGISTER_CONTENT_OBSERVER = 2;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected boolean mAutoRequery;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected C0635a mChangeObserver;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected Context mContext;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected Cursor mCursor;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected C0638e mCursorFilter;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected DataSetObserver mDataSetObserver;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected boolean mDataValid;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected FilterQueryProvider mFilterQueryProvider;
    @RestrictTo({Scope.LIBRARY_GROUP})
    protected int mRowIDColumn;

    /* renamed from: android.support.v4.widget.d$a */
    private class C0635a extends ContentObserver {
        /* renamed from: a */
        final /* synthetic */ C2906d f1975a;

        public boolean deliverSelfNotifications() {
            return true;
        }

        C0635a(C2906d c2906d) {
            this.f1975a = c2906d;
            super(new Handler());
        }

        public void onChange(boolean z) {
            this.f1975a.onContentChanged();
        }
    }

    /* renamed from: android.support.v4.widget.d$b */
    private class C0636b extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ C2906d f1976a;

        C0636b(C2906d c2906d) {
            this.f1976a = c2906d;
        }

        public void onChanged() {
            this.f1976a.mDataValid = true;
            this.f1976a.notifyDataSetChanged();
        }

        public void onInvalidated() {
            this.f1976a.mDataValid = false;
            this.f1976a.notifyDataSetInvalidated();
        }
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public boolean hasStableIds() {
        return true;
    }

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    @Deprecated
    public C2906d(Context context, Cursor cursor) {
        init(context, cursor, 1);
    }

    public C2906d(Context context, Cursor cursor, boolean z) {
        init(context, cursor, z ? true : true);
    }

    public C2906d(Context context, Cursor cursor, int i) {
        init(context, cursor, i);
    }

    @Deprecated
    protected void init(Context context, Cursor cursor, boolean z) {
        init(context, cursor, z ? true : true);
    }

    void init(Context context, Cursor cursor, int i) {
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.mAutoRequery = true;
        } else {
            this.mAutoRequery = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.mCursor = cursor;
        this.mDataValid = z;
        this.mContext = context;
        this.mRowIDColumn = z ? cursor.getColumnIndexOrThrow(ManagerWebServices.PARAM_ID_UNDERSCORE) : -1;
        if ((i & 2) == 2) {
            this.mChangeObserver = new C0635a(this);
            this.mDataSetObserver = new C0636b(this);
        } else {
            this.mChangeObserver = null;
            this.mDataSetObserver = null;
        }
        if (z) {
            if (this.mChangeObserver != null) {
                cursor.registerContentObserver(this.mChangeObserver);
            }
            if (this.mDataSetObserver != null) {
                cursor.registerDataSetObserver(this.mDataSetObserver);
            }
        }
    }

    public Cursor getCursor() {
        return this.mCursor;
    }

    public int getCount() {
        return (!this.mDataValid || this.mCursor == null) ? 0 : this.mCursor.getCount();
    }

    public Object getItem(int i) {
        if (!this.mDataValid || this.mCursor == null) {
            return 0;
        }
        this.mCursor.moveToPosition(i);
        return this.mCursor;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getItemId(int r4) {
        /*
        r3 = this;
        r0 = r3.mDataValid;
        r1 = 0;
        if (r0 == 0) goto L_0x001c;
    L_0x0006:
        r0 = r3.mCursor;
        if (r0 == 0) goto L_0x001c;
    L_0x000a:
        r0 = r3.mCursor;
        r4 = r0.moveToPosition(r4);
        if (r4 == 0) goto L_0x001b;
    L_0x0012:
        r4 = r3.mCursor;
        r0 = r3.mRowIDColumn;
        r0 = r4.getLong(r0);
        return r0;
    L_0x001b:
        return r1;
    L_0x001c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.d.getItemId(int):long");
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.mCursor.moveToPosition(i)) {
            if (view == null) {
                view = newView(this.mContext, this.mCursor, viewGroup);
            }
            bindView(view, this.mContext, this.mCursor);
            return view;
        } else {
            viewGroup = new StringBuilder();
            viewGroup.append("couldn't move cursor to position ");
            viewGroup.append(i);
            throw new IllegalStateException(viewGroup.toString());
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.mDataValid) {
            return 0;
        }
        this.mCursor.moveToPosition(i);
        if (view == null) {
            view = newDropDownView(this.mContext, this.mCursor, viewGroup);
        }
        bindView(view, this.mContext, this.mCursor);
        return view;
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    public void changeCursor(Cursor cursor) {
        cursor = swapCursor(cursor);
        if (cursor != null) {
            cursor.close();
        }
    }

    public Cursor swapCursor(Cursor cursor) {
        if (cursor == this.mCursor) {
            return null;
        }
        Cursor cursor2 = this.mCursor;
        if (cursor2 != null) {
            if (this.mChangeObserver != null) {
                cursor2.unregisterContentObserver(this.mChangeObserver);
            }
            if (this.mDataSetObserver != null) {
                cursor2.unregisterDataSetObserver(this.mDataSetObserver);
            }
        }
        this.mCursor = cursor;
        if (cursor != null) {
            if (this.mChangeObserver != null) {
                cursor.registerContentObserver(this.mChangeObserver);
            }
            if (this.mDataSetObserver != null) {
                cursor.registerDataSetObserver(this.mDataSetObserver);
            }
            this.mRowIDColumn = cursor.getColumnIndexOrThrow(ManagerWebServices.PARAM_ID_UNDERSCORE);
            this.mDataValid = true;
            notifyDataSetChanged();
        } else {
            this.mRowIDColumn = -1;
            this.mDataValid = null;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        if (this.mFilterQueryProvider != null) {
            return this.mFilterQueryProvider.runQuery(charSequence);
        }
        return this.mCursor;
    }

    public Filter getFilter() {
        if (this.mCursorFilter == null) {
            this.mCursorFilter = new C0638e(this);
        }
        return this.mCursorFilter;
    }

    public FilterQueryProvider getFilterQueryProvider() {
        return this.mFilterQueryProvider;
    }

    public void setFilterQueryProvider(FilterQueryProvider filterQueryProvider) {
        this.mFilterQueryProvider = filterQueryProvider;
    }

    protected void onContentChanged() {
        if (this.mAutoRequery && this.mCursor != null && !this.mCursor.isClosed()) {
            this.mDataValid = this.mCursor.requery();
        }
    }
}
