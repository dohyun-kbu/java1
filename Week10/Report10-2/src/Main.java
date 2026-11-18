//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    final float MIN = 30.0f;        // 최소 몸무게
    final float MAX = 120.0f;       // 최대 몸무게
    String[] name = {"홍길동", "이혜인", "김명성", "경복대", "이대학", "박철수", "최영희", "정민수", "강다은", "윤서준"};
    float[] weight = new float[name.length];
    float total = 0;                // 몸무게의 합
    float avg;                      // 평균 몸무게
    float rate;                     // 평균 이상자의 비율
    int count = 0;                  // 평균 이상자 수
    int i = 0;

    /*****  입력 **********/
    while (i < name.length) {
        System.out.printf("%s 학생 몸무게 입력 (%.1f ~ %.1f Kg) : ", name[i], MIN, MAX);
        weight[i] = keyboard.nextFloat();
        if (weight[i] >= MIN && weight[i] <= MAX)
            i++;
        else {
            System.err.println("ERROR : 몸무게는 30.0 ~ 120.0 Kg");
            System.in.read();
        }
    }

    /****  평균, 평균 이상자 비율 **********/
    for (i = 0; i < weight.length; i++)
        total += weight[i];
    avg = total / weight.length;

    for (i = 0; i < weight.length; i++) {
        if (weight[i] >= avg)
            count++;
    }
    rate = (float) count / weight.length * 100;

    /******  몸무게 순 정렬 (내림차순) ***********/
    for (i = 0; i < weight.length - 1; i++) {
        for (int j = 0; j < weight.length - 1 - i; j++) {
            if (weight[j] < weight[j + 1]) {
                String temp = name[j];
                name[j] = name[j + 1];
                name[j + 1] = temp;

                float test = weight[j];
                weight[j] = weight[j + 1];
                weight[j + 1] = test;
            }
        }
    }

    /******  출력 *******/
    System.out.println();
    System.out.printf("평균 몸무게 : %.1f Kg\n", avg);
    System.out.printf("평균 이상자 : %d명 (%.1f %%)\n", count, rate);

    System.out.println("[몸무게 상위 2명]");
    for (i = 0; i < 2; i++)
        System.out.printf("%d위 %s %.1f Kg\n", i + 1, name[i], weight[i]);

    System.out.println("[몸무게 하위 2명]");
    for (i = weight.length - 2; i < weight.length; i++)
        System.out.printf("%d위 %s %.1f Kg\n", i + 1, name[i], weight[i]);
}
