package com.company.KaKao.StringCompression;

public class StringCompression {
    public StringCompression()
    {
        String s = "aabbaccc";

        int sLength = s.length();

        String[] s_arr = new String[sLength];

        String result =null;

        for(int comperssion = 1; comperssion<sLength/2 ; comperssion++) //압축을 여러번 해야한다.
        {
            result ="";
            for(int i =0 ; i<sLength;i+=comperssion)
            {
                String sChar = s.substring(i,i+comperssion);
                System.out.println("[기준 대상] "+ sChar);
                System.out.println("[기준 대상 i] "+ i);
                int equalsCount = 1; //같은 문자 카운트
                for(int j = i+comperssion ; j<sLength ; j+=comperssion)
                {
                    String comparison = s.substring(j,j+comperssion);
                    System.out.println("비교 "+ comparison);

                    if(sChar.equals(comparison) ) //문자가 같다면
                    {
                        System.out.println("같다");
                        equalsCount++;
                    }
                    if(j+comperssion >= sLength-1)
                    {
                        //마지막 문자열을 입력해야한다.
                        //지금은 추가가안되고있다.
                    }
                    else if(!sChar.equals(comparison) )
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
