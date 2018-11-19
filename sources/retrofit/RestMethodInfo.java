package retrofit;

import com.tinder.api.ManagerWebServices;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import retrofit.client.C19368b;
import retrofit.http.Body;
import retrofit.http.EncodedPath;
import retrofit.http.EncodedQuery;
import retrofit.http.EncodedQueryMap;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.Header;
import retrofit.http.Part;
import retrofit.http.PartMap;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import rx.Observable;

final class RestMethodInfo {
    /* renamed from: q */
    private static final Pattern f60454q = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    /* renamed from: r */
    private static final Pattern f60455r = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    /* renamed from: a */
    final Method f60456a;
    /* renamed from: b */
    boolean f60457b = false;
    /* renamed from: c */
    final ResponseType f60458c;
    /* renamed from: d */
    final boolean f60459d;
    /* renamed from: e */
    final boolean f60460e;
    /* renamed from: f */
    Type f60461f;
    /* renamed from: g */
    RequestType f60462g = RequestType.SIMPLE;
    /* renamed from: h */
    String f60463h;
    /* renamed from: i */
    boolean f60464i;
    /* renamed from: j */
    String f60465j;
    /* renamed from: k */
    Set<String> f60466k;
    /* renamed from: l */
    String f60467l;
    /* renamed from: m */
    List<C19368b> f60468m;
    /* renamed from: n */
    String f60469n;
    /* renamed from: o */
    boolean f60470o;
    /* renamed from: p */
    Annotation[] f60471p;

    enum RequestType {
        SIMPLE,
        MULTIPART,
        FORM_URL_ENCODED
    }

    private enum ResponseType {
        VOID,
        OBSERVABLE,
        OBJECT
    }

    /* renamed from: retrofit.RestMethodInfo$a */
    private static final class C19358a {
        /* renamed from: a */
        public static boolean m69521a(Class cls) {
            return cls == Observable.class ? true : null;
        }

        /* renamed from: a */
        public static Type m69520a(Type type, Class cls) {
            return C19387h.m69585b(type, cls, Observable.class);
        }
    }

    RestMethodInfo(Method method) {
        boolean z = false;
        this.f60456a = method;
        this.f60458c = m69529c();
        this.f60459d = this.f60458c == ResponseType.OBJECT ? true : null;
        if (this.f60458c == ResponseType.OBSERVABLE) {
            z = true;
        }
        this.f60460e = z;
    }

