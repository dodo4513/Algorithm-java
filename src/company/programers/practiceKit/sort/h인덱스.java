package company.programers.practiceKit.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 09/02/2019
 */
public class h인덱스 {

  static int[] numbers = {2, 2};
//  static int[] numbers = {6, 1, 1, 1, 1};
//  static int[] numbers = {1, 2, 3, 3, 3, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9, 9, 10, 10, 10};

  static int solution(int[] citations) {

    List<Integer> list = Arrays.stream(citations).boxed().sorted(((o1, o2) -> o2 - o1))
        .collect(Collectors.toList());

    // h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h가 이 과학자의 H-Index입니다.
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) <= i + 1) {
        return list.get(i);
      }
    }

    return list.size();
  }

  static int solution1(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);

    for (int i = citations.length -1 ; i >= 0 ; i--) {
      if(citations.length -i >= citations[i])
        break;
      answer++;
    }
    return answer;
  }


  public static void main(String args[]) {

    System.out.println(solution(numbers));
    System.out.println(solution1(numbers));
  }
}

