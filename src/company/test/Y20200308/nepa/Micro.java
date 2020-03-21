package company.test.Y20200308.nepa;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Do-young on 3/8/20
 */
public class Micro {

    public static class UserStats {

        private Optional<Long> visitCount;

        public Optional<Long> getVisitCount() {
            return visitCount;
        }
    }


    Map<Long, Long> count(Map<String, UserStats>... visits) {

        Map<Long, Long> result = new HashMap<>();

        if (visits == null) {
            return result;
        }

        Arrays.stream(visits).filter(Objects::nonNull).flatMap(f -> f.entrySet().stream()).forEach(e -> {
            try {
                long key = Long.parseLong(e.getKey());
                UserStats userStats = e.getValue();

                if (userStats != null) {
                    userStats.getVisitCount().ifPresent(u -> result.merge(key, u, Long::sum));
                }

            } catch (NumberFormatException ignore) {
            }
        });

        //        for (Map<String, UserStats> v : visits) {
        //            if (v == null) {
        //                continue;
        //            }
        //            for (String key : v.keySet()) {
        //                try {
        //                    long k = Long.parseLong(key);
        //
        //                    UserStats userStats = v.get(key);
        //                    if (userStats != null) {
        //                        if (userStats.getVisitCount().isPresent()) {
        //                            result.merge(k, userStats.getVisitCount().get(), Long::sum);
        //                        }
        //
        //                    }
        //                } catch (NumberFormatException ignore) {
        //                }
        //            }
        //
        //        }

        return result;
    }

}
