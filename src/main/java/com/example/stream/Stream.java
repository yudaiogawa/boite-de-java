package com.example.stream;

import com.example.stream.models.Idol;
import org.apache.commons.compress.utils.Lists;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Stream {

    void printIdols() {
        createIdols().forEach(i -> System.out.println(i.toString()));
    }

    private List<Idol> createIdols() {
        List<Idol> idols = Lists.newArrayList();
        idols.add(new Idol("miipan", 20));
        idols.add(new Idol("kyonko", 23));
        idols.add(new Idol("katoshi", 22));
        idols.add(new Idol("hinano", 16));
        idols.add(null);

        return idols.stream().filter(Objects::nonNull).collect(Collectors.toList());
    }
}
