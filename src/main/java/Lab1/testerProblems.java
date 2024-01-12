package Lab1;

import java.util.Arrays;

public class testerProblems {
    public static void main(String[] args) {
        Problems problems = new Problems();

        // Test for problem1
        int[] numbers1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println("Problem 1 Expected: [0, 1], Actual: " + Arrays.toString(problems.problem1(numbers1, target1)));

        // Test for problem2
        int x2 = 121;
        System.out.println("Problem 2 Expected: true, Actual: " + problems.problem2(x2));

        // Test for problem3
        String[] strArr3 = {"flower", "flow", "flight"};
        System.out.println("Problem 3 Expected: fl, Actual: " + problems.problem3(strArr3));

        // Test for problem4
        String str4 = "MCMXCIV";
        System.out.println("Problem 4 Expected: 1994, Actual: " + problems.problem4(str4));

        // Test for problem5
        String str5 = "([{}])";
        System.out.println("Problem 5 Expected: true, Actual: " + problems.problem5(str5));

        // Test for problem6
        Problems problems2 = new Problems();
        Problems.Problem6Node list1 = problems2.new Problem6Node(1, problems2.new Problem6Node(2, problems2.new Problem6Node(4)));
        Problems.Problem6Node list2 = problems2.new Problem6Node(1, problems2.new Problem6Node(3, problems2.new Problem6Node(4)));

        Problems.Problem6Node mergedList = problems.problem6(list1, list2);
        String actualOutput = mergedList.printList();
        String expectedOutput = "1->1->2->3->4->4";

        System.out.println("Problem 6 Expected: " + expectedOutput + ", Actual: " + actualOutput);

        // Test for problem7
        int[] digits7 = {1, 2, 3};
        System.out.println("Problem 7 Expected: [1, 2, 4], Actual: " + Arrays.toString(problems.problem7(digits7)));
    }



}
