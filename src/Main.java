public class Main {
    public static void main(String[] args) {
        int[][] num = {{-1,2,9},{0,6,1},{3,5,4}};
//        System.out.println(Q1(num));
//        System.out.println(Q2(num));
//        System.out.print(Q3(num));
//        System.out.println(Q4(num));
//        System.out.println(Q5(num));
//        System.out.println(Q6(num));
//        Q7
//        System.out.println(Q7Print(num));
//        System.out.println(Q7(num));
//        System.out.println(Q7Print(num));

//        System.out.println(Q8(num));
//        System.out.println(Q9(num));
//        System.out.println(Q10(num));
//        System.out.println(Q11(num));
//        Q12
//        System.out.println(Q12(Q12Right(num),Q12Left(num)));
//        System.out.println(Q12Right(num)+" right diagonal");
//        System.out.println(Q12Left(num)+ " left diagonal");

//        System.out.println(Q13(num));
//        System.out.println(Q14(num,7));
//        Q15
//        if (Q15(num)){
//            System.out.println("all elements are unique");
//        }else {
//            System.out.println("some elements repeat");
//        }

    }
    public static int Q1(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum+=a[i][j];
            }
        }
        return sum;
    }
    public static int Q2(int[][] a){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum+=a[i][j];
                count++;
            }

        }
        return sum/count;
    }
    public static String Q3(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int max =a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if(max<a[i][j]){
                    max = a[i][j];
                }
            }
            System.out.print(max+" ");
        }
        return " ";
    }
    public static String Q4(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int min =a[i][0];
            for (int j = 0; j < a[i].length; j++) {
                if(min >a[i][j]){
                    min = a[i][j];
                }
            }
            System.out.print(min +" ");
        }
        return " ";
    }
    public static String Q5(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int max =0;
            for (int j = 0; j < a[i].length; j++) {
                    max += a[i][j];
            }
            System.out.print(max+" ");
        }
        return " ";
    }
    public static String Q6(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i==j || i+j==2){
                    if (a[i][j]<0){
                        return "diagonal is negative";
                    }
                }
            }
        }
        return "diagonal is positive";
    }
    public static String Q7Print(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
        return " ";
    }
    public static String Q7(int[][] a){
        int[] tmp = a[0];
        a[0] = a[1];
        a[1] = tmp;
        return " ";
    }
    public static int Q8(int[][] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]<0){
                    for (int k = 0; k < a[i].length; k++) {
                        sum+=a[i][k];
                    }
                }
            }
        }
        return sum;

    }
    public static int Q9(int[][] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>0){
                    count++;
                }
            }
        }
        return count;

    }
    public static int Q10(int[][] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]<0){
                    count++;
                }
            }
        }
        return count;

    }
    public static int Q11(int[][] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==0){
                    a[i][j] = count;
                    count++;
                }
            }
        }
        return count;
    }
    public static int Q12Left(int[][] a){
        int sumL = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i==j){
                    sumL +=a[i][j];
                }
            }
        }
        return sumL;
    }
    public static int Q12Right(int[][] a){
        int sumR = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i+j==2){
                    sumR +=a[i][j];
                }
            }
        }
        return sumR;
    }
    public static boolean Q12(int sumL,int sumR){
        boolean answer;
        if (sumL==sumR){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
    public static int Q13(int[][] a){
        int sumL = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i==j){
                    sumL +=a[i][j];
                }
            }
        }
        return sumL;
    }
    public static int Q14(int[][] a,int UserNum){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]<UserNum){
                    count++;
                }
            }
        }
        return count;
    }
    public static boolean Q15(int[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    int startIdx = (k == i) ? j + 1 : 0;
                    for (int l = startIdx; l < a[k].length; l++) {
                        if (a[i][j] == a[k][l]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
