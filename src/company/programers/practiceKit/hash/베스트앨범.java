package company.programers.practiceKit.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cyclamen on 09/02/2019
 */
public class 베스트앨범 {


  static String[] genres = {"classic", "pop", "classic", "classic", "pop"};
  static int[] plays = {500, 600, 150, 800, 2500};


  int[] solution(String[] genres, int[] plays) {
    Map<String, Songs> dic = new HashMap<>();

    for (int i = 0; i < genres.length; i++) {
      Songs songs = dic.getOrDefault(genres[i], new Songs());
      songs.count += plays[i];
      songs.queue.add(new Song(plays[i], i));
      dic.put(genres[i], songs);
    }

    return dic.keySet().stream()
        .sorted(((o1, o2) -> dic.get(o2).count - dic.get(o1).count))
        .flatMap(
            key -> dic.get(key).queue.stream().sorted((o1, o2) -> o2.plays - o1.plays).limit(2))
        .mapToInt(q -> q.index).toArray();
  }

  class Songs {

    int count;
    List<Song> queue = new ArrayList<>();
  }

  class Song {

    int plays;
    int index;

    Song(int plays, int index) {
      this.plays = plays;
      this.index = index;
    }
  }

  public static void main(String args[]) {
    베스트앨범 앨범 = new 베스트앨범();
    System.out.println(앨범.solution(genres, plays));
  }
}

