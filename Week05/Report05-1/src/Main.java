//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


void main() {
    Scanner keyboard = new Scanner(System.in);
    int a;
    int b;
    int c;

    System.out.println("3개의 정수를 입력하세요");
    a = keyboard.nextInt();
    b = keyboard.nextInt();
    c = keyboard.nextInt();

    System.out.println(
            (a > 0 && b > 0 && c > 0) ? "모두 양수" :
                    (a < 0 || b < 0 || c < 0) ? "음수 포함" :
                            (a == 0 && b == 0 && c == 0) ? "모두 0" :
                                    (a >= 0 || b >= 0 || c >= 0) ? "양수 포함" : ""
    );
}
