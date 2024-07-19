package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 19
 */
public class Post {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private String title;
    private String content;
    private Integer likes;

    List<Comment> comments = new ArrayList<>();

    public Post() {
    }

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.getComments().add(comment);
    }

    public void removeComment(Comment comment) {
        this.getComments().remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.getTitle()).append("\n");
        sb.append(this.getLikes()).append(" Likes - ");
        sb.append(this.getMoment().format(fmt)).append("\n");
        sb.append(this.getContent()).append("\n");

        sb.append("COMMENTS:\n");
        for (Comment comment : this.getComments()) {
            sb.append(comment.getText()).append("\n");
        }

        return sb.toString();
    }
}
