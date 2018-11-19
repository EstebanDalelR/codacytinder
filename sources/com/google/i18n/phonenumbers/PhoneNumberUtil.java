package com.google.i18n.phonenumbers;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.google.i18n.phonenumbers.NumberParseException.ErrorType;
import com.google.i18n.phonenumbers.PhoneNumberMatcher.C5617a;
import com.google.i18n.phonenumbers.Phonemetadata.NumberFormat;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneMetadata;
import com.google.i18n.phonenumbers.Phonemetadata.PhoneNumberDesc;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource;
import com.google.i18n.phonenumbers.internal.C5628b;
import com.google.i18n.phonenumbers.internal.C6952a;
import com.google.i18n.phonenumbers.internal.MatcherApi;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberUtil {
    /* renamed from: a */
    static final Pattern f20734a = Pattern.compile("[+＋]+");
    /* renamed from: b */
    static final Pattern f20735b = Pattern.compile("[\\\\/] *x");
    /* renamed from: c */
    static final Pattern f20736c = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    /* renamed from: d */
    static final String f20737d;
    /* renamed from: e */
    static final Pattern f20738e = Pattern.compile("(\\D+)");
    /* renamed from: f */
    private static final Logger f20739f = Logger.getLogger(PhoneNumberUtil.class.getName());
    /* renamed from: g */
    private static final Map<Integer, String> f20740g;
    /* renamed from: h */
    private static final Set<Integer> f20741h;
    /* renamed from: i */
    private static final Set<Integer> f20742i;
    /* renamed from: j */
    private static final Map<Character, Character> f20743j;
    /* renamed from: k */
    private static final Map<Character, Character> f20744k;
    /* renamed from: l */
    private static final Map<Character, Character> f20745l;
    /* renamed from: m */
    private static final Map<Character, Character> f20746m;
    /* renamed from: n */
    private static final Pattern f20747n = Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
    /* renamed from: o */
    private static final String f20748o;
    /* renamed from: p */
    private static final Pattern f20749p = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    /* renamed from: q */
    private static final Pattern f20750q = Pattern.compile("(\\p{Nd})");
    /* renamed from: r */
    private static final Pattern f20751r = Pattern.compile("[+＋\\p{Nd}]");
    /* renamed from: s */
    private static final Pattern f20752s = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    /* renamed from: t */
    private static final String f20753t;
    /* renamed from: u */
    private static final String f20754u;
    /* renamed from: v */
    private static final Pattern f20755v;
    /* renamed from: w */
    private static final Pattern f20756w;
    /* renamed from: x */
    private static final Pattern f20757x = Pattern.compile("(\\$\\d)");
    /* renamed from: y */
    private static final Pattern f20758y = Pattern.compile("\\(?\\$1\\)?");
    /* renamed from: z */
    private static PhoneNumberUtil f20759z;
    /* renamed from: A */
    private final C5624e f20760A;
    /* renamed from: B */
    private final Map<Integer, List<String>> f20761B;
    /* renamed from: C */
    private final MatcherApi f20762C = C6952a.m30469a();
    /* renamed from: D */
    private final Set<String> f20763D = new HashSet(35);
    /* renamed from: E */
    private final C5628b f20764E = new C5628b(100);
    /* renamed from: F */
    private final Set<String> f20765F = new HashSet(320);
    /* renamed from: G */
    private final Set<Integer> f20766G = new HashSet();

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$1 */
    class C56181 implements Iterable<C5625g> {
        /* renamed from: a */
        final /* synthetic */ CharSequence f20726a;
        /* renamed from: b */
        final /* synthetic */ String f20727b;
        /* renamed from: c */
        final /* synthetic */ Leniency f20728c;
        /* renamed from: d */
        final /* synthetic */ long f20729d;
        /* renamed from: e */
        final /* synthetic */ PhoneNumberUtil f20730e;

        public Iterator<C5625g> iterator() {
            return new PhoneNumberMatcher(this.f20730e, this.f20726a, this.f20727b, this.f20728c, this.f20729d);
        }
    }

    /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$2 */
    static /* synthetic */ class C56192 {
        /* renamed from: a */
        static final /* synthetic */ int[] f20731a = new int[CountryCodeSource.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.values();
            r0 = r0.length;
            r0 = new int[r0];
            f20733c = r0;
            r0 = 1;
            r1 = f20733c;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PREMIUM_RATE;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = f20733c;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.TOLL_FREE;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = f20733c;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.MOBILE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.FIXED_LINE_OR_MOBILE;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r6 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.SHARED_COST;	 Catch:{ NoSuchFieldError -> 0x004b }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
            r6 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOIP;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
            r6 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0056 }
        L_0x0056:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PERSONAL_NUMBER;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
            r6 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0062 }
        L_0x0062:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.PAGER;	 Catch:{ NoSuchFieldError -> 0x006e }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
            r6 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x006e }
        L_0x006e:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.UAN;	 Catch:{ NoSuchFieldError -> 0x007a }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
            r6 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x007a }
        L_0x007a:
            r4 = f20733c;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType.VOICEMAIL;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
            r6 = 11;	 Catch:{ NoSuchFieldError -> 0x0086 }
            r4[r5] = r6;	 Catch:{ NoSuchFieldError -> 0x0086 }
        L_0x0086:
            r4 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.values();
            r4 = r4.length;
            r4 = new int[r4];
            f20732b = r4;
            r4 = f20732b;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.E164;	 Catch:{ NoSuchFieldError -> 0x0099 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0099 }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0099 }
        L_0x0099:
            r4 = f20732b;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL;	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00a3 }
            r4[r5] = r1;	 Catch:{ NoSuchFieldError -> 0x00a3 }
        L_0x00a3:
            r4 = f20732b;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.RFC3966;	 Catch:{ NoSuchFieldError -> 0x00ad }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ad }
            r4[r5] = r2;	 Catch:{ NoSuchFieldError -> 0x00ad }
        L_0x00ad:
            r4 = f20732b;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r5 = com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat.NATIONAL;	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b7 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x00b7 }
        L_0x00b7:
            r4 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.values();
            r4 = r4.length;
            r4 = new int[r4];
            f20731a = r4;
            r4 = f20731a;	 Catch:{ NoSuchFieldError -> 0x00ca }
            r5 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;	 Catch:{ NoSuchFieldError -> 0x00ca }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ca }
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x00ca }
        L_0x00ca:
            r0 = f20731a;	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r4 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD;	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x00d4 }
            r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x00d4 }
        L_0x00d4:
            r0 = f20731a;	 Catch:{ NoSuchFieldError -> 0x00de }
            r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN;	 Catch:{ NoSuchFieldError -> 0x00de }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00de }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00de }
        L_0x00de:
            r0 = f20731a;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = com.google.i18n.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY;	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00e8 }
            r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x00e8 }
        L_0x00e8:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.2.<clinit>():void");
        }
    }

    public enum Leniency {
        POSSIBLE {
            boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                return phoneNumberUtil.m24535d(phoneNumber);
            }
        },
        VALID {
            boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                if (phoneNumberUtil.m24531b(phoneNumber)) {
                    if (PhoneNumberMatcher.m24466a(phoneNumber, charSequence.toString(), phoneNumberUtil) != null) {
                        return PhoneNumberMatcher.m24463a(phoneNumber, phoneNumberUtil);
                    }
                }
                return null;
            }
        },
        STRICT_GROUPING {

            /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$Leniency$3$1 */
            class C69461 implements C5617a {
                /* renamed from: a */
                final /* synthetic */ C69473 f25445a;

                C69461(C69473 c69473) {
                    this.f25445a = c69473;
                }

                /* renamed from: a */
                public boolean mo5922a(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder stringBuilder, String[] strArr) {
                    return PhoneNumberMatcher.m24462a(phoneNumberUtil, phoneNumber, stringBuilder, strArr);
                }
            }

            boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                String charSequence2 = charSequence.toString();
                if (phoneNumberUtil.m24531b(phoneNumber) && PhoneNumberMatcher.m24466a(phoneNumber, charSequence2, phoneNumberUtil) && !PhoneNumberMatcher.m24465a(phoneNumber, charSequence2)) {
                    if (PhoneNumberMatcher.m24463a(phoneNumber, phoneNumberUtil)) {
                        return PhoneNumberMatcher.m24464a(phoneNumber, charSequence, phoneNumberUtil, new C69461(this));
                    }
                }
                return null;
            }
        },
        EXACT_GROUPING {

            /* renamed from: com.google.i18n.phonenumbers.PhoneNumberUtil$Leniency$4$1 */
            class C69481 implements C5617a {
                /* renamed from: a */
                final /* synthetic */ C69494 f25446a;

                C69481(C69494 c69494) {
                    this.f25446a = c69494;
                }

                /* renamed from: a */
                public boolean mo5922a(PhoneNumberUtil phoneNumberUtil, PhoneNumber phoneNumber, StringBuilder stringBuilder, String[] strArr) {
                    return PhoneNumberMatcher.m24470b(phoneNumberUtil, phoneNumber, stringBuilder, strArr);
                }
            }

            boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil) {
                String charSequence2 = charSequence.toString();
                if (phoneNumberUtil.m24531b(phoneNumber) && PhoneNumberMatcher.m24466a(phoneNumber, charSequence2, phoneNumberUtil) && !PhoneNumberMatcher.m24465a(phoneNumber, charSequence2)) {
                    if (PhoneNumberMatcher.m24463a(phoneNumber, phoneNumberUtil)) {
                        return PhoneNumberMatcher.m24464a(phoneNumber, charSequence, phoneNumberUtil, new C69481(this));
                    }
                }
                return null;
            }
        };

        abstract boolean verify(PhoneNumber phoneNumber, CharSequence charSequence, PhoneNumberUtil phoneNumberUtil);
    }

    public enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH
    }

    public enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966
    }

    public enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN
    }

    public enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG
    }

    static {
        Map hashMap = new HashMap();
        hashMap.put(Integer.valueOf(52), "1");
        hashMap.put(Integer.valueOf(54), "9");
        f20740g = Collections.unmodifiableMap(hashMap);
        Collection hashSet = new HashSet();
        hashSet.add(Integer.valueOf(86));
        f20741h = Collections.unmodifiableSet(hashSet);
        Set hashSet2 = new HashSet();
        hashSet2.add(Integer.valueOf(52));
        hashSet2.add(Integer.valueOf(54));
        hashSet2.add(Integer.valueOf(55));
        hashSet2.add(Integer.valueOf(62));
        hashSet2.addAll(hashSet);
        f20742i = Collections.unmodifiableSet(hashSet2);
        hashMap = new HashMap();
        hashMap.put(Character.valueOf('0'), Character.valueOf('0'));
        hashMap.put(Character.valueOf('1'), Character.valueOf('1'));
        hashMap.put(Character.valueOf('2'), Character.valueOf('2'));
        hashMap.put(Character.valueOf('3'), Character.valueOf('3'));
        hashMap.put(Character.valueOf('4'), Character.valueOf('4'));
        hashMap.put(Character.valueOf('5'), Character.valueOf('5'));
        hashMap.put(Character.valueOf('6'), Character.valueOf('6'));
        hashMap.put(Character.valueOf('7'), Character.valueOf('7'));
        hashMap.put(Character.valueOf('8'), Character.valueOf('8'));
        hashMap.put(Character.valueOf('9'), Character.valueOf('9'));
        Map hashMap2 = new HashMap(40);
        hashMap2.put(Character.valueOf('A'), Character.valueOf('2'));
        hashMap2.put(Character.valueOf('B'), Character.valueOf('2'));
        hashMap2.put(Character.valueOf('C'), Character.valueOf('2'));
        hashMap2.put(Character.valueOf('D'), Character.valueOf('3'));
        hashMap2.put(Character.valueOf('E'), Character.valueOf('3'));
        hashMap2.put(Character.valueOf('F'), Character.valueOf('3'));
        hashMap2.put(Character.valueOf('G'), Character.valueOf('4'));
        hashMap2.put(Character.valueOf('H'), Character.valueOf('4'));
        hashMap2.put(Character.valueOf('I'), Character.valueOf('4'));
        hashMap2.put(Character.valueOf('J'), Character.valueOf('5'));
        hashMap2.put(Character.valueOf('K'), Character.valueOf('5'));
        hashMap2.put(Character.valueOf('L'), Character.valueOf('5'));
        hashMap2.put(Character.valueOf('M'), Character.valueOf('6'));
        hashMap2.put(Character.valueOf('N'), Character.valueOf('6'));
        hashMap2.put(Character.valueOf('O'), Character.valueOf('6'));
        hashMap2.put(Character.valueOf('P'), Character.valueOf('7'));
        hashMap2.put(Character.valueOf('Q'), Character.valueOf('7'));
        hashMap2.put(Character.valueOf('R'), Character.valueOf('7'));
        hashMap2.put(Character.valueOf('S'), Character.valueOf('7'));
        hashMap2.put(Character.valueOf('T'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('U'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('V'), Character.valueOf('8'));
        hashMap2.put(Character.valueOf('W'), Character.valueOf('9'));
        hashMap2.put(Character.valueOf('X'), Character.valueOf('9'));
        hashMap2.put(Character.valueOf('Y'), Character.valueOf('9'));
        hashMap2.put(Character.valueOf('Z'), Character.valueOf('9'));
        f20744k = Collections.unmodifiableMap(hashMap2);
        Map hashMap3 = new HashMap(100);
        hashMap3.putAll(f20744k);
        hashMap3.putAll(hashMap);
        f20745l = Collections.unmodifiableMap(hashMap3);
        hashMap3 = new HashMap();
        hashMap3.putAll(hashMap);
        hashMap3.put(Character.valueOf('+'), Character.valueOf('+'));
        hashMap3.put(Character.valueOf('*'), Character.valueOf('*'));
        hashMap3.put(Character.valueOf('#'), Character.valueOf('#'));
        f20743j = Collections.unmodifiableMap(hashMap3);
        hashMap3 = new HashMap();
        for (Character charValue : f20744k.keySet()) {
            char charValue2 = charValue.charValue();
            hashMap3.put(Character.valueOf(Character.toLowerCase(charValue2)), Character.valueOf(charValue2));
            hashMap3.put(Character.valueOf(charValue2), Character.valueOf(charValue2));
        }
        hashMap3.putAll(hashMap);
        hashMap3.put(Character.valueOf('-'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('－'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('‐'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('‑'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('‒'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('–'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('—'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('―'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('−'), Character.valueOf('-'));
        hashMap3.put(Character.valueOf('/'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf('／'), Character.valueOf('/'));
        hashMap3.put(Character.valueOf(' '), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('　'), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('⁠'), Character.valueOf(' '));
        hashMap3.put(Character.valueOf('.'), Character.valueOf('.'));
        hashMap3.put(Character.valueOf('．'), Character.valueOf('.'));
        f20746m = Collections.unmodifiableMap(hashMap3);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Arrays.toString(f20744k.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        stringBuilder.append(Arrays.toString(f20744k.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        f20748o = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        stringBuilder.append(f20748o);
        stringBuilder.append("\\p{Nd}");
        stringBuilder.append("]*");
        f20753t = stringBuilder.toString();
        String str = "xｘ#＃~～";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(",;");
        stringBuilder2.append(str);
        f20754u = m24502e(stringBuilder2.toString());
        f20737d = m24502e(str);
        stringBuilder = new StringBuilder();
        stringBuilder.append("(?:");
        stringBuilder.append(f20754u);
        stringBuilder.append(")$");
        f20755v = Pattern.compile(stringBuilder.toString(), 66);
        stringBuilder = new StringBuilder();
        stringBuilder.append(f20753t);
        stringBuilder.append("(?:");
        stringBuilder.append(f20754u);
        stringBuilder.append(")?");
        f20756w = Pattern.compile(stringBuilder.toString(), 66);
    }

    /* renamed from: e */
    private static String m24502e(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[");
        stringBuilder.append(str);
        stringBuilder.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        stringBuilder.append("(\\p{Nd}{1,7})");
        stringBuilder.append("#?|[- ]+(");
        stringBuilder.append("\\p{Nd}");
        stringBuilder.append("{1,5})#");
        return stringBuilder.toString();
    }

    PhoneNumberUtil(C5624e c5624e, Map<Integer, List<String>> map) {
        this.f20760A = c5624e;
        this.f20761B = map;
        for (Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0))) {
                this.f20766G.add(entry.getKey());
            } else {
                this.f20765F.addAll(list);
            }
        }
        if (this.f20765F.remove("001") != null) {
            f20739f.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.f20763D.addAll((Collection) map.get(Integer.valueOf(1)));
    }

    /* renamed from: a */
    static CharSequence m24479a(CharSequence charSequence) {
        Matcher matcher = f20751r.matcher(charSequence);
        if (!matcher.find()) {
            return "";
        }
        charSequence = charSequence.subSequence(matcher.start(), charSequence.length());
        matcher = f20736c.matcher(charSequence);
        if (matcher.find()) {
            charSequence = charSequence.subSequence(0, matcher.start());
        }
        matcher = f20735b.matcher(charSequence);
        if (matcher.find()) {
            charSequence = charSequence.subSequence(0, matcher.start());
        }
        return charSequence;
    }

    /* renamed from: b */
    static boolean m24498b(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return null;
        }
        return f20756w.matcher(charSequence).matches();
    }

    /* renamed from: a */
    static StringBuilder m24486a(StringBuilder stringBuilder) {
        if (f20752s.matcher(stringBuilder).matches()) {
            stringBuilder.replace(0, stringBuilder.length(), m24481a((CharSequence) stringBuilder, f20745l, true));
        } else {
            stringBuilder.replace(0, stringBuilder.length(), m24499c((CharSequence) stringBuilder));
        }
        return stringBuilder;
    }

    /* renamed from: c */
    public static String m24499c(CharSequence charSequence) {
        return m24485a(charSequence, false).toString();
    }

    /* renamed from: a */
    static StringBuilder m24485a(CharSequence charSequence, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            int digit = Character.digit(charAt, 10);
            if (digit != -1) {
                stringBuilder.append(digit);
            } else if (z) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder;
    }

    /* renamed from: a */
    private static String m24481a(CharSequence charSequence, Map<Character, Character> map, boolean z) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            Character ch = (Character) map.get(Character.valueOf(Character.toUpperCase(charAt)));
            if (ch != null) {
                stringBuilder.append(ch);
            } else if (!z) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static synchronized void m24488a(PhoneNumberUtil phoneNumberUtil) {
        synchronized (PhoneNumberUtil.class) {
            f20759z = phoneNumberUtil;
        }
    }

    /* renamed from: a */
    public Set<String> m24520a() {
        return Collections.unmodifiableSet(this.f20765F);
    }

    /* renamed from: a */
    private static boolean m24493a(PhoneNumberDesc phoneNumberDesc) {
        return (phoneNumberDesc.m24613c() == 1 && phoneNumberDesc.m24608a(0) == -1) ? false : true;
    }

    /* renamed from: b */
    public static synchronized PhoneNumberUtil m24496b() {
        PhoneNumberUtil phoneNumberUtil;
        synchronized (PhoneNumberUtil.class) {
            if (f20759z == null) {
                m24488a(m24476a(C5623d.f20886a));
            }
            phoneNumberUtil = f20759z;
        }
        return phoneNumberUtil;
    }

    /* renamed from: a */
    public static PhoneNumberUtil m24476a(MetadataLoader metadataLoader) {
        if (metadataLoader != null) {
            return m24477a(new C6951f(metadataLoader));
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
    }

    /* renamed from: a */
    private static PhoneNumberUtil m24477a(C5624e c5624e) {
        if (c5624e != null) {
            return new PhoneNumberUtil(c5624e, C5622c.m24668a());
        }
        throw new IllegalArgumentException("metadataSource could not be null.");
    }

    /* renamed from: a */
    static boolean m24494a(String str) {
        if (str.length() != 0) {
            if (f20758y.matcher(str).matches() == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: f */
    private boolean m24504f(String str) {
        return (str == null || this.f20765F.contains(str) == null) ? null : true;
    }

    /* renamed from: c */
    private boolean m24500c(int i) {
        return this.f20761B.containsKey(Integer.valueOf(i));
    }

    /* renamed from: a */
    public String m24517a(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat) {
        if (phoneNumber.m24623b() == 0 && phoneNumber.m24633i()) {
            String j = phoneNumber.m24634j();
            if (j.length() > 0) {
                return j;
            }
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        m24521a(phoneNumber, phoneNumberFormat, stringBuilder);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public void m24521a(PhoneNumber phoneNumber, PhoneNumberFormat phoneNumberFormat, StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        int a = phoneNumber.m24616a();
        String a2 = m24516a(phoneNumber);
        if (phoneNumberFormat == PhoneNumberFormat.E164) {
            stringBuilder.append(a2);
            m24487a(a, PhoneNumberFormat.E164, stringBuilder);
        } else if (m24500c(a)) {
            PhoneMetadata a3 = m24478a(a, m24528b(a));
            stringBuilder.append(m24483a(a2, a3, phoneNumberFormat));
            m24489a(phoneNumber, a3, phoneNumberFormat, stringBuilder);
            m24487a(a, phoneNumberFormat, stringBuilder);
        } else {
            stringBuilder.append(a2);
        }
    }

    /* renamed from: a */
    private PhoneMetadata m24478a(int i, String str) {
        if ("001".equals(str)) {
            return m24512a(i);
        }
        return m24526b(str);
    }

    /* renamed from: a */
    public String m24516a(PhoneNumber phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        if (phoneNumber.m24630f() && phoneNumber.m24632h() > 0) {
            char[] cArr = new char[phoneNumber.m24632h()];
            Arrays.fill(cArr, '0');
            stringBuilder.append(new String(cArr));
        }
        stringBuilder.append(phoneNumber.m24623b());
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m24487a(int i, PhoneNumberFormat phoneNumberFormat, StringBuilder stringBuilder) {
        switch (phoneNumberFormat) {
            case E164:
                stringBuilder.insert(0, i).insert(0, '+');
                return;
            case INTERNATIONAL:
                stringBuilder.insert(0, " ").insert(0, i).insert(0, '+');
                return;
            case RFC3966:
                stringBuilder.insert(0, "-").insert(0, i).insert(0, '+').insert(0, "tel:");
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private String m24483a(String str, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat) {
        return m24484a(str, phoneMetadata, phoneNumberFormat, null);
    }

    /* renamed from: a */
    private String m24484a(String str, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        List x;
        NumberFormat a;
        if (phoneMetadata.m24603x().size() != 0) {
            if (phoneNumberFormat != PhoneNumberFormat.NATIONAL) {
                x = phoneMetadata.m24603x();
                a = m24511a(x, str);
                return a != null ? str : m24482a(str, a, phoneNumberFormat, charSequence);
            }
        }
        x = phoneMetadata.m24601v();
        a = m24511a(x, str);
        if (a != null) {
        }
    }

    /* renamed from: a */
    NumberFormat m24511a(List<NumberFormat> list, String str) {
        for (NumberFormat numberFormat : list) {
            int c = numberFormat.m24543c();
            if ((c == 0 || this.f20764E.m24681a(numberFormat.m24540a(c - 1)).matcher(str).lookingAt()) && this.f20764E.m24681a(numberFormat.m24539a()).matcher(str).matches()) {
                return numberFormat;
            }
        }
        return null;
    }

    /* renamed from: a */
    String m24518a(String str, NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat) {
        return m24482a(str, numberFormat, phoneNumberFormat, null);
    }

    /* renamed from: a */
    private String m24482a(String str, NumberFormat numberFormat, PhoneNumberFormat phoneNumberFormat, CharSequence charSequence) {
        Object b = numberFormat.m24542b();
        str = this.f20764E.m24681a(numberFormat.m24539a()).matcher(str);
        if (phoneNumberFormat != PhoneNumberFormat.NATIONAL || charSequence == null || charSequence.length() <= 0 || numberFormat.m24548f().length() <= 0) {
            numberFormat = numberFormat.m24546d();
            if (phoneNumberFormat != PhoneNumberFormat.NATIONAL || numberFormat == null || numberFormat.length() <= null) {
                str = str.replaceAll(b);
            } else {
                str = str.replaceAll(f20757x.matcher(b).replaceFirst(numberFormat));
            }
        } else {
            str = str.replaceAll(f20757x.matcher(b).replaceFirst(numberFormat.m24548f().replace("$CC", charSequence)));
        }
        if (phoneNumberFormat != PhoneNumberFormat.RFC3966) {
            return str;
        }
        numberFormat = f20749p.matcher(str);
        if (numberFormat.lookingAt() != null) {
            str = numberFormat.replaceFirst("");
        }
        return numberFormat.reset(str).replaceAll("-");
    }

    /* renamed from: a */
    private void m24489a(PhoneNumber phoneNumber, PhoneMetadata phoneMetadata, PhoneNumberFormat phoneNumberFormat, StringBuilder stringBuilder) {
        if (phoneNumber.m24627c() && phoneNumber.m24628d().length() > 0) {
            if (phoneNumberFormat == PhoneNumberFormat.RFC3966) {
                stringBuilder.append(";ext=");
                stringBuilder.append(phoneNumber.m24628d());
            } else if (phoneMetadata.m24594p() != null) {
                stringBuilder.append(phoneMetadata.m24596q());
                stringBuilder.append(phoneNumber.m24628d());
            } else {
                stringBuilder.append(" ext. ");
                stringBuilder.append(phoneNumber.m24628d());
            }
        }
    }

    /* renamed from: a */
    PhoneNumberDesc m24513a(PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        switch (phoneNumberType) {
            case PREMIUM_RATE:
                return phoneMetadata.m24569e();
            case TOLL_FREE:
                return phoneMetadata.m24566d();
            case MOBILE:
                return phoneMetadata.m24562c();
            case FIXED_LINE:
            case FIXED_LINE_OR_MOBILE:
                return phoneMetadata.m24558b();
            case SHARED_COST:
                return phoneMetadata.m24572f();
            case VOIP:
                return phoneMetadata.m24578h();
            case PERSONAL_NUMBER:
                return phoneMetadata.m24575g();
            case PAGER:
                return phoneMetadata.m24580i();
            case UAN:
                return phoneMetadata.m24582j();
            case VOICEMAIL:
                return phoneMetadata.m24584k();
            default:
                return phoneMetadata.m24554a();
        }
    }

    /* renamed from: a */
    private PhoneNumberType m24473a(String str, PhoneMetadata phoneMetadata) {
        if (!m24524a(str, phoneMetadata.m24554a())) {
            return PhoneNumberType.UNKNOWN;
        }
        if (m24524a(str, phoneMetadata.m24569e())) {
            return PhoneNumberType.PREMIUM_RATE;
        }
        if (m24524a(str, phoneMetadata.m24566d())) {
            return PhoneNumberType.TOLL_FREE;
        }
        if (m24524a(str, phoneMetadata.m24572f())) {
            return PhoneNumberType.SHARED_COST;
        }
        if (m24524a(str, phoneMetadata.m24578h())) {
            return PhoneNumberType.VOIP;
        }
        if (m24524a(str, phoneMetadata.m24575g())) {
            return PhoneNumberType.PERSONAL_NUMBER;
        }
        if (m24524a(str, phoneMetadata.m24580i())) {
            return PhoneNumberType.PAGER;
        }
        if (m24524a(str, phoneMetadata.m24582j())) {
            return PhoneNumberType.UAN;
        }
        if (m24524a(str, phoneMetadata.m24584k())) {
            return PhoneNumberType.VOICEMAIL;
        }
        if (m24524a(str, phoneMetadata.m24558b())) {
            if (phoneMetadata.m24600u()) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            if (m24524a(str, phoneMetadata.m24562c()) != null) {
                return PhoneNumberType.FIXED_LINE_OR_MOBILE;
            }
            return PhoneNumberType.FIXED_LINE;
        } else if (phoneMetadata.m24600u() || m24524a(str, phoneMetadata.m24562c()) == null) {
            return PhoneNumberType.UNKNOWN;
        } else {
            return PhoneNumberType.MOBILE;
        }
    }

    /* renamed from: b */
    PhoneMetadata m24526b(String str) {
        if (m24504f(str)) {
            return this.f20760A.mo5925a(str);
        }
        return null;
    }

    /* renamed from: a */
    PhoneMetadata m24512a(int i) {
        if (this.f20761B.containsKey(Integer.valueOf(i))) {
            return this.f20760A.mo5924a(i);
        }
        return 0;
    }

    /* renamed from: a */
    boolean m24524a(String str, PhoneNumberDesc phoneNumberDesc) {
        int length = str.length();
        List b = phoneNumberDesc.m24612b();
        if (b.size() <= 0 || b.contains(Integer.valueOf(length))) {
            return this.f20762C.matchNationalNumber(str, phoneNumberDesc, false);
        }
        return false;
    }

    /* renamed from: b */
    public boolean m24531b(PhoneNumber phoneNumber) {
        return m24523a(phoneNumber, m24533c(phoneNumber));
    }

    /* renamed from: a */
    public boolean m24523a(PhoneNumber phoneNumber, String str) {
        int a = phoneNumber.m24616a();
        PhoneMetadata a2 = m24478a(a, str);
        boolean z = false;
        if (a2 != null) {
            if ("001".equals(str) || a == m24505g(str)) {
                if (m24473a(m24516a(phoneNumber), a2) != PhoneNumberType.UNKNOWN) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String m24533c(PhoneNumber phoneNumber) {
        int a = phoneNumber.m24616a();
        List list = (List) this.f20761B.get(Integer.valueOf(a));
        if (list == null) {
            phoneNumber = f20739f;
            Level level = Level.INFO;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Missing/invalid country_code (");
            stringBuilder.append(a);
            stringBuilder.append(")");
            phoneNumber.log(level, stringBuilder.toString());
            return null;
        } else if (list.size() == 1) {
            return (String) list.get(null);
        } else {
            return m24480a(phoneNumber, list);
        }
    }

    /* renamed from: a */
    private String m24480a(PhoneNumber phoneNumber, List<String> list) {
        String a = m24516a(phoneNumber);
        for (String str : list) {
            PhoneMetadata b = m24526b(str);
            if (b.m24605z()) {
                if (this.f20764E.m24681a(b.m24549A()).matcher(a).lookingAt()) {
                    return str;
                }
            } else if (m24473a(a, b) != PhoneNumberType.UNKNOWN) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m24528b(int i) {
        List list = (List) this.f20761B.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) list.get(0);
    }

    /* renamed from: c */
    public int m24532c(String str) {
        if (m24504f(str)) {
            return m24505g(str);
        }
        Logger logger = f20739f;
        Level level = Level.WARNING;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid or missing region code (");
        if (str == null) {
            str = ManagerWebServices.NULL_STRING_VALUE;
        }
        stringBuilder.append(str);
        stringBuilder.append(") provided.");
        logger.log(level, stringBuilder.toString());
        return null;
    }

    /* renamed from: g */
    private int m24505g(String str) {
        PhoneMetadata b = m24526b(str);
        if (b != null) {
            return b.m24585l();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid region code: ");
        stringBuilder.append(str);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    public String m24519a(String str, boolean z) {
        PhoneMetadata b = m24526b(str);
        if (b == null) {
            z = f20739f;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid or missing region code (");
            if (str == null) {
                str = ManagerWebServices.NULL_STRING_VALUE;
            }
            stringBuilder.append(str);
            stringBuilder.append(") provided.");
            z.log(level, stringBuilder.toString());
            return null;
        }
        str = b.m24592o();
        if (str.length() == 0) {
            return null;
        }
        if (z) {
            str = str.replace("~", "");
        }
        return str;
    }

    /* renamed from: d */
    public boolean m24535d(PhoneNumber phoneNumber) {
        phoneNumber = m24536e(phoneNumber);
        if (phoneNumber != ValidationResult.IS_POSSIBLE) {
            if (phoneNumber != ValidationResult.IS_POSSIBLE_LOCAL_ONLY) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private ValidationResult m24474a(CharSequence charSequence, PhoneMetadata phoneMetadata) {
        return m24475a(charSequence, phoneMetadata, PhoneNumberType.UNKNOWN);
    }

    /* renamed from: a */
    private ValidationResult m24475a(CharSequence charSequence, PhoneMetadata phoneMetadata, PhoneNumberType phoneNumberType) {
        List arrayList;
        PhoneMetadata length;
        PhoneNumberDesc a = m24513a(phoneMetadata, phoneNumberType);
        Collection b = a.m24612b().isEmpty() ? phoneMetadata.m24554a().m24612b() : a.m24612b();
        List d = a.m24614d();
        if (phoneNumberType == PhoneNumberType.FIXED_LINE_OR_MOBILE) {
            if (m24493a(m24513a(phoneMetadata, PhoneNumberType.FIXED_LINE)) == null) {
                return m24475a(charSequence, phoneMetadata, PhoneNumberType.MOBILE);
            }
            PhoneNumberDesc a2 = m24513a(phoneMetadata, PhoneNumberType.MOBILE);
            if (m24493a(a2)) {
                arrayList = new ArrayList(b);
                if (a2.m24612b().size() == 0) {
                    phoneMetadata = phoneMetadata.m24554a().m24612b();
                } else {
                    phoneMetadata = a2.m24612b();
                }
                arrayList.addAll(phoneMetadata);
                Collections.sort(arrayList);
                if (d.isEmpty() != null) {
                    d = a2.m24614d();
                } else {
                    phoneMetadata = new ArrayList(d);
                    phoneMetadata.addAll(a2.m24614d());
                    Collections.sort(phoneMetadata);
                    d = phoneMetadata;
                }
                if (((Integer) arrayList.get(0)).intValue() == -1) {
                    return ValidationResult.INVALID_LENGTH;
                }
                length = charSequence.length();
                if (d.contains(Integer.valueOf(length)) != null) {
                    return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
                }
                phoneMetadata = ((Integer) arrayList.get(0)).intValue();
                if (phoneMetadata == length) {
                    return ValidationResult.IS_POSSIBLE;
                }
                if (phoneMetadata > length) {
                    return ValidationResult.TOO_SHORT;
                }
                if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
                    return ValidationResult.TOO_LONG;
                }
                return arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) == null ? ValidationResult.IS_POSSIBLE : ValidationResult.INVALID_LENGTH;
            }
        }
        arrayList = b;
        if (((Integer) arrayList.get(0)).intValue() == -1) {
            return ValidationResult.INVALID_LENGTH;
        }
        length = charSequence.length();
        if (d.contains(Integer.valueOf(length)) != null) {
            return ValidationResult.IS_POSSIBLE_LOCAL_ONLY;
        }
        phoneMetadata = ((Integer) arrayList.get(0)).intValue();
        if (phoneMetadata == length) {
            return ValidationResult.IS_POSSIBLE;
        }
        if (phoneMetadata > length) {
            return ValidationResult.TOO_SHORT;
        }
        if (((Integer) arrayList.get(arrayList.size() - 1)).intValue() < length) {
            return ValidationResult.TOO_LONG;
        }
        if (arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) == null) {
        }
        return arrayList.subList(1, arrayList.size()).contains(Integer.valueOf(length)) == null ? ValidationResult.IS_POSSIBLE : ValidationResult.INVALID_LENGTH;
    }

    /* renamed from: e */
    public ValidationResult m24536e(PhoneNumber phoneNumber) {
        return m24510a(phoneNumber, PhoneNumberType.UNKNOWN);
    }

    /* renamed from: a */
    public ValidationResult m24510a(PhoneNumber phoneNumber, PhoneNumberType phoneNumberType) {
        CharSequence a = m24516a(phoneNumber);
        int a2 = phoneNumber.m24616a();
        if (m24500c(a2)) {
            return m24475a(a, m24478a(a2, m24528b(a2)), phoneNumberType);
        }
        return ValidationResult.INVALID_COUNTRY_CODE;
    }

    /* renamed from: d */
    public C5621b m24534d(String str) {
        return new C5621b(str);
    }

    /* renamed from: a */
    int m24507a(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        if (stringBuilder.length() != 0) {
            if (stringBuilder.charAt(0) != '0') {
                int length = stringBuilder.length();
                int i = 1;
                while (i <= 3 && i <= length) {
                    int parseInt = Integer.parseInt(stringBuilder.substring(0, i));
                    if (this.f20761B.containsKey(Integer.valueOf(parseInt))) {
                        stringBuilder2.append(stringBuilder.substring(i));
                        return parseInt;
                    }
                    i++;
                }
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: a */
    int m24506a(CharSequence charSequence, PhoneMetadata phoneMetadata, StringBuilder stringBuilder, boolean z, PhoneNumber phoneNumber) throws NumberParseException {
        if (charSequence.length() == 0) {
            return 0;
        }
        CharSequence stringBuilder2 = new StringBuilder(charSequence);
        String str = "NonMatch";
        if (phoneMetadata != null) {
            str = phoneMetadata.m24588m();
        }
        CountryCodeSource a = m24514a((StringBuilder) stringBuilder2, str);
        if (z) {
            phoneNumber.m24619a(a);
        }
        int l;
        if (a == CountryCodeSource.FROM_DEFAULT_COUNTRY) {
            if (phoneMetadata != null) {
                l = phoneMetadata.m24585l();
                String valueOf = String.valueOf(l);
                String stringBuilder3 = stringBuilder2.toString();
                if (stringBuilder3.startsWith(valueOf)) {
                    StringBuilder stringBuilder4 = new StringBuilder(stringBuilder3.substring(valueOf.length()));
                    PhoneNumberDesc a2 = phoneMetadata.m24554a();
                    m24525a(stringBuilder4, phoneMetadata, null);
                    if ((!this.f20762C.matchNationalNumber(stringBuilder2, a2, false) && this.f20762C.matchNationalNumber(stringBuilder4, a2, false)) || m24474a(stringBuilder2, phoneMetadata) == ValidationResult.TOO_LONG) {
                        stringBuilder.append(stringBuilder4);
                        if (z) {
                            phoneNumber.m24619a(CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN);
                        }
                        phoneNumber.m24617a(l);
                        return l;
                    }
                }
            }
            phoneNumber.m24617a(0);
            return 0;
        } else if (stringBuilder2.length() <= 2) {
            throw new NumberParseException(ErrorType.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        } else {
            l = m24507a((StringBuilder) stringBuilder2, stringBuilder);
            if (l != null) {
                phoneNumber.m24617a(l);
                return l;
            }
            throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
        }
    }

    /* renamed from: a */
    private boolean m24495a(Pattern pattern, StringBuilder stringBuilder) {
        pattern = pattern.matcher(stringBuilder);
        if (!pattern.lookingAt()) {
            return false;
        }
        pattern = pattern.end();
        Matcher matcher = f20750q.matcher(stringBuilder.substring(pattern));
        if (matcher.find() && m24499c(matcher.group(1)).equals("0")) {
            return false;
        }
        stringBuilder.delete(0, pattern);
        return true;
    }

    /* renamed from: a */
    CountryCodeSource m24514a(StringBuilder stringBuilder, String str) {
        if (stringBuilder.length() == 0) {
            return CountryCodeSource.FROM_DEFAULT_COUNTRY;
        }
        Matcher matcher = f20734a.matcher(stringBuilder);
        if (matcher.lookingAt()) {
            stringBuilder.delete(null, matcher.end());
            m24486a(stringBuilder);
            return CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
        }
        Pattern a = this.f20764E.m24681a(str);
        m24486a(stringBuilder);
        return m24495a(a, stringBuilder) != null ? CountryCodeSource.FROM_NUMBER_WITH_IDD : CountryCodeSource.FROM_DEFAULT_COUNTRY;
    }

    /* renamed from: a */
    boolean m24525a(StringBuilder stringBuilder, PhoneMetadata phoneMetadata, StringBuilder stringBuilder2) {
        int length = stringBuilder.length();
        String s = phoneMetadata.m24598s();
        if (length != 0) {
            if (s.length() != 0) {
                Matcher matcher = this.f20764E.m24681a(s).matcher(stringBuilder);
                if (!matcher.lookingAt()) {
                    return false;
                }
                PhoneNumberDesc a = phoneMetadata.m24554a();
                boolean matchNationalNumber = this.f20762C.matchNationalNumber(stringBuilder, a, false);
                int groupCount = matcher.groupCount();
                phoneMetadata = phoneMetadata.m24599t();
                if (!(phoneMetadata == null || phoneMetadata.length() == 0)) {
                    if (matcher.group(groupCount) != null) {
                        StringBuilder stringBuilder3 = new StringBuilder(stringBuilder);
                        stringBuilder3.replace(0, length, matcher.replaceFirst(phoneMetadata));
                        if (matchNationalNumber && this.f20762C.matchNationalNumber(stringBuilder3.toString(), a, false) == null) {
                            return false;
                        }
                        if (stringBuilder2 != null && groupCount > 1) {
                            stringBuilder2.append(matcher.group(1));
                        }
                        stringBuilder.replace(0, stringBuilder.length(), stringBuilder3.toString());
                        return true;
                    }
                }
                if (matchNationalNumber && this.f20762C.matchNationalNumber(stringBuilder.substring(matcher.end()), a, false) == null) {
                    return false;
                }
                if (!(stringBuilder2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                    stringBuilder2.append(matcher.group(1));
                }
                stringBuilder.delete(0, matcher.end());
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    String m24529b(StringBuilder stringBuilder) {
        Matcher matcher = f20755v.matcher(stringBuilder);
        if (matcher.find() && m24498b(stringBuilder.substring(0, matcher.start()))) {
            int groupCount = matcher.groupCount();
            for (int i = 1; i <= groupCount; i++) {
                if (matcher.group(i) != null) {
                    String group = matcher.group(i);
                    stringBuilder.delete(matcher.start(), stringBuilder.length());
                    return group;
                }
            }
        }
        return "";
    }

    /* renamed from: c */
    private boolean m24501c(CharSequence charSequence, String str) {
        return (m24504f(str) == null && (charSequence == null || charSequence.length() == null || f20734a.matcher(charSequence).lookingAt() == null)) ? null : true;
    }

    /* renamed from: a */
    public PhoneNumber m24515a(CharSequence charSequence, String str) throws NumberParseException {
        PhoneNumber phoneNumber = new PhoneNumber();
        m24522a(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    /* renamed from: a */
    public void m24522a(CharSequence charSequence, String str, PhoneNumber phoneNumber) throws NumberParseException {
        m24491a(charSequence, str, false, true, phoneNumber);
    }

    /* renamed from: b */
    public PhoneNumber m24527b(CharSequence charSequence, String str) throws NumberParseException {
        PhoneNumber phoneNumber = new PhoneNumber();
        m24530b(charSequence, str, phoneNumber);
        return phoneNumber;
    }

    /* renamed from: b */
    public void m24530b(CharSequence charSequence, String str, PhoneNumber phoneNumber) throws NumberParseException {
        m24491a(charSequence, str, true, true, phoneNumber);
    }

    /* renamed from: a */
    static void m24490a(CharSequence charSequence, PhoneNumber phoneNumber) {
        if (charSequence.length() > 1 && charSequence.charAt(0) == '0') {
            phoneNumber.m24621a(true);
            int i = 1;
            while (i < charSequence.length() - 1 && charSequence.charAt(i) == '0') {
                i++;
            }
            if (i != 1) {
                phoneNumber.m24624b(i);
            }
        }
    }

    /* renamed from: a */
    private void m24491a(CharSequence charSequence, String str, boolean z, boolean z2, PhoneNumber phoneNumber) throws NumberParseException {
        int a;
        if (charSequence == null) {
            throw new NumberParseException(ErrorType.NOT_A_NUMBER, "The phone number supplied was null.");
        } else if (charSequence.length() > Callback.DEFAULT_SWIPE_ANIMATION_DURATION) {
            throw new NumberParseException(ErrorType.TOO_LONG, "The string supplied was too long to parse.");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            String charSequence2 = charSequence.toString();
            m24492a(charSequence2, stringBuilder);
            if (!m24498b((CharSequence) stringBuilder)) {
                throw new NumberParseException(ErrorType.NOT_A_NUMBER, "The string supplied did not seem to be a phone number.");
            } else if (!z2 || m24501c(stringBuilder, str)) {
                if (z) {
                    phoneNumber.m24625b(charSequence2);
                }
                charSequence2 = m24529b(stringBuilder);
                if (charSequence2.length() <= false) {
                    phoneNumber.m24620a(charSequence2);
                }
                PhoneMetadata b = m24526b(str);
                CharSequence stringBuilder2 = new StringBuilder();
                try {
                    a = m24506a((CharSequence) stringBuilder, b, (StringBuilder) stringBuilder2, z, phoneNumber);
                } catch (NumberParseException e) {
                    Matcher matcher = f20734a.matcher(stringBuilder);
                    if (e.m24455a() == ErrorType.INVALID_COUNTRY_CODE && matcher.lookingAt()) {
                        a = m24506a(stringBuilder.substring(matcher.end()), b, (StringBuilder) stringBuilder2, z, phoneNumber);
                        if (a == 0) {
                            throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Could not interpret numbers after plus-sign.");
                        }
                    }
                    throw new NumberParseException(e.m24455a(), e.getMessage());
                }
                if (a != 0) {
                    String b2 = m24528b(a);
                    if (b2.equals(str) == null) {
                        b = m24478a(a, b2);
                    }
                } else {
                    stringBuilder2.append(m24486a(stringBuilder));
                    if (str != null) {
                        phoneNumber.m24617a(b.m24585l());
                    } else if (z) {
                        phoneNumber.m24638n();
                    }
                }
                if (stringBuilder2.length() < 2) {
                    throw new NumberParseException(ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                }
                if (b != null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    CharSequence stringBuilder4 = new StringBuilder(stringBuilder2);
                    m24525a((StringBuilder) stringBuilder4, b, stringBuilder3);
                    charSequence = m24474a(stringBuilder4, b);
                    if (!(charSequence == ValidationResult.TOO_SHORT || charSequence == ValidationResult.IS_POSSIBLE_LOCAL_ONLY || charSequence == ValidationResult.INVALID_LENGTH)) {
                        if (z && stringBuilder3.length() > null) {
                            phoneNumber.m24626c(stringBuilder3.toString());
                        }
                        stringBuilder2 = stringBuilder4;
                    }
                }
                charSequence = stringBuilder2.length();
                if (charSequence < 2) {
                    throw new NumberParseException(ErrorType.TOO_SHORT_NSN, "The string supplied is too short to be a phone number.");
                } else if (charSequence > 17) {
                    throw new NumberParseException(ErrorType.TOO_LONG, "The string supplied is too long to be a phone number.");
                } else {
                    m24490a(stringBuilder2, phoneNumber);
                    phoneNumber.m24618a(Long.parseLong(stringBuilder2.toString()));
                }
            } else {
                throw new NumberParseException(ErrorType.INVALID_COUNTRY_CODE, "Missing or invalid default region.");
            }
        }
    }

    /* renamed from: a */
    private void m24492a(String str, StringBuilder stringBuilder) {
        int indexOf = str.indexOf(";phone-context=");
        if (indexOf >= 0) {
            int length = ";phone-context=".length() + indexOf;
            if (length < str.length() - 1 && str.charAt(length) == '+') {
                int indexOf2 = str.indexOf(59, length);
                if (indexOf2 > 0) {
                    stringBuilder.append(str.substring(length, indexOf2));
                } else {
                    stringBuilder.append(str.substring(length));
                }
            }
            length = str.indexOf("tel:");
            stringBuilder.append(str.substring(length >= 0 ? length + "tel:".length() : 0, indexOf));
        } else {
            stringBuilder.append(m24479a((CharSequence) str));
        }
        str = stringBuilder.indexOf(";isub=");
        if (str > null) {
            stringBuilder.delete(str, stringBuilder.length());
        }
    }

    /* renamed from: f */
    private static PhoneNumber m24503f(PhoneNumber phoneNumber) {
        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.m24617a(phoneNumber.m24616a());
        phoneNumber2.m24618a(phoneNumber.m24623b());
        if (phoneNumber.m24628d().length() > 0) {
            phoneNumber2.m24620a(phoneNumber.m24628d());
        }
        if (phoneNumber.m24630f()) {
            phoneNumber2.m24621a(true);
            phoneNumber2.m24624b(phoneNumber.m24632h());
        }
        return phoneNumber2;
    }

    /* renamed from: a */
    public MatchType m24508a(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        phoneNumber = m24503f(phoneNumber);
        phoneNumber2 = m24503f(phoneNumber2);
        if (phoneNumber.m24627c() && phoneNumber2.m24627c() && !phoneNumber.m24628d().equals(phoneNumber2.m24628d())) {
            return MatchType.NO_MATCH;
        }
        int a = phoneNumber.m24616a();
        int a2 = phoneNumber2.m24616a();
        if (a == 0 || a2 == 0) {
            phoneNumber.m24617a(a2);
            if (phoneNumber.m24622a(phoneNumber2)) {
                return MatchType.NSN_MATCH;
            }
            if (m24497b(phoneNumber, phoneNumber2) != null) {
                return MatchType.SHORT_NSN_MATCH;
            }
            return MatchType.NO_MATCH;
        } else if (phoneNumber.m24622a(phoneNumber2)) {
            return MatchType.EXACT_MATCH;
        } else {
            if (a != a2 || m24497b(phoneNumber, phoneNumber2) == null) {
                return MatchType.NO_MATCH;
            }
            return MatchType.SHORT_NSN_MATCH;
        }
    }

    /* renamed from: b */
    private boolean m24497b(PhoneNumber phoneNumber, PhoneNumber phoneNumber2) {
        phoneNumber = String.valueOf(phoneNumber.m24623b());
        phoneNumber2 = String.valueOf(phoneNumber2.m24623b());
        if (!phoneNumber.endsWith(phoneNumber2)) {
            if (phoneNumber2.endsWith(phoneNumber) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType m24509a(com.google.i18n.phonenumbers.Phonenumber.PhoneNumber r8, java.lang.CharSequence r9) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r7 = this;
        r0 = "ZZ";	 Catch:{ NumberParseException -> 0x000b }
        r0 = r7.m24515a(r9, r0);	 Catch:{ NumberParseException -> 0x000b }
        r0 = r7.m24508a(r8, r0);	 Catch:{ NumberParseException -> 0x000b }
        return r0;
    L_0x000b:
        r0 = move-exception;
        r0 = r0.m24455a();
        r1 = com.google.i18n.phonenumbers.NumberParseException.ErrorType.INVALID_COUNTRY_CODE;
        if (r0 != r1) goto L_0x0047;
    L_0x0014:
        r0 = r8.m24616a();
        r0 = r7.m24528b(r0);
        r1 = "ZZ";	 Catch:{ NumberParseException -> 0x0047 }
        r1 = r0.equals(r1);	 Catch:{ NumberParseException -> 0x0047 }
        if (r1 != 0) goto L_0x0034;	 Catch:{ NumberParseException -> 0x0047 }
    L_0x0024:
        r9 = r7.m24515a(r9, r0);	 Catch:{ NumberParseException -> 0x0047 }
        r8 = r7.m24508a(r8, r9);	 Catch:{ NumberParseException -> 0x0047 }
        r9 = com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.EXACT_MATCH;	 Catch:{ NumberParseException -> 0x0047 }
        if (r8 != r9) goto L_0x0033;	 Catch:{ NumberParseException -> 0x0047 }
    L_0x0030:
        r8 = com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NSN_MATCH;	 Catch:{ NumberParseException -> 0x0047 }
        return r8;	 Catch:{ NumberParseException -> 0x0047 }
    L_0x0033:
        return r8;	 Catch:{ NumberParseException -> 0x0047 }
    L_0x0034:
        r6 = new com.google.i18n.phonenumbers.Phonenumber$PhoneNumber;	 Catch:{ NumberParseException -> 0x0047 }
        r6.<init>();	 Catch:{ NumberParseException -> 0x0047 }
        r2 = 0;	 Catch:{ NumberParseException -> 0x0047 }
        r3 = 0;	 Catch:{ NumberParseException -> 0x0047 }
        r4 = 0;	 Catch:{ NumberParseException -> 0x0047 }
        r0 = r7;	 Catch:{ NumberParseException -> 0x0047 }
        r1 = r9;	 Catch:{ NumberParseException -> 0x0047 }
        r5 = r6;	 Catch:{ NumberParseException -> 0x0047 }
        r0.m24491a(r1, r2, r3, r4, r5);	 Catch:{ NumberParseException -> 0x0047 }
        r8 = r7.m24508a(r8, r6);	 Catch:{ NumberParseException -> 0x0047 }
        return r8;
    L_0x0047:
        r8 = com.google.i18n.phonenumbers.PhoneNumberUtil.MatchType.NOT_A_NUMBER;
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.i18n.phonenumbers.PhoneNumberUtil.a(com.google.i18n.phonenumbers.Phonenumber$PhoneNumber, java.lang.CharSequence):com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType");
    }
}
