//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);

    int score;
    String grade;

    System.out.print("당신의 JAVA 점수 입력 : ");
    score = keyboard.nextInt();

    grade = (score >= 95) ? "A+" :
            (score >= 90) ? "A0" :
                    (score >= 85) ? "B+" :
                            (score >= 80) ? "B0" :
                                    (score >= 75) ? "C+" :
                                            (score >= 70) ? "C0" :
                                                    (score >= 65) ? "D+" :
                                                            (score >= 60) ? "D0" : "F";

    System.out.println("입력 점수 : " + score);
    System.out.println("학점 : " + grade);
}

