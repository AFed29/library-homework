public enum Genre {
    AUTOBIOGRAPHY("The author writing about themselves"),
    CHILDRENS("Books for kids"),
    ADVENTURE("We're going on an adventure!"),
    POLITICALFICTION("What happens when politics goes wrong");

    private String description;

    Genre(String description) {
        this.description = description;
    }
}
