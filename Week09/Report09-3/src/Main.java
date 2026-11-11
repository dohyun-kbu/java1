//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int WELL = 300;       // 우물 깊이
    final int UP = 55;          // 낮에 올라가는거리
    final int DOWN = 13;        // 밤에 미끄러지는겨리
    final int LIMIT = 7;        // 방울꽃이 시드는날
    int height = 0;             // 현재 높이
    int day = 1;
    String result;

    while (true) {
        height += UP;
        System.out.printf("%2d일째 낮 : %3d cm\n", day, height);
        if (height >= WELL)     // 낮에 올라오면 밤에 미끄러지지 않음
            break;
        height -= DOWN;
        System.out.printf("%2d일째 밤 : %3d cm\n", day, height);
        day++;
    }

    result = (day <= LIMIT) ? "방울꽃이 시들기 전에 곁을 지킬 수 있습니다" : "방울꽃이 시들어 버립니다";
    System.out.printf("%d일째 낮에 탈출합니다. %s\n", day, result);
}