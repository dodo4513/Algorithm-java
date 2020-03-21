package company.test.Y20200301.Woo;

import java.util.Arrays;
import java.util.List;

/**
 * @author cyclamen on 3/1/20
 */
public class statistic {

    public static String solution(String S) {
        String[] rows = S.split("\\n");
        ResultWriter resultWriter = new ResultWriter();
        for (String row : rows) {
            FileType extension = getExtension(row);
            int volume = getVolume(row);

            resultWriter.accumulate(extension, volume);
        }

        return resultWriter.getResult();
    }

    private static class ResultWriter {
        private int musicVolumes;
        private int imageVolumes;
        private int movieVolumes;
        private int otherVolumes;

        public void accumulate(FileType type, int volumn) {
            switch (type) {
                case MUSIC:
                    musicVolumes += volumn;
                    break;
                case IMAGE:
                    imageVolumes += volumn;
                    break;
                case MOVIE:
                    movieVolumes += volumn;
                    break;
                case OTHER:
                    otherVolumes += volumn;
            }
        }

        public String getResult() {
            return "music " + musicVolumes + "b\n" + "images " + imageVolumes + "b\n" + "movies " + movieVolumes + "b\n"
                   + "other " + otherVolumes + "b";
        }
    }

    private static int getVolume(String row) {
        return Integer.parseInt(row.split(" ")[1].replaceAll("b", ""));
    }

    private static FileType getExtension(String row) {
        String[] fileNameParts = row.split("\\.");
        String extension = fileNameParts[fileNameParts.length - 1].split(" ")[0];
        return FileType.getType(extension);
    }

    enum FileType {
        MUSIC,
        IMAGE,
        MOVIE,
        OTHER;

        public static List<String> MUSIC_EXTENDS = Arrays.asList("mp3", "aac", "flac");
        public static List<String> IMAGE_EXTENDS = Arrays.asList("jpg", "bmp", "gif");
        public static List<String> MOVIE_EXTENDS = Arrays.asList("mp4", "avi", "mkv");

        public static FileType getType(String extension) {
            if (MUSIC_EXTENDS.contains(extension)) {
                return FileType.MUSIC;
            } else if (IMAGE_EXTENDS.contains(extension)) {
                return FileType.IMAGE;
            } else if (MOVIE_EXTENDS.contains(extension)) {
                return FileType.MOVIE;
            } else {
                return FileType.OTHER;
            }
        }
    }

    public static void main(String[] args) {

        String a =
            "mov!e.mkv 10000b\nmov!e.mv 10000b";
        System.out.println(solution(a));

    }

}
