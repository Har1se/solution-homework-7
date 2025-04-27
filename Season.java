import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import java.util.Iterator;

public class Season implements Iterable<Episode> {
    private final List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode episode) {
        episodes.add(episode);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    @Override
    public Iterator<Episode> iterator() {
        return new Iterator<Episode>() {
            private final EpisodeIterator iterator = new SeasonIterator(Season.this);

            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Episode next() {
                return iterator.next();
            }
        };
    }
}