package dev.vince.commons;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * The ModuleMap class is used to store modules.
 * It is a LinkedHashMap with the class of the module as key and the module as value.
 * It extends off of LinkedHashMap to allow for easy iteration.
 *
 * @author dev-vince
 */
public final class SimpleHashMap<T> extends HashMap<Class<?>, T> {
    /**
     * Puts an array of objects in the ModuleMap
     *
     * @param objects the objects to put in the ModuleMap
     */
    @SafeVarargs
    public final void putAll(final T... objects) {
        for (T module : objects) {
            put(module);
        }
    }

    /**
     * Puts type in the ModuleMap
     *
     * @param object the type to put in the ModuleMap
     */
    public T put(final T object) {
        return super.put(object.getClass(), object);
    }

    /**
     * Gets a type from the SimpleHashMap
     *
     * @param moduleClass the class of the type to get
     * @return the type
     */
    public T get(final Class<? extends T> moduleClass) {
        return super.get(moduleClass);
    }

    /**
     * Gets all the types in the SimpleHashMap
     *
     * @return a LinkedList with all the types
     */
    public LinkedList<T> getValues() {
        return new LinkedList<>(values());
    }
}
