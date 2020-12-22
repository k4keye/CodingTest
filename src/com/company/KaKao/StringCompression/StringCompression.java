package com.company.KaKao.StringCompression;

public class StringCompression {
    public StringCompression()
    {
        String s = "aabbaccc";

        int sLength = s.length();

        String[] s_arr = new String[sLength];

        String result =null;
        int equalsCount = 1; //같은 문자 카운트
        for(int comperssion = 1; comperssion<sLength/2 ; comperssion++) //압축을 여러번 해야한다.
        {
            result ="";
            for(int i =0 ; i<sLength;i+=comperssion) //한 문자씩 검사
            {
                String sChar = s.substring(i,i+comperssion);
                System.out.println("[기준 대상] "+ sChar);
                System.out.println("[기준 대상 i] "+ i);

                if((i+comperssion) >= sLength) //반복문이 동작하지못한다면
                {
                    if(sChar.equals(s.substring((i-comperssion),i))) equalsCount++; //이전문자 비교
                    if(equalsCount < 2) result += sChar;
                    else result += equalsCount+ sChar;
                    System.out.println("마지막 >> "+result);

                }
                equalsCount = 1; //같은 문자 카운트
                for(int j = i+comperssion ; j<sLength ; j+=comperssion) //위의 문자를 제외한 모든 문자
                {
                    String comparison = s.substring(j,j+comperssion);
                    System.out.println("비교 "+ comparison);

                    if(sChar.equals(comparison) ) //문자가 같다면
                    {
                        System.out.println("같다");
                        equalsCount++;

                    }

                    else if(!sChar.equals(comparison))
                    {
                        System.out.println("다르다 ");
                        if(equalsCount < 2) result += sChar;
                        else result += equalsCount+ sChar;

                        System.out.println(result);
                        i+=(equalsCount-1); //i 를 같은 문자열 길이만큼 증가
                        break;
                    }
                }


            }
            System.out.println();
            System.out.println();
            System.out.println(result);
        }


    }
}
