package company.programers.kakao2020;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author doyoung hwang on 2019-11-01 2:47
 */
public class Problem4 {

  public static int[] solution(String[] words, String[] queries) {

    Trie trie = new Trie();
    Trie reverseTrie = new Trie();

    for (String w : words) {
      trie.insert(w);
      reverseTrie.insert(reverse(w));
    }

    int[] result = new int[queries.length];

    for (int i=0;i<queries.length;i++) {
      if (queries[i].charAt(0) != '?') {
        result[i] = trie.searchCount(queries[i]);
      } else {
        result[i] = reverseTrie.searchCount(reverse(queries[i]));
      }
    }

    return result;
  }

  public static void main(String[] args) {

//    String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
//    String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};

    String[] words = {"aaaa","aaab"};
    String[] queries = {"a???","???b"};



    System.out.println(Arrays.toString(solution(words, queries)));
  }

  static class Node {

    HashMap<Character, Node> children = new HashMap<>();

    void insert(String s) {

      if (s.length() > 0) {
        char c = s.charAt(0);

        children.putIfAbsent(c, new Node());
        children.get(c).insert(s.substring(1));
      }
    }

    int searchCount(String s) {
      // base case
      if (s.equals("")) {
        return children.size() == 0 ? 1 : 0;
      }

      char c = s.charAt(0);

      if (c != '?') {
        return children.containsKey(c) ? children.get(c).searchCount(s.substring(1)) : 0;
      }

      int f = 0;
      for (Node node : children.values()) {
        f += node.searchCount(s.substring(1));
      }

      return f;
    }
  }

  static class Trie {

    Node root = new Node();

    void insert(String s) {
      root.insert(s);
    }

    int searchCount(String s) {
      return root.searchCount(s);
    }

  }

  public static String reverse(String input){
    char[] in = input.toCharArray();
    int begin=0;
    int end=in.length-1;
    char temp;
    while(end>begin){
      temp = in[begin];
      in[begin]=in[end];
      in[end] = temp;
      end--;
      begin++;
    }
    return new String(in);
  }

}


