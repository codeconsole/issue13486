package issue13486;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ModelResolver<T> {
    private final Map<String, Object> model = new HashMap<>();

    private final BiFunction<Object, Map<String, Object>, Map<String, Object>> resolver;

    public ModelResolver(BiFunction<Object, Map<String, Object>, Map<String, Object>> resolver) {
        this.resolver = resolver;
    }

    public Map<String, Object> resolve(Object resourceResponse) {
        if (resolver != null) {
            Map<String, Object> m = resolver.apply(resourceResponse, model);
            model.putAll(m);
        }
        return model;
    }

    public void put(String key, Object value) {
        model.put(key, value);
    }

    public void putAll(Map<String, Object> values) {
        model.putAll(values);
    }
}