    /* renamed from: a */
    private RuntimeException m69523a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f60456a.getDeclaringClass().getSimpleName());
        stringBuilder.append(".");
        stringBuilder.append(this.f60456a.getName());
        stringBuilder.append(": ");
        stringBuilder.append(str);
        return new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: a */
    private RuntimeException m69522a(int i, String str, Object... objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" (parameter #");
        stringBuilder.append(i + 1);
        stringBuilder.append(")");
        return m69523a(stringBuilder.toString(), objArr);
    }

    /* renamed from: a */
    synchronized void m69532a() {
        if (!this.f60457b) {
            m69527b();
            m69530d();
            this.f60457b = true;
        }
    }

    /* renamed from: b */
    private void m69527b() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r13 = this;
        r0 = r13.f60456a;
        r0 = r0.getAnnotations();
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
    L_0x0009:
        if (r3 >= r1) goto L_0x00ec;
    L_0x000b:
        r4 = r0[r3];
        r5 = r4.annotationType();
        r6 = 0;
        r7 = r5.getAnnotations();
        r8 = r7.length;
        r9 = 0;
    L_0x0018:
        if (r9 >= r8) goto L_0x002b;
    L_0x001a:
        r10 = r7[r9];
        r11 = retrofit.http.RestMethod.class;
        r12 = r10.annotationType();
        if (r11 != r12) goto L_0x0028;
    L_0x0024:
        r6 = r10;
        r6 = (retrofit.http.RestMethod) r6;
        goto L_0x002b;
    L_0x0028:
        r9 = r9 + 1;
        goto L_0x0018;
    L_0x002b:
        r7 = 2;
        r8 = 1;
        if (r6 == 0) goto L_0x0076;
    L_0x002f:
        r9 = r13.f60463h;
        if (r9 == 0) goto L_0x0046;
    L_0x0033:
        r0 = "Only one HTTP method is allowed. Found: %s and %s.";
        r1 = new java.lang.Object[r7];
        r3 = r13.f60463h;
        r1[r2] = r3;
        r2 = r6.value();
        r1[r8] = r2;
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x0046:
        r7 = "value";	 Catch:{ Exception -> 0x0067 }
        r9 = new java.lang.Class[r2];	 Catch:{ Exception -> 0x0067 }
        r7 = r5.getMethod(r7, r9);	 Catch:{ Exception -> 0x0067 }
        r9 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0067 }
        r4 = r7.invoke(r4, r9);	 Catch:{ Exception -> 0x0067 }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x0067 }
        r13.m69528b(r4);
        r4 = r6.value();
        r13.f60463h = r4;
        r4 = r6.hasBody();
        r13.f60464i = r4;
        goto L_0x00e8;
    L_0x0067:
        r0 = "Failed to extract String 'value' from @%s annotation.";
        r1 = new java.lang.Object[r8];
        r3 = r5.getSimpleName();
        r1[r2] = r3;
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x0076:
        r6 = retrofit.http.Headers.class;
        if (r5 != r6) goto L_0x0093;
    L_0x007a:
        r4 = (retrofit.http.Headers) r4;
        r4 = r4.value();
        r5 = r4.length;
        if (r5 != 0) goto L_0x008c;
    L_0x0083:
        r0 = "@Headers annotation is empty.";
        r1 = new java.lang.Object[r2];
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x008c:
        r4 = r13.m69531a(r4);
        r13.f60468m = r4;
        goto L_0x00e8;
    L_0x0093:
        r4 = retrofit.http.Multipart.class;
        if (r5 != r4) goto L_0x00ab;
    L_0x0097:
        r4 = r13.f60462g;
        r5 = retrofit.RestMethodInfo.RequestType.SIMPLE;
        if (r4 == r5) goto L_0x00a6;
    L_0x009d:
        r0 = "Only one encoding annotation is allowed.";
        r1 = new java.lang.Object[r2];
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x00a6:
        r4 = retrofit.RestMethodInfo.RequestType.MULTIPART;
        r13.f60462g = r4;
        goto L_0x00e8;
    L_0x00ab:
        r4 = retrofit.http.FormUrlEncoded.class;
        if (r5 != r4) goto L_0x00c3;
    L_0x00af:
        r4 = r13.f60462g;
        r5 = retrofit.RestMethodInfo.RequestType.SIMPLE;
        if (r4 == r5) goto L_0x00be;
    L_0x00b5:
        r0 = "Only one encoding annotation is allowed.";
        r1 = new java.lang.Object[r2];
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x00be:
        r4 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED;
        r13.f60462g = r4;
        goto L_0x00e8;
    L_0x00c3:
        r4 = retrofit.http.Streaming.class;
        if (r5 != r4) goto L_0x00e8;
    L_0x00c7:
        r4 = r13.f60461f;
        r5 = retrofit.client.C19370e.class;
        if (r4 == r5) goto L_0x00e6;
    L_0x00cd:
        r0 = "Only methods having %s as data type are allowed to have @%s annotation.";
        r1 = new java.lang.Object[r7];
        r3 = retrofit.client.C19370e.class;
        r3 = r3.getSimpleName();
        r1[r2] = r3;
        r2 = retrofit.http.Streaming.class;
        r2 = r2.getSimpleName();
        r1[r8] = r2;
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x00e6:
        r13.f60470o = r8;
    L_0x00e8:
        r3 = r3 + 1;
        goto L_0x0009;
    L_0x00ec:
        r0 = r13.f60463h;
        if (r0 != 0) goto L_0x00f9;
    L_0x00f0:
        r0 = "HTTP method annotation is required (e.g., @GET, @POST, etc.).";
        r1 = new java.lang.Object[r2];
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x00f9:
        r0 = r13.f60464i;
        if (r0 != 0) goto L_0x011b;
    L_0x00fd:
        r0 = r13.f60462g;
        r1 = retrofit.RestMethodInfo.RequestType.MULTIPART;
        if (r0 != r1) goto L_0x010c;
    L_0x0103:
        r0 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST).";
        r1 = new java.lang.Object[r2];
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x010c:
        r0 = r13.f60462g;
        r1 = retrofit.RestMethodInfo.RequestType.FORM_URL_ENCODED;
        if (r0 != r1) goto L_0x011b;
    L_0x0112:
        r0 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).";
        r1 = new java.lang.Object[r2];
        r0 = r13.m69523a(r0, r1);
        throw r0;
    L_0x011b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit.RestMethodInfo.b():void");
    }

    /* renamed from: b */
    private void m69528b(String str) {
        if (!(str == null || str.length() == 0)) {
            if (str.charAt(0) == '/') {
                String str2;
                String str3;
                int indexOf = str.indexOf(63);
                if (indexOf == -1 || indexOf >= str.length() - 1) {
                    str2 = null;
                    str3 = str;
                } else {
                    str3 = str.substring(0, indexOf);
                    str2 = str.substring(indexOf + 1);
                    if (f60455r.matcher(str2).find()) {
                        throw m69523a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", str2);
                    }
                }
                str = m69525a(str);
                this.f60465j = str3;
                this.f60466k = str;
                this.f60467l = str2;
                return;
            }
        }
        throw m69523a("URL path \"%s\" must start with '/'.", str);
    }

    /* renamed from: a */
    List<C19368b> m69531a(String[] strArr) {
        List<C19368b> arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            int indexOf = str.indexOf(58);
            if (!(indexOf == -1 || indexOf == 0)) {
                if (indexOf != str.length() - 1) {
                    String substring = str.substring(0, indexOf);
                    str = str.substring(indexOf + 1).trim();
                    if (ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(substring)) {
                        this.f60469n = str;
                    } else {
                        arrayList.add(new C19368b(substring, str));
                    }
                    i++;
                }
            }
            throw m69523a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
        }
        return arrayList;
    }

    /* renamed from: c */
    private ResponseType m69529c() {
        Type type;
        Type genericReturnType = this.f60456a.getGenericReturnType();
        Type[] genericParameterTypes = this.f60456a.getGenericParameterTypes();
        Class cls = null;
        int i = 1;
        if (genericParameterTypes.length > 0) {
            type = genericParameterTypes[genericParameterTypes.length - 1];
            Type rawType = type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType() : type;
            if (rawType instanceof Class) {
                cls = (Class) rawType;
            }
        } else {
            type = null;
        }
        Object obj = genericReturnType != Void.TYPE ? 1 : null;
        if (cls == null || !Callback.class.isAssignableFrom(cls)) {
            i = 0;
        }
        if (obj != null && r4 != 0) {
            throw m69523a("Must have return type or Callback as last argument, not both.", new Object[0]);
        } else if (obj == null && r4 == 0) {
            throw m69523a("Must have either a return type or Callback as last argument.", new Object[0]);
        } else if (obj != null) {
            if (C19378d.f60507a) {
                Class a = C19387h.m69575a(genericReturnType);
                if (C19358a.m69521a(a)) {
                    this.f60461f = m69524a((ParameterizedType) C19358a.m69520a(genericReturnType, a));
                    return ResponseType.OBSERVABLE;
                }
            }
            this.f60461f = genericReturnType;
            return ResponseType.OBJECT;
        } else {
            genericReturnType = C19387h.m69585b(type, C19387h.m69575a(type), Callback.class);
            if (genericReturnType instanceof ParameterizedType) {
                this.f60461f = m69524a((ParameterizedType) genericReturnType);
                return ResponseType.VOID;
            }
            throw m69523a("Last parameter must be of type Callback<X> or Callback<? super X>.", new Object[0]);
        }
    }

    /* renamed from: a */
    private static Type m69524a(ParameterizedType parameterizedType) {
        parameterizedType = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < parameterizedType.length; i++) {
            Object obj = parameterizedType[i];
            if (obj instanceof WildcardType) {
                parameterizedType[i] = ((WildcardType) obj).getUpperBounds()[0];
            }
        }
        return parameterizedType[0];
    }

    /* renamed from: d */
    private void m69530d() {
        Class[] parameterTypes = this.f60456a.getParameterTypes();
        Annotation[][] parameterAnnotations = this.f60456a.getParameterAnnotations();
        int length = parameterAnnotations.length;
        if (!(this.f60459d || r0.f60460e)) {
            length--;
        }
        Annotation[] annotationArr = new Annotation[length];
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (i < length) {
            Class[] clsArr;
            Class cls = parameterTypes[i];
            Annotation[] annotationArr2 = parameterAnnotations[i];
            if (annotationArr2 != null) {
                int length2 = annotationArr2.length;
                Object obj4 = obj3;
                obj3 = obj2;
                obj2 = obj;
                int i2 = 0;
                while (i2 < length2) {
                    Annotation annotation = annotationArr2[i2];
                    Class annotationType = annotation.annotationType();
                    if (annotationType == Path.class) {
                        m69526a(i, ((Path) annotation).value());
                    } else if (annotationType == EncodedPath.class) {
                        m69526a(i, ((EncodedPath) annotation).value());
                    } else if (annotationType != Query.class) {
                        if (annotationType != EncodedQuery.class) {
                            if (annotationType == QueryMap.class) {
                                if (!Map.class.isAssignableFrom(cls)) {
                                    throw m69522a(i, "@QueryMap parameter type must be Map.", new Object[0]);
                                }
                            } else if (annotationType == EncodedQueryMap.class) {
                                if (!Map.class.isAssignableFrom(cls)) {
                                    throw m69522a(i, "@EncodedQueryMap parameter type must be Map.", new Object[0]);
                                }
                            } else if (annotationType != Header.class) {
                                if (annotationType == Field.class) {
                                    if (r0.f60462g != RequestType.FORM_URL_ENCODED) {
                                        throw m69522a(i, "@Field parameters can only be used with form encoding.", new Object[0]);
                                    }
                                } else if (annotationType != FieldMap.class) {
                                    if (annotationType == Part.class) {
                                        if (r0.f60462g != RequestType.MULTIPART) {
                                            throw m69522a(i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                        }
                                    } else if (annotationType == PartMap.class) {
                                        if (r0.f60462g != RequestType.MULTIPART) {
                                            throw m69522a(i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                        } else if (!Map.class.isAssignableFrom(cls)) {
                                            throw m69522a(i, "@PartMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else if (annotationType == Body.class) {
                                        clsArr = parameterTypes;
                                        if (r0.f60462g != RequestType.SIMPLE) {
                                            throw m69522a(i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                        } else if (obj2 != null) {
                                            throw m69523a("Multiple @Body method annotations found.", new Object[0]);
                                        } else {
                                            obj2 = 1;
                                            if (annotationArr[i] == null) {
                                                throw m69522a(i, "Multiple Retrofit annotations found, only one allowed: @%s, @%s.", annotationArr[i].annotationType().getSimpleName(), annotationType.getSimpleName());
                                            }
                                            annotationArr[i] = annotation;
                                            i2++;
                                            parameterTypes = clsArr;
                                        }
                                    } else {
                                        clsArr = parameterTypes;
                                        i2++;
                                        parameterTypes = clsArr;
                                    }
                                    clsArr = parameterTypes;
                                    obj4 = 1;
                                    if (annotationArr[i] == null) {
                                        annotationArr[i] = annotation;
                                        i2++;
                                        parameterTypes = clsArr;
                                    } else {
                                        throw m69522a(i, "Multiple Retrofit annotations found, only one allowed: @%s, @%s.", annotationArr[i].annotationType().getSimpleName(), annotationType.getSimpleName());
                                    }
                                } else if (r0.f60462g != RequestType.FORM_URL_ENCODED) {
                                    throw m69522a(i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                } else if (!Map.class.isAssignableFrom(cls)) {
                                    throw m69522a(i, "@FieldMap parameter type must be Map.", new Object[0]);
                                }
                                clsArr = parameterTypes;
                                obj3 = 1;
                                if (annotationArr[i] == null) {
                                    throw m69522a(i, "Multiple Retrofit annotations found, only one allowed: @%s, @%s.", annotationArr[i].annotationType().getSimpleName(), annotationType.getSimpleName());
                                }
                                annotationArr[i] = annotation;
                                i2++;
                                parameterTypes = clsArr;
                            }
                        }
                    }
                    clsArr = parameterTypes;
                    if (annotationArr[i] == null) {
                        annotationArr[i] = annotation;
                        i2++;
                        parameterTypes = clsArr;
                    } else {
                        throw m69522a(i, "Multiple Retrofit annotations found, only one allowed: @%s, @%s.", annotationArr[i].annotationType().getSimpleName(), annotationType.getSimpleName());
                    }
                }
                clsArr = parameterTypes;
                obj = obj2;
                obj2 = obj3;
                obj3 = obj4;
            } else {
                clsArr = parameterTypes;
            }
            if (annotationArr[i] == null) {
                throw m69522a(i, "No Retrofit annotation found.", new Object[0]);
            }
            i++;
            parameterTypes = clsArr;
        }
        if (r0.f60462g == RequestType.SIMPLE && !r0.f60464i && obj != null) {
            throw m69523a("Non-body HTTP method cannot contain @Body or @TypedOutput.", new Object[0]);
        } else if (r0.f60462g == RequestType.FORM_URL_ENCODED && obj2 == null) {
            throw m69523a("Form-encoded method must contain at least one @Field.", new Object[0]);
        } else if (r0.f60462g == RequestType.MULTIPART && obj3 == null) {
            throw m69523a("Multipart method must contain at least one @Part.", new Object[0]);
        } else {
            r0.f60471p = annotationArr;
        }
    }

    /* renamed from: a */
    private void m69526a(int i, String str) {
        if (!f60454q.matcher(str).matches()) {
            throw m69522a(i, "@Path parameter name must match %s. Found: %s", f60455r.pattern(), str);
        } else if (!this.f60466k.contains(str)) {
            throw m69522a(i, "URL \"%s\" does not contain \"{%s}\".", this.f60465j, str);
        }
    }

    /* renamed from: a */
    static Set<String> m69525a(String str) {
        str = f60455r.matcher(str);
        Set<String> linkedHashSet = new LinkedHashSet();
        while (str.find()) {
            linkedHashSet.add(str.group(1));
        }
        return linkedHashSet;
    }
}
