package commic.hy.suzumiya.config;

/**
 * Created time : 2017/7/3 14:31.
 *
 * @author HY
 */
public class Config {

    private boolean isFirst;
    private boolean clickTurnPage;
    private int chapter;
    private int page;
    private boolean isAlwaysOn;
    private float textSize;

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    public boolean isClickTurnPage() {
        return clickTurnPage;
    }

    public void setClickTurnPage(boolean clickTurnPage) {
        this.clickTurnPage = clickTurnPage;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public boolean isAlwaysOn() {
        return isAlwaysOn;
    }

    public void setAlwaysOn(boolean alwaysOn) {
        isAlwaysOn = alwaysOn;
    }

    public float getTextSize() {
        return textSize;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }
}
