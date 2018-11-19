package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.e */
class C0638e extends Filter {
    /* renamed from: a */
    C0637a f1977a;

    /* renamed from: android.support.v4.widget.e$a */
    interface C0637a {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    C0638e(C0637a c0637a) {
        this.f1977a = c0637a;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f1977a.convertToString((Cursor) obj);
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        charSequence = this.f1977a.runQueryOnBackgroundThread(charSequence);
        FilterResults filterResults = new FilterResults();
        if (charSequence != null) {
            filterResults.count = charSequence.getCount();
            filterResults.values = charSequence;
        } else {
            filterResults.count = null;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        charSequence = this.f1977a.getCursor();
        if (filterResults.values != null && filterResults.values != charSequence) {
            this.f1977a.changeCursor((Cursor) filterResults.values);
        }
    }
}
