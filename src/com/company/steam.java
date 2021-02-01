package com.company;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class steam {
    public void to()
    {
        //원하는 컬렉션의 타입으로 변환한다.
        String[] arr = new String[]{"AB","CD","EF","G"};
        Set<String> setResult = Arrays.stream(arr).collect(Collectors.toSet());
        List<String> listResult = Arrays.stream(arr).collect(toList());
        Map<String,Integer> mapResult = Arrays.stream(arr).collect(Collectors.toMap(p->p , String::length));

    }

    public void joining()
    {
        //모두 하나의 문자열로 합친다.
        String[] arr = new String[]{"AB","CD","EF","G"};
        String result = Arrays.stream(arr).collect(Collectors.joining());
        String result2 = Arrays.stream(arr).collect(Collectors.joining(","));
        String result3 = Arrays.stream(arr).map(Object::toString).collect(Collectors.joining(","));

    }

    public void groupingBy()
    {
        //특정 데이터를 기준으로 그룹화하여 처리한다.
        String[] arr = new String[]{"AB","CD","EF","G"};
        Map<Integer, List<String>> map = Arrays.stream(arr).collect(Collectors.groupingBy(String::length , Collectors.toList()));
        for(int key : map.keySet())
        {
            System.out.println(key +" , "+map.get(key));
        }

        //counting 각 엘리먼트의 수를 센다.
         Map<String, Long> mapCnt = Arrays.stream(arr).collect(Collectors.groupingBy(p->p,Collectors.counting()));
        for(String key : mapCnt.keySet())
        {
            System.out.println(key +" , "+mapCnt.get(key));
        }
    }

    public void reducing()
    {
        //리듀싱 한다.
        final List<Menu> menuList = Arrays.asList(
                new Menu("고기", 1200)
                , new Menu("랍스타", 7600)
                , new Menu("피자", 3100));
        Integer collect = menuList.stream().collect(Collectors.reducing(0, Menu::getPrice, (a, b) ->   a+b ));
    }

}
class Menu {
    private Integer price;
    private String name;

    public Menu (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}