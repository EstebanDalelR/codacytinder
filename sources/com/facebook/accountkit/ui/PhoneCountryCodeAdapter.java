package com.facebook.accountkit.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.accountkit.C1196d.C1188a;
import com.facebook.accountkit.C1196d.C1192e;
import com.facebook.accountkit.C1196d.C1193f;
import com.facebook.accountkit.PhoneNumber;
import com.facebook.accountkit.internal.C1251w;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

final class PhoneCountryCodeAdapter extends BaseAdapter implements SpinnerAdapter {
    /* renamed from: a */
    private final Context f3429a;
    /* renamed from: b */
    private final UIManager f3430b;
    /* renamed from: c */
    private final C1292a[] f3431c;

    private enum CountryCodeSource {
        APP_SUPPLIED_DEFAULT_VALUE,
        APP_SUPPLIED_PHONE_NUMBER,
        DEFAULT_VALUE,
        FIRST_VALUE,
        TELEPHONY_SERVICE
    }

    public static class ValueData implements Parcelable {
        public static final Creator<ValueData> CREATOR = new C12911();
        public final String countryCode;
        public final String countryCodeSource;
        public final int position;

        /* renamed from: com.facebook.accountkit.ui.PhoneCountryCodeAdapter$ValueData$1 */
        static class C12911 implements Creator<ValueData> {
            C12911() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m4568a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m4569a(i);
            }

            /* renamed from: a */
            public ValueData m4568a(Parcel parcel) {
                return new ValueData(parcel);
            }

            /* renamed from: a */
            public ValueData[] m4569a(int i) {
                return new ValueData[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private ValueData(String str, String str2, int i) {
            this.countryCode = str;
            this.countryCodeSource = str2;
            this.position = i;
        }

        private ValueData(Parcel parcel) {
            this.countryCode = parcel.readString();
            this.countryCodeSource = parcel.readString();
            this.position = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.countryCode);
            parcel.writeString(this.countryCodeSource);
            parcel.writeInt(this.position);
        }
    }

    /* renamed from: com.facebook.accountkit.ui.PhoneCountryCodeAdapter$a */
    private static final class C1292a {
        /* renamed from: a */
        final String f3424a;
        /* renamed from: b */
        final String f3425b;
        /* renamed from: c */
        final String f3426c;
        /* renamed from: d */
        final long f3427d;
        /* renamed from: e */
        final String f3428e;

        C1292a(String str, String str2, String str3) {
            this.f3424a = str;
            this.f3425b = str2;
            this.f3426c = str3;
            str = str.replaceAll("[\\D]", "");
            str3 = str2.length();
            for (int i = 0; i < str3; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(Integer.toString(str2.charAt(i)));
                str = stringBuilder.toString();
            }
            this.f3427d = Long.valueOf(str).longValue();
            if (C1292a.m4572d() != null) {
                str = C1292a.m4570a(str2);
                if (TextUtils.isEmpty(str) != null) {
                    str = str2;
                }
                this.f3428e = str;
                return;
            }
            this.f3428e = str2;
        }

        /* renamed from: a */
        String m4573a() {
            return this.f3424a;
        }

        /* renamed from: b */
        String m4574b() {
            return this.f3428e;
        }

        /* renamed from: c */
        String m4575c() {
            return this.f3426c;
        }

        /* renamed from: a */
        private static String m4570a(String str) {
            int codePointAt = (Character.codePointAt(str, 0) - 65) + 127462;
            str = (Character.codePointAt(str, 1) - 65) + 127462;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(new String(Character.toChars(codePointAt)));
            stringBuilder.append(new String(Character.toChars(str)));
            str = stringBuilder.toString();
            return C1292a.m4571b(str) ? str : "";
        }

        /* renamed from: d */
        private static boolean m4572d() {
            return VERSION.SDK_INT >= 23;
        }

        @TargetApi(23)
        /* renamed from: b */
        private static boolean m4571b(String str) {
            return new Paint().hasGlyph(str);
        }
    }

    public /* synthetic */ Object getItem(int i) {
        return m4579a(i);
    }

    public PhoneCountryCodeAdapter(Context context, UIManager uIManager, String[] strArr, String[] strArr2) {
        this.f3429a = context;
        this.f3430b = uIManager;
        this.f3431c = m4577a(context, strArr, strArr2);
    }

    public int getCount() {
        return this.f3431c.length;
    }

