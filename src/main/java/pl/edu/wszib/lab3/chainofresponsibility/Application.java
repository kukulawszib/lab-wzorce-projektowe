package pl.edu.wszib.lab3.chainofresponsibility;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        final HttpRequest httpRequest = new HttpRequest(
                "https://google.com",
                "GET",
                Map.of("accept", "text/html"),
                null
        );
        final AbstractFilter filter = createHttpFilter();
        boolean result = filter.filter(httpRequest);

        // Zadanie:
        //  Przygotuj filtr, który będzie pozwalał na przetwarzanie żądań http dla oczekiwanego typu zwracanego "application/json" (nagłówek Accept),
        //  Przygotuj drugi filtr, który dla żądań typu POST będzie pozwalał na dalsze procesowanie tylko danych w formacie json (nagłówek "Content-type" = "application/json")
    }

    private static AbstractFilter createHttpFilter() {
        return new LoggingFilter(
                new HttpsOnlyFilter(new NoopFilter())
        );
    }
}
