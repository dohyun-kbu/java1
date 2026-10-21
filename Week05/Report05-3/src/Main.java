//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

void main() {
    Scanner keyboard = new Scanner(System.in);

    int time;
    int hour;
    int minute;
    int second;

    System.out.print("초 입력 : ");
    time = keyboard.nextInt();

    hour = time / 3600;
    minute = (time % 3600) / 60;
    second = time % 60;

    System.out.println(time + " 초 = " + hour + " 시간 " + minute + " 분 " + second + " 초");
}

