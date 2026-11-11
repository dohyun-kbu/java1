//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int COUNT = 10;       // 공이떨어지는 횟수
    double x, height;           // 처음 높이 현재 낙하 높이
    double total = 0;           // 공이 움직인 거리

    while (true) {
        System.out.print("초기 높이 X(m)를 입력하세요: ");
        x = keyboard.nextDouble();
        if (x > 0)
            break;
        else {
            System.err.print("ERROR : 높이는 0보다 커야 함");
            System.in.read();
        }
    }

    height = x;
    for (int i = 1; i <= COUNT; i++) {
        if (i == 1)
            total += height;        // 처음
        else
            total += height * 2;    // 올라갔다가 다시 떨어짐
        System.out.printf("공의 %d번째 낙하 높이: %.4f m\n", i, height);
        height = height * 2 / 3;
    }

    System.out.printf("총 이동 거리: %.4f m\n", total);
}
