package com.company.etc.wo20240310;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {
    private static final String PATTERN = "/payment/(\\d{1,9})/([a-zA-Z]{1,10})";
    public String solution(String pathVariableUrl) {
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(pathVariableUrl);

        if (matcher.matches()) {
            String paymentId = matcher.group(1);
            String paymentMethod = matcher.group(2);
            return "/payment/" + paymentMethod + "?paymentId=" + paymentId;
        }

        return "error";
    }
}
