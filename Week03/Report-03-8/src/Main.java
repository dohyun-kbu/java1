//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double celsius;
    double fahrenheit;

    System.out.print("섭씨 온도를 입력하세요 : ");
    celsius = keyboard.nextDouble();

    fahrenheit = celsius * 9 / 5 + 32;

    System.out.printf("섭씨 %.1f\u2103는 화씨 %.1fF 입니다.\n", celsius, fahrenheit);
}