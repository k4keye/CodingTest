package com.company.programmers.hash;

import java.util.Arrays;

public class 전화번호_목록 {


    public boolean solution1(String[] phone_book) {
        Arrays.sort(phone_book);
        String target = phone_book[0];
        for(int i=1; i < phone_book.length-1 ; i++)
        {
            if(phone_book[i].contains(target)) return false;
        }
        return true;
        //효율성 테스트  20 ,18
    }

    public boolean solution2(String[] phone_book) {
        String target ="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        for (String s : phone_book) {
            if(target.length()>s.length()) target =s;
        }

        for(int i=0; i < phone_book.length ; i++)
        {
            if(phone_book[i].startsWith(target) && !phone_book[i].equals(target)) return false;
        }
        return true;
        //효율성 테스트 1.17,0.99로 증가
    }
}
