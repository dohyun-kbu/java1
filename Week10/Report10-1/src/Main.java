//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final int JUDGE = 7;
    final float MIN = 60.0f;
    final float MAX = 100.0f;
    String player = "홍길동";
    float[] score = new float[JUDGE];
    float total = 0;
    float high, low;
    float result;
    int i = 0;

    /**************  입력 *************/
    while (i < score.length) {
        System.out.printf("%d번 채점관 점수 입력 (%.1f ~ %.1f) : ", i + 1, MIN, MAX);
        score[i] = keyboard.nextFloat();
        if (score[i] >= MIN && score[i] <= MAX)
            i++;
        else {
            System.err.println("ERROR : 점수는 60.0 ~ 100.0");
            System.in.read();
        }
    }

    /*********  처리 ***********/
    high = score[0];
    low = score[0];
    for (i = 0; i < score.length; i++) {
        total += score[i];
        if (score[i] > high)
            high = score[i];
        if (score[i] < low)
            low = score[i];
    }
    result = (total - high - low) / (JUDGE - 2);    // 최고, 최소를 뺀 5명의 평균

    /*********  출력 *********/
    System.out.println();
    for (i = 0; i < score.length; i++)
        System.out.printf("%d번 채점관 : %.1f\n", i + 1, score[i]);
    System.out.printf("최고 점수 : %.1f, 최소 점수 : %.1f (제외)\n", high, low);
    System.out.printf("%s 선수의 최종 점수 : %.2f\n", player, result);
}