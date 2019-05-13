package by.ifanbel.configurations;

import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.Collection;

public class myConverter implements Converter<String, Collection> {
    public Collection convert(String s) {
        Collection collection = new ArrayList<String>();
        collection.add(s);
        return collection;
    }
}
