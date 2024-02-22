package com.test.ui.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;


@Data
@Builder
public class SamplePageProfile {
    public  final String imagePath;
    private final String name;
    private final String email;
    private final String website;
    private final String experienceInYear;
    private final List<String> expertise;
    private final String education;
    private final String comment;

    @Getter
    @RequiredArgsConstructor
    public enum Expertise {

        FT("Functional Testing"),
        AT("Automation Testing"),
        MT("Manual Testing");
        private final String name;

    }

    @Getter
    @RequiredArgsConstructor
    public enum Education {

        POST_GRADUATE("Post Graduate"),
        GRADUATE("Graduate"),
        OTHER("Other");
        private final String name;

    }

}




