package com.company.Leetcode;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GroupAnagramsTest {

    @DisplayName("\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"")
    @Test
    void test01() {
        // given
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        // then
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s);
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    @DisplayName("")
    @Test
    void test02() {
        // given
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{""});

        // then
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s);
                System.out.println(" ");
            }
            System.out.println();
        }
    }

    @DisplayName("\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\",\"ac\",\"bd\",\"aac\",\"bbd\",\"aacc\",\"bbdd\",\"acc\",\"bdd\"")
    @Test
    void test03() {
        // given
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        // when
        List<List<String>> lists = groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat", "ac", "bd", "aac", "bbd", "aacc", "bbdd", "acc", "bdd"});

        // then
        for (List<String> list : lists) {
            for (String s : list) {
                System.out.print(s);
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}