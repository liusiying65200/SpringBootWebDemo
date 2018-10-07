package net.hualisheng.springBootWebDemo.model;

public class ArticleWithBLOBs extends Article {
    private String title;

    private String content;

    private String htmlTitle;

    private String htmlKeywords;

    private String htmlDescription;

    private String filePath;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHtmlTitle() {
        return htmlTitle;
    }

    public void setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle == null ? null : htmlTitle.trim();
    }

    public String getHtmlKeywords() {
        return htmlKeywords;
    }

    public void setHtmlKeywords(String htmlKeywords) {
        this.htmlKeywords = htmlKeywords == null ? null : htmlKeywords.trim();
    }

    public String getHtmlDescription() {
        return htmlDescription;
    }

    public void setHtmlDescription(String htmlDescription) {
        this.htmlDescription = htmlDescription == null ? null : htmlDescription.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }
}