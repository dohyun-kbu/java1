//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException {
    Scanner keyboard = new Scanner(System.in);

    final int ID = 0;
    final int NAME = 1;
    final int KOR = 0;
    final int ENG = 1;
    final int MATH = 2;
    final int SUM = 0;
    final int CLASS_RANK = 1;
    final int GRADE_RANK = 2;
    final int MAX_STUDENT = 10;     // 한 반의 최대 학생 수

    String[] subject = {"국어", "영어", "수학"};
    String[][] class1 = {{"3456", "오준우"}, {"1334", "경복대"}, {"2342", "이대한"},
            {"1234", "홍길동"}, {"3456", "한민국"}, {"4563", "이재명"}};
    String[][] class2 = {{"3342", "이순신"}, {"3476", "정도령"},
            {"4863", "이순재"}, {"3414", "오대한"}};
    String[][][] grade = {class1, class2};

    int[][][] score = new int[grade.length][MAX_STUDENT][subject.length];
    int[][][] result = new int[grade.length][MAX_STUDENT][3];
    float[][] avg = new float[grade.length][MAX_STUDENT];
    float classAvg;

    /**********  입력 ******/
    for (int i = 0; i < grade.length; i++) {
        for (int j = 0; j < grade[i].length; j++) {
            int k = 0;
            while (k < subject.length) {
                System.out.printf("[%d반] %s 학생의 %s 성적 : ", i + 1, grade[i][j][NAME], subject[k]);
                score[i][j][k] = keyboard.nextInt();
                if (score[i][j][k] >= 0 && score[i][j][k] <= 100)
                    k++;
                else {
                    System.err.println("ERROR : 점수는 0 ~ 100");
                    System.in.read();
                }
            }
            System.out.println();
        }
    }

    /******  총점, 평균 ***/
    for (int i = 0; i < grade.length; i++) {
        for (int j = 0; j < grade[i].length; j++) {
            for (int k = 0; k < subject.length; k++)
                result[i][j][SUM] += score[i][j][k];
            avg[i][j] = (float) result[i][j][SUM] / subject.length;
        }
    }

    /*********  반 등수, 학년 등수 *****/
    for (int i = 0; i < grade.length; i++) {
        for (int j = 0; j < grade[i].length; j++) {
            result[i][j][CLASS_RANK] = 1;
            result[i][j][GRADE_RANK] = 1;
            for (int a = 0; a < grade.length; a++) {
                for (int b = 0; b < grade[a].length; b++) {
                    if (result[a][b][SUM] > result[i][j][SUM]) {
                        result[i][j][GRADE_RANK]++;
                        if (a == i)
                            result[i][j][CLASS_RANK]++;
                    }
                }
            }
        }
    }

    /******  반 등수 순 정렬 (반마다 총점 내림차순) *****/
    for (int i = 0; i < grade.length; i++) {
        for (int j = 0; j < grade[i].length - 1; j++) {
            for (int k = 0; k < grade[i].length - 1 - j; k++) {
                if (result[i][k][SUM] < result[i][k + 1][SUM]) {
                    String[] temp = grade[i][k];
                    grade[i][k] = grade[i][k + 1];
                    grade[i][k + 1] = temp;

                    int[] test = score[i][k];
                    score[i][k] = score[i][k + 1];
                    score[i][k + 1] = test;

                    test = result[i][k];
                    result[i][k] = result[i][k + 1];
                    result[i][k + 1] = test;

                    float change = avg[i][k];
                    avg[i][k] = avg[i][k + 1];
                    avg[i][k + 1] = change;
                }
            }
        }
    }

    /***  출력 (Data, 정보) *******/
    for (int i = 0; i < grade.length; i++) {
        classAvg = 0;
        System.out.printf("%d반\n", i + 1);
        System.out.println("************************");
        System.out.println(" 학번  이름  국어  영어  수학  총점  평균 반석차 학년석차");
        System.out.println("************************");
        for (int j = 0; j < grade[i].length; j++) {
            System.out.printf(" %4s %3s %4d %4d %4d %5d %6.2f %4d %6d\n",
                    grade[i][j][ID], grade[i][j][NAME],
                    score[i][j][KOR], score[i][j][ENG], score[i][j][MATH],
                    result[i][j][SUM], avg[i][j],
                    result[i][j][CLASS_RANK], result[i][j][GRADE_RANK]);
            classAvg += avg[i][j];
        }
        classAvg = classAvg / grade[i].length;
        System.out.println("********************");
        System.out.println("\t\t학급 평균 : " + classAvg);
    }
}