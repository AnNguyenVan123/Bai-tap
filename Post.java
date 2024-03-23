import java.util.Date;

public class Post {
    private int id ;
    private String title ;
    private String content ;
    private Date create_at;
    private Date update_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public Post(int id, String title, String content, Date create_at, Date update_at) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.create_at = create_at;
        this.update_at = update_at;
    }

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", create_at=" + create_at +
                ", update_at=" + update_at +
                '}';
    }
}
