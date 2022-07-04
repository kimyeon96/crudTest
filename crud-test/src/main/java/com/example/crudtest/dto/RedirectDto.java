package com.example.crudtest.dto;

import lombok.Data;

@Data
public class RedirectDto {
/*기능을 하는 애들은 (변수명처럼) Dto가 붙는다고 생각을 하면 됨
        우리가 보기 편하게 쓰는거*/
/*    Dto는 컨트롤러랑 뷰 왔다갔다 할때 정보 담는 객체, getter setter해서 처리한다*/
    /*(게터 세터역할: 데이터가 리다이렉트dto해서 쓰는데 그거 에드어트리뷰트 msg url해서 정보를 담는걸로 썼잖아
            담으면 게터, 보내는게 세터)*/

    /*원래는 getter setter해서 쭉 써야되는데
    옛날에는 getter setter해서 쭉 썼는데 지금은 어노테이션으로 간편화해서 쭉 쓸수가 있다
    이 데이터가 Dto에 들어가는것
            dto 파일 열어보면 위에 @Data 써있잖아 그게 게터 세터 역할 하는것*/
    /*@Data만 써도 얘가 알아서 만들어준다*/
    private String msg;
    private String url;
}