    /* renamed from: a */
    public ValueData m4580a(@Nullable PhoneNumber phoneNumber, @Nullable String str) {
        String name;
        String countryCode;
        String str2;
        int i;
        if (phoneNumber != null) {
            name = CountryCodeSource.APP_SUPPLIED_PHONE_NUMBER.name();
            int length = this.f3431c.length;
            countryCode = phoneNumber.getCountryCode();
            String countryCodeIso = phoneNumber.getCountryCodeIso();
            if (countryCodeIso != null) {
                phoneNumber = m4578a(countryCodeIso);
            } else {
                phoneNumber = null;
                while (phoneNumber < length) {
                    if (countryCode.equalsIgnoreCase(this.f3431c[phoneNumber].f3424a)) {
                        break;
                    }
                    phoneNumber++;
                }
            }
            str2 = name;
            i = phoneNumber;
            for (phoneNumber = null; phoneNumber <= 3 && i == -1; phoneNumber++) {
                switch (phoneNumber) {
                    case null:
                        str2 = CountryCodeSource.APP_SUPPLIED_DEFAULT_VALUE.name();
                        countryCode = str;
                        break;
                    case 1:
                        str2 = CountryCodeSource.TELEPHONY_SERVICE.name();
                        countryCode = C1251w.m4519h(this.f3429a);
                        break;
                    case 2:
                        str2 = CountryCodeSource.DEFAULT_VALUE.name();
                        countryCode = "US";
                        break;
                    case 3:
                        str2 = CountryCodeSource.FIRST_VALUE.name();
                        countryCode = this.f3431c[0].f3424a;
                        break;
                    default:
                        str2 = this.f3431c[i].f3425b;
                        countryCode = this.f3431c[i].f3424a;
                        break;
                }
                if (phoneNumber <= 3) {
                    i = m4578a(countryCode);
                }
            }
            return new ValueData(countryCode, str2, i);
        }
        name = null;
        countryCode = name;
        phoneNumber = -1;
        str2 = name;
        i = phoneNumber;
        for (phoneNumber = null; phoneNumber <= 3; phoneNumber++) {
            switch (phoneNumber) {
                case null:
                    str2 = CountryCodeSource.APP_SUPPLIED_DEFAULT_VALUE.name();
                    countryCode = str;
                    break;
                case 1:
                    str2 = CountryCodeSource.TELEPHONY_SERVICE.name();
                    countryCode = C1251w.m4519h(this.f3429a);
                    break;
                case 2:
                    str2 = CountryCodeSource.DEFAULT_VALUE.name();
                    countryCode = "US";
                    break;
                case 3:
                    str2 = CountryCodeSource.FIRST_VALUE.name();
                    countryCode = this.f3431c[0].f3424a;
                    break;
                default:
                    str2 = this.f3431c[i].f3425b;
                    countryCode = this.f3431c[i].f3424a;
                    break;
            }
            if (phoneNumber <= 3) {
                i = m4578a(countryCode);
            }
        }
        return new ValueData(countryCode, str2, i);
    }

    /* renamed from: a */
    public ValueData m4579a(int i) {
        C1292a c1292a = this.f3431c[i];
        return new ValueData(c1292a.f3424a, c1292a.f3425b, i);
    }

    public long getItemId(int i) {
        return this.f3431c[i].f3427d;
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(this.f3429a, C1193f.com_accountkit_phone_country_code_item_layout, null);
            view.setLayoutParams(new LayoutParams(-1, -1));
        }
        C1292a c1292a = this.f3431c[i];
        TextView textView = (TextView) view.findViewById(C1192e.flag);
        ((TextView) view.findViewById(C1192e.label)).setText(m4576a(c1292a));
        textView.setText(c1292a.m4574b());
        return view;
    }

    /* renamed from: a */
    private String m4576a(C1292a c1292a) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c1292a.m4575c());
        stringBuilder.append(" (+");
        stringBuilder.append(c1292a.m4573a());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = View.inflate(this.f3429a, C1193f.com_accountkit_phone_country_code_layout, null);
            view.setLayoutParams(new ViewGroup.LayoutParams(viewGroup.getLayoutParams()));
        }
        TextView textView = (TextView) view.findViewById(C1192e.country_code);
        textView.setText(this.f3431c[i].m4574b());
        if (ag.m4611a(this.f3430b) == 0) {
            textView.setTextColor(((SkinManager) this.f3430b).getTextColor());
        }
        return view;
    }

    /* renamed from: a */
    public int m4578a(String str) {
        if (C1251w.m4500a(str)) {
            return -1;
        }
        int length = this.f3431c.length;
        for (int i = 0; i < length; i++) {
            if (str.equalsIgnoreCase(this.f3431c[i].f3425b)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static C1292a[] m4577a(Context context, String[] strArr, String[] strArr2) {
        context = context.getResources().getStringArray(C1188a.com_accountkit_phone_country_codes);
        ArrayList arrayList = new ArrayList();
        Set hashSet = strArr2 != null ? new HashSet(Arrays.asList(strArr2)) : null;
        strArr2 = (strArr == null || strArr.length <= null) ? new HashSet() : new HashSet(Arrays.asList(strArr));
        for (String split : context) {
            String[] split2 = split.split(":", 3);
            if (!strArr2.contains(split2[1]) && (hashSet == null || hashSet.contains(split2[1]))) {
                arrayList.add(new C1292a(split2[0], split2[1], split2[2]));
            }
        }
        context = Collator.getInstance(Resources.getSystem().getConfiguration().locale);
        context.setStrength(0);
        Collections.sort(arrayList, new Comparator<C1292a>() {
            public /* synthetic */ int compare(Object obj, Object obj2) {
                return m4567a((C1292a) obj, (C1292a) obj2);
            }

            /* renamed from: a */
            public int m4567a(C1292a c1292a, C1292a c1292a2) {
                return context.compare(c1292a.f3426c, c1292a2.f3426c);
            }
        });
        context = new C1292a[arrayList.size()];
        arrayList.toArray(context);
        return context;
    }
}
