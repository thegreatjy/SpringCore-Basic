package hello.core.order;

import hello.core.MemberApp;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        // 회원가입
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        // 상품 주문
        Order order = orderService.createOrder(member.getId(), "itemA", 10000);
        System.out.println("order : " + order.toString());
        System.out.println("order : " + order.calculatePrice());
    }
}
