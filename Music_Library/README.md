# Music Library 🎵

A CLI-based Java application to manage your personal music collection — add songs, create playlists, and search your library from the terminal.

---

## Features

- Add and remove songs from your library
- Create and manage playlists
- Search and filter songs by title, artist, or genre
- Runs fully in the terminal (no GUI)
- Docker support for easy setup

---

## Project Structure

```
.
├── Dockerfile
├── README.md
└── src
    ├── Artist.java
    ├── Comparator.java
    ├── Media.java
    ├── out
    │   ├── Artist.class
    │   ├── Media.class
    │   ├── Playable.class
    │   ├── Playlist.class
    │   ├── PodcastEp.class
    │   ├── Song.class
    │   ├── sortByduration.class
    │   ├── sortByreleaseYear.class
    │   └── Tester.class
    ├── Playable.java
    ├── Playlist.java
    ├── PodcastEp.java
    ├── Song.java
    └── Tester.java

```

---

## Getting Started

### Requirements

- Java 17+
- Docker *(optional)*

### Run Locally

```bash
git clone https://github.com/your-username/music-library.git
cd music-library
javac -d out src/*.java
java -cp out Tester
```

### Run with Docker 🐳

```bash
docker build -t music-library . #run from directory
docker run -it music-library
```
### Debuuging from bash in container

```bash
 docker run -it music-library /bin/bash
```

---

## Contributing

1. Fork the repo
2. Create a branch (`git checkout -b feature/your-feature`)
3. Commit your changes
4. Open a Pull Request

---

## License

MIT License
