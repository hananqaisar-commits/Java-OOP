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
Music_Library/
├── src/
│   ├── Main.java         # Entry point
│   ├── Music.java        # Song model
│   ├── Playlist.java     # Playlist logic
│   └── Tester.java       # Tests
├── Dockerfile
├── .dockerignore
├── .gitignore
└── README.md
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
java -cp out Main
```

### Run with Docker 🐳

```bash
docker build -t music-library .
docker run -it music-library
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
