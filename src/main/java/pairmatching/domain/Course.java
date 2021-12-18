package pairmatching.domain;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<String> getList() {
        return Arrays.stream(Course.values())
                .map(Course::getName)
                .sequential()
                .collect(Collectors.toList());
    }
}
