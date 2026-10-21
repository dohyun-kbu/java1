//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

void main() {
    Scanner keyboard = new Scanner(System.in);

    int price;
    int member;
    String result;

    System.out.print("구매 금액 입력 : ");
    price = keyboard.nextInt();

    System.out.print("멤버십 회원 여부 (1: 회원, 0: 비회원) : ");
    member = keyboard.nextInt();

    result = (price < 0) ? "구매 금액 오류" :
            (price >= 50000 || (member == 1 && price >= 30000)) ? "무료배송" :
                    "배송비 부과";

    System.out.println(result);
}

