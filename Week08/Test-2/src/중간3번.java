//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int spend;      // 지출액
    int saving;     // 저축액
    int food;       // 식 생활비
    double engel;   // 엥겔 지수
    boolean flag;
    String grade;
    String result;

    System.out.print("지출액 입력 : ");
    spend = keyboard.nextInt();
    System.out.print("저축액 입력 : ");
    saving = keyboard.nextInt();

    flag = (spend > 0 && saving >= 0 && saving <= spend) ? true : false;

    food = spend - saving;
    engel = food * 100.0 / spend;

    grade = (engel <= 30) ? "상류층" :
            ((engel <= 50) ? "중산층" : "하류층");

    result = flag == true ? String.format("\n지출액 : %,d 원\n저축액 : %,d 원\n식 생활비 : %,d 원\n엥겔 지수 : %.2f %%\n판정 : %s",
            spend, saving, food, engel, grade) : "Data 오류 입니다";

    System.out.println(result);
}
