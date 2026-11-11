//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    final int TOTAL = 37;       // 닭과 개의 합
    final int LEGS = 102;       // 다리의 총합

    // *********** for문
    System.out.println("for문");
    for (int chicken = 0; chicken <= TOTAL; chicken++) {
        int dog = TOTAL - chicken;
        if (chicken * 2 + dog * 4 == LEGS)
            System.out.printf("닭 = %d마리, 개 = %d마리\n", chicken, dog);
    }
    System.out.println();

    // ******************** while문
    System.out.println("while문");
    int chicken = 0;
    while (chicken <= TOTAL) {
        int dog = TOTAL - chicken;
        if (chicken * 2 + dog * 4 == LEGS)
            System.out.printf("닭 = %d마리, 개 = %d마리\n", chicken, dog);
        chicken++;
    }
    System.out.println();

    // ************************* do-while문
    System.out.println("do-while문");
    chicken = 0;
    do {
        int dog = TOTAL - chicken;
        if (chicken * 2 + dog * 4 == LEGS)
            System.out.printf("닭 = %d마리, 개 = %d마리\n", chicken, dog);
        chicken++;
    } while (chicken <= TOTAL);
}