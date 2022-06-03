import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
class TryCommonMark {
<<<<<<< HEAD
    public static void main(String[] args) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse("This is *Sparta*");
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        renderer.render(document); // "<p>This is <em>Sparta</em></p>\n"
=======
public static void main(String[] args) {
    Parser parser = Parser.builder().build();
    Node document = parser.parse("This is *Sparta*");
    HtmlRenderer renderer = HtmlRenderer.builder().build();
    renderer.render(document); // "<p>This is <em>Sparta</em></p>\n"
>>>>>>> 63f15b09d119721dd8b53a9e66e09a3eeb34f901
    }
}
