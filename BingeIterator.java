import java.util.Iterator;
import java.util.List;

public class BingeIterator implements EpisodeIterator {
    private final List<Season> seasons;
    private int seasonIndex = 0;
    private EpisodeIterator currentIterator;

    public BingeIterator(Series series) {
        this.seasons = series.getSeasons();
        if (!seasons.isEmpty()) {
            currentIterator = new SeasonIterator(seasons.get(0));
        }
    }

    @Override
    public boolean hasNext() {
        while (currentIterator != null) {
            if (currentIterator.hasNext()) {
                return true;
            } else if (++seasonIndex < seasons.size()) {
                currentIterator = new SeasonIterator(seasons.get(seasonIndex));
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public Episode next() {
        return currentIterator.next();
    }
}
