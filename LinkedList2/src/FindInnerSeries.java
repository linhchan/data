import java.util.*;

public class FindInnerSeries {
  private static enum SeriesType {
    NONE,
    INCREASING,
    DECREASING;
  }

  public static Collection<List<Integer>> findInnerSeries(List<Integer> input) {
    if (input.size() < 2) {
      return Collections.emptyList();
    }

    Collection<List<Integer>> result = new ArrayList<List<Integer>>();
    List<Integer> series = new ArrayList<Integer>();
    SeriesType seriesType = SeriesType.NONE;

    Iterator<Integer> i = input.iterator();
    int prev = i.next();
    while (i.hasNext()) {
      int cur = i.next();
      int diff = cur - prev;
      if (diff == 1) {
        if (seriesType != SeriesType.INCREASING) {
          seriesType = SeriesType.INCREASING;
          if (!series.isEmpty()) {
            result.add(series);
          }

          series = new ArrayList<Integer>();
          series.add(prev);
        }

        series.add(cur);
      } else if (diff == -1) {
        if (seriesType != SeriesType.DECREASING) {
          seriesType = SeriesType.DECREASING;
          if (!series.isEmpty()) {
            result.add(series);
          }

          series = new ArrayList<Integer>();
          series.add(prev);
        }

        series.add(cur);
      } else {
        seriesType = SeriesType.NONE;
      }

      prev = cur;
    }

    if (!series.isEmpty()) {
      result.add(series);
    }

    return result;
  }
}
