//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final float MOON_RATE = 0.165f;
    float weight;
    float moon;

    System.out.print("당신의 몸무게를 입력하세요 (Kg) : ");
    weight = keyboard.nextFloat();

    moon = weight * MOON_RATE;

    System.out.printf("\n지구에서 몸무게%.1fKg는 달에서 %.2fKg입니다.\n", weight, moon);
}
