//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final String SCHOOL = "경복대학교";
    final String NAME = "홍길동";
    final int AGE = 20;
    final String GENDER = "남(여)";
    final double HEIGHT = 170.6;
    final double WEIGHT = 65.4;

    System.out.printf("학교 : %s\n", SCHOOL);
    System.out.printf("이름 : %s\n", NAME);
    System.out.printf("나이 : %d\n", AGE);
    System.out.printf("성별 : %s\n", GENDER);
    System.out.printf("신장 : %.1f Cm\n", HEIGHT);
    System.out.printf("체중 : %.1f Kg\n", WEIGHT);

}