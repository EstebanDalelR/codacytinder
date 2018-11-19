package retrofit;

import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import retrofit.RequestInterceptor.RequestFacade;
import retrofit.client.C19368b;
import retrofit.client.C19369d;
import retrofit.converter.Converter;
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
import retrofit.mime.C19542a;
import retrofit.mime.C19543c;
import retrofit.mime.C19648e;
import retrofit.mime.TypedOutput;

/* renamed from: retrofit.e */
final class C19541e implements RequestFacade {
    /* renamed from: a */
    private final Converter f61051a;
    /* renamed from: b */
    private final Annotation[] f61052b;
    /* renamed from: c */
    private final String f61053c;
    /* renamed from: d */
    private final boolean f61054d;
    /* renamed from: e */
    private final boolean f61055e;
    /* renamed from: f */
    private final String f61056f;
    /* renamed from: g */
    private final C19542a f61057g;
    /* renamed from: h */
    private final C19543c f61058h;
    /* renamed from: i */
    private TypedOutput f61059i;
    /* renamed from: j */
    private String f61060j;
    /* renamed from: k */
    private StringBuilder f61061k;
    /* renamed from: l */
    private List<C19368b> f61062l;
    /* renamed from: m */
    private String f61063m;

    /* renamed from: retrofit.e$a */
    private static class C19540a implements TypedOutput {
        /* renamed from: a */
        private final TypedOutput f61049a;
        /* renamed from: b */
        private final String f61050b;

        C19540a(TypedOutput typedOutput, String str) {
            this.f61049a = typedOutput;
            this.f61050b = str;
        }

        public String fileName() {
            return this.f61049a.fileName();
        }

        public String mimeType() {
            return this.f61050b;
        }

        public long length() {
            return this.f61049a.length();
        }

        public void writeTo(OutputStream outputStream) throws IOException {
            this.f61049a.writeTo(outputStream);
        }
    }

    C19541e(String str, RestMethodInfo restMethodInfo, Converter converter) {
        this.f61056f = str;
        this.f61051a = converter;
        this.f61052b = restMethodInfo.f60471p;
        this.f61053c = restMethodInfo.f60463h;
        this.f61054d = restMethodInfo.f60459d;
        this.f61055e = restMethodInfo.f60460e;
        if (restMethodInfo.f60468m != null) {
            this.f61062l = new ArrayList(restMethodInfo.f60468m);
        }
        this.f61063m = restMethodInfo.f60469n;
        this.f61060j = restMethodInfo.f60465j;
        str = restMethodInfo.f60467l;
        if (str != null) {
            converter = new StringBuilder();
            converter.append(ManagerWebServices.QUERY_QUESTION_MARK);
            converter.append(str);
            this.f61061k = converter;
        }
        switch (restMethodInfo.f60462g) {
            case FORM_URL_ENCODED:
                this.f61057g = new C19542a();
                this.f61058h = null;
                this.f61059i = this.f61057g;
                return;
            case MULTIPART:
                this.f61057g = null;
                this.f61058h = new C19543c();
                this.f61059i = this.f61058h;
                return;
            case SIMPLE:
                this.f61057g = null;
                this.f61058h = null;
                return;
            default:
                converter = new StringBuilder();
                converter.append("Unknown request type: ");
                converter.append(restMethodInfo.f60462g);
                throw new IllegalArgumentException(converter.toString());
        }
    }

