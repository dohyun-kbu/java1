//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int total;
    int money;
    int tax;

    System.out.print("판매금액을입력하세요 : ");
    total = keyboard.nextInt();

    money = total * 10 / 11;
    tax = total - money;

    System.out.printf("\n판매금액 : %,d원\n", total);
    System.out.printf("금액 : %,d원\n", money);
    System.out.printf("세금 : %,d원\n", tax);
}