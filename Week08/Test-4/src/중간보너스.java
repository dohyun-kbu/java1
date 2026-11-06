//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int COST = 1015000;               // 매입 원가
    final double PROFIT = 30.0 / 100;       // 이익율 30%
    final double TAX = 10.0 / 100;          // 세율 10%

    double price = COST * (1 + PROFIT);     // 정가(매출액)
    double salesTax = price * TAX;          // 매출 세액
    double buyTax = COST * TAX;             // 매입 세액
    double payTax = salesTax - buyTax;      // 납부 세액

    System.out.printf("매입 원가 : %,d 원\n", COST);
    System.out.printf("정    가 : %,.2f 원\n", price);
    System.out.printf("매출 세액 : %,.2f 원\n", salesTax);
    System.out.printf("매입 세액 : %,.2f 원\n", buyTax);
    System.out.printf("납부 세액 : %,.2f 원\n", payTax);
}