public class Main {
    public static void main(String[] args) {
        // Создаем сериал
        Series series = new Series();

        Season season1 = new Season();
        season1.addEpisode(new Episode("S1E1", 1800));
        season1.addEpisode(new Episode("S1E2", 1900));
        season1.addEpisode(new Episode("S1E3", 2000));

        Season season2 = new Season();
        season2.addEpisode(new Episode("S2E1", 2100));
        season2.addEpisode(new Episode("S2E2", 2200));

        series.addSeason(season1);
        series.addSeason(season2);

        System.out.println("--- Нормальный порядок (1 сезон) ---");
        for (Episode e : season1) {
            System.out.println(e);
        }

        System.out.println("\n--- Обратный порядок (1 сезон) ---");
        EpisodeIterator reverseIterator = new ReverseSeasonIterator(season1);
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        System.out.println("\n--- Перемешанный порядок (1 сезон) ---");
        EpisodeIterator shuffleIterator = new ShuffleSeasonIterator(season1, 42L);
        while (shuffleIterator.hasNext()) {
            System.out.println(shuffleIterator.next());
        }

        System.out.println("\n--- Полный сериал (Binge Mode) ---");
        EpisodeIterator bingeIterator = new BingeIterator(series);
        while (bingeIterator.hasNext()) {
            System.out.println(bingeIterator.next());
        }
    }
}

