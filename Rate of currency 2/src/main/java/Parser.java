import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static void main(String[] args) throws IOException {

        Window window = new Window();

        List<Article> articleList = new ArrayList<>();
        Document doc = Jsoup.connect("https://cbr.ru/key-indicators/").get();
        Elements tdElements = doc.getElementsByAttributeValue("class", "table key-indicator_table");
        tdElements.forEach(tdElement -> {
            Element Element = tdElement.child(0);
            String a = Element.attr("");
            String b = Element.child(0).text();
            articleList.add(new Article(a, b));
        });
        String a =""+articleList.get(1);

        String today =""+a.substring(29,39);
        window.today=today;
        window.actionPerformedToday(today);
        String tomorrow =""+a.substring(40,50);
        window.tomorrow=tomorrow;
        window.actionPerformedTomorrow(tomorrow);
        String usdToday =""+a.substring(66,73);
        window.usdToday=usdToday;
        window.actionPerformedUsdToday(usdToday);
        String eurToday =""+a.substring(91,98);
        window.eurToday=eurToday;
        window.actionPerformedEurToday(eurToday);
        String usdTomorrow =""+a.substring(74, 81);
        window.usdTomorrow=usdTomorrow;
        window.actionPerformedUsdTomorrow(usdTomorrow);
        String eurTomorrow =""+a.substring(99, 106);
        window.eurTomorrow=eurTomorrow;
        window.actionPerformedEurTomorrow(eurTomorrow);
    }
}

class Article {
    private String a;
    private String b;

    public Article(String url, String name) {
        this.a = url;
        this.b = name;
    }

    public String toString() {
        return "Article{" +
                "url='" + a + '\'' +
                ", name='" + b + '\'' +
                '}';
    }
}

