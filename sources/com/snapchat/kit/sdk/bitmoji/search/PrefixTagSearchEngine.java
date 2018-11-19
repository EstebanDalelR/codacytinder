package com.snapchat.kit.sdk.bitmoji.search;

import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

public class PrefixTagSearchEngine {

    public interface TagResultsCallback {
        void onComplete(@NonNull List<String> list, @Nullable String str, @Nullable C5909d c5909d);
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.search.PrefixTagSearchEngine$a */
    private enum C5904a {
        EXACT_MATCH(0),
        CONTAINS_EXACT_WORDS_WITH_FIRST_WORD(10),
        CONTAINS_EXACT_WORDS(11),
        PREFIX_MATCH_WITH_FIRST_WORD(20),
        PREFIX_MATCH(21),
        NONE(100);
        
        /* renamed from: g */
        private final int f21625g;

        private C5904a(int i) {
            this.f21625g = i;
        }

        /* renamed from: a */
        public int m25470a() {
            return this.f21625g;
        }
    }

    /* renamed from: com.snapchat.kit.sdk.bitmoji.search.PrefixTagSearchEngine$b */
    private static class C5905b extends AsyncTask<Void, Void, List<String>> {
        /* renamed from: a */
        private final String f21626a;
        /* renamed from: b */
        private final C5909d f21627b;
        /* renamed from: c */
        private final boolean f21628c;
        /* renamed from: d */
        private final TagResultsCallback f21629d;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m25471a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m25472a((List) obj);
        }

        C5905b(String str, C5909d c5909d, boolean z, TagResultsCallback tagResultsCallback) {
            this.f21626a = str;
            this.f21627b = c5909d;
            this.f21628c = z;
            this.f21629d = tagResultsCallback;
        }

        /* renamed from: a */
        protected List<String> m25471a(Void... voidArr) {
            return PrefixTagSearchEngine.m25477b(this.f21626a, this.f21627b, this.f21628c);
        }

        /* renamed from: a */
        protected void m25472a(List<String> list) {
            this.f21629d.onComplete(list, this.f21626a, this.f21627b);
        }
    }

    @Inject
    PrefixTagSearchEngine() {
    }

    /* renamed from: a */
    public void m25480a(String str, C5909d c5909d, boolean z, TagResultsCallback tagResultsCallback) {
        if (c5909d == null) {
            tagResultsCallback.onComplete(Collections.emptyList(), str, false);
        } else {
            new C5905b(str, c5909d, z, tagResultsCallback).execute(new Void[null]);
        }
    }

    @WorkerThread
    /* renamed from: b */
    private static List<String> m25477b(String str, C5909d c5909d, boolean z) {
        System.currentTimeMillis();
        final HashMap hashMap = new HashMap();
        List a = m25474a(str);
        if (a.isEmpty()) {
            return new ArrayList();
        }
        List<String> arrayList = new ArrayList();
        for (String str2 : c5909d.m25491a()) {
            if (z || c5909d.m25493b(str2)) {
                C5904a a2 = m25473a(str2, a);
                if (a2 != C5904a.NONE) {
                    hashMap.put(str2, Integer.valueOf(a2.m25470a()));
                    arrayList.add(str2);
                }
            }
        }
        Collections.sort(arrayList, new Comparator<String>() {
            public /* synthetic */ int compare(Object obj, Object obj2) {
                return m25469a((String) obj, (String) obj2);
            }

            /* renamed from: a */
            public int m25469a(String str, String str2) {
                return ((Integer) hashMap.get(str)).compareTo((Integer) hashMap.get(str2));
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private static C5904a m25473a(String str, List<String> list) {
        List a = m25474a(str);
        if (m25476a((List) list, a)) {
            return C5904a.EXACT_MATCH;
        }
        if (m25478b(list, a)) {
            if (((String) a.get(0)).equals(list.get(0)) != null) {
                return C5904a.CONTAINS_EXACT_WORDS_WITH_FIRST_WORD;
            }
            return C5904a.CONTAINS_EXACT_WORDS;
        } else if (!m25479c(list, a)) {
            return C5904a.NONE;
        } else {
            if (((String) a.get(0)).startsWith((String) list.get(0)) != null) {
                return C5904a.PREFIX_MATCH_WITH_FIRST_WORD;
            }
            return C5904a.PREFIX_MATCH;
        }
    }

    /* renamed from: a */
    private static boolean m25476a(List<String> list, List<String> list2) {
        return list.equals(list2);
    }

    /* renamed from: b */
    private static boolean m25478b(List<String> list, List<String> list2) {
        for (String contains : list) {
            if (!list2.contains(contains)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m25479c(List<String> list, List<String> list2) {
        list = list.iterator();
        boolean z;
        do {
            z = true;
            if (!list.hasNext()) {
                return true;
            }
            String str = (String) list.next();
            for (String startsWith : list2) {
                if (startsWith.startsWith(str)) {
                    continue;
                    break;
                }
            }
            z = false;
            continue;
        } while (z);
        return false;
    }

    /* renamed from: a */
    private static List<String> m25474a(String str) {
        str = str.toLowerCase().replace("'", "").split(" ");
        List<String> arrayList = new ArrayList(str.length);
        for (String str2 : str) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