    public void addHeader(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        } else if (ManagerWebServices.PARAM_CONTENT_TYPE.equalsIgnoreCase(str)) {
            this.f61063m = str2;
        } else {
            List list = this.f61062l;
            if (list == null) {
                list = new ArrayList(2);
                this.f61062l = list;
            }
            list.add(new C19368b(str, str2));
        }
    }

    public void addPathParam(String str, String str2) {
        m70519a(str, str2, true);
    }

    public void addEncodedPathParam(String str, String str2) {
        m70519a(str, str2, false);
    }

    /* renamed from: a */
    private void m70519a(String str, String str2, boolean z) {
        if (str == null) {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        } else if (str2 == null) {
            z = new StringBuilder();
            z.append("Path replacement \"");
            z.append(str);
            z.append("\" value must not be null.");
            throw new IllegalArgumentException(z.toString());
        } else if (z) {
            StringBuilder stringBuilder;
            try {
                z = URLEncoder.encode(String.valueOf(str2), "UTF-8").replace("+", "%20");
                String str3 = this.f61060j;
                stringBuilder = new StringBuilder();
                stringBuilder.append("{");
                stringBuilder.append(str);
                stringBuilder.append("}");
                this.f61060j = str3.replace(stringBuilder.toString(), z);
            } catch (boolean z2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to convert path parameter \"");
                stringBuilder.append(str);
                stringBuilder.append("\" value to UTF-8:");
                stringBuilder.append(str2);
                throw new RuntimeException(stringBuilder.toString(), z2);
            }
        } else {
            z2 = this.f61060j;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("{");
            stringBuilder2.append(str);
            stringBuilder2.append("}");
            this.f61060j = z2.replace(stringBuilder2.toString(), String.valueOf(str2));
        }
    }

    public void addQueryParam(String str, String str2) {
        m70520a(str, str2, false, true);
    }

    public void addEncodedQueryParam(String str, String str2) {
        m70520a(str, str2, false, false);
    }

    /* renamed from: a */
    private void m70518a(String str, Object obj, boolean z, boolean z2) {
        if (obj instanceof Iterable) {
            for (Object next : (Iterable) obj) {
                if (next != null) {
                    m70520a(str, next.toString(), z, z2);
                }
            }
        } else if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                Object obj2 = Array.get(obj, i);
                if (obj2 != null) {
                    m70520a(str, obj2.toString(), z, z2);
                }
            }
        } else {
            m70520a(str, obj.toString(), z, z2);
        }
    }

    /* renamed from: a */
    private void m70520a(String str, String str2, boolean z, boolean z2) {
        if (str == null) {
            throw new IllegalArgumentException("Query param name must not be null.");
        } else if (str2 == null) {
            z = new StringBuilder();
            z.append("Query param \"");
            z.append(str);
            z.append("\" value must not be null.");
            throw new IllegalArgumentException(z.toString());
        } else {
            StringBuilder stringBuilder;
            try {
                stringBuilder = this.f61061k;
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                    this.f61061k = stringBuilder;
                }
                stringBuilder.append(stringBuilder.length() > 0 ? ManagerWebServices.QUERY_AMPERSAND : ManagerWebServices.QUERY_QUESTION_MARK);
                if (z) {
                    str = URLEncoder.encode(str, "UTF-8");
                }
                if (z2) {
                    str2 = URLEncoder.encode(str2, "UTF-8");
                }
                stringBuilder.append(str);
                stringBuilder.append(true);
                stringBuilder.append(str2);
            } catch (boolean z3) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to convert query parameter \"");
                stringBuilder.append(str);
                stringBuilder.append("\" value to UTF-8: ");
                stringBuilder.append(str2);
                throw new RuntimeException(stringBuilder.toString(), z3);
            }
        }
    }

    /* renamed from: a */
    private void m70517a(int i, Map<?, ?> map, boolean z, boolean z2) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            Object key = entry.getKey();
            if (key == null) {
                z = new StringBuilder();
                z.append("Parameter #");
                z.append(i + 1);
                z.append(" query map contained null key.");
                throw new IllegalArgumentException(z.toString());
            }
            Object value = entry.getValue();
            if (value != null) {
                m70520a(key.toString(), value.toString(), z, z2);
            }
        }
    }

    /* renamed from: a */
    void m70522a(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            if (!(this.f61054d || this.f61055e)) {
                length--;
            }
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Annotation annotation = this.f61052b[i];
                Class annotationType = annotation.annotationType();
                String value;
                StringBuilder stringBuilder;
                if (annotationType == Path.class) {
                    Path path = (Path) annotation;
                    value = path.value();
                    if (obj == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Path parameter \"");
                        stringBuilder.append(value);
                        stringBuilder.append("\" value must not be null.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    m70519a(value, obj.toString(), path.encode());
                } else if (annotationType == EncodedPath.class) {
                    r4 = ((EncodedPath) annotation).value();
                    if (obj == null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Path parameter \"");
                        stringBuilder.append(r4);
                        stringBuilder.append("\" value must not be null.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    m70519a(r4, obj.toString(), false);
                } else if (annotationType == Query.class) {
                    if (obj != null) {
                        Query query = (Query) annotation;
                        m70518a(query.value(), obj, query.encodeName(), query.encodeValue());
                    }
                } else if (annotationType == EncodedQuery.class) {
                    if (obj != null) {
                        m70518a(((EncodedQuery) annotation).value(), obj, false, false);
                    }
                } else if (annotationType == QueryMap.class) {
                    if (obj != null) {
                        QueryMap queryMap = (QueryMap) annotation;
                        m70517a(i, (Map) obj, queryMap.encodeNames(), queryMap.encodeValues());
                    }
                } else if (annotationType == EncodedQueryMap.class) {
                    if (obj != null) {
                        m70517a(i, (Map) obj, false, false);
                    }
                } else if (annotationType == Header.class) {
                    if (obj != null) {
                        r4 = ((Header) annotation).value();
                        if (obj instanceof Iterable) {
                            for (Object next : (Iterable) obj) {
                                if (next != null) {
                                    addHeader(r4, next.toString());
                                }
                            }
                        } else if (obj.getClass().isArray()) {
                            int length2 = Array.getLength(obj);
                            for (int i2 = 0; i2 < length2; i2++) {
                                r7 = Array.get(obj, i2);
                                if (r7 != null) {
                                    addHeader(r4, r7.toString());
                                }
                            }
                        } else {
                            addHeader(r4, obj.toString());
                        }
                    }
                } else if (annotationType == Field.class) {
                    if (obj != null) {
                        Field field = (Field) annotation;
                        value = field.value();
                        boolean encodeName = field.encodeName();
                        r4 = field.encodeValue();
                        if (obj instanceof Iterable) {
                            for (Object next2 : (Iterable) obj) {
                                if (next2 != null) {
                                    this.f61057g.m70523a(value, encodeName, next2.toString(), r4);
                                }
                            }
                        } else if (obj.getClass().isArray()) {
                            int length3 = Array.getLength(obj);
                            for (int i3 = 0; i3 < length3; i3++) {
                                Object obj2 = Array.get(obj, i3);
                                if (obj2 != null) {
                                    this.f61057g.m70523a(value, encodeName, obj2.toString(), r4);
                                }
                            }
                        } else {
                            this.f61057g.m70523a(value, encodeName, obj.toString(), r4);
                        }
                    }
                } else if (annotationType == FieldMap.class) {
                    if (obj != null) {
                        FieldMap fieldMap = (FieldMap) annotation;
                        boolean encodeNames = fieldMap.encodeNames();
                        r4 = fieldMap.encodeValues();
                        for (Entry entry : ((Map) obj).entrySet()) {
                            next2 = entry.getKey();
                            if (next2 == null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Parameter #");
                                stringBuilder.append(i + 1);
                                stringBuilder.append(" field map contained null key.");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            r6 = entry.getValue();
                            if (r6 != null) {
                                this.f61057g.m70523a(next2.toString(), encodeNames, r6.toString(), r4);
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else if (annotationType == Part.class) {
                    if (obj != null) {
                        Part part = (Part) annotation;
                        value = part.value();
                        r4 = part.encoding();
                        if (obj instanceof TypedOutput) {
                            this.f61058h.m70529a(value, r4, (TypedOutput) obj);
                        } else if (obj instanceof String) {
                            this.f61058h.m70529a(value, r4, new C19648e((String) obj));
                        } else {
                            this.f61058h.m70529a(value, r4, this.f61051a.toBody(obj));
                        }
                    }
                } else if (annotationType == PartMap.class) {
                    if (obj != null) {
                        r4 = ((PartMap) annotation).encoding();
                        for (Entry entry2 : ((Map) obj).entrySet()) {
                            r6 = entry2.getKey();
                            if (r6 == null) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Parameter #");
                                stringBuilder.append(i + 1);
                                stringBuilder.append(" part map contained null key.");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            String obj3 = r6.toString();
                            next = entry2.getValue();
                            if (next != null) {
                                if (next instanceof TypedOutput) {
                                    this.f61058h.m70529a(obj3, r4, (TypedOutput) next);
                                } else if (next instanceof String) {
                                    this.f61058h.m70529a(obj3, r4, new C19648e((String) next));
                                } else {
                                    this.f61058h.m70529a(obj3, r4, this.f61051a.toBody(next));
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                } else if (annotationType != Body.class) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown annotation: ");
                    stringBuilder.append(annotationType.getCanonicalName());
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (obj == null) {
                    throw new IllegalArgumentException("Body parameter value must not be null.");
                } else if (obj instanceof TypedOutput) {
                    this.f61059i = (TypedOutput) obj;
                } else {
                    this.f61059i = this.f61051a.toBody(obj);
                }
            }
        }
    }

    /* renamed from: a */
    C19369d m70521a() throws UnsupportedEncodingException {
        if (this.f61058h == null || this.f61058h.m70528a() != 0) {
            String str = this.f61056f;
            StringBuilder stringBuilder = new StringBuilder(str);
            if (str.endsWith("/")) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.append(this.f61060j);
            CharSequence charSequence = this.f61061k;
            if (charSequence != null) {
                stringBuilder.append(charSequence);
            }
            TypedOutput typedOutput = this.f61059i;
            List list = this.f61062l;
            if (this.f61063m != null) {
                if (typedOutput != null) {
                    typedOutput = new C19540a(typedOutput, this.f61063m);
                } else {
                    C19368b c19368b = new C19368b(ManagerWebServices.PARAM_CONTENT_TYPE, this.f61063m);
                    if (list == null) {
                        list = Collections.singletonList(c19368b);
                    } else {
                        list.add(c19368b);
                    }
                }
            }
            return new C19369d(this.f61053c, stringBuilder.toString(), list, typedOutput);
        }
        throw new IllegalStateException("Multipart requests must contain at least one part.");
    }
}
