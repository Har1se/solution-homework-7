Binge Mode Streaming Service Simulator
Project Description
This mini-platform simulates watching TV series in Binge Mode, similar to streaming services like Netflix.
The project demonstrates the use of the "Iterator" pattern in Java: it allows you to abstract from the details of storing episodes and provides an easy way to iterate.

Project structure
Episode — represents one episode (title, duration).

Season — a season of a TV series containing a collection of episodes.

Series is a series containing several seasons.

EpisodeIterator is an interface for episode iterators (hasNext(), next()).

Specific iterators of the season:

SeasonIterator — the usual order of episodes.

ReverseSeasonIterator — the reverse order of episodes.

ShuffleSeasonIterator — random order (with a fixed LED for reproducibility).

BingeIterator is an end—to-end iterator for the entire series (from the first episode of the first season to the last).

Additionally (optional):

The "Skip intro" iterator (SkipIntroIterator).

Filter by browsing history (UnwatchedEpisodeIterator).
