package com.company;

import com.company.KaKao.StringCompression.StringCompressionErr;
import com.company.programmers.hash.완주하지_못한_선수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] arr = new String[]{"A","B","A"};
        List<String> strings = new ArrayList<>();
        strings.addAll( Arrays.asList(arr));

        for (String string : strings) {
            System.out.println(string);
        }
        strings.remove("A");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
