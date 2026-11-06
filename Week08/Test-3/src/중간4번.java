//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int a, b, c;
    double s, area;
    String type;
    String result;

    System.out.print("첫 번째 변 a : ");
    a = keyboard.nextInt();
    System.out.print("두 번째 변 b : ");
    b = keyboard.nextInt();
    System.out.print("세 번째 변 c : ");
    c = keyboard.nextInt();

    if (a + b > c && a + c > b && b + c > a) {
        if (a == b && b == c) {
            type = "정 삼각형";
        } else {
            type = (a == b || b == c || a == c) ? "이등변 삼각형" : "일반 삼각형";
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                type = type + " (직각 삼각형)";
            }
        }

        s = (a + b + c) / 2.0;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        result = String.format("삼각형이 성립합니다.\n삼각형의 종류 : %s\n삼각형의 면적 : %.2f \u33a0", type, area);
    } else {
        result = "삼각형 아님";
    }

    System.out.println(result);
}
