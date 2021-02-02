package com.company;

import java.io.FilenameFilter;

public class lambda {
    //메서드에서 이름과 반환타임을 제거하면 람다식이된다.
    //반환값이 있는경우 식이나 값만 적고 return 제거
    //매개변수의 타입추론이 가능하면 생략가능
    //매개 변수가 하나일때는 괄호를 생략가능(타입없을때)

    public void simpleLambda()
    {
        //(a, b) -> a > b ? a : b;
    }
    private int max(int a , int b)
    {
        return a>b ? a:b;
    }
    private void print(String name , int i)
    {
        System.out.println(name+"="+i);
    }

}